/*
    Fullname: Trương Đỗ Quỳnh Anh
    Student ID: 31231022100
    Date of birth: 16/12/2005
    Created date: 15/10/2024 
*/

// Khai báo thư viện
import java.util.Scanner;

public class Exercise13 {
    public static void main(String[] args) {
        // Tạo đối tượng scanner để nhận dữ liệu từ người dùng
        Scanner scanner = new Scanner(System.in);

        //Hiển thị thông báo và nhập vào các giá trị cần thiết.
        System.out.print("Nhap vao so hang cua ma tran thu nhat: ");
        int rows1 = scanner.nextInt();
        System.out.print("Nhap vao so cot cua ma tran thu nhat (so hang cua ma tran thu hai): ");
        int cols1 = scanner.nextInt();
        System.out.print("Nhap vao so cot cua ma tran thu hai: ");
        int cols2 = scanner.nextInt();

        int[][] matrix1 = new int[rows1][cols1];
        int[][] matrix2 = new int[cols1][cols2];
        int[][] result = new int[rows1][cols2];

        System.out.print("Nhap vao cac phan tu cua ma tran thu nhat: ");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }

        System.out.print("Nhap vao cac phan tu cua ma tran thu hai: ");
        for (int i = 0; i < cols1; i++) {
            for (int j = 0; j < cols2; j++) {
                matrix2[i][j] = scanner.nextInt();
            }
        }

        // Nhân hai ma trận.
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        //Hiển thị ma trận kết quả.
        System.out.println("Tich cua hai ma tran la: ");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}