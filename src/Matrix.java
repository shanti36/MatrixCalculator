import java.util.Scanner;

import static java.lang.System.out;

public class Matrix {
    private int rows, cols;
    private Complex[][] data;

    Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.data = new Complex[rows][cols];
        for (int i=0;i<rows;i++) {
            for (int j=0;j<cols;j++) {
                data[i][j] = new Complex(0,0);
            }
        }
    }

    public static Matrix create() {
        Scanner scanner = new Scanner(System.in);

        out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        Matrix matrix = new Matrix(rows, cols);

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
                matrix.setNum(i, j, num);
            }
        }
        return matrix;
    }

    public Complex getNum(int row, int col) {
        return this.data[row][col];
    }
    public void setNum(int row, int col, Complex n) {
        this.data[row][col] = n;
    }

    public int getRows() {return this.rows;}
    public int getCols() {return this.cols;}

    public void print() {
        for (int i=0;i<rows;i++) {
            for (int j=0; j<cols; j++) {
                out.print(this.data[i][j] + "\t");
            }
            out.println();
        }
    }
}
