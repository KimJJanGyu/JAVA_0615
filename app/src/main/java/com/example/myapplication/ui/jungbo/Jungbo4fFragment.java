package com.example.myapplication.ui.jungbo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;

import com.example.myapplication.R;

public class Jungbo4fFragment extends Fragment {
    private ImageView overlayImageView;
    private TextView lastClickedTextView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_jungbo4f, container, false);

        overlayImageView = view.findViewById(R.id.overlay_image);

        TextView textView1 = view.findViewById(R.id.text_jungbo4f1);
        TextView textView2 = view.findViewById(R.id.text_jungbo4f2);
        TextView textView3 = view.findViewById(R.id.text_jungbo4f3);
        TextView textView4 = view.findViewById(R.id.text_jungbo4f4);
        TextView textView5 = view.findViewById(R.id.text_jungbo4f5);
        TextView textView6 = view.findViewById(R.id.text_jungbo4f6);
        TextView textView7 = view.findViewById(R.id.text_jungbo4f7);
        TextView textView8 = view.findViewById(R.id.text_jungbo4f8);
        TextView textView9 = view.findViewById(R.id.text_jungbo4f9);
        TextView textView10 = view.findViewById(R.id.text_jungbo4f10);
        TextView textView11 = view.findViewById(R.id.text_jungbo4f11);


        textView1.setOnClickListener(v -> handleTextViewClick(textView1, R.drawable.ic_maker));
        textView2.setOnClickListener(v -> handleTextViewClick(textView2, R.drawable.ic_maker));
        textView3.setOnClickListener(v -> handleTextViewClick(textView3, R.drawable.ic_maker));
        textView3.setOnClickListener(v -> handleTextViewClick(textView4, R.drawable.ic_maker));
        textView3.setOnClickListener(v -> handleTextViewClick(textView5, R.drawable.ic_maker));
        textView3.setOnClickListener(v -> handleTextViewClick(textView6, R.drawable.ic_maker));
        textView3.setOnClickListener(v -> handleTextViewClick(textView7, R.drawable.ic_maker));
        textView3.setOnClickListener(v -> handleTextViewClick(textView8, R.drawable.ic_maker));
        textView3.setOnClickListener(v -> handleTextViewClick(textView9, R.drawable.ic_maker));
        textView3.setOnClickListener(v -> handleTextViewClick(textView10, R.drawable.ic_maker));
        textView3.setOnClickListener(v -> handleTextViewClick(textView11, R.drawable.ic_maker));



        return view;
    }

    private void handleTextViewClick(TextView textView, int imageResId) {
        if (lastClickedTextView != null && lastClickedTextView == textView) {
            overlayImageView.setVisibility(View.GONE);
            lastClickedTextView = null;
        } else {
            // Set the image resource
            overlayImageView.setImageResource(imageResId);

            // Get the layout parameters of overlayImageView
            ConstraintLayout.LayoutParams params = (ConstraintLayout.LayoutParams) overlayImageView.getLayoutParams();

            // Set the margins to move overlayImageView to the desired coordinates
            if (textView.getId() == R.id.text_jungbo4f1) {
                params.leftMargin = 290;
                params.topMargin = 400;
            } else if (textView.getId() == R.id.text_jungbo4f2) {
                params.leftMargin = 130;
                params.topMargin = 200;
            } else if (textView.getId() == R.id.text_jungbo4f3) {
                params.leftMargin = 350;
                params.topMargin = 200;
            } else if (textView.getId() == R.id.text_jungbo4f4) {
                params.leftMargin = 350;
                params.topMargin = 350;
            }else if (textView.getId() == R.id.text_jungbo4f5) {
                params.leftMargin = 450;
                params.topMargin = 650;
            }else if (textView.getId() == R.id.text_jungbo4f6) {
                params.leftMargin = 320;
                params.topMargin = 740;
            }else if (textView.getId() == R.id.text_jungbo4f7) {
                params.leftMargin = 350;
                params.topMargin = 600;
            }else if (textView.getId() == R.id.text_jungbo4f8) {
                params.leftMargin = 500;
                params.topMargin = 450;
            }else if (textView.getId() == R.id.text_jungbo4f9) {
                params.leftMargin = 350;
                params.topMargin = 500;
            }else if (textView.getId() == R.id.text_jungbo4f10) {
                params.leftMargin = 760;
                params.topMargin = 370;
            }else if (textView.getId() == R.id.text_jungbo4f11) {
                params.leftMargin = 350;
                params.topMargin = 650;
            }// Add more conditions as needed for other TextViews

            // Apply the modified layout parameters
            overlayImageView.setLayoutParams(params);

            // Make overlayImageView visible
            overlayImageView.setVisibility(View.VISIBLE);

            // Set the last clicked textView
            lastClickedTextView = textView;
        }
    }
}
