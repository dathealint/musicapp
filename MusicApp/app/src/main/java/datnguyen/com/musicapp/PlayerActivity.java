package datnguyen.com.musicapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import datnguyen.com.musicapp.R;


/**
 * Created by datnguyen on 12/20/16.
 */

public class PlayerActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_player);

		// grab control
		TextView tvTitle = (TextView) findViewById(R.id.tvTitle);

		// get song name
		String songName = getIntent().getStringExtra(Constants.EXTRA_SONG_KEY);
		tvTitle.setText(String.format(getString(R.string.text_desc_player), songName));
	}
}
