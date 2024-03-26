import java.util.Scanner;

public class baitapvandung_string {
    public static void main(String[] args) {
        //Nhập chuỗi đếm xem có bnhieu chữ thường, hoa, số, space
        System.out.println("Hãy nhập chuỗi bất ký: ");
        String nhap = new Scanner(System.in).nextLine();
        int demSo = 0;
        int demChuThuong = 0;
        int demChuHoa = 0;
        int demKhoangTrang = 0;

        for (int i = 0; i < nhap.length(); i++) {
            char c = nhap.charAt(i);
            if (Character.isLowerCase(c)){
                demChuThuong++;
            }else if (Character.isUpperCase(c)){
                demChuHoa++;
            }else if(Character.isWhitespace(c)){
                demKhoangTrang++;
            }else if (Character.isDigit(c)){
                demSo++;
            }
        }

        System.out.println("Chuỗi "+ nhap+" có: \n"
        + demSo +" số\n"+ demChuThuong + " chũ thường\n"
        + demChuHoa + " chữ hoa\n" + demKhoangTrang + " khoảng trắng");




    }
}
