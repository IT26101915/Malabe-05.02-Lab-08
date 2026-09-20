import java.util.Scanner;

public class IT26101915Lab8Q4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] studentsArray = new int[8];

        // Input 8 Student IDs
        for (int i = 0; i < 8; i++) {

            System.out.print("Enter Student ID " + (i + 1) + ": ");
            int id = input.nextInt();

            while (id <= 0) {
                System.out.println("Error! Student ID must be positive.");
                System.out.print("Enter Student ID " + (i + 1) + ": ");
                id = input.nextInt();
            }

            studentsArray[i] = id;
        }

        // Search Student ID
        System.out.print("Enter Student ID to search: ");
        int searchID = input.nextInt();

        boolean found = false;

        for (int i = 0; i < 8; i++) {
            if (studentsArray[i] == searchID) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Student is Available");
        } else {
            System.out.println("Student is Not Available");
        }
    }
}