package datnguyen.com.musicapp;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

import datnguyen.com.musicapp.R;

/**
 * Created by datnguyen on 12/20/16.
 */

public class FavoriteSongsActivity extends BaseListViewActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.setTitle(getString(R.string.view_title_my_favorites));
	}

	@Override
	protected String descriptionText() {
		return getString(R.string.txt_desc_favortie);
	}

	@Override
	public void handleItemClick(int position) {
		// go to player and play
		String songName = (String) elements.get(position);
		Intent intent = new Intent(this, PlayerActivity.class);
		intent.putExtra(Constants.EXTRA_SONG_KEY, songName);
		startActivity(intent);
	}
}
