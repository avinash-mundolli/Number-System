public class PositiveNegative {
    public static void main(String[] args) {
        int num = -5;
        System.out.print("Input: " + num);
        
        if (num > 0)
            System.out.println("\nOutput: Positive number");
        else if (num < 0)
            System.out.println("\nOutput: Negative number");
        else
            System.out.println("\nOutput: Zero");
    }
}