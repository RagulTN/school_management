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
        System.out.println("Enter student First Name : ");
        this.firstName = sc.nextLine();

        System.out.println("Enter student Last Name : ");
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
                courses = courses + " " + course;
                feeBalance = feeBalance + costOfCourse;
            }
            else{
                System.out.println("Thank you !! \n");
                break;
            }
        } while(true);

    System.out.println("Enrolled Courses : " + courses);
    System.out.println("Fee Balance : " + feeBalance);
    }

    //Pay tuition
    public void ViewBalance(){
        System.out.println("Your Balance is : " + feeBalance);
    }

    //Pay Fee amount
    public void PayFee(){
        Scanner sc = new Scanner(System.in);
        int payAmount = sc.nextInt();
        feeBalance = feeBalance - payAmount;
        System.out.println("Thank for your payment rupees" + payAmount);
        ViewBalance();

    }

    //Show status
    public String showInfo(){
        return "Name : " + firstName +" "+lastName+"\n Course Enrolled : "
         +courses+ "\nBalance : "+ feeBalance;

    }

}
