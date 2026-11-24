import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //------------------------------------------------------
    /*
    1.Write a program that checks the role of the user
    If the role is admin print "welcome admin"
    If the role is superuser print "welcome superuser"
    If the role is user print "welcome user" (tip: use if else)
     */
        System.out.println("This is program 1:");

        System.out.println("Please choose Number of your role in the IBM company:");
        System.out.println("1/ Admin ");
        System.out.println("2/ Superuser ");
        System.out.println("3/ user ");

        int roll = input.nextInt();

        if (roll == 1) {
            System.out.println("welcome admin");
        } else if (roll == 2) {
            System.out.println("welcome superuser");
        } else if (roll == 3) {
            System.out.println("welcome user");
        } else {
            System.out.println("Choose from list given:");
        }

        //------------------------------------------------------
    /*
    2.Take three numbers from the user and print the greatest number.
    Test Data
    Input the 1st number: 25
    Input the 2nd number: 78
    Input the 3rd number: 87
    Expected Output : The greatest: 87
     */
        System.out.println("This is program 2:");

        System.out.println("Please Enter your height ");
        int yourHeight = input.nextInt();

        System.out.println("Please Enter your friend height ");
        int friendHeight = input.nextInt();

        System.out.println("Please Enter your brother height ");
        int brotherHeight = input.nextInt();

        if (yourHeight > friendHeight && yourHeight > brotherHeight) {
            System.out.println("You have the greatest Height = " + yourHeight);

        } else if (friendHeight > yourHeight && friendHeight > brotherHeight) {
            System.out.println("Your friend have the greatest Height = " + friendHeight);

        } else  {
            System.out.println("Your brother have the greatest Height = " + brotherHeight);

        }



        //------------------------------------------------------
          /*
    3.Write a Java program that generates an integer between 1 and 7
    and displays the name of the weekday.
    Test Data
    number: 4
    Expected Output:
    Wednesday
     */

        System.out.println("This is program 3:");

        System.out.println("Please choose number of the day from this list:");

        System.out.println("1/ sunday ");
        System.out.println("2/ monday ");
        System.out.println("3/ tuseday ");
        System.out.println("4/ wednesday ");
        System.out.println("5/ thursday ");
        System.out.println("6/ friday ");
        System.out.println("7/ saturday ");

        int day = input.nextInt();

        switch (day){

             case 1:
                 System.out.println("Today is Sunday" );
                  break;

            case 2:
                System.out.println("Today is Monday");
                break;

            case 3:
                System.out.println("Today is Tuesday");
                break;

            case 4:
                System.out.println("Today is Wednesday " );
                break;


            case 5:
                System.out.println("Today is Thursday");
                break;

            case 6:
                System.out.println("Today is Friday" );
                break;

            case 7:
                 System.out.println("Today is Saturday" );
                 break;

            default: System.out.println("Please choose from given numbers..");
    }



    //------------------------------------------------------
          /*
    4. Write a program that takes a numeric score as input and prints
    the corresponding letter grade using the following grading scale:
    A: 90-100
    B: 80-89
    C: 70-79
    D: 60-69 F:
    0-59
    Enter your numeric score: 85
    Numeric Score: 85
    Letter Grade: B
     */
        System.out.println("This is program 4:");

        System.out.println("Enter your numeric score 0-100:");
        int score = input.nextInt();

        if  (score >= 90 && score <= 100){
            System.out.println("Numeric Score:" + score);
            System.out.println("Letter Grade: A " );

        } else if (score >= 80 && score <= 89) {
            System.out.println("Numeric Score:" +score);
            System.out.println("Letter Grade: B " );

        } else if (score >= 70 && score <= 79) {
            System.out.println("Numeric Score:  " +score);
            System.out.println("Letter Grade: C " );

        } else if (score >= 60 && score <= 69) {
            System.out.println("Numeric Score:  " +score);
            System.out.println("Letter Grade: D " );

        } else if (score >= 0 && score <= 59) {
            System.out.println("Numeric Score:  " +score);
            System.out.println("Letter Grade: F " );

        }else {
            System.out.println("Please enter your numeric score from 0 to 100");
        }

        //------------------------------------------------------
          /*
    5. Write a Java program that takes a person's age as input and
    categorizes them into one of three age categories: "Child,"
    "Teenager," or "Adult" using an if statement.
    use an if statement to categorize the age based on the following criteria:
    • If the age is less than 13, categorize them as a "Child."
    • If the age is between 13 and 19 (inclusive), categorize them as a
    "Teenager."
    • If the age is 20 or older, categorize them as an "Adult."
    Sample Output:
    Enter your age: 25
    You are an Adult.
     */
        System.out.println("This is program 5:");

        System.out.println("Enter your age:");
        int age = input.nextInt();

        if (age < 13){
            System.out.println(" You are a Child");
        }
        else if (age >= 13 && age <= 19) {
            System.out.println(" You are a Teenager");
        }
        else if (age >= 20 && age <=200) {
            System.out.println(" You are a Teenager");
        }
        else {
            System.out.println(" who have this age already dead");
        }

//------------------------------------------------------


    }}
