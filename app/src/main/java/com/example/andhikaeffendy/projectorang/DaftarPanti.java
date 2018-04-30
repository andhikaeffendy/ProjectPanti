package com.example.andhikaeffendy.projectorang;

public class DaftarPanti {
    private String mNamaPanti, mAlamatPanti;
    private int mLogoPanti;

    public DaftarPanti(String mNamaPanti, String mAlamatPanti, int mLogoPanti){
        this.mNamaPanti = mNamaPanti;
        this.mAlamatPanti = mAlamatPanti;
        this.mLogoPanti = mLogoPanti;
    }

    public String getmAlamatPanti() {
        return mAlamatPanti;
    }

    public String getmNamaPanti() {
        return mNamaPanti;
    }

    public int getmLogoPanti() {
        return mLogoPanti;
    }

    public void setmAlamatPanti(String mAlamatPanti) {
        this.mAlamatPanti = mAlamatPanti;
    }

    public void setmLogoPanti(int mLogoPanti) {
        this.mLogoPanti = mLogoPanti;
    }

    public void setmNamaPanti(String mNamaPanti) {
        this.mNamaPanti = mNamaPanti;
    }
}
