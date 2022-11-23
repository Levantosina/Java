import java.text.DecimalFormat;

public class areaSquare {

    public static double squareArea(double A) {
        double r = ((2 * A) / Math.PI);
        double B = (r * r);
        String C = String.format("%.2f", B);
        C = C.replace(',', '.');
        double d = Double.parseDouble(C);
        return d;
    }

    public static void main(String[] args) {
        double A = 2;
        System.out.println(squareArea(A));
    }
}