import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {

        //Bai 6: Nhap nam xem co nam nhuan hay khong
        System.out.println("Nhap nam: ");
        int nam = new Scanner(System.in).nextInt();

        if((nam % 4 == 0) && (nam % 100 != 0) || (nam % 400 == 0)){
            System.out.println("Nam nhuan");
        }else {
            System.out.println("Nam khong nhuan");
        }
    }
}
