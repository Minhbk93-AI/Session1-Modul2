import java.util.Scanner;

public class Session2 {
    public static void main(String[] args) {
        float rate = 23000; // Tỷ giá VND/USD hiện tại


        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số tiền USD cần đổi: ");

        float usd = scanner.nextFloat();


        double vnd = usd * rate;
        System.out.printf("%.1f USD = %.1f VND%n", usd, vnd);


        scanner.close();

    }
}