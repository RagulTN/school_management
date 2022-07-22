import java.util.Scanner;

public class StudentDatabase {
    //Create new student 
    public static void main(String[] args) {
        
        //Ask number of students to be added
        System.out.print("Enter Num of students to be added : ");
        Scanner sc = new Scanner(System.in);
        int numOfStudents = sc.nextInt();
        Student[] student = new Student[numOfStudents];

        for (int i = 0; i < numOfStudents; i++) {
            student[i] = new Student();
            student[i].enroll();
            student[i].PayFee();
            System.out.println(student[i].toString());
        }     
    }
}
