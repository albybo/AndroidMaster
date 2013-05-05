package it.albertomarchesini.androbix;

import android.app.Activity;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;

import obix.*;
import obix.net.*;

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
	
	
	public void iniziaTutto(View view) {
		
		Uri uri = new Uri("indirizzo");
		try {
		MiaProva.esegui();
		}
		catch(Exception exc) {
			Log.v("Obix",exc.getMessage()); finish(); };
		
		

	}

}

