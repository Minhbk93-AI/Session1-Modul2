import java.util.Scanner;

public class Session3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);


    System.out.print("Nhập vào chiều dài của hình chữ nhật: ");
    float chieuDai = sc.nextFloat();


    System.out.print("Nhập vào chiều rộng của hình chữ nhật: ");
    float chieuRong = sc.nextFloat();


    float chuVi = (chieuDai + chieuRong) * 2;
    float dienTich = chieuDai * chieuRong;

    // Hiển thị kết quả
    System.out.println("Diện tích hình chữ nhật là: " + dienTich);
    System.out.println("Chu vi hình chữ nhật là: " + chuVi);


    sc.close();
  }
}
