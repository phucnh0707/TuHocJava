import java.util.Calendar;
import java.util.Scanner;

public class bai21 {
    public static void main(String[] args) {
//Viet chuong trinh chuyen chuoi 1 nhu chuoi 2
        String str1 = "qwertyuiop";
        String str2 = "asdfghjkl;";
        //Nhập tin nhắn cần mã hóa
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        //Biết lưu tin nhắn sau khi đc mã hóa
        String output = "";
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            //Tìm vị trí của ký tự trong chuỗi a
            int index = str1.indexOf(c);
           //Nếu ký tự không tồn tại thì cộng ký tự đó vào output
            if (index == -1){
                output += input;
            }else {
                //Nếu ký tự có trong chuỗi a thì lấy ký b tương ứng cộng vào output
                output += str2.charAt(index);

            }
        }
        System.out.println("Tin nhắn đc mã hóa là: "+ output);



    }
}
