package com.pablo.ecocesta.application;


import android.app.Application;

import com.pablo.ecocesta.db.DbOpenHelper;
import com.pablo.ecocesta.entity.DaoMaster;
import com.pablo.ecocesta.entity.DaoSession;
import com.pablo.ecocesta.entity.GlobalList;

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
        if(mDaoSession.getGlobalListDao().loadAll().size() == 0){
            mDaoSession.getGlobalListDao().insert(new GlobalList(1L, "Janishar Ali","", ""));
        }
    }

    public DaoSession getDaoSession() {
        return mDaoSession;
    }
}
