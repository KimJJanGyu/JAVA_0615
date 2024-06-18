package com.example.myapplication.ui.hanlim;

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

public class Hanlim2fFragment extends Fragment {
    private ImageView overlayImageView;
    private TextView lastClickedTextView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_hanlim2f, container, false);

        overlayImageView = view.findViewById(R.id.overlay_image);

        TextView textView1 = view.findViewById(R.id.text_hanlim2f1);
        TextView textView2 = view.findViewById(R.id.text_hanlim2f2);
        TextView textView3 = view.findViewById(R.id.text_hanlim2f3);
        TextView textView4 = view.findViewById(R.id.text_hanlim2f4);
        TextView textView5 = view.findViewById(R.id.text_hanlim2f5);
        TextView textView6 = view.findViewById(R.id.text_hanlim2f6);
        TextView textView7 = view.findViewById(R.id.text_hanlim2f7);
        TextView textView8 = view.findViewById(R.id.text_hanlim2f8);
        TextView textView9 = view.findViewById(R.id.text_hanlim2f9);
        TextView textView10 = view.findViewById(R.id.text_hanlim2f10);
        TextView textView11 = view.findViewById(R.id.text_hanlim2f11);
        TextView textView12 = view.findViewById(R.id.text_hanlim2f12);
        TextView textView13 = view.findViewById(R.id.text_hanlim2f13);
        TextView textView14 = view.findViewById(R.id.text_hanlim2f14);
        TextView textView15 = view.findViewById(R.id.text_hanlim2f15);
        TextView textView16 = view.findViewById(R.id.text_hanlim2f16);
        TextView textView17 = view.findViewById(R.id.text_hanlim2f17);
        TextView textView18 = view.findViewById(R.id.text_hanlim2f18);

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
        textView11.setOnClickListener(v -> handleTextViewClick(textView10, R.drawable.ic_maker));
        textView12.setOnClickListener(v -> handleTextViewClick(textView10, R.drawable.ic_maker));
        textView13.setOnClickListener(v -> handleTextViewClick(textView10, R.drawable.ic_maker));
        textView14.setOnClickListener(v -> handleTextViewClick(textView10, R.drawable.ic_maker));
        textView15.setOnClickListener(v -> handleTextViewClick(textView10, R.drawable.ic_maker));
        textView16.setOnClickListener(v -> handleTextViewClick(textView10, R.drawable.ic_maker));
        textView17.setOnClickListener(v -> handleTextViewClick(textView10, R.drawable.ic_maker));
        textView18.setOnClickListener(v -> handleTextViewClick(textView10, R.drawable.ic_maker));



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
            if (textView.getId() == R.id.text_hanlim2f1) {
                params.leftMargin = 70;
                params.topMargin = 870;
            } else if (textView.getId() == R.id.text_hanlim2f2) {
                params.leftMargin = 130;
                params.topMargin = 800;
            } else if (textView.getId() == R.id.text_hanlim2f3) {
                params.leftMargin = 130;
                params.topMargin = 570;
            } else if (textView.getId() == R.id.text_hanlim2f4) {
                params.leftMargin = 370;
                params.topMargin = 670;
            } else if (textView.getId() == R.id.text_hanlim2f5) {
                params.leftMargin = 400;
                params.topMargin = 940;
            }else if (textView.getId() == R.id.text_hanlim2f6) {
                params.leftMargin = 70;
                params.topMargin = 200;
            }else if (textView.getId() == R.id.text_hanlim2f7) {
                params.leftMargin = 70;
                params.topMargin = 290;
            }else if (textView.getId() == R.id.text_hanlim2f8) {
                params.leftMargin = 70;
                params.topMargin = 350;
            }else if (textView.getId() == R.id.text_hanlim2f9) {
                params.leftMargin = 70;
                params.topMargin = 400;
            }else if (textView.getId() == R.id.text_hanlim2f10) {
                params.leftMargin = 70;
                params.topMargin = 430;
            }else if (textView.getId() == R.id.text_hanlim2f11) {
                params.leftMargin = 100;
                params.topMargin = 110;
            }else if (textView.getId() == R.id.text_hanlim2f12) {
                params.leftMargin = 370;
                params.topMargin = 300;
            }else if (textView.getId() == R.id.text_hanlim2f13) {
                params.leftMargin = 370;
                params.topMargin = 1180;
            }else if (textView.getId() == R.id.text_hanlim2f14) {
                params.leftMargin = 370;
                params.topMargin = 1180;
            }else if (textView.getId() == R.id.text_hanlim2f15) {
                params.leftMargin = 350;
                params.topMargin = 220;
            }else if (textView.getId() == R.id.text_hanlim2f16) {
                params.leftMargin = 370;
                params.topMargin = 1180;
            }else if (textView.getId() == R.id.text_hanlim2f17) {
                params.leftMargin = 370;
                params.topMargin = 1180;
            }else if (textView.getId() == R.id.text_hanlim2f18) {
                params.leftMargin = 370;
                params.topMargin = 1180;
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
