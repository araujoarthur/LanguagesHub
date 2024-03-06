public class Exercise2 {
    public static void main(String[] args)
    {
        int val1, val2;
        val1 = 2;
        val2 = 4;

        System.out.println("Val1:" + val1 + " Val2:" + val2);

        System.out.println("Swapping...");
        
        val1 = val1 + val2;
        val2 = val1 - val2;
        val1 = val1 - val2;

        System.out.println("Val1:" + val1 + " Val2:" + val2);
    }
}