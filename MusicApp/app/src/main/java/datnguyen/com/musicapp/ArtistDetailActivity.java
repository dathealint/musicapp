package datnguyen.com.musicapp.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;

/**
 * Created by datnguyen on 12/20/16.
 */

public class ArtistDetailActivity extends BaseListViewActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		// get artist
		String artist = getIntent().getStringExtra(Constants.EXTRA_ARTIST_KEY);
		if (!TextUtils.isEmpty(artist)) {
			this.setTitle(artist);
		}
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
