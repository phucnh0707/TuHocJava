public class bai16 {
    public static void main(String[] args) {
        // S = 1! + 2! + 3! + ... + 10!
        int m = 1;
        int tong = 0;
        for (int i = 1; i <= 10; i++) {
            m = m *i;
            tong +=m;
            System.out.println(m);
        }


        System.out.println("Tong: " + tong);

    }
}
