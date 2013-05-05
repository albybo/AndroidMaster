package it.albertomarchesini.androbix;

import obix.Uri;
import obix.net.MiaProva;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;

public class ObixActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_obix);
		
		Intent intent = getIntent();
		
	
		ConnectivityManager connMgr = (ConnectivityManager) 
		getSystemService(Context.CONNECTIVITY_SERVICE);
		NetworkInfo networkInfo = connMgr.getActiveNetworkInfo();
		if (networkInfo != null && networkInfo.isConnected()) {
			Log.v("Obix","connessione ok"); 
			    } else {
					Log.v("Obix","connessione ko"); 

			    }
		
		/*	
		
		Uri uri = new Uri("indirizzo");
				
		try {
		MiaProva.esegui();
		}
		catch(Exception exc) {
			Log.v("Obix",exc.getMessage()); finish(); };
			
			
*/			
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.obix, menu);
		return true;
	}

}
