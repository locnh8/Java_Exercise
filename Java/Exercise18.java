/*
    Fullname: Trương Đỗ Quỳnh Anh
    Student ID: 31231022100
    Date of birth: 16/12/2005
    Created date: 16/10/2024 
*/

// Khai báo thư viện
import java.util.Arrays;
import java.util.Scanner;

public class Exercise18 {
    public static void main(String[] args) {
        // Tạo đối tượng scanner để nhận dữ liệu từ người dùng
        Scanner scanner = new Scanner(System.in);

        //Hiển thị thông báo và nhập vào các giá trị cần thiết.
        System.out.print("Nhap vao chuoi thu nhat: ");
        String str1 = scanner.nextLine();

        System.out.print("Nhap vao chuoi thu hai: ");
        String str2 = scanner.nextLine();

        // Kiểm tra hai chuỗi có phải là đảo ngược của nhau (anagram) hay không và in kết quả
        if (areAnagrams(str1, str2)) {
            System.out.println("Hai chuoi nay la dao nguoc cua nhau");
        } else {
            System.out.println("Hai chuoi nay khong phai la dao nguoc cua nhau");
        }
    }

    // Phương thức kiểm tra xem hai chuỗi có phải là anagram hay không
    public static boolean areAnagrams(String str1, String str2) {
        // Loại bỏ khoảng trắng, chuyển thành chữ thường và chuyển thành mảng ký tự
        char[] charArray1 = str1.replaceAll("\\s", "").toLowerCase().toCharArray();
        char[] charArray2 = str2.replaceAll("\\s", "").toLowerCase().toCharArray();

        //Sắp xếp 2 mảng
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // So sánh hai mảng đã sắp xếp để kiểm tra xem chúng có bằng nhau không
        return Arrays.equals(charArray1, charArray2);
    }
}