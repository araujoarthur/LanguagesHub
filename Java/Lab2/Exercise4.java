public class Exercise4 {
    public static void main(String[] args)
    {
        if (args.length < 2) return;
        double sum, counter;
        sum = counter = 0;

        for(int i = 0; i < args.length; i++) {
            try {
                double number = Double.parseDouble(args[i]);
                sum = sum + number;
                counter++;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input: " + args[i]);
            }
        }
        
        System.out.println("Média: " + (sum/counter));
    }
}