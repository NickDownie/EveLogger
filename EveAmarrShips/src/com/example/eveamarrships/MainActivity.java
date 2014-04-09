package com.example.eveamarrships;

import android.os.Bundle;
import android.app.ListActivity;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends ListActivity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		String[] ships={"Punisher", "Coercer", "Omen", "Bestower", "Legion", "Harbinger", "Abaddon", "Avatar"};
		setListAdapter(new ArrayAdapter<String>(this,
		R.layout.activity_main, R.id.space, ships));
	}
	protected void onListItemClick(ListView l, View v, int) {
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
