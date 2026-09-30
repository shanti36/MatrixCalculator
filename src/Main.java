import java.util.Scanner;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Matrix matrix1 = null;
        Matrix matrix2 = null;

        while (true) {
            out.println("MENU");
            out.println("1. Enter matrix_1");
            out.println("2. Print matrix_1");
            out.println("3. Enter matrix_2");
            out.println("4. Print matrix_2");
            out.println("5. Transpose matrix_1");
            out.println("6. Transpose matrix_2");
            out.println("7. Sum of matrices");
            out.println("8. Multiply matrices");
            out.println("0. Exit");
            out.print("Choose option: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    matrix1 = Matrix.create();
                    break;
                case 2:
                    matrix1.print();
                    break;
                case 3:
                    matrix2 = Matrix.create();
                    break;
                case 4:
                    matrix2.print();
                    break;
                case 5:
                    Matrix m1Trans = MatrixCalculator.transpose(matrix1);
                    m1Trans.print();
                    break;
                case 6:
                    Matrix m2Trans = MatrixCalculator.transpose(matrix2);
                    m2Trans.print();
                    break;
                case 7:
                    Matrix mAdd = MatrixCalculator.add(matrix1, matrix2);
                    mAdd.print();
                    break;
                case 8:
                    Matrix mMul = MatrixCalculator.multiply(matrix1, matrix2);
                    mMul.print();
                    break;
                case 0:
                    return;
            }
        }
    }
}