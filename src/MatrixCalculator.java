public class MatrixCalculator {
    public static Matrix transpose(Matrix m) {
        Matrix mTrans = new Matrix(m.getCols(), m.getRows());
        for (int i = 0; i < m.getRows(); i++){
            for (int j = 0; j < m.getCols(); j++) {
                mTrans.setNum(j, i, m.getNum(i, j));
            }
        }
        return mTrans;
    }

    public static Matrix add(Matrix m1, Matrix m2) {
        Matrix mAdd = new Matrix(m1.getRows(), m1.getCols());
        for (int i = 0; i < m1.getRows(); i++){
            for (int j = 0; j < m1.getCols(); j++) {
                Complex c = Complex.add(m1.getNum(i, j), m2.getNum(i,j));
                mAdd.setNum(i, j, c);
            }
        }
        return mAdd;
    }

    public static Matrix multiply(Matrix m1, Matrix m2) {
        Matrix mMul = new Matrix(m1.getRows(), m2.getCols());
        for (int m = 0; m < m1.getRows(); m++) {
            for (int k = 0; k < m2.getCols(); k++) {
                Complex sum = new Complex();
                for (int n = 0; n < m1.getCols(); n++) {
                    sum = Complex.add(sum, Complex.mul(m1.getNum(m, n), m2.getNum(n, k)));
                }
                mMul.setNum(m, k, sum);
            }
        }
        return mMul;
    }

    public static Matrix getMinor(Matrix m, int rowSkip, int colSkip) {
        Matrix newMatrix = new Matrix(m.getRows() - 1, m.getCols() - 1);

        int rowMinor = 0;
        for (int i = 0; i < m.getRows(); i++) {
            if (i == rowSkip) {continue;}

            int colMinor = 0;
            for (int j = 0; j < m.getCols(); j++) {
                if (j == colSkip) {continue;}
                newMatrix.setNum(rowMinor, colMinor, m.getNum(i, j));
                colMinor++;
            }
            rowMinor++;
        }
        return newMatrix;
    }

    public static Complex getDet(Matrix m) {
        if (m.getRows() == 2) {
            Complex i = Complex.subtract(Complex.mul(m.getNum(0, 0), m.getNum(1, 1)), Complex.mul(m.getNum(0, 1), m.getNum(1, 0)));
            return i;
        }

        Complex sum = null;
        if (m.getRows() > 2) {
            sum = new Complex(0, 0);
            Complex l = new Complex(-1.0, 0);

            for (int k = 0; k < m.getCols(); k++) {
                l = Complex.mul(l, new Complex(-1.0, 0));
                sum = Complex.add(sum, Complex.mul(Complex.mul(m.getNum(0, k), l), MatrixCalculator.getDet(MatrixCalculator.getMinor(m, 0, k))));
            }
        }
        return sum;
    }
}