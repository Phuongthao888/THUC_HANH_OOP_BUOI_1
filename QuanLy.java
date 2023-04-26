package TH1_1A;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLy {
    private ArrayList<Vehicle> quanlyxe;
    Scanner sc = new Scanner(System.in);
    Vehicle vehicle;
    
    public QuanLy(){
        super();
        quanlyxe = new ArrayList<Vehicle>();
    }
    
    public void NhapThongTin(){
        String TenChuXe;
        String LoaiXe;
        int DungTich;
        double TriGia;
        double Thue;
        Vehicle ve = new Vehicle();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten chu xe: "); TenChuXe = sc.nextLine();
        System.out.print("Nhap loai xe: "); LoaiXe = sc.nextLine();
        System.out.print("Nhap dung tich: "); DungTich = sc.nextInt();
        System.out.print("Nhap tri gia: "); TriGia = sc.nextInt();
        
        Thue = thue(DungTich, TriGia);

        vehicle = new Vehicle(TenChuXe, LoaiXe, DungTich, TriGia, Thue);
        quanlyxe.add(vehicle);
        System.out.println("Them thanh cong");
    }
    
    public void in(){
        System.out.println(String.format("|%-20s|%-20s|%-20s|%-20s|%-20s|",
                "Ten chu xe", "Loai xe","Dung tich", "Tri gia","Thue"));
        System.out.println("========================================================================================================");
        for (Vehicle vehicle : quanlyxe) {
            System.out.println(String.format("|%-20s|%-20s|%-20s|%-20s|%-20s|",
                    vehicle.getTenChuXe(), vehicle.getLoaiXe(), vehicle.getDungTich(), vehicle.getTriGia(), vehicle.getThue()));
        }
    }
    public double thue(double DungTich, double TriGia){
        double Thue;
        if(DungTich>100)
            Thue = TriGia * 0.01;
        else if(DungTich>= 100 && DungTich<=200)
            Thue = TriGia * 0.03;
        else
            Thue = TriGia *0.05;
        return Thue;
    }
 
}
