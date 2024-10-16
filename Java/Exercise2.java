/*
    Fullname: Trương Đỗ Quỳnh Anh
    Student ID: 31231022100
    Date of birth: 16/12/2005
    Created date: 12/10/2024 
*/

//Khai báo thư viện
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        //Tạo đối tượng scanner để nhận dữ liệu từ người dùng.
        Scanner scanner = new Scanner(System.in);

        //Hiển thị thông báo và nhập vào các giá trị cần thiết.
        System.out.print("Nhap vao so thu nhat: ");
        int x = scanner.nextInt();

        System.out.print("Nhap vao so thu hai: ");
        int y = scanner.nextInt();

        System.out.print("Nhap vao so thu ba: ");
        int z = scanner.nextInt();

        //Khai báo biến lưu số lớn nhất.
        int largest;

        //Kiểm tra số lớn nhất.
        if (x >= y && x >= z) {
            largest = x;
        } else if (y >= x && y >= z) {
            largest = y;
        } else {
            largest = z;
        }

        //In kết quả.
        System.out.println("So lon nhat la: " + largest);
    }
}