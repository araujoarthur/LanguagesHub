public class Exercise5 {
    public static void main(String[] args)
    {
        if (args.length != 2) return;

        double v1, v2;

        try {
            v1 = Double.parseDouble(args[0]);
            v2 = Double.parseDouble(args[1]);  
            boolean areEqual = (v1 == v2);

            System.out.println(areEqual);
        } catch (NumberFormatException e) {
            System.out.println("Input não numérico");
        }

       
    }
}