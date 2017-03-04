package com.example.zeynep.activityfragment;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txtView;
    public final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtView = (TextView) findViewById(R.id.mainText);
        //   Button main_send_btn = (Button) findViewById(R.id.activity_main_btnSend);

        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragTransaction = fragmentManager.beginTransaction();

        SecondFragment myFragment = new SecondFragment();
        fragTransaction.add(R.id.activity_main_frmSecondFragment, myFragment);
        fragTransaction.commit();

        //   MainFragment fragment = (MainFragment) fragmentManager.findFragmentById(R.id.main_fragment);

        myFragment.className = "tfgfbvc";

        // // TODO: 26.2.2017 .setText(fragment.getPassedData()); >> fragmenttan data cek

        Log.e(TAG, "onCreate");
    }

    public void send(View v) {
        Intent intent = new Intent(MainActivity.this, ArabaActivity.class);

        intent.putExtra("name", "Zeynep");
        intent.putExtra("surname", "Tokcan");
        intent.putExtra("age", 22);


        startActivity(intent);
        //  finish();

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(TAG, "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG, "onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(TAG, "onRestart");
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.e(TAG, "onPostResume");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(TAG, "onStart");
    }


    @Override
    public void onAttachFragment(android.support.v4.app.Fragment fragment) {
        Log.e(TAG, "onAttachFragment");

    }
}
