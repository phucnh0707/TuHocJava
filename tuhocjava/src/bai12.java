import java.util.Scanner;

public class bai12 {
    public static void main(String[] args) {
     //for
        System.out.println("Nhap n: ");
        int n = new Scanner(System.in).nextInt();
        int gt = 1;
//        for (int i = 1; i <= n; i++) {
//            gt = gt*i;
//        }
//        System.out.println("Giai thua cua " + n + " la: "+ gt);

        //while
        int i = 1;
        while (i <= n){
            gt = gt * i;
            i++;
        }
        System.out.println("Giai thua cua " + n + " la: "+ gt);

    }





}
