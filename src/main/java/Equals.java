public class Equals {
    public double[] roots(double a, double b, double c) {
        double d = b * b - 4 * a * c;
        if (d > 0) {
            double x1, x2;
            x1 = (-b - Math.sqrt(d)) / (2 * a);
            x2 = (-b + Math.sqrt(d)) / (2 * a);
            return new double[]{x1, x2};
        } else if (d == 0) {
            double x = -b / (2 * a);
            return new double[]{x};
        } else {
            throw new Error("Нет корней");
        }
    }

}
