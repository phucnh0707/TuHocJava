public class bai19 {
    public static void main(String[] args) {
        //Bai 19: Tinh tổng các số trong chuỗi str1, tính tbc
        String str1 = "English = 78 Science = 83 Math = 68 History = 65";
        int count = 0;
        int sum = 0;
        String[] tach = str1.split(" ");
        for (String t : tach){
            System.out.println(t);
            try {
                //Chuyen chuoi sang so
                int num = Integer.parseInt(t);
                sum +=num;
                count++;
            }catch (NumberFormatException e){
                //Loi khong lam gi ca
            }
        }
        //Tinh trung binh cong
        double tbc = sum / count;
        System.out.println("Tổng các số trong chuỗi là: "+ sum);
        System.out.println("Trung bình cộng các số trong chuỗi là: "+ tbc);
    }
}
