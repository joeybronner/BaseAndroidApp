package com.app;

import com.app.R;

import android.os.Bundle;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.preference.PreferenceActivity;

public class Vue3 extends PreferenceActivity {
		 
		@Override
		protected void onCreate(Bundle savedInstanceState)
		{
		   super.onCreate(savedInstanceState);
		   addPreferencesFromResource(R.xml.activity_configuration);
		   
			/* action bar settings */ 
			getActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#CF423C"))); // background color
			

		}
}
