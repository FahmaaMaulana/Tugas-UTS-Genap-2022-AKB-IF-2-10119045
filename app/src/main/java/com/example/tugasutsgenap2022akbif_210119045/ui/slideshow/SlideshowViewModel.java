package com.example.tugasutsgenap2022akbif_210119045.ui.slideshow;
//<!--//NIM   : 10119045-->
// <!--//NAMA  : Fahma Maulana-->
// <!--//KELAS : IF-2 -->

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SlideshowViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public SlideshowViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is slideshow fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}