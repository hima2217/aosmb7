package com.example.aosmb7.data;

import com.example.aosmb7.data.dataSource.Doctor;

public class Repository {

    private Doctor doctor;

    public Repository(Doctor doctor) {
        this.doctor = doctor;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

}