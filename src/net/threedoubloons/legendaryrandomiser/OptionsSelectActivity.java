package net.threedoubloons.legendaryrandomiser;

import android.os.Bundle;
import android.preference.PreferenceManager;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;

public class OptionsSelectActivity extends Activity implements OnSeekBarChangeListener {
	private static final String PREFS_SETS = "prefs_sets";
	private static final int CHANGE_SETTINGS = 1;
	public static final String GAME_OPTIONS = "net.threedoubloons.legendaryrandomiser.GAME_OPTIONS";
	private GameDetails options;
	private TextView numPlayers;
	private CheckBox useAdvancedRules;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_options_select);
		
		options = new GameDetails();
		loadSettings();
		
		SeekBar numPlayersBar = (SeekBar)findViewById(R.id.num_players_seek);
		numPlayersBar.setOnSeekBarChangeListener(this);
		
		numPlayers = (TextView)findViewById(R.id.num_players);
		useAdvancedRules = (CheckBox)findViewById(R.id.aos_use_advanced_setup);
		numPlayers.setText(Integer.toString(options.getNumPlayers()));
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.options_select, menu);
		return true;
	}

	public void randomiseGame(View v) {
		Intent i = new Intent();
		i.setClass(getApplicationContext(), GameDetailsActivity.class);
		i.putExtra(GAME_OPTIONS, options);
		startActivity(i);
	}

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		switch(requestCode) {
		case CHANGE_SETTINGS:
			loadSettings();
		}
		super.onActivityResult(requestCode, resultCode, data);
	}

	private void loadSettings() {
		SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
		long defaultSets = Long.decode(getResources().getString(R.string.default_sets));		
		options.setActiveSets(sharedPreferences.getLong(PREFS_SETS, defaultSets));
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case R.id.action_settings:
			Intent i = new Intent();
			i.setClass(getApplicationContext(), SettingsActivity.class);
			startActivityForResult(i, CHANGE_SETTINGS);
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	@Override
	public void onProgressChanged(SeekBar seekBar, int progress,
			boolean fromUser) {
		options.setNumPlayers(progress + 1);
		numPlayers.setText(Integer.toString(options.getNumPlayers()));
		
		if (options.getNumPlayers() == 1) {
			useAdvancedRules.setVisibility(View.VISIBLE);
		} else {
			useAdvancedRules.setVisibility(View.GONE);
		}
	}

	@Override
	public void onStartTrackingTouch(SeekBar seekBar) {		
	}

	@Override
	public void onStopTrackingTouch(SeekBar seekBar) {
	}
	
	public void checkAdvancedRules(View view) {
		options.setUseAdvancedRules(useAdvancedRules.isChecked());
	}
}
