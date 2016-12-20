package datnguyen.com.musicapp.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;

import datnguyen.com.musicapp.R;

/**
 * Created by datnguyen on 12/20/16.
 */

public class SearchActivity extends BaseListViewActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		this.setTitle(getString(R.string.view_title_search));
	}

	@Override
	protected int layoutResId() {
		return R.layout.activity_search;
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