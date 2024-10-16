/*
    Fullname: Trương Đỗ Quỳnh Anh
    Student ID: 31231022100
    Date of birth: 16/12/2005
    Created date: 16/10/2024 
*/

// Khai báo thư viện
import java.util.Scanner;

public class Exercise17 {
    public static void main(String[] args) {
        // Tạo đối tượng scanner để nhận dữ liệu từ người dùng
        Scanner scanner = new Scanner(System.in);

        // Yêu cầu người dùng nhập lựa chọn
        System.out.print("Nhap 1 de chuyen doi tu nhi phan sang thap phan hoac 2 de chuyen doi tu thap phan sang nhi phan: ");
        int choice = scanner.nextInt();

        // Sử dụng cấu trúc switch case để xử lý theo lựa chọn của người dùng và hiển thị kết quả.
        switch (choice) {
            case 1:
                System.out.print("Nhap vao mot so nhi phan: ");
                String binary = scanner.next();
                int decimal = Integer.parseInt(binary, 2);
                System.out.println("So thap phan tuong duong la: " + decimal);
                break;

            case 2:
                System.out.print("Nhap vao mot so thap phan: ");
                int num = scanner.nextInt();
                String binaryStr = Integer.toBinaryString(num);
                System.out.println("So nhi phan tuong duong la: " + binaryStr);
                break;

            default:
                System.out.println("Lua chon khong hop le");
        }
    }
}
