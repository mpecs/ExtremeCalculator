import java.util.Scanner;
public class menu {

    public static void displayMenu(){
        System.out.println("Select your option:");
    System.out.println("---");
    System.out.println("Option 1");
    System.out.println("Option 2");
    System.out.println("Option 3");
    System.out.println("Exit (4)");

    System.out.print("Your selected option is: (number)");
    }

    public static void returnMenu(){
        Scanner mainMenu = new Scanner (System.in);
        System.out.println("Type 1 to return to main menu, type 0 to exit");
        int Menu = mainMenu.nextInt();
        if (Menu == 1){
            displayMenu();
        }
        else if (Menu != 1){
            System.out.println("Goodbye");
        }
        mainMenu.close();
    }
    
    public static void main (String args[]){
        
    //user input
    int userSelected;

    //display menu
    displayMenu();

    Scanner in = new Scanner(System.in);
    userSelected = in.nextInt();

    //switch statement


    switch (userSelected){

        case 1:        
        Scanner userInput1 = new Scanner (System.in);

        System.out.println("Daily allowed expenditure based on Edenred finances");
        System.out.println("please input your current Edenred benefits balance:");
        double edenred = userInput1.nextDouble();
        System.out.println("Please enter date");
        double days = 27 - (userInput1.nextDouble());
        double result = edenred / days;

        userInput1.close();
        System.out.println("Allowed daily Edenred expenditure is "+ result + "euro");
        break;

        case 2:
        Scanner userInput2 = new Scanner (System.in);

        System.out.println("Do I have study hours?");
        System.out.println("Please input your current year of study");
        int year = userInput2.nextInt();
        System.out.println("Please input current term of school year:");
        int term = userInput2.nextInt();
        
        if(year < 5 && term < 5){
            if (year == 1){
                System.out.println("Yes, checkin is at 7 pm.");
            }
            else if (year == 2 && term < 3){
                System.out.println("Yes, checkin is at 7 pm.");
            }
            else if (year == 2 && term > 2){
                System.out.println("No unless otherwise stated, enjoy a free evening.");
            }
            else if (year == 3 && term == 1){
                System.out.println("Yes, checkin is at 7 pm.");
            }
            else if (year == 3 && term > 1){
                System.out.println("No unless otherwise stated, enjoy a free evening.");
            }
            else if (year == 4 && term < 5){
                System.out.println("No unless otherwise stated, enjoy a free evening.");
            }
            else{
                System.out.println("Please enter a valid year or term.");
            }
        }
        
        userInput2.close();
        break;

        case 3:

        System.out.println("What is your age in animal years?");
        System.out.println("Choose an animal");
        System.out.println("1 - Dog");
        System.out.println("2 - Cat");
        System.out.println("3 - Chicken");
        System.out.println("Your selected animal is (1 - 3):");

        Scanner userInput3 = new Scanner(System.in);
        int userAnimal = userInput3.nextInt();
        
        System.out.println("Please enter your age in years");
        int Age = in.nextInt();

        if(userAnimal == 1){
            double DogAge = Age * 3.64;
            System.out.println("Your age in dog years is " + DogAge);
        }
        else if (userAnimal == 2){
            double CatAge = Age * 3.2;
            System.out.println("Your age in cat years is " + CatAge);
        }
        else if (userAnimal == 3){
            double ChickenAge = Age * 5.33;
            System.out.println("Your age in chicken years is " + ChickenAge);
        }
        userInput3.close();
        break;
        }
    System.out.println("Thank you for using our calculator.");


    }


    
    }


