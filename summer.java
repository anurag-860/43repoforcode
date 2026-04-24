import java.util.Scanner;

public class SummerVacation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("🌞 Welcome to Summer Vacation Planner 🌞");

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your favorite summer activity: ");
        String activity = scanner.nextLine();

        System.out.print("Enter number of vacation days: ");
        int days = scanner.nextInt();

        System.out.println("\n--- Vacation Plan ---");
        System.out.println("Name: " + name);
        System.out.println("Favorite Activity: " + activity);
        System.out.println("Vacation Days: " + days);

        System.out.println("\nDaily Plan:");
        for (int i = 1; i <= days; i++) {
            System.out.println("Day " + i + ": Enjoy " + activity + " 🎉");
        }

        System.out.println("\nHave a great summer vacation! 😎");

        scanner.close();
    }
}
