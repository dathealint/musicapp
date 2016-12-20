package datnguyen.com.musicapp.Activities;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

import datnguyen.com.musicapp.R;

/**
 * Created by datnguyen on 12/20/16.
 */

public class PlaylistsActivity extends BaseListViewActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.setTitle(getString(R.string.view_title_playlists));
	}

	@Override
	public void handleItemClick(int position) {
		// go to playlist detail
		String playlistName = (String) elements.get(position);
		Intent intent = new Intent(this, PlaylistDetailActivity.class);
		intent.putExtra(Constants.EXTRA_PLAYLIST_KEY, playlistName);
		startActivity(intent);
	}
}
