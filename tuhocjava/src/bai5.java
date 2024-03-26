import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
//        Bai 5: Nhap chieu cao va can nang tinh BMI
        System.out.println("Nhap chieu cao: ");
        double chieuCao = new Scanner(System.in).nextDouble();
        System.out.println("Nhap can nang: ");
        double canNang = new Scanner(System.in).nextDouble();

        double  bMI = canNang/(Math.pow(chieuCao,2));
        if (bMI < 15){
            System.out.println("Than hinh qua gay");
        }else if (bMI >= 15 && bMI < 16){
            System.out.println("Than hinh gay");
        }else if(bMI>= 16 && bMI<18.5){
            System.out.println("Than hinh hoi gay");
        } else if (bMI >= 18.5 && bMI < 25) {
            System.out.println("Than hinh binh thuong");
        }else if(bMI>=25 && bMI<30){
            System.out.println("Than hinh hoi beo");
        }else if(bMI >= 30 && bMI < 35){
            System.out.println("Than hinh beo");
        }else if(bMI>=35){
            System.out.println("Than hinh qua beo");
        }
    }
}
