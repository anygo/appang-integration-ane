package com.nextapps.appangintegrationane;

import com.nextapps.nasrun.NASRun;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends Activity {

	@Override
	 protected void onCreate(Bundle savedInstanceState) {
	 	 super.onCreate(savedInstanceState);
	 	 //setContentView(R.layout.activity_main);
	 	 Log.d("AI", "onCreate");
	 	 Intent intent = getIntent();
	 	 String key = intent.getStringExtra("key");
	 	 NASRun.run(this, key);
	 	 finish();
	 }

}
