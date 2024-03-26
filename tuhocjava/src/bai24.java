public class bai24 {
    public static void main(String[] args) {
        //1. tách tên file bao gồm cả đuôi
        //2. tách tên file
        String path = "https://www.nhaccuatui.com/bai-hat/chung-ta-cua-tuong-lai-son-tung-m-tp.JmD8wHQ4IuAk.html";
        int lastSlashIndex = path.lastIndexOf('/');
        String tenFileCaDuoi = path.substring(lastSlashIndex+1);
        System.out.println(tenFileCaDuoi);

        int firstDotIndex = tenFileCaDuoi.indexOf('.');
        String tenFileKhongDuoi = tenFileCaDuoi.substring(0,firstDotIndex);
        System.out.println(tenFileKhongDuoi);

    }
}
