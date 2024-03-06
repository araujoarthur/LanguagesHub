public class Exercise1Alternative {
    public static void main (String[] args) 
    {
        if (args.length != 2)
        {
            System.out.println("Usage: java Exercise1Alternative <width> <height>");
            return;
        } 
        
        double width, height, hip;
        try {
            width = Double.parseDouble(args[0]);
            height = Double.parseDouble(args[1]);
            hip = Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
            double answer = width + 2*hip;
            System.out.println("Perimeter: "+ (answer));
        } catch (NumberFormatException e) {
            System.out.println("Input invalido: " + args[0] + " " + args[1]);
            return;
        }
    }
}