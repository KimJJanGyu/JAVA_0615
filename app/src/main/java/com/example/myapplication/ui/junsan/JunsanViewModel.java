package com.example.myapplication.ui.junsan;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class JunsanViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public JunsanViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("전산관");
    }

    public LiveData<String> getText() {
        return mText;
    }
}