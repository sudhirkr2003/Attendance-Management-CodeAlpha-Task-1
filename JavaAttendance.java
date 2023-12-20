import java.util.Scanner;

public class JavaAttendance
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Attendence Management System:-");
        System.out.println("Enter your name:-");
        String name = scanner.nextLine();
        
        // Student's ID Number
        System.out.println("Enter your register number:");
        int id = scanner.nextInt();
        
        // Student's attendance record
        System.out.println("Enter your attendance record (1 for present, 0 for absent):");
        int[] attendanceRecord = new int[10];
        for (int i =0; i < attendanceRecord.length; i++)
        {
            attendanceRecord[i] = scanner.nextInt();
        }
        
        // Calculate the student's  attendance percentage
        int totalAttendance = 0;
        for (int i = 0; i < attendanceRecord.length; i++)
        {
            totalAttendance += attendanceRecord[i];
        }
        float attendancePercentage = (float) totalAttendance / attendanceRecord.length * 100;
        
        // display the student's attendance record
        System.out.println("Here is your attendance record:");
        for (int i = 0; i < attendanceRecord.length; i++)
        {
            System.out.println("Week " + (i + 1) + ":" + attendanceRecord[i]);
        }
        
        // Display the student's attendance precentage
        System.out.println("Yourattendance precentage is " + attendanceRecord + "%.");
        
        // Determine the student's attendance stutes
        if (attendancePercentage >= 75)
        {
            System.out.println("You have a good precentage of attendance.");
        } else 
        {
            System.out.println("Your attendance is below 75");
        }
    }
}