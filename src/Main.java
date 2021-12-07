import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        conversieFahrenheitToCelsius(44);
//        conversieFahrenheitToCelsius(77);
//        conversieFahrenheitToCelsius(12);
//        conversieFahrenheitToCelsius(32);

        LogicalOprations logicalOprations = new LogicalOprations();
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number one ");
        int nrOne = scan.nextInt();
        System.out.println("Enter number two ");
        int nrTwo = scan.nextInt();
        System.out.println("Enter number three ");
        int nrThree = scan.nextInt();
        System.out.println("The biggest number is: " + logicalOprations.compareThreeNumbers(nrOne,nrTwo,nrThree));

        System.out.println("Enter age one ");
        int age = scan.nextInt();
        System.out.println("Are you allowed to vote: " + logicalOprations.isEligibleToVote(age));
    }

    public static float conversieFahrenheitToCelsius(float gradeFahrenheit){
        float gradeCelcius = ((float) 5/9 ) * (gradeFahrenheit - 32);
        System.out.println( gradeFahrenheit + " grade F este " + gradeCelcius + " grade C");
        return gradeCelcius;
    }
}
