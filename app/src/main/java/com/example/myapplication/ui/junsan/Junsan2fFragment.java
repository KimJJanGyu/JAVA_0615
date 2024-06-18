package com.example.myapplication.ui.junsan;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;

import com.example.myapplication.R;


public class Junsan2fFragment extends Fragment {
    private ImageView overlayImageView;
    private TextView lastClickedTextView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_junsan2f, container, false);

        overlayImageView = view.findViewById(R.id.overlay_image);

        TextView textView1 = view.findViewById(R.id.junsan2f_1);
        TextView textView2 = view.findViewById(R.id.junsan2f_2);
        TextView textView3 = view.findViewById(R.id.junsan2f_3);
        TextView textView4 = view.findViewById(R.id.junsan2f_4);
        TextView textView5 = view.findViewById(R.id.junsan2f_5);
        TextView textView6 = view.findViewById(R.id.junsan2f_6);
        TextView textView7 = view.findViewById(R.id.junsan2f_7);
        TextView textView8 = view.findViewById(R.id.junsan2f_8);
        TextView textView9 = view.findViewById(R.id.junsan2f_9);
        TextView textView10 = view.findViewById(R.id.junsan2f_10);
        TextView textView11 = view.findViewById(R.id.junsan2f_11);
        TextView textView12 = view.findViewById(R.id.junsan2f_12);
        TextView textView13 = view.findViewById(R.id.junsan2f_13);

        textView1.setOnClickListener(v -> handleTextViewClick(textView1, R.drawable.ic_maker)); // Replace R.drawable.image1 with your actual image
        textView2.setOnClickListener(v -> handleTextViewClick(textView2, R.drawable.ic_maker)); // Replace R.drawable.image2 with your actual image
        textView3.setOnClickListener(v -> handleTextViewClick(textView3, R.drawable.ic_maker)); // Replace R.drawable.image3 with your actual image
        textView4.setOnClickListener(v -> handleTextViewClick(textView4, R.drawable.ic_maker)); // Replace R.drawable.image3 with your actual image
        textView5.setOnClickListener(v -> handleTextViewClick(textView5, R.drawable.ic_maker)); // Replace R.drawable.image1 with your actual image
        textView6.setOnClickListener(v -> handleTextViewClick(textView6, R.drawable.ic_maker)); // Replace R.drawable.image2 with your actual image
        textView7.setOnClickListener(v -> handleTextViewClick(textView7, R.drawable.ic_maker)); // Replace R.drawable.image3 with your actual image
        textView8.setOnClickListener(v -> handleTextViewClick(textView8, R.drawable.ic_maker)); // Replace R.drawable.image1 with your actual image
        textView9.setOnClickListener(v -> handleTextViewClick(textView9, R.drawable.ic_maker)); // Replace R.drawable.image2 with your actual image
        textView10.setOnClickListener(v -> handleTextViewClick(textView10, R.drawable.ic_maker)); // Replace R.drawable.image1 with your actual image
        textView11.setOnClickListener(v -> handleTextViewClick(textView11, R.drawable.ic_maker)); // Replace R.drawable.image3 with your actual image
        textView12.setOnClickListener(v -> handleTextViewClick(textView12, R.drawable.ic_maker)); // Replace R.drawable.image3 with your actual image
        textView13.setOnClickListener(v -> handleTextViewClick(textView13, R.drawable.ic_maker)); // Replace R.drawable.image1 with your actual image



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
            if (textView.getId() == R.id.junsan2f_1) {
                params.leftMargin = 900;
                params.topMargin = 560;
            } else if (textView.getId() == R.id.junsan2f_2) {
                params.leftMargin = 900;
                params.topMargin = 450;
            } else if (textView.getId() == R.id.junsan2f_3) {
                params.leftMargin = 780;
                params.topMargin = 570;
            } else if (textView.getId() == R.id.junsan2f_4) {
                params.leftMargin = 670;
                params.topMargin = 500;
            } else if (textView.getId() == R.id.junsan2f_5) {
                params.leftMargin = 260;
                params.topMargin = 360;
            } else if (textView.getId() == R.id.junsan2f_6) {
                params.leftMargin = 320;
                params.topMargin = 360;
            } else if (textView.getId() == R.id.junsan2f_7) {
                params.leftMargin = 380;
                params.topMargin = 360;
            } else if (textView.getId() == R.id.junsan2f_8) {
                params.leftMargin = 80;
                params.topMargin = 550;
            } else if (textView.getId() == R.id.junsan2f_9) {
                params.leftMargin = 80;
                params.topMargin = 480;
            }
            else if (textView.getId() == R.id.junsan2f_10) {
                params.leftMargin = 80;
                params.topMargin = 370;
            }
            else if (textView.getId() == R.id.junsan2f_11) {
                params.leftMargin = 780;
                params.topMargin = 200;
            }
            else if (textView.getId() == R.id.junsan2f_12) {
                params.leftMargin = 930;
                params.topMargin = 230;
            }
            else if (textView.getId() == R.id.junsan2f_13) {
                params.leftMargin = 930;
                params.topMargin = 310;
            }
            // Add more conditions as needed for other TextViews

            // Apply the modified layout parameters
            overlayImageView.setLayoutParams(params);

            // Make overlayImageView visible
            overlayImageView.setVisibility(View.VISIBLE);

            // Set the last clicked textView
            lastClickedTextView = textView;
        }
    }
}
