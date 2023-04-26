package TH1_1A;

import java.util.Scanner;

public class Vehicle {
    private String TenChuXe;
    private String LoaiXe;
    private int DungTich;
    private double TriGia;
    private double Thue;

    public Vehicle(){}

    public Vehicle(String TenChuXe, String LoaiXe, int DungTich, double TriGia, double Thue) {
        this.TenChuXe = TenChuXe;
        this.LoaiXe = LoaiXe;
        this.DungTich = DungTich;
        this.TriGia = TriGia;
        this.Thue = Thue;
    }
    
    public String getTenChuXe() {
        return TenChuXe;
    }

    public void setTenChuXe(String TenChuXe) {
        this.TenChuXe = TenChuXe;
    }

    public String getLoaiXe() {
        return LoaiXe;
    }

    public void setLoaiXe(String LoaiXe) {
        this.LoaiXe = LoaiXe;
    }

    public int getDungTich() {
        return DungTich;
    }

    public void setDungTich(int DungTich) {
        this.DungTich = DungTich;
    }

    public double getTriGia() {
        return TriGia;
    }

    public void setTriGia(double TriGia) {
        this.TriGia = TriGia;
    }

    public double getThue() {
        return Thue;
    }

    public void setThue(double Thue) {
        this.Thue = Thue;
    }

    @Override
    public String toString() {
        return "Vehicle{" + "TenChuXe=" + TenChuXe + ", LoaiXe=" + LoaiXe + ", DungTich=" + DungTich + ", TriGia=" + TriGia + ", Thue=" + Thue + '}';
    }

    public void NhapThongTin(){
        
    }
    public void in(){
    }
    
}
