package com.example.myapplication.ui.hongji;


import android.annotation.SuppressLint;
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

public class Hongji4fFragment extends Fragment {
    private ImageView overlayImageView;
    private TextView lastClickedTextView;

    @SuppressLint("MissingInflatedId")
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_hongji4f, container, false);

        overlayImageView = view.findViewById(R.id.overlay_image);

        TextView textView1 = view.findViewById(R.id.text_hongji4f1);
        TextView textView2 = view.findViewById(R.id.text_hongji4f2);
        TextView textView3 = view.findViewById(R.id.text_hongji4f3);
        TextView textView4 = view.findViewById(R.id.text_hongji4f4);
        TextView textView5 = view.findViewById(R.id.text_hongji4f5);
        TextView textView6 = view.findViewById(R.id.text_hongji4f6);
        TextView textView7 = view.findViewById(R.id.text_hongji4f7);
        TextView textView8 = view.findViewById(R.id.text_hongji4f8);
        TextView textView9 = view.findViewById(R.id.text_hongji4f9);
        TextView textView10 = view.findViewById(R.id.text_hongji4f10);
        TextView textView11 = view.findViewById(R.id.text_hongji4f11);
        TextView textView12 = view.findViewById(R.id.text_hongji4f12);
        TextView textView13= view.findViewById(R.id.text_hongji4f13);
        TextView textView14 = view.findViewById(R.id.text_hongji4f14);
        TextView textView15 = view.findViewById(R.id.text_hongji4f15);
        TextView textView16 = view.findViewById(R.id.text_hongji4f16);
        TextView textView17 = view.findViewById(R.id.text_hongji4f17);
        TextView textView18 = view.findViewById(R.id.text_hongji4f18);


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
        textView16.setOnClickListener(v -> handleTextViewClick(textView16, R.drawable.ic_maker));
        textView17.setOnClickListener(v -> handleTextViewClick(textView17, R.drawable.ic_maker));
        textView18.setOnClickListener(v -> handleTextViewClick(textView18, R.drawable.ic_maker));

        return view;
    }

    private void handleTextViewClick(TextView textView, int imageResId) {
        if (lastClickedTextView != null && lastClickedTextView == textView) {
            overlayImageView.setVisibility(View.GONE);
            lastClickedTextView = null;
        } else {
            // Set the image resource
            overlayImageView.setImageResource(imageResId);

            // Use ConstraintSet to modify constraints
            ConstraintLayout.LayoutParams params = (ConstraintLayout.LayoutParams) overlayImageView.getLayoutParams();

            if (textView.getId() == R.id.text_hongji4f1) {
                params.leftMargin = 130;
                params.topMargin = 450;
            } else if (textView.getId() == R.id.text_hongji4f2) {
                params.leftMargin = 220;
                params.topMargin = 100;
            } else if (textView.getId() == R.id.text_hongji4f3) {
                params.leftMargin = 300;
                params.topMargin = 100;
            } else if (textView.getId() == R.id.text_hongji4f4) {
                params.leftMargin = 820;
                params.topMargin = 450;
            } else if (textView.getId() == R.id.text_hongji4f5) {
                params.leftMargin = 220;
                params.topMargin = 230;
            }else if (textView.getId() == R.id.text_hongji4f6) {
                params.leftMargin = 700;
                params.topMargin = 450;
            }else if (textView.getId() == R.id.text_hongji4f7) {
                params.leftMargin = 320;
                params.topMargin = 230;
            }else if (textView.getId() == R.id.text_hongji4f8) {
                params.leftMargin = 440;
                params.topMargin = 100;
            }else if (textView.getId() == R.id.text_hongji4f9) {
                params.leftMargin = 590;
                params.topMargin = 100;
            }else if (textView.getId() == R.id.text_hongji4f10) {
                params.leftMargin = 720;
                params.topMargin = 100;
            }else if (textView.getId() == R.id.text_hongji4f11) {
                params.leftMargin = 840;
                params.topMargin = 100;
            }else if (textView.getId() == R.id.text_hongji4f12) {
                params.leftMargin = 200;
                params.topMargin = 450;
            }else if (textView.getId() == R.id.text_hongji4f13) {
                params.leftMargin = 280;
                params.topMargin = 450;
            }else if (textView.getId() == R.id.text_hongji4f14) {
                params.leftMargin = 370;
                params.topMargin = 450;
            }else if (textView.getId() == R.id.text_hongji4f15) {
                params.leftMargin = 440;
                params.topMargin = 450;
            }else if (textView.getId() == R.id.text_hongji4f16) {
                params.leftMargin = 1000;
                params.topMargin = 100;
            }else if (textView.getId() == R.id.text_hongji4f17) {
                params.leftMargin = 1000;
                params.topMargin = 170;
            }else if (textView.getId() == R.id.text_hongji4f18) {
                params.leftMargin = 930;
                params.topMargin = 450;
            }
            // Add more conditions as needed for other TextViews

            // Apply the modified constraints
            overlayImageView.setLayoutParams(params);

            // Make overlayImageView visible
            overlayImageView.setVisibility(View.VISIBLE);

            // Set the last clicked textView
            lastClickedTextView = textView;
        }
    }
}
