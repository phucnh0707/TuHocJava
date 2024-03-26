import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        //Bai 4: Tim x,y khi biet tong hieu cua chung
        System.out.println("Nhap tong: ");
        double tong = new Scanner(System.in).nextDouble();

        System.out.println("Nhap hieu: ");
        double hieu = new Scanner(System.in).nextDouble();

        double x = (tong + hieu) / 2;
        double y = tong - x;

        System.out.println("x = " + x + "\n" + "y = " + y);


    }
}
