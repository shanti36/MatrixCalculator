public class Complex {
    private double a, b;

    Complex() {
        a = 0;
        b = 0;
    }

    Complex(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {return this.a;}
    public double getB() {return this.b;}

    public void setA(double a) {
        this.a = a;
    }
    public void setB(double b) {
        this.b = b;
    }
    public static Complex add(Complex c1, Complex c2) {
        Complex cAdd = new Complex(c1.getA() + c2.getA(), c1.getB() + c2.getB());
        return cAdd;
    }

    public static Complex mul(Complex c1, Complex c2) {
        double a, b;
        a = c1.getA() * c2.getA() - c1.getB() * c2.getB();
        b = c1.getA() * c2.getB() + c1.getB() * c2.getA();
        return new Complex(a, b);
    }

    @Override
    public String toString() {
        if (b == 0){
            return a + "";
        }
        if (a == 0) {
            return b + "i";
        }
        if (b > 0) {
            return a + " + " + b + "i";
        }
        return a + " - " + Math.abs(b) + "i";
    }
}
