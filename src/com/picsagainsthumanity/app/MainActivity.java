package com.picsagainsthumanity.app;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	
	public void onClick(View v) {
		AlertDialog.Builder builder = new AlertDialog.Builder(this);
		builder
		.setTitle("Warning")
		.setMessage("You are running an experimental version of Pics Against Humanity. From here on, we will pretend that you logged in.")
		.setPositiveButton("OK", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				// do nothing
//				Intent loginIntent = new Intent(this, )
				Intent gameListIntent = new Intent(MainActivity.this, GameListActivity.class);
				startActivity(gameListIntent);
			}
		})
		.setNegativeButton("Well, crap!", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				// do nothing
			}
		})
		.setIcon(android.R.drawable.ic_dialog_alert)
		.show();
	}
}
