package com.example.android.moodsounds;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class MusicAdapter extends ArrayAdapter<Music> {

    /**
     * Custom constructor
     *
     * @param context The current context. Used to inflate the layout file.
     * @param musics  A List of Musics objects to display in a list
     */
    public MusicAdapter(Activity context, ArrayList<Music> musics) {
        super(context, 0, musics);
    }

    /**
     * View for AdapterView
     *
     * @param position    The position in the list of data that should be displayed in the
     *                    list item view.
     * @param convertView The recycled view to populate.
     * @param parent      The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.music_item, parent, false);
        }
        // Get the {@link Music} object located at this position in the list
        Music currentMusic = getItem(position);

        // Find the TextView with the ID musicTitle
        TextView musicTitle = (TextView) listItemView.findViewById(R.id.musicTitle);
        // Get the music title and set it on the TextView
        musicTitle.setText(currentMusic.getMusicTitle());

        // Find the TextView with the ID musicAuthor
        TextView musicAuthor = (TextView) listItemView.findViewById(R.id.musicAuthor);
        // Get the music title and set it on the TextView
        musicAuthor.setText(currentMusic.getMusicAuthor());

        // Return the whole list item layout
        return listItemView;

    }
}