package TH1_2;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        LopHocPhan lhp = new LopHocPhan();
        Scanner sc = new Scanner(System.in);
        lhp.NhapLHP();
        int menu;
        do{
            System.out.println("===Menu===");
            System.out.println("1. Nhap sv tham gia vao LHP");
            System.out.println("2. in");
            System.out.print("Lua chon: ");
            menu = sc.nextInt();
            switch(menu){
                case 1:
                    lhp.nhap();
                    break;
                case 2:
                    lhp.in();
                    break;
                default:
                    if(menu!=3)
                        System.out.println("chuc nang khong ton tai");
                    else
                        System.out.println("da thoat");
            }
        }while(menu!=3);
    }
}
