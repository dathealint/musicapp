package datnguyen.com.musicapp;

import android.content.Intent;
import android.os.Bundle;

import datnguyen.com.musicapp.R;

/**
 * Created by datnguyen on 12/20/16.
 */

public class ArtistsActivity extends BaseListViewActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.setTitle(getString(R.string.view_title_artist));
	}

	@Override
	protected String descriptionText() {
		return getString(R.string.txt_desc_artist);
	}

	@Override
	public void handleItemClick(int position) {
		// go to artist detail
		String artistName = (String) elements.get(position);
		Intent intent = new Intent(this, ArtistDetailActivity.class);
		intent.putExtra(Constants.EXTRA_ARTIST_KEY, artistName);
		startActivity(intent);
	}
}
