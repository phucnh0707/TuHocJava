import java.util.Scanner;

public class bai7 {
    public static void main(String[] args) {
        System.out.println("Nhap thang: ");
        int thang = new Scanner(System.in).nextInt();

        if(thang == 1 || thang == 3 || thang == 5 || thang == 7 || thang == 8 || thang == 10 || thang == 12){
            System.out.println("Thang nay co 31 ngay");
        }else if(thang == 4 || thang == 6 || thang == 9 || thang == 11) {
            System.out.println("Thang nay co 30 ngay");
        }else if(thang == 2){
            System.out.println("Nhap nam: ");

            int nam = new Scanner(System.in).nextInt();
            if((nam % 4 == 0) && (nam % 100 != 0) || (nam % 400 == 0)){
                System.out.println("Thang nay co 29 ngay");
            }else {
                System.out.println("Thang nay co 28 ngay");
            }

        }else {
            System.out.println("Nhap thang khong hop le");
        }
    }
}
