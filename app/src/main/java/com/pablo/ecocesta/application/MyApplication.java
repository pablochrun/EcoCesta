package com.pablo.ecocesta.application;


import android.app.Application;
import android.util.Log;

import com.google.gson.Gson;
import com.pablo.ecocesta.db.DbOpenHelper;
import com.pablo.ecocesta.entity.Category;
import com.pablo.ecocesta.entity.DaoMaster;
import com.pablo.ecocesta.entity.DaoSession;
import com.pablo.ecocesta.entity.Product;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by irene on 15/10/2017.
 */

public class MyApplication extends Application {
    private DaoSession mDaoSession;

    @Override
    public void onCreate() {
        super.onCreate();
        mDaoSession =
                new DaoMaster(new DbOpenHelper(this, "greendao_demo.db").getWritableDb()).newSession();

        // USER CREATION FOR DEMO PURPOSE
        if(mDaoSession.getCategoryDao().loadAll().size() == 0){
            initializeCategories();
        }

        if(mDaoSession.getProductDao().loadAll().size() == 0){
            initializeProducts();
            //mDaoSession.getGlobalListDao().insert(new GlobalList(1L, "Janishar Ali","", ""));
        }



    }

    public DaoSession getDaoSession() {
        return mDaoSession;
    }

    private void initializeProducts(){
        readJSON("setup_products.json", "products", Product.class);
    }

    private void initializeCategories(){
        readJSON("setup_categories.json", "categories", Category.class);
    }

    private void readJSON(String fileName, String jsonObjectName, final Class classToParse){
            String jsonLoaded = loadJSONFromAsset(fileName);
            Log.d("Details-->", jsonLoaded);
            Gson gson = new Gson();

            Object myObj = gson.fromJson(jsonLoaded, classToParse);
            Log.d("Details-->", myObj.toString());

            /*
            JSONObject obj = new JSONObject(loadJSONFromAsset(fileName));
            JSONArray m_jArry = obj.getJSONArray(jsonObjectName);

            Gson gson = new Gson();
            for (int i = 0; i < m_jArry.length(); i++) {
                JSONObject jo_inside = m_jArry.getJSONObject(i);
                Log.d("Details-->", jo_inside.toString());
                Object myObje = gson.fromJson(jsonObjectName, classToParse.getComponentType());
                Log.d("Details-->", jo_inside.toString());

            }
            */

    }

    private String loadJSONFromAsset(String fileName) {
        String json = null;
        try {
            InputStream is = this.getAssets().open(fileName);
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            json = new String(buffer, "UTF-8");
        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
        return json;
    }
}
