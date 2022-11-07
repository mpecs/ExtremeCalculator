import java.util.Scanner;
class predictedWellbeing {

public static void main(String[] args){ 

    Scanner userInput = new Scanner(System.in); 

        System.out.println("Welcome to the predicted wellbeing Calculator");
        System.out.println("Starting out with a predicted score of 5, we will calculate your predicted wellbeing based on your selected AP programs.");
        System.out.println("(Please do not take this seriously)");
        
        System.out.println("How many of these classes did you choose this year?");
        System.out.println("AP Statistics, AP Computer Science Principles, AP Computer Science A, AP English, AP Human Geography");
        double block1 = userInput.nextDouble();

        System.out.println("How many of these classes did you choose this year?");
        System.out.println("AP Economics, AP Studio Art, AP French Language, AP Literature, AP German Language");
        double block2= userInput.nextDouble();

        System.out.println("How many of these classes did you choose this year?");
        System.out.println("AP Comparative Government, AP Biology, AP Calculus, AP Psychology, AP Art History, AP Seminar/Research, AP European History, AP Physics");
        double block3 = userInput.nextDouble();

        double fullWellScore = 5;
        double userWellScore = fullWellScore - 0.25*block1 - 0.5*block2 - 1*block3;

        System.out.println("Your predicted wellbeing score for this year is " + userWellScore +"/5.");
        if (userWellScore == 5){
            System.out.println("Enjoy your year!");
        }
        else if (userWellScore > 3 && userWellScore < 5){
            System.out.println("It's good to challenge yourself.");
        }
        else if (userWellScore > 1 && userWellScore <= 3){
            System.out.println("Consider researching some time organizational skills or different study methods.");
        }
        else if (userWellScore <= 1){
            System.out.println("Good luck!");
        }

}  
}  