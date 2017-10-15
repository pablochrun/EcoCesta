package com.pablo.ecocesta;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.pablo.ecocesta.application.MyApplication;
import com.pablo.ecocesta.entity.GlobalList;

import ecoceseta.com.pablo.ecocesta.R;

public class InitialActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_initial);

        TextView textView = (TextView) findViewById(R.id.text);

        // Put this in a different thread or use AsyncSession in greenDAO.
        // For Demo purpose, this query is made on main thread but it should in a different thread.
        GlobalList user = ((MyApplication)getApplication()).getDaoSession().getGlobalListDao().load(1L);

        if(user != null){
            textView.setText(user.getList_name());
        }

    }
}
