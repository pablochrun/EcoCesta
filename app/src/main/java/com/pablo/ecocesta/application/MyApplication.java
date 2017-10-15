package com.pablo.ecocesta.application;


import android.app.Application;

import com.pablo.ecocesta.entities.DaoMaster;
import com.pablo.ecocesta.entities.DaoSession;
import com.pablo.ecocesta.entities.GlobalList;

/**
 * Created by irene on 15/10/2017.
 */

public class MyApplication extends Application {
    private DaoSession mDaoSession;

    @Override
    public void onCreate() {
        super.onCreate();
        mDaoSession = new DaoMaster(
                new DaoMaster.DevOpenHelper(this, "greendao_ecocesta.db").getWritableDb()).newSession();

        // USER CREATION FOR DEMO PURPOSE
        if(mDaoSession.getGlobalListDao().loadAll().size() == 0){
            mDaoSession.getGlobalListDao().insert(new GlobalList(1L, "Janishar Ali","", ""));
        }
    }

    public DaoSession getDaoSession() {
        return mDaoSession;
    }
}
