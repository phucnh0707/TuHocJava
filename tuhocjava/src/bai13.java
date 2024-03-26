import java.util.Scanner;

public class bai13 {
    public static void main(String[] args) {
        System.out.println("Nhap a: ");
        int a = new Scanner(System.in).nextInt();
        int tong =0 ;
        if (a % 2 == 0) {
            for (int i = 0; i <= a; i += 2) {
                tong += i; // tong + i
            }
            System.out.println("Tong cac so chan cua a la: " + tong);
        } else {
            System.out.println("Khong tinh so le");
        }
    }
}
