public class Main {

    public static void main(String[] args) {
//        Calculator calculator = new Calculator();
        LogicalOprations logicalOprations = new LogicalOprations();
//        Scanner scan = new Scanner(System.in);
//
//        System.out.println("Find the avarage for three numbers");
//        System.out.println("Enter number one ");
//        int nrOne = scan.nextInt();
//        System.out.println("Enter number two ");
//        int nrTwo = scan.nextInt();
//        System.out.println("Enter number three ");
//        int nrThree = scan.nextInt();
//        System.out.println("The average for " + nrOne + ", "+ nrTwo + ", "+ nrThree + ", "+ " is: " + calculator.averageThreeNumbers(nrOne,nrTwo,nrThree));
//        System.out.println("**************************NEXT EXERCISE************************************");
//        System.out.println();
//
//        System.out.println("Display the division Modulo");
//        System.out.println("Enter number one ");
//        nrOne = scan.nextInt();
//        System.out.println("Enter number two ");
//        nrTwo = scan.nextInt();
//        System.out.println("Dividing " + nrOne + " to " + nrTwo + " the modulo is " + calculator.divisionModuloDisplay(nrOne,nrTwo));
//        System.out.println("**************************NEXT EXERCISE************************************");
//        System.out.println();
//
//        System.out.println("Convert Fahrenheit to Celsius");
//        System.out.println("Enter temperature in Fahrenheit ");
//        nrOne = scan.nextInt();
//        System.out.println("Temperature " + nrOne + " in Fahrenheit is " + calculator.fahrenheitToCelsius(nrOne) + " in Celsius ");
//        System.out.println("**************************NEXT EXERCISE************************************");
//        System.out.println();
//
//        System.out.println("Convert inch to meter");
//        System.out.println("Enter distance in inch");
//        nrOne = scan.nextInt();
//        System.out.println("Distance " + nrOne + " in inch is " + calculator.inchToMeter(nrOne) + " in meters ");
//        System.out.println("**************************NEXT EXERCISE************************************");
//        System.out.println();
//
//        System.out.println("Calculate Speed");
//        System.out.println("Enter Distance in Meteres");
//        nrOne = scan.nextInt();
//        System.out.println("Enter duration in hours ");
//        nrTwo = scan.nextInt();
//        System.out.println("Enter duration in minutes ");
//        nrThree = scan.nextInt();
//        System.out.println("Enter duration in seconds ");
//        int nrFour = scan.nextInt();
//        System.out.println("YOUR SPEED IS:");
//        calculator.speedCalculator(nrOne,nrTwo,nrThree,nrFour);
//        System.out.println("**************************NEXT EXERCISE************************************");
//        System.out.println();
//
//        System.out.println("See if string is Equal.");
//        System.out.println("Please enter a text to compare with \"Barcelona\". ");
//        String myInputText = scan.nextLine();
//        logicalOprations.isTheSameString(myInputText);
//        System.out.println("**************************NEXT EXERCISE************************************");
//        System.out.println();
//
//        System.out.println("Compare THREE numbers and see the biggest.");
//        System.out.println("Enter number one ");
//        nrOne = scan.nextInt();
//        System.out.println("Enter number two ");
//        nrTwo = scan.nextInt();
//        System.out.println("Enter number three ");
//        nrThree = scan.nextInt();
//        System.out.println("The biggest number is: " + logicalOprations.compareThreeNumbers(nrOne,nrTwo,nrThree));
//        System.out.println("**************************NEXT EXERCISE************************************");
//        System.out.println();
//
//        System.out.println("Check if age is eligible to vote.");
//        System.out.println("Enter age one ");
//        int age = scan.nextInt();
//        System.out.println("Are you allowed to vote: " + logicalOprations.isEligibleToVote(age));
//        System.out.println("**************************NEXT EXERCISE************************************");
//        System.out.println();
        ReadFromKeyboard read = new ReadFromKeyboard();
        int start = read.getInt();
        int stop = read.getInt();
//        System.out.println("The number you've entered are : " + start + " and " + stop);
//        System.out.println("The number you've entered, " + number + " is even: " + LogicalOprations.evenOrOdd(number));
//        logicalOprations.countToNegative100(start);
//        logicalOprations.countToNegative100While(start);
//        LogicalOprations.countToNegative100(start);
//        LogicalOprations.countBetweenNumbers(start, stop);
//        LogicalOprations.countUp(start,stop);
//        LogicalOprations.allEvenNumbers();
//        LogicalOprations.allOddNumbersTo100();
//        logicalOprations.countBetweenNumbersWhile(start, stop);
        logicalOprations.countUpWhile(start,stop);
//        logicalOprations.allEvenNumbersWhile();
//        logicalOprations.allOddNumbersTo100While();
//        System.out.println("The sum between " + start + " and all numbers to 100 is: " + logicalOprations.averageSumIntervalTo100(start));
//        logicalOprations.displayStars(12);
    }
}
