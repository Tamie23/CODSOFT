import java.util.Scanner;

class studentgradecalculator {
public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
        System.out.println("Enter the marks for each of the following subjects (out of 100):");

        System.out.print("Math: ");
        int math = input.nextInt();

        System.out.print("English: ");
        int english = input.nextInt();

        System.out.print(" Integrated Science: ");
        int integratedscience = input.nextInt();

        System.out.print("History: ");
        int history = input.nextInt();

        System.out.print("Geography: ");
        int geography = input.nextInt();

        System.out.print("Social Studies: ");
        int socialstudies = input.nextInt();

    
        int total = math + english + integratedscience + history + geography + socialstudies;
        float percentage = total / 6.0f;

        
        System.out.println("\nTotal Marks: " + total);
        System.out.println("Average Percentage: " + percentage);

        
        if (percentage >= 80) {
            System.out.println("Grade: A");
        } else if (percentage >= 70) {
            System.out.println("Grade: B");
        } else if (percentage >= 60) {
            System.out.println("Grade: C");
        } else if (percentage >= 50) {
            System.out.println("Grade: D");
        } else if (percentage >= 40) {
            System.out.println("Grade: E");
        } else {
            System.out.println("Grade: F");
        }
    }
}
}