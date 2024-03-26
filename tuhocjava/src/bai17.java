import java.util.Scanner;

public class bai17 {
    public static void main(String[] args) {
    //Tim tat ca so hoan thien trong pham vi 1-1000
//        System.out.println("Nhap n: ");
//        int n = new Scanner(System.in).nextInt();
//        int tong = 0;
//        for (int i = 1; i < n; i++) {
//            if (n % i == 0){
//                tong += i;
//            }
//        }
//        if (tong == n){
//            System.out.println(n + " La so hoan hao");
//        }else {
//            System.out.println(n + " Khong phai so hoan hao");
//        }

        for (int n = 1; n <= 1000; n++) {
            int tong = 0;
            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    tong += i;
                }
            }
            if (tong == n) {
                System.out.println(n + " La so hoan hao");
            }
        }
    }
}
