package TH1_1A;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        QuanLy ql = new QuanLy();
        Scanner sc = new Scanner(System.in);
        int menu;
        do{
        System.out.println("1. Nhap");
        System.out.println("2. In thong tin");
        System.out.println("3. Thoat ");
        System.out.print("Lua chon: ");
        menu = sc.nextInt();
        switch(menu){
            case 1:
                ql.NhapThongTin();
                break;
            case 2:
                ql.in();
                break;
            default:
                if(menu != 3)
                    System.out.println("Chuc nang khong ton tai! ");
                else 
                    System.out.println("Da thoat");
                
        }
        }while(menu!=3);
        
    }
}
