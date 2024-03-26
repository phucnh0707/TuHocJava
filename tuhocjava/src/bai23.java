import java.util.Scanner;

public class bai23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hãy nhập chuỗi bất ký: ");
        String nhap = sc.nextLine();
        StringBuilder chuoiChu = new StringBuilder();
        StringBuilder chuoiSo = new StringBuilder();

        String[] arr1 = nhap.split("");
        for (int i = 0; i < arr1.length; i++) {
            char c = nhap.charAt(i);
            if (Character.isDigit(c)){
                chuoiSo.append(c);
            }else if (Character.isLetter(c)){
                chuoiChu.append(c);
            }
        }

        System.out.println("Chuỗi chữ: "+ chuoiChu);
        System.out.println("Chuỗi số: "+ chuoiSo);
    }
}
