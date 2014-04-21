package com.app;

import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.app.R;

public class Home extends Activity
{
	
	@SuppressLint("NewApi")
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home);
		
		// action bar settings
		getActionBar().setTitle("Accueil");
		getActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#CF423C")));
		
		
		// top button (link to vue1 view)
		Button btnalarme = (Button) findViewById(R.id.buttonVue1);
		btnalarme.setOnClickListener(new View.OnClickListener()
		{	
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(Home.this, Vue1.class);
				startActivity(intent);
			}
		});	
		
		// center button (link to vue2 view)
		Button btninfos = (Button) findViewById(R.id.buttonVue2);
		btninfos.setOnClickListener(new View.OnClickListener()
		{	
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(Home.this, Vue2.class);
				startActivity(intent);
			}
		});		
		
		// bottom button (link to vue3 view)
		Button btnconfig = (Button) findViewById(R.id.buttonVue3);
		btnconfig.setOnClickListener(new View.OnClickListener()
		{	
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(Home.this, Vue3.class);
				startActivity(intent);
			}
		});		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		// inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.actionbar_home, menu);
		return true;
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case R.id.menu_about:
			// here, the code to set the action
			return true;
		case R.id.menu_help:
			// here, the code to set the action
			return true;
		case R.id.menu_refresh:
			// here, the code to set the action
			return true;
		case R.id.menu_search:
			// here, the code to set the action
			return true;
		case R.id.menu_settings:
			// here, the code to set the action
			return true;
		default:
			return super.onOptionsItemSelected(item);
		}
	}

}
