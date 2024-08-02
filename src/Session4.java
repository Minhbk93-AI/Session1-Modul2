import java.util.Scanner;

public class Session4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhập 1 số: ");
        float a =sc.nextFloat();

        float b= (float)Math.pow(a,2);

        float c= b*a;
        System.out.println("Bình phương số a: " +b);
        System.out.println("Lập phương số a: " +c);
        sc.close();

    }
}
