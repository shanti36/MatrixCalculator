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
}
