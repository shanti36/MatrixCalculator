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
            out.println("0. Exit");
            out.print("Choose option: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    out.print("Enter the number of rows: ");
                    int rows = scanner.nextInt();
                    out.print("Enter the number of columns: ");
                    int cols = scanner.nextInt();

                    matrix1 = new Matrix(rows, cols);

                    out.println("Enter the matrix numbers:");
                    for (int i=0;i<rows;i++) {
                        for (int j = 0; j < cols; j++) {
                            double a, b;
                            Complex num;

                            out.print("Enter a: ");
                            a = scanner.nextDouble();
                            out.print("Enter b: ");
                            b = scanner.nextDouble();

                            num = new Complex(a, b);
                            matrix1.setNum(i, j, num);
                        }
                    }
                    break;
                case 2:
                    matrix1.print();
                    break;
                case 3:
                    out.print("Enter the number of rows: ");
                    int rows2 = scanner.nextInt();
                    out.print("Enter the number of columns: ");
                    int cols2 = scanner.nextInt();

                    matrix2 = new Matrix(rows2, cols2);

                    out.println("Enter the matrix numbers:");
                    for (int i=0;i<rows2;i++) {
                        for (int j = 0; j < cols2; j++) {
                            double a, b;
                            Complex num;

                            out.print("Enter a: ");
                            a = scanner.nextDouble();
                            out.print("Enter b: ");
                            b = scanner.nextDouble();

                            num = new Complex(a, b);
                            matrix2.setNum(i, j, num);
                        }
                    }
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
                case 0:
                    return;
            }
        }
    }
}