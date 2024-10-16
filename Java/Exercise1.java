/*
    Fullname: Trương Đỗ Quỳnh Anh
    Student ID: 31231022100
    Date of birth: 16/12/2005
    Created date: 12/10/2024 
*/

//Khai báo thư viện
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        //Tạo đối tượng scanner để nhận dữ liệu từ người dùng.
        Scanner scanner = new Scanner(System.in);
        
        //Hiển thị thông báo và nhập vào các giá trị cần thiết.
        System.out.print("Nhap vao so thu nhat: ");
        int x = scanner.nextInt();

        System.out.print("Nhap vao so thu hai: ");
        int y = scanner.nextInt();

        System.out.println("Chon mot phep tinh: +, -, *, /");
        char operation = scanner.next().charAt(0);

        // Khai báo biến lưu kết quả.
        int result;

        //Sử dụng switch case để thực hiện phép toán dựa trên lựa chọn của người dùng.
        switch (operation) {
            case '+':
                result = x + y;
                break;
            case '-':
                result = x - y;
                break;
            case '*':
                result = x * y;
                break;
            case '/':
                if (y != 0) {
                    result = x / y;
                } else {
                    System.out.println("Khong co phep chia 0");
                    return;
                }
                break;
            default:
                System.out.println("Phep tinh khong hop le");
                return;
        }

        // In kết quả.
        System.out.println("Ket qua phep tinh la: " + result);
    }
}