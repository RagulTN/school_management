import java.util.Scanner;

public class Student {

    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses = "";
    private int feeBalance;
    private int costOfCourse = 600;
    private int id = 1000;

    //Receive student name and year
    public Student(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student First Name : ");
        this.firstName = sc.nextLine();

        System.out.print("Enter student Last Name : ");
        this.lastName = sc.nextLine();

        System.out.println(" 1 - First year \n 2 - Second year \n 3 - Third year \n 4 - final year");
        this.gradeYear = sc.nextInt();

        setStudentID();
       
    }

    //Generate an ID
    private void setStudentID(){
        id++;
        this.studentID = gradeYear + "" + id;
    }

    //Enroll in courses
    //View Balance
    public void enroll(){
        do{
            System.out.print("Enter course to enroll (type 'quit' to exit ) : ");
            Scanner sc = new Scanner(System.in);
            String course = sc.nextLine();
            if(!course.equals("quit")){
                courses = courses + course + " ";
                feeBalance = feeBalance + costOfCourse;
            }
            else{
                System.out.println("Thank you !! \n");
                break;
            }
        } while(true);

    System.out.println("Enrolled Courses : " + courses);
    System.out.println("Total amount of courses : " + feeBalance);
    System.out.println("-----------");
    }

    //Pay tuition
    public void ViewBalance(){
        System.out.println("Your Fee Balance : " + feeBalance);
        System.out.println("-----------");

    }

    //Pay Fee amount
    public void PayFee(){
        System.out.print("Enter Pay Amount : ");
        Scanner sc = new Scanner(System.in);
        int payAmount = sc.nextInt();
        System.out.println();
        feeBalance = feeBalance - payAmount;
        System.out.println("You have paid : " + payAmount + " rupees");
        ViewBalance();

    }

    //Show status
    public String toString(){
        return " \n Student Details : \n \n Name : " + firstName +" "+lastName+ "\n Grade year : " + gradeYear +
         "\n Student ID : " + studentID + "\n Course Enrolled : "
         + courses + " \n Balance : "+ feeBalance;

    }

}
