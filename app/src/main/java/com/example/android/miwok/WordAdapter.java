package com.example.android.miwok;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {
    /** Resource ID for the color Resource value */
    private int mColorResourceId;
    public WordAdapter(Context context, ArrayList<Word> word, int colorResourceID)
    {
        super(context, 0, word);
        mColorResourceId = colorResourceID;
    }
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null)
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        Word currentWord = getItem(position);

        //find the view on which to set the color
        View containerView = listItemView.findViewById(R.id.coloredView);

        //find the color the resource id maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);

        //set the background color of the view
        containerView.setBackgroundColor(color);

        //find the miwok textview and set translated word
        TextView tv1 = (TextView) listItemView.findViewById(R.id.miwokText);
        tv1.setText(currentWord.getMiwokTranslation());

        //find the default textView and set the default word
        TextView tv2 = (TextView) listItemView.findViewById(R.id.defaultText);
        tv2.setText(currentWord.getDefaultTranslation());

        //find the imageview and set the image
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        if (currentWord.hasImage())
        {
            imageView.setImageResource(currentWord.getImageResourceID());
            imageView.setVisibility(View.VISIBLE);
        }
        else
            imageView.setVisibility(View.GONE);
        return listItemView;
    }
}
