import java.util.Scanner;

public class bai10 {
    public static void main(String[] args) {
        //Bai 10: Viet chuong tinh diem (toan tu 3 ngoi)

        System.out.println("Nhap diem: ");
        double diem = new Scanner(System.in).nextDouble();

        String tl = diem >= 8 ? "Gioi" : ((diem <= 8 && diem >= 6.5) ? "Kha" :
                (diem < 6.5 && diem >= 5) ? "Trung binh" : "Yeu");
        System.out.println(tl);
    }
}
