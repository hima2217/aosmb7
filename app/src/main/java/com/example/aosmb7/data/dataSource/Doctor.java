package com.example.aosmb7.data.dataSource;

public class Doctor {
    String doctorname;
    Integer avatar;

    public void setAvatar(int avatar) {
        this.avatar = avatar;
    }

    public void setDoctorname(String doctorname) {
        this.doctorname = doctorname;
    }

    public int getAvatar() {
        return avatar;
    }

    public String getDoctorname() {
        return doctorname;
    }

    public Doctor(String doctorname, Integer avatar){
        this.doctorname = doctorname;
        this.avatar = avatar;
    }
    public Doctor(){

    }
}
