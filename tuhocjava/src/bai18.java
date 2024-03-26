import java.util.Scanner;

public class bai18 {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Vui long nhap so > 0: ");
            a = sc.nextInt();
            while (a <= 0) {
                System.out.println("Vui long nhap lai, so phai > 0: ");
                a = sc.nextInt();
            }
            System.out.println("Ban da nhap so thanh cong: " + a);
            //Kiem tra so nguyen to
            int demUoc = 0;
            for (int i = 1; i <= a; i++) {
                if (a % i == 0) {
                    demUoc++;
                }
            }
            if (demUoc == 2) {
                System.out.println(a + " La so nguyen to");
            } else {
                System.out.println(a + " Khong phai la so nguyen to");
            }
            System.out.println();
            System.out.println("Ban co muon thoat khong?, bam y de thoat!");
            String traLoi = new Scanner(System.in).nextLine();
            if (traLoi.equals("y") || traLoi.equals("Y")){
                break;
            }
        }
    }
}