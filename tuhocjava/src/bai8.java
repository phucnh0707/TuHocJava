import java.util.Scanner;

public class bai8 {
    public static void main(String[] args) {
        //Bai 8: Giai phuong trinh bac 2
        System.out.println("Nhap a: ");
        double a = new Scanner(System.in).nextDouble();
        System.out.println("Nhap b: ");
        double b = new Scanner(System.in).nextDouble();
        System.out.println("Nhap c: ");
        double c = new Scanner(System.in).nextDouble();

        double delTa = Math.pow(b, 2) - 4 * a * c;

        if(delTa < 0){
            System.out.println("Phuong trinh vo nghiem");
        }else if(delTa == 0){
            System.out.println("Phuong trinh co nghiem kep x1 = x2 = " + -(b/(2*a)));
        }else if(delTa > 0){
            System.out.println("Phuong trinh co 2 nghiem \n" +
                    "x1 = " + (-b + Math.sqrt(delTa))/2*a + "\n" +
                    "x2 = " + (-b - Math.sqrt(delTa))/2*a );
        }
    }
}
