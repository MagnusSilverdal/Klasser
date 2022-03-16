/**
 * This is a class
 * Created 2022-03-16
 *
 * @author Magnus Silverdal
 */
public class Rektangel {
    double bas = 10;
    double höjd = 3;

    public double getArea() {
        return bas*höjd;
    }

    public double getCircumference() {
        return 2*bas+2*höjd;
    }
}
