package com.example.aosmb7.UI.vwmdls;

import android.content.ClipData;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.aosmb7.data.Repository;
import com.example.aosmb7.data.dataSource.Doctor;

public class ViewModel extends androidx.lifecycle.ViewModel {

    private final MutableLiveData<Repository> doctorUI =
            new MutableLiveData(new Repository(new Doctor(null, null)));


    public LiveData<Repository> getDoctorUI() {
        return doctorUI;
    }

    public void addDoctor(String name, Integer avatar) {
        doctorUI.setValue(
                new Repository(new Doctor(name, avatar))
        );
    }

    }