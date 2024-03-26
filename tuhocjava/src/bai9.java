import java.util.Scanner;

public class bai9 {
    public static void main(String[] args) {
        System.out.println("Nhap thang: ");
        int thang = new Scanner(System.in).nextInt();
        if (thang == 1 || thang == 2 || thang == 3){
            System.out.println("Quy 1");
        }else if(thang == 4 || thang == 5 || thang == 6){
            System.out.println("Quy 2");
        }else if(thang == 7 || thang == 8 || thang == 9){
            System.out.println("Quy 3");
        }else if(thang == 10 || thang == 11 || thang == 12){
            System.out.println("Quy 4");
        }else {
            System.out.println("Nhap thang khong hop ly");
        }


    }
}
