package TH1_2;

import java.util.Scanner;

public class SinhVien {
    private String maSV;
    private String hoTen;
    Scanner sc = new Scanner(System.in);

    public SinhVien() {
    }
    
    public SinhVien(String maSV, String hoTen) {
        this.maSV = maSV;
        this.hoTen = hoTen;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    @Override
    public String toString() {
        return "SinhVien{" + "maSV=" + maSV + ", hoTen=" + hoTen + '}';
    }
    
}
