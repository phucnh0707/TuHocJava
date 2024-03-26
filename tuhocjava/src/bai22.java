public class bai22 {
    public static void main(String[] args) {
        String str1 = "tôi chăm học tôi chịu khó tôi đẹp trai";
        String[] tach = str1.split(" ");
        int count = 0;
        for (String a : tach){
            if (a.equals("tôi")){
                count++;
            }
        }
        System.out.println("Có " + count + " chữ tôi");
    }
}
