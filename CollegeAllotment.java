import java.util.Scanner;

public class CollegeAllotment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Collect candidate details
        System.out.print("Enter Candidate Name: ");
        String candidateName = sc.nextLine();

        System.out.print("Enter College Name: ");
        String collegeName = sc.nextLine();

        System.out.print("Enter Entrance Test Rank: ");
        int rank = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Branch: ");
        String branch = sc.nextLine();

        System.out.print("Enter Date of Joining: ");
        String dateOfJoining = sc.nextLine();

        System.out.print("Enter Address: ");
        String address = sc.nextLine();

        System.out.print("Enter CGPA: ");
        double cgpa = sc.nextDouble();

        sc.nextLine(); 

        System.out.print("Enter University: ");
        String university = sc.nextLine();

        // Display the formatted College Allotment Order
        System.out.println("\n**********************************");
        System.out.println("         College Allotment Order");
        System.out.println("**********************************");
        System.out.println("Candidate Name : " + candidateName + "\tCollege Name : " + collegeName);
        System.out.println("Entrance Test Rank : " + rank + "\tBranch : " + branch);
        System.out.println("Date of Joining : " + dateOfJoining + "\tAddress : " + address);
        System.out.println("CGPA : " + cgpa + "\tUniversity : " + university);
        System.out.println("**********************************");
        
        // Validate CGPA and select university based on CGPA and rank
        if (cgpa >= 9.0) {
            System.out.println("You are eligible for top-tier universities.");
        } else if (cgpa >= 7.0) {
            System.out.println("You are eligible for mid-tier universities.");
        } else {
            System.out.println("You are eligible for other universities.");
        }

        if (rank <= 500) {
            System.out.println("You are eligible for branches like CSE, AI, Data Science.");
        } else if (rank <= 2000) {
            System.out.println("You can opt for branches like IT, ECE.");
        } else {
            System.out.println("You may get branches like Mechanical, Civil, etc.");
        }



    }
}
