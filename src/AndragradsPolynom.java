/**
 * This is a class
 * Created 2022-03-16
 *
 * @author Magnus Silverdal
 */
public class AndragradsPolynom {
    double A;
    double B;
    double C;

    public AndragradsPolynom(double a, double b, double c) {
        A = a;
        B = b;
        C = c;
    }

    public double[] solveForZero() {
        double p = B/A;
        double q = C/A;
        double[] zero = {p/2+Math.sqrt(p*p/4-q),p/2-Math.sqrt(p*p/4-q)};
        return zero;
    }

    public AndragradsPolynom derivate() {
        return new AndragradsPolynom(0,2*A,B);
    }

    @Override
    public String toString() {
        return A + " x^2 + " + B + " x + " + C;
    }
}
