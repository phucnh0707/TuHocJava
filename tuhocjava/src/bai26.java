public class bai26 {
    public static void main(String[] args) {
        //Chuẩn hóa chuỗi
        String srt1 = "    Nguyễn hồng    PHÚC    ";
        System.out.println(chuanHoaChuoi(srt1));
    }
    public static String chuanHoaChuoi(String chuoi){
        //Xóa khoảng cách đầu cuối
        chuoi = chuoi.trim();
        //Tách chuỗi ra từng phần tử nếu có khoảng cách
        String[] words = chuoi.split("\\s+");
        //Duyệt từng chữ trong mảng
        for (int i = 0; i < words.length; i++) {
            //chuyển tất cả chữ về thường
            words[i] = words[i].toLowerCase();
            //chữ cái đầu viết hoa
            String firstChar = words[i].substring(0,1);
            firstChar = firstChar.toUpperCase();
            words[i] = firstChar + words[i].substring(1);
        }
        //join tất cả chữ lại bằng 1 khoảng cách
        return String.join(" ", words);
    }

}
