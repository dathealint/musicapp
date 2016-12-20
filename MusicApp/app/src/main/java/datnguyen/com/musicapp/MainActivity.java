package datnguyen.com.musicapp.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import datnguyen.com.musicapp.R;

public class MainActivity extends AppCompatActivity {

	private static MainActivity staticInstance;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		staticInstance = this;

		// grab controls
		Button btnFavorite = (Button) findViewById(R.id.btnFavorites);
		Button btnSearch = (Button) findViewById(R.id.btnSearch);
		Button btnPlaylists = (Button) findViewById(R.id.btnPlaylists);
		Button btnArtists = (Button) findViewById(R.id.btnArtists);

		// setup click event handlers
		btnFavorite.setOnClickListener(clickListener);
		btnSearch.setOnClickListener(clickListener);
		btnPlaylists.setOnClickListener(clickListener);
		btnArtists.setOnClickListener(clickListener);
	}

	View.OnClickListener clickListener = new View.OnClickListener() {
		@Override
		public void onClick(View view) {
			switch (view.getId()) {
				case R.id.btnFavorites: {
					// open Favorite activity using Intent
					Intent intent = new Intent(staticInstance, FavoriteSongsActivity.class);
					startActivity(intent);
				}
				break;
				case R.id.btnSearch: {
					Intent intent = new Intent(staticInstance, SearchActivity.class);
					startActivity(intent);
				}
				break;
				case R.id.btnPlaylists: {
					Intent intent = new Intent(staticInstance, PlaylistsActivity.class);
					startActivity(intent);
				}
				break;
				case R.id.btnArtists: {
					Intent intent = new Intent(staticInstance, ArtistsActivity.class);
					startActivity(intent);
				}
				break;
			}
		}
	};
}
