import java.util.Scanner;

public class bai11 {
    public static void main(String[] args) {
        System.out.println("Nhap so: ");
        System.out.println("Tim theo ten");
        System.out.println("Tim theo tac gia");
        System.out.println("Tim theo nha xuat ban");
        System.out.println("Tim theo tieu de");
        int so = new Scanner(System.in).nextInt();

        switch (so) {
            case 1:
                System.out.println("Tim theo ten");
                break;
            case 2:
                System.out.println("Tim theo tac gia");
                break;
            case 3:
                System.out.println("Tim theo nha xuat ban");
                break;
            case 4:
                System.out.println("Tim theo tieu de");
                break;
            default:
                System.out.println("Nhap so khong hop le");
        }
    }
}
