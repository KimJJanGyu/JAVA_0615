package com.example.myapplication.ui.jungbo;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class JungboViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public JungboViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("정보통신관");
    }

    public LiveData<String> getText() {
        return mText;
    }
}