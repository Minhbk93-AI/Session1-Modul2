import java.util.Scanner;

public class Session6 {
    public static void main(String[] args) {
        System.out.println("Nhập điểm 3 môn Toán, Lý Hóa");

        Scanner sc= new Scanner(System.in);
        double diemToan= sc.nextDouble();
        double diemLy= sc.nextDouble();
        double diemHoa= sc.nextDouble();
        double tongDiem= diemToan+diemLy+diemHoa;
        double dTB= (diemToan+diemLy+diemHoa)/3;
        System.out.println("Điểm Toán: " +diemToan);
        System.out.println("Điểm Lý: " +diemLy);
        System.out.println("Điểm Hoóa: " +diemHoa);
        System.out.println("Tổng Điểm: " +tongDiem);
        System.out.println("Điểm Trung Bình: " +dTB);
        sc.close();

    }
}
