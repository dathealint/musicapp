package datnguyen.com.musicapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

import datnguyen.com.musicapp.R;

/**
 * Created by datnguyen on 12/20/16.
 */

public class BaseListViewAdapter extends ArrayAdapter {

	public BaseListViewAdapter(Context context,List objects) {
		super(context, R.layout.row_list_item, objects);
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		ViewHolder viewHolder;
		// create a new view
		if (convertView == null) {
			viewHolder = new ViewHolder();
			LayoutInflater layoutInflater = LayoutInflater.from(getContext());
			convertView = layoutInflater.inflate(R.layout.row_list_item, parent, false);
			viewHolder.tvTitle = (TextView) convertView.findViewById(R.id.tvTitle);

			// cache viewholder
			convertView.setTag(viewHolder);
		} else {
			viewHolder = (ViewHolder) convertView.getTag();
		}

		String name = (String) getItem(position);
		viewHolder.tvTitle.setText(name);

		return convertView;
	}

	// View Holder - for caching
	protected static class ViewHolder {
		TextView tvTitle;
	}


}
