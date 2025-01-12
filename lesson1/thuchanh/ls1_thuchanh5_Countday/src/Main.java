import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int month;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tháng bạn muốn: ");
        month = sc.nextInt();

            switch (month) {
                case 2:
                    System.out.println("Tháng 2 là tháng có 29 hoặc 28 ngày");
                    break;
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    System.out.println("Tháng" + month + "có 31 ngày");
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.println("Tháng" + month + "có 30 ngày");
                    break;
                default:
                    System.out.println("Tháng không hợp lệ");
                    break;
            }

    }
}