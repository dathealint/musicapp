package datnguyen.com.musicapp.Activities;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.support.v7.app.AppCompatActivity;
import java.util.ArrayList;

import datnguyen.com.musicapp.R;

/**
 * Created by datnguyen on 12/20/16.
 */

public class BaseListViewActivity extends AppCompatActivity {

	public ArrayList elements = new ArrayList();
	public ListView listView = null;
	private BaseListViewAdapter adapter = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_base_list_items);

		getSupportActionBar().setDisplayHomeAsUpEnabled(true);

		// grab controls
		listView = (ListView) findViewById(R.id.lvListView);
		listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
				handleItemClick(i);
			}
		});
		listView.setMinimumHeight((int) getResources().getDimension(R.dimen.list_min_row_height));

		adapter = new BaseListViewAdapter(this, elements);
		listView.setAdapter(adapter);

		// call relaod data to grab latest data source for listview
		reloadData();

		// after that, reload listview
		reloadListView();
	}

	private void reloadListView() {
		adapter.clear();
		adapter.addAll(elements);

		adapter.notifyDataSetChanged();
	}

	public void reloadData() {
		// Dummy data for now, subclasses can override and setup another dataset
		elements = new ArrayList();
		for (int i = 0; i < 10; i++) {
			elements.add(String.format("%s %d", this.getClass().getSimpleName(), i + 1));
		}
	}

	public void handleItemClick(int position) {
		// implemented by subclasses
	}

}
