package com.example.myapplication.ui.sooam;


import android.graphics.Color;
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


public class Sooam2fFragment extends Fragment {
    private ImageView overlayImageView;
    private TextView lastClickedTextView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_sooam2f, container, false);

        overlayImageView = view.findViewById(R.id.overlay_image);

        TextView textView1 = view.findViewById(R.id.sooam2f_1);
        TextView textView2 = view.findViewById(R.id.sooam2f_2);
        TextView textView3 = view.findViewById(R.id.sooam2f_3);
        TextView textView4 = view.findViewById(R.id.sooam2f_4);
        TextView textView5 = view.findViewById(R.id.sooam2f_5);
        TextView textView6 = view.findViewById(R.id.sooam2f_6);
        TextView textView7 = view.findViewById(R.id.sooam2f_7);
        TextView textView8 = view.findViewById(R.id.sooam2f_8);
        TextView textView9 = view.findViewById(R.id.sooam2f_9);
        TextView textView10 = view.findViewById(R.id.sooam2f_10);
        TextView textView11 = view.findViewById(R.id.sooam2f_11);
        TextView textView12 = view.findViewById(R.id.sooam2f_12);
        TextView textView13 = view.findViewById(R.id.sooam2f_13);
        TextView textView14 = view.findViewById(R.id.sooam2f_14);
        TextView textView15 = view.findViewById(R.id.sooam2f_15);
        TextView textView16 = view.findViewById(R.id.sooam2f_16);
        TextView textView17 = view.findViewById(R.id.sooam2f_17);
        TextView textView18 = view.findViewById(R.id.sooam2f_18);
        TextView textView19 = view.findViewById(R.id.sooam2f_19);
        TextView textView20 = view.findViewById(R.id.sooam2f_20);
        TextView textView21 = view.findViewById(R.id.sooam2f_21);
        TextView textView22 = view.findViewById(R.id.sooam2f_22);
        TextView textView23 = view.findViewById(R.id.sooam2f_23);
        TextView textView24 = view.findViewById(R.id.sooam2f_24);
        TextView textView25 = view.findViewById(R.id.sooam2f_25);
        TextView textView26 = view.findViewById(R.id.sooam2f_26);
        TextView textView27 = view.findViewById(R.id.sooam2f_27);
        TextView textView28 = view.findViewById(R.id.sooam2f_28);
        TextView textView29 = view.findViewById(R.id.sooam2f_29);
        TextView textView30 = view.findViewById(R.id.sooam2f_30);


        textView1.setOnClickListener(v -> handleTextViewClick(textView1, R.drawable.ic_maker)); // Replace R.drawable.image1 with your actual image
        textView2.setOnClickListener(v -> handleTextViewClick(textView2, R.drawable.ic_maker)); // Replace R.drawable.image2 with your actual image
        textView3.setOnClickListener(v -> handleTextViewClick(textView3, R.drawable.ic_maker)); // Replace R.drawable.image3 with your actual image
        textView4.setOnClickListener(v -> handleTextViewClick(textView4, R.drawable.ic_maker)); // Replace R.drawable.image4 with your actual image
        textView5.setOnClickListener(v -> handleTextViewClick(textView5, R.drawable.ic_maker)); // Replace R.drawable.image5 with your actual image
        textView6.setOnClickListener(v -> handleTextViewClick(textView6, R.drawable.ic_maker)); // Replace R.drawable.image6 with your actual image
        textView7.setOnClickListener(v -> handleTextViewClick(textView7, R.drawable.ic_maker)); // Replace R.drawable.image7 with your actual image
        textView8.setOnClickListener(v -> handleTextViewClick(textView8, R.drawable.ic_maker)); // Replace R.drawable.image8 with your actual image
        textView9.setOnClickListener(v -> handleTextViewClick(textView9, R.drawable.ic_maker)); // Replace R.drawable.image9 with your actual image
        textView10.setOnClickListener(v -> handleTextViewClick(textView10, R.drawable.ic_maker)); // Replace R.drawable.image10 with your actual image
        textView11.setOnClickListener(v -> handleTextViewClick(textView11, R.drawable.ic_maker)); // Replace R.drawable.image11 with your actual image
        textView12.setOnClickListener(v -> handleTextViewClick(textView12, R.drawable.ic_maker)); // Replace R.drawable.image12 with your actual image
        textView13.setOnClickListener(v -> handleTextViewClick(textView13, R.drawable.ic_maker)); // Replace R.drawable.image13 with your actual image
        textView14.setOnClickListener(v -> handleTextViewClick(textView14, R.drawable.ic_maker)); // Replace R.drawable.image14 with your actual image
        textView15.setOnClickListener(v -> handleTextViewClick(textView15, R.drawable.ic_maker)); // Replace R.drawable.image15 with your actual image
        textView16.setOnClickListener(v -> handleTextViewClick(textView16, R.drawable.ic_maker)); // Replace R.drawable.image16 with your actual image
        textView17.setOnClickListener(v -> handleTextViewClick(textView17, R.drawable.ic_maker)); // Replace R.drawable.image17 with your actual image
        textView18.setOnClickListener(v -> handleTextViewClick(textView18, R.drawable.ic_maker)); // Replace R.drawable.image18 with your actual image
        textView19.setOnClickListener(v -> handleTextViewClick(textView19, R.drawable.ic_maker)); // Replace R.drawable.image19 with your actual image
        textView20.setOnClickListener(v -> handleTextViewClick(textView20, R.drawable.ic_maker)); // Replace R.drawable.image20 with your actual image
        textView21.setOnClickListener(v -> handleTextViewClick(textView21, R.drawable.ic_maker)); // Replace R.drawable.image21 with your actual image
        textView22.setOnClickListener(v -> handleTextViewClick(textView22, R.drawable.ic_maker)); // Replace R.drawable.image22 with your actual image
        textView23.setOnClickListener(v -> handleTextViewClick(textView23, R.drawable.ic_maker)); // Replace R.drawable.image23 with your actual image
        textView24.setOnClickListener(v -> handleTextViewClick(textView24, R.drawable.ic_maker)); // Replace R.drawable.image24 with your actual image
        textView25.setOnClickListener(v -> handleTextViewClick(textView25, R.drawable.ic_maker)); // Replace R.drawable.image25 with your actual image
        textView26.setOnClickListener(v -> handleTextViewClick(textView26, R.drawable.ic_maker)); // Replace R.drawable.image26 with your actual image
        textView27.setOnClickListener(v -> handleTextViewClick(textView27, R.drawable.ic_maker)); // Replace R.drawable.image27 with your actual image
        textView28.setOnClickListener(v -> handleTextViewClick(textView28, R.drawable.ic_maker)); // Replace R.drawable.image28 with your actual image
        textView29.setOnClickListener(v -> handleTextViewClick(textView29, R.drawable.ic_maker)); // Replace R.drawable.image29 with your actual image
        textView30.setOnClickListener(v -> handleTextViewClick(textView30, R.drawable.ic_maker)); // Replace R.drawable.image30 with your actual image



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
            if (textView.getId() == R.id.sooam2f_1) {
                params.leftMargin = 100;
                params.topMargin = 380;
            } else if (textView.getId() == R.id.sooam2f_2) {
                params.leftMargin = 450;
                params.topMargin = 330;
            } else if (textView.getId() == R.id.sooam2f_3) {
                params.leftMargin = 780;
                params.topMargin = 320;
            } else if (textView.getId() == R.id.sooam2f_4) {
                params.leftMargin = 450;
                params.topMargin = 330;
            } else if (textView.getId() == R.id.sooam2f_5) {
                params.leftMargin = 780;
                params.topMargin = 320;
            } else if (textView.getId() == R.id.sooam2f_6) {
                params.leftMargin = 450;
                params.topMargin = 330;
            } else if (textView.getId() == R.id.sooam2f_7) {
                params.leftMargin = 780;
                params.topMargin = 320;
            } else if (textView.getId() == R.id.sooam2f_8) {
                params.leftMargin = 450;
                params.topMargin = 330;
            } else if (textView.getId() == R.id.sooam2f_9) {
                params.leftMargin = 780;
                params.topMargin = 320;
            } else if (textView.getId() == R.id.sooam2f_10) {
                params.leftMargin = 450;
                params.topMargin = 330;
            } else if (textView.getId() == R.id.sooam2f_11) {
                params.leftMargin = 780;
                params.topMargin = 320;
            } else if (textView.getId() == R.id.sooam2f_12) {
                params.leftMargin = 450;
                params.topMargin = 330;
            } else if (textView.getId() == R.id.sooam2f_13) {
                params.leftMargin = 780;
                params.topMargin = 320;
            } else if (textView.getId() == R.id.sooam2f_14) {
                params.leftMargin = 450;
                params.topMargin = 330;
            } else if (textView.getId() == R.id.sooam2f_15) {
                params.leftMargin = 780;
                params.topMargin = 320;
            } else if (textView.getId() == R.id.sooam2f_16) {
                params.leftMargin = 450;
                params.topMargin = 330;
            } else if (textView.getId() == R.id.sooam2f_17) {
                params.leftMargin = 780;
                params.topMargin = 320;
            } else if (textView.getId() == R.id.sooam2f_18) {
                params.leftMargin = 450;
                params.topMargin = 330;
            } else if (textView.getId() == R.id.sooam2f_19) {
                params.leftMargin = 780;
                params.topMargin = 320;
            } else if (textView.getId() == R.id.sooam2f_20) {
                params.leftMargin = 450;
                params.topMargin = 330;
            } else if (textView.getId() == R.id.sooam2f_21) {
                params.leftMargin = 780;
                params.topMargin = 320;
            } else if (textView.getId() == R.id.sooam2f_22) {
                params.leftMargin = 450;
                params.topMargin = 330;
            } else if (textView.getId() == R.id.sooam2f_23) {
                params.leftMargin = 780;
                params.topMargin = 320;
            } else if (textView.getId() == R.id.sooam2f_24) {
                params.leftMargin = 450;
                params.topMargin = 330;
            } else if (textView.getId() == R.id.sooam2f_25) {
                params.leftMargin = 780;
                params.topMargin = 320;
            } else if (textView.getId() == R.id.sooam2f_26) {
                params.leftMargin = 450;
                params.topMargin = 330;
            } else if (textView.getId() == R.id.sooam2f_27) {
                params.leftMargin = 780;
                params.topMargin = 320;
            } else if (textView.getId() == R.id.sooam2f_28) {
                params.leftMargin = 450;
                params.topMargin = 330;
            } else if (textView.getId() == R.id.sooam2f_29) {
                params.leftMargin = 780;
                params.topMargin = 320;
            } else if (textView.getId() == R.id.sooam2f_30) {
                params.leftMargin = 780;
                params.topMargin = 320;
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