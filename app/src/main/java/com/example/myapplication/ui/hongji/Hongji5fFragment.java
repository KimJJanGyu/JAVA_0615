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

public class Hongji5fFragment extends Fragment {
    private ImageView overlayImageView;
    private TextView lastClickedTextView;

    @SuppressLint("MissingInflatedId")
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_hongji5f, container, false);

        overlayImageView = view.findViewById(R.id.overlay_image);

        TextView textView1 = view.findViewById(R.id.text_hongji5f1);
        TextView textView2 = view.findViewById(R.id.text_hongji5f2);
        TextView textView3 = view.findViewById(R.id.text_hongji5f3);
        TextView textView4 = view.findViewById(R.id.text_hongji5f4);
        TextView textView5 = view.findViewById(R.id.text_hongji5f5);
        TextView textView6 = view.findViewById(R.id.text_hongji5f6);
        TextView textView7 = view.findViewById(R.id.text_hongji5f7);
        TextView textView8 = view.findViewById(R.id.text_hongji5f8);
        TextView textView9 = view.findViewById(R.id.text_hongji5f9);
        TextView textView10 = view.findViewById(R.id.text_hongji5f10);
        TextView textView11 = view.findViewById(R.id.text_hongji5f11);
        TextView textView12 = view.findViewById(R.id.text_hongji5f12);
        TextView textView13= view.findViewById(R.id.text_hongji5f13);
        TextView textView14 = view.findViewById(R.id.text_hongji5f14);
        TextView textView15 = view.findViewById(R.id.text_hongji5f15);
        TextView textView16 = view.findViewById(R.id.text_hongji5f16);
        TextView textView17 = view.findViewById(R.id.text_hongji5f17);
        TextView textView18 = view.findViewById(R.id.text_hongji5f18);
        TextView textView19 = view.findViewById(R.id.text_hongji5f19);


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
        textView19.setOnClickListener(v -> handleTextViewClick(textView19, R.drawable.ic_maker));

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

            if (textView.getId() == R.id.text_hongji5f1) {
                params.leftMargin = 130;
                params.topMargin = 450;
            } else if (textView.getId() == R.id.text_hongji5f2) {
                params.leftMargin = 550;
                params.topMargin = 450;
            } else if (textView.getId() == R.id.text_hongji5f3) {
                params.leftMargin = 700;
                params.topMargin = 450;
            } else if (textView.getId() == R.id.text_hongji5f4) {
                params.leftMargin = 820;
                params.topMargin = 450;
            } else if (textView.getId() == R.id.text_hongji5f5) {
                params.leftMargin = 900;
                params.topMargin = 450;
            }else if (textView.getId() == R.id.text_hongji5f6) {
                params.leftMargin = 280;
                params.topMargin = 230;
            }else if (textView.getId() == R.id.text_hongji5f7) {
                params.leftMargin = 320;
                params.topMargin = 100;
            }else if (textView.getId() == R.id.text_hongji5f8) {
                params.leftMargin = 440;
                params.topMargin = 100;
            }else if (textView.getId() == R.id.text_hongji5f9) {
                params.leftMargin = 530;
                params.topMargin = 100;
            }else if (textView.getId() == R.id.text_hongji5f10) {
                params.leftMargin = 590;
                params.topMargin = 100;
            }else if (textView.getId() == R.id.text_hongji5f11) {
                params.leftMargin = 770;
                params.topMargin = 100;
            }else if (textView.getId() == R.id.text_hongji5f12) {
                params.leftMargin = 880;
                params.topMargin = 100;
            }else if (textView.getId() == R.id.text_hongji5f13) {
                params.leftMargin = 1000;
                params.topMargin = 170;
            }else if (textView.getId() == R.id.text_hongji5f14) {
                params.leftMargin = 900;
                params.topMargin = 230;
            }else if (textView.getId() == R.id.text_hongji5f15) {
                params.leftMargin = 230;
                params.topMargin = 450;
            }else if (textView.getId() == R.id.text_hongji5f16) {
                params.leftMargin = 330;
                params.topMargin = 450;
            }else if (textView.getId() == R.id.text_hongji5f17) {
                params.leftMargin = 370;
                params.topMargin = 450;
            }else if (textView.getId() == R.id.text_hongji5f18) {
                params.leftMargin = 440;
                params.topMargin = 450;
            }else if (textView.getId() == R.id.text_hongji5f19) {
                params.leftMargin = 1000;
                params.topMargin = 100;
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
