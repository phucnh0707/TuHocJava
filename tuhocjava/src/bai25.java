import java.util.Scanner;

public class bai25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi: ");
        String nhap = sc.nextLine();

        String chuoiDao = new StringBuilder(nhap).reverse().toString();

        if (nhap.equalsIgnoreCase(chuoiDao)){
            System.out.println("Đây là chuỗi đảo: " +"\n" +chuoiDao+"\n" + nhap);
        }else
        {
            System.out.println("Đây không phải là chuỗi đảo: "+"\n" + chuoiDao+"\n" + nhap);

        }
    }
}
