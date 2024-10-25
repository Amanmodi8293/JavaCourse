public class CheckNthBit {
    public static void main(String[] args) {
        // Ensure that two arguments are provided
        if (args.length != 2) {
            System.out.println("Usage: java CheckNthBit <num> <n>");
            return;
        }

        try {
            // Parse the input arguments
            int num = Integer.parseInt(args[0]);
            int n = Integer.parseInt(args[1]);

            // Check if the nth bit is set
            if ((num & (1 << n)) != 0) {
                System.out.println("The " + n + "th bit of " + num + " is set (1).");
            } else {
                System.out.println("The " + n + "th bit of " + num + " is not set (0).");
            }
        } catch (NumberFormatException e) {
            System.out.println("Please provide valid integers for num and n.");
        }
    }
}
