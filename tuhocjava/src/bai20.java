import java.util.Scanner;

public class bai20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password = "";
        String newPassword;
        while (true) {
            System.out.println("\tHãy nhập mật khẩu\n * Có ít nhất 6 ký tự\n * Chứa ít nhất 1 chữ cái (chữ cái thường hoặc hoa đều được)\n * Chứa ít nhất 1 số");
            newPassword = sc.nextLine();
            if (checkMk(newPassword) == true) {
                password = newPassword;
                System.out.println("Mật khẩu đã được thiết lập\n");
                break;
            } else {
                System.out.println("Mật khẩu không hợp lệ hãy nhập lại!!!");
            }
        }


        int count = 0;
        String login = "";
        while (true) {
        //Nhập lại mk
            System.out.println("Nhập lại mật khẩu: ");
            login = sc.nextLine();
            //ktra mật khẩu
            if (login.equals(newPassword)){
                System.out.println("Đăng nhập thành công");
                break;
            }else {
                System.out.println("Mật khẩu không đúng!\n Bạn đã sai "+ count + " lần\n");
                count++;
            }
            //Nếu count = 5 thoát chương trình
            if (count == 5){
                System.out.println("Bạn đã nhập sai quá 5 lần, mật khẩu đã bị khóa!");
                break;
            }
        }
    }


    public static boolean checkMk(String pass) {
        //Kiểm tra mật khẩu ít nhất 6 ký tự
        if (pass.length() < 6) {
            return false;
        }

        //Kiểm tra mật khẩu có chữ cái không
        boolean coChu = false;
        for (char c : pass.toCharArray()){
            if (Character.isLetter(c)){
               coChu = true;
               break;
            }
        }
        if (!coChu){
            return false;
        }

        //Kiểm tra mật khẩu có chữ số không
        boolean coSo = false;
        for (char c : pass.toCharArray()){
            if (Character.isDigit(c)){
                coSo = true;
                break;
            }
        }
        if (!coSo){
            return false;
        }

        return true;

    }
}
