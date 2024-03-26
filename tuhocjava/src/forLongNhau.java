public class forLongNhau {
    public static void main(String[] args) {
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                System.out.print(i+""+j+"\t");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("");
        System.out.println("");

        //Ve N
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                if (j == 1 || j ==7 || i == j){
                    System.out.print("*"+"\t");
                }else {
                    System.out.print(" "+"\t");
                }
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("");
        System.out.println("");

        //Ve hinh vuong
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                if (j == 1 || j ==7 || i == 1 || i == 7){
                    System.out.print("*"+"\t");
                }else {
                    System.out.print(" "+"\t");
                }
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("");
        System.out.println("");
        //Ve hinh tam giac
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= i; j++) {
                    System.out.print("*"+"\t");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("");
        System.out.println("");
        //Hinh a
        System.out.println("Hinh a");
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j<= 4 ; j++) {
                System.out.print("*"+"\t");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("");
        System.out.println("");
        //Hinh b
        System.out.println("Hinh b");
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j<= 4 ; j++) {
                if (i == 1 || i == 4 || j == 1 || j == 4){
                    System.out.print("*"+"\t");
                }else {
                    System.out.print(" "+"\t");
                }
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("");
        System.out.println("");
        //Hinh c
        System.out.println("Hinh c");
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j<= i; j++) {
                    System.out.print("*"+"\t");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("");
        System.out.println("");
        //Hinh d
        System.out.println("Hinh d");
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j<= i; j++) {
                if (i == 3 && j == 2){
                    System.out.print(""+"\t");
                }else {
                    System.out.print("*"+"\t");
                }
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("");
        System.out.println("");
        //Hinh e
        System.out.println("Hinh e");
        for (int i = 4; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + "\t");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("");
        System.out.println("");
    }
}
