package TH1_2;

import TH1_1A.Vehicle;
import java.util.ArrayList;
import java.util.Scanner;

public class LopHocPhan {
    private ArrayList<SinhVien> dssv;
    Scanner sc = new Scanner(System.in);
    SinhVien sv = new SinhVien();
    LopHocPhan lhp;
    
    private String maLHP;
    private String tenLHP;
    private String tenGV;
    private String thongtinLH;
    
    public LopHocPhan(){
        super();
        dssv = new ArrayList<SinhVien>();
    }

    public LopHocPhan(ArrayList<SinhVien> dssv, String maLHP, String tenLHP, String tenGV, String thongtinLH) {
        this.dssv = dssv;
        this.maLHP = maLHP;
        this.tenLHP = tenLHP;
        this.tenGV = tenGV;
        this.thongtinLH = thongtinLH;
    }

    public ArrayList<SinhVien> getDssv() {
        return dssv;
    }

    public void setDssv(ArrayList<SinhVien> dssv) {
        this.dssv = dssv;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    public SinhVien getSv() {
        return sv;
    }

    public void setSv(SinhVien sv) {
        this.sv = sv;
    }

    public String getMaLHP() {
        return maLHP;
    }

    public void setMaLHP(String maLHP) {
        this.maLHP = maLHP;
    }

    public String getTenLHP() {
        return tenLHP;
    }

    public void setTenLHP(String tenLHP) {
        this.tenLHP = tenLHP;
    }

    public String getTenGV() {
        return tenGV;
    }

    public void setTenGV(String tenGV) {
        this.tenGV = tenGV;
    }

    public String getThongtinLH() {
        return thongtinLH;
    }

    public void setThongtinLH(String thongtinLH) {
        this.thongtinLH = thongtinLH;
    }
    public int KiemTraSoLuongTrongKho(){
         return this.dssv.size();
    }
    public void NhapLHP(){
        System.out.print("Ma LHP: "); maLHP = sc.nextLine();
        System.out.print("Ten LHP: "); tenLHP = sc.nextLine();
        System.out.print("Ten GV: "); tenGV = sc.nextLine();
        System.out.print("Thong tin lop hoc: "); thongtinLH = sc.nextLine();
        
    }
    public void nhap(){
        String maSV;
        String hoTen;
        System.out.print("Ma SV: "); maSV = sc.nextLine();
        System.out.print("Ho ten SV: "); hoTen = sc.nextLine();
        sv = new SinhVien(maSV, hoTen);
        dssv.add(sv);
        System.out.println("them thanh cong");
    }

    public void in(){
        System.out.println("- Ma LHP: " + maLHP + "\n" +
                "- Ten LHP: " + tenLHP + "\n" +
                "- GV giang day: " + tenGV + "\n" +
                "- Thong tin buoi hoc: " + thongtinLH +"\n");
        System.out.println("Danh sach sinh vien \n");

        for (SinhVien sv : dssv) {
            System.out.println(String.format("|%-5s|%-10s|",
                    sv.getMaSV(), sv.getHoTen()));
        }
        System.out.println("Tong so sinh vien: " +KiemTraSoLuongTrongKho());

    }
}
