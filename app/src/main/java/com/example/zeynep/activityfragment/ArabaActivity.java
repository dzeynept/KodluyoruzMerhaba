package com.example.zeynep.activityfragment;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

/**
 * Created by zeynep
 */
public class ArabaActivity extends AppCompatActivity {
    private final String TAG = "ArabaActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_araba);
        Bundle bundle = getIntent().getExtras();

        TextView txt_name = (TextView) findViewById(R.id.txt_name);
        TextView txt_age = (TextView) findViewById(R.id.txt_age);
        txt_name.setText( bundle.getString("name"));
        txt_age.setText(String.valueOf(bundle.getInt("age"))); // bundle.getInt("" + "");

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
