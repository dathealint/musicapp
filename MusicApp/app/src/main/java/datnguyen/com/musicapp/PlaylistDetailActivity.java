package datnguyen.com.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.SupportActivity;
import android.text.TextUtils;

/**
 * Created by datnguyen on 12/20/16.
 */

public class PlaylistDetailActivity extends BaseListViewActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		// get playlist
		String playlist = getIntent().getStringExtra(Constants.EXTRA_PLAYLIST_KEY);
		if (!TextUtils.isEmpty(playlist)) {
			this.setTitle(playlist);
		}
	}

	@Override
	protected String descriptionText() {
		return getString(R.string.txt_desc_playlist_detail);
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
