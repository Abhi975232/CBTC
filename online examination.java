import java.util.Scanner;

 public class OnlineExamSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isLoggedIn = false;
        boolean isExamInProgress = false;
        int score = 0;
        int remainingTime = 0;

        while (true) {
            if (!isLoggedIn) {
                System.out.println("===== Online Exam System =====");
                System.out.println("1. Login");
                System.out.println("2. Exit");
                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();

                if (choice == 1) {
                    // Implement login functionality
                    isLoggedIn = true;
                    System.out.println("Logged in successfully!");
                } else if (choice == 2) {
                    System.out.println("Exiting the system. Goodbye!");
                    break;
                } else {
                    System.out.println("Invalid choice. Try again.");
                }
            } else if (!isExamInProgress) {
                System.out.println("===== Main Menu =====");
                System.out.println("1. Update Profile and Password");
                System.out.println("2. Start Exam");
                System.out.println("3. Logout");
                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();

                if (choice == 1) {
                    // Implement profile and password update
                    System.out.println("Profile and password updated.");
                } else if (choice == 2) {
                    // Implement starting an exam
                    isExamInProgress = true;
                    remainingTime = 60; // Set the exam time in seconds
                    System.out.println("Exam started. You have 60 seconds.");
                } else if (choice == 3) {
                    isLoggedIn = false;
                    System.out.println("Logged out.");
                } else {
                    System.out.println("Invalid choice. Try again.");
                }
            } else {
                // Implement exam functionalities with MCQs, timer, and scoring
                if (remainingTime > 0) {
                    System.out.println("Remaining time: " + remainingTime + " seconds");
                   
                } else {
                    isExamInProgress = false;
                    System.out.println("Exam finished. Your score: " + score);
                }
            }
        }
        scanner.close();
    }
}
