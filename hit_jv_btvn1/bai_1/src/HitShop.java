import java.util.Scanner;

public class HitShop {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap ten hang: ");
        String tenHang = sc.nextLine();
        System.out.print("Nhap gia hang: ");
        float donGia = sc.nextFloat();
        System.out.print("Nhap so luong hang: ");
        int soLuong = sc.nextInt();

        System.out.println("Ten hang la: " + tenHang);
        System.out.println("Gia hang la: " + donGia);
        System.out.println("So luong hang la: " + soLuong);
        System.out.println("Thanh tien la: " + (soLuong*donGia));
    }
}