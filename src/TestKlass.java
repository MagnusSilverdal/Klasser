import java.util.Random;

/**
 * This is a class
 * Created 2022-03-16
 *
 * @author Magnus Silverdal
 */
public class TestKlass {
    public static void main(String[] args) {
        Rektangel r1 = new Rektangel();
        Rektangel r2 = new Rektangel();
        r1.bas = 10000000;
        r1.höjd = 5000000;
        System.out.println("Rektangelns storlek är " + r1.bas + " x " + r1.höjd);
        System.out.println("Arean är " + r1.getArea());
        System.out.println("Omkretsen är " + r1.getCircumference());

        AndragradsPolynom p = new AndragradsPolynom(1,1,0);
        System.out.println("Polynomet är " + p.A + " x^2 + " + p.B + " x + " + p.C);
        System.out.println("Det har nollställena " + p.solveForZero()[0] + " och " + p.solveForZero()[1]);
        AndragradsPolynom pPrim = p.derivate();
        System.out.println("Derivatan är " + pPrim.A + " x^2 + " + pPrim.B + " x + " + pPrim.C);

    }

}
