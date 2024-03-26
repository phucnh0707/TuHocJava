public class bai26_String {
    public static void main(String[] args) {
        //StringBuilder quản lý 1 chuỗi có thể thay đổi kich thước và nội dung
        StringBuilder chuoi = new StringBuilder();
        //Phương thức thường dùng
        // append: Thêm vào cuối chuỗi
        chuoi.append("Xin chào, ");
        chuoi.append("mình đang ôn java");
        System.out.println(chuoi);
        // insert(vị trí index, chuỗi cần chèn)
        chuoi.insert(3," men");
        System.out.println(chuoi);
        // delete(start, end)
        chuoi.delete(3,7);
        System.out.println(chuoi);
        //indexOf(trả về vị trí đầu tiên của chuỗi hoặc ký tự
        String chuoi2 = "tôi là tôi";
//        System.out.println(chuoi2.indexOf("tôi"));
        //indexLastOf(trả về vị trí đầu tiên của chuỗi hoặc ký tự
        //contains (kiểm tra chuỗi con có tồn tại trong chuỗi lớn hay kh
        //subString(cắt chuỗi)
        //replace(thay toàn bộ chuỗi cũ thành chuỗi mới
        //replaceFirst (thay thế chuỗi cũ thành chuỗi new đc tìm thấy)
        //trim(xóa toàn bộ khoảng trắng ở đầu và cuối chuỗi)
        //compareTo so sánh chuỗi phân biệt chữ hoa thường
        String s22 = "abc123";
        String s23 = "abc123";
        int x = s22.compareTo(s23);
        System.out.println(x);
        //compareToIgnoreCase so sánh chuỗi không phân biệt chữ hoa thường
        //reverse đảo ngược chuỗi
        StringBuilder s24 = new StringBuilder();
        s24.append("Linh khung");
        System.out.println(s24);
        s24.append(" và heo");
        System.out.println(s24);
        s24.reverse();
        System.out.println(s24);
        //split tách chuỗi
        String s25 = "Một Hai Ba";
        String[] arr1 = s25.split(" ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
        //toLowerCase trả về chữ thường
        String s26 = s25.toLowerCase();
        System.out.println(s26);
        //
        String s27 = s25.toUpperCase();
        System.out.println(s27);
        char[] arr2 = s25.toCharArray();
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
    }
}
