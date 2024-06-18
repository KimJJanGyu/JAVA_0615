package com.example.myapplication.ui.hongji;

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

public class Hongji3fFragment extends Fragment {
    private ImageView overlayImageView;
    private TextView lastClickedTextView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_hongji3f, container, false);

        overlayImageView = view.findViewById(R.id.overlay_image);

        TextView textView1 = view.findViewById(R.id.hongji3f_1);
        TextView textView2 = view.findViewById(R.id.hongji3f_2);
        TextView textView3 = view.findViewById(R.id.hongji3f_3);
        TextView textView4 = view.findViewById(R.id.hongji3f_4);
        TextView textView5 = view.findViewById(R.id.hongji3f_5);
        TextView textView6 = view.findViewById(R.id.hongji3f_6);
        TextView textView7 = view.findViewById(R.id.hongji3f_7);
        TextView textView8 = view.findViewById(R.id.hongji3f_8);
        TextView textView9 = view.findViewById(R.id.hongji3f_9);
        TextView textView10 = view.findViewById(R.id.hongji3f_10);
        TextView textView11 = view.findViewById(R.id.hongji3f_11);
        TextView textView12 = view.findViewById(R.id.hongji3f_12);
        TextView textView13 = view.findViewById(R.id.hongji3f_13);
        TextView textView14 = view.findViewById(R.id.hongji3f_14);
        TextView textView15 = view.findViewById(R.id.hongji3f_15);

        textView1.setOnClickListener(v -> handleTextViewClick(textView1, R.drawable.ic_maker));
        textView2.setOnClickListener(v -> handleTextViewClick(textView2, R.drawable.ic_maker));
        textView3.setOnClickListener(v -> handleTextViewClick(textView3, R.drawable.ic_maker));
        textView4.setOnClickListener(v -> handleTextViewClick(textView4, R.drawable.ic_maker));
        textView5.setOnClickListener(v -> handleTextViewClick(textView5, R.drawable.ic_maker));
        textView6.setOnClickListener(v -> handleTextViewClick(textView6, R.drawable.ic_maker));
        textView7.setOnClickListener(v -> handleTextViewClick(textView7, R.drawable.ic_maker));
        textView8.setOnClickListener(v -> handleTextViewClick(textView8, R.drawable.ic_maker));
        textView9.setOnClickListener(v -> handleTextViewClick(textView9, R.drawable.ic_maker));
        textView10.setOnClickListener(v -> handleTextViewClick(textView10, R.drawable.ic_maker));
        textView11.setOnClickListener(v -> handleTextViewClick(textView11, R.drawable.ic_maker));
        textView12.setOnClickListener(v -> handleTextViewClick(textView12, R.drawable.ic_maker));
        textView13.setOnClickListener(v -> handleTextViewClick(textView13, R.drawable.ic_maker));
        textView14.setOnClickListener(v -> handleTextViewClick(textView14, R.drawable.ic_maker));
        textView15.setOnClickListener(v -> handleTextViewClick(textView15, R.drawable.ic_maker));

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
            if (textView.getId() == R.id.hongji3f_1) {
                params.leftMargin = 130;
                params.topMargin = 450;
            } else if (textView.getId() == R.id.hongji3f_2) {
                params.leftMargin = 220;
                params.topMargin = 100;
            } else if (textView.getId() == R.id.hongji3f_3) {
                params.leftMargin = 300;
                params.topMargin = 100;
            } else if (textView.getId() == R.id.hongji3f_4) {
                params.leftMargin = 410;
                params.topMargin = 100;
            } else if (textView.getId() == R.id.hongji3f_5) {
                params.leftMargin = 510;
                params.topMargin = 100;
            }else if (textView.getId() == R.id.hongji3f_6) {
                params.leftMargin = 610;
                params.topMargin = 100;
            }else if (textView.getId() == R.id.hongji3f_7) {
                params.leftMargin = 710;
                params.topMargin = 100;
            }else if (textView.getId() == R.id.hongji3f_8) {
                params.leftMargin = 900;
                params.topMargin = 200;
            }else if (textView.getId() == R.id.hongji3f_9) {
                params.leftMargin = 220;
                params.topMargin = 450;
            }else if (textView.getId() == R.id.hongji3f_10) {
                params.leftMargin = 320;
                params.topMargin = 450;
            }else if (textView.getId() == R.id.hongji3f_11) {
                params.leftMargin = 400;
                params.topMargin = 450;
            }else if (textView.getId() == R.id.hongji3f_12) {
                params.leftMargin = 470;
                params.topMargin = 450;
            }else if (textView.getId() == R.id.hongji3f_13) {
                params.leftMargin = 950;
                params.topMargin = 100;
            }else if (textView.getId() == R.id.hongji3f_14) {
                params.leftMargin = 1000;
                params.topMargin = 100;
            } else if (textView.getId() == R.id.hongji3f_15) {
                params.leftMargin = 700;
                params.topMargin = 450;
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
