public class Exercise6 {
    public static void main(String[] args)
    {
            double v1, v2, v3;

            v1 = 2.0;
            v2 = 1.0;
            v3 = 1.0;
            
            double[] result = new double[2];
        
            result[0] = ((-v1) + Math.sqrt(Math.pow(v1, 2) - (4 * v2 * v3)))/(2*v2);
            result[1] = ((-v1) - Math.sqrt(Math.pow(v1, 2) - (4 * v2 * v3)))/(2*v2);

            double[] roots = bhaskara(v1, v2, v3);
            System.out.println("Root 1: " + roots[0]);
            System.out.println("Root 2: " + roots[1]);

    }

    static double[] bhaskara(double a, double b, double c)
    {
        double[] result = new double[2];
        result[0] = ((-a) + Math.sqrt(Math.pow(a, 2) - (4 * b * c)))/(2*b);
        result[1] = ((-a) - Math.sqrt(Math.pow(a, 2) - (4 * b * c)))/(2*b);
        return result;
    }
}