public class LogicalOprations {

    //ex 4

    public void isTheSameString(String inputString) {
        if (inputString.equals("Barcelona")) {
            System.out.println(inputString + " is the same as Barcelona.");
        } else {
            System.out.println("Please try a different String");
        }
    }

    public static boolean evenOrOdd(int number) {
        return number % 2 == 0;
    }

    //ex 10
    public boolean isEligibleToVote(int age) {
        if (age > 18) {
            return true;
        } else
            return false;
    }

    //ex 11
    public int compareThreeNumbers(int nrOne, int nrTwo, int nrThree) {
        if (nrOne > nrTwo && nrOne > nrThree) {
            return nrOne;
        } else if (nrTwo > nrThree) {
            return nrTwo;
        } else
            return nrThree;
    }

 // FOR LOOP Exercises start HERE !!!!!
    //For ex 1
    public void countTo100(int countStart) {
        if (countStart > 100)
            System.out.println("Please enter a number between 0 and 99!");
        else {
            System.out.println("We are counting from " + countStart + " to 100!");
            for (int i = countStart; i <= 100; i++) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    //For ex 2
    public void countToNegative100(int countStart) {
        if (countStart > 100)
            System.out.println("Please enter a number between 0 and 99!");
        else {
            System.out.println("We are counting from " + countStart + " to -100!");
            for (int i = countStart; i >= -100; i--) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    //For ex 3
    public void countBetweenNumbers(int start, int stop) {
        if (start < stop) {
            System.out.println("We are counting up from " + start + " to " + stop);
            for (int i = start; i <= stop; i++) {
                System.out.print(i + " ");
            }
        } else {
            System.out.println("We are counting down from " + start + " to " + stop);
            for (int i = start; i >= stop; i--) {
                System.out.print(i + " ");
            }
        }
    }

    //For ex 4
    public void countUp(int start, int stop) {
        if (start < stop) {
            System.out.println("We are counting up from " + start + " to " + stop);
            for (int i = start; i <= stop; i++) {
                System.out.print(i + " ");
            }
        }
        else {
            System.out.println("We are counting from " + stop + " to " + start);
            for (int i = stop; i <= start; i++) {
                System.out.print(i + " ");
            }
        }
    }
    //For ex 5
    public void allOddNumbersTo100(){
        System.out.println("All odd numbers between 0 and 100 are: ");
        for (int i = 0; i <= 100; i++){
            if (i % 2 != 0)
                System.out.print(i + " ");
        }
        System.out.println();
    }
    //For ex 6
    public void allEvenNumbers(){
        System.out.println("All even numbers between 0 and 100 are: ");
        for (int i = 0; i <= 100; i++){
            if (i % 2 == 0)
                System.out.print(i + " ");
        }
        System.out.println();
    }

    //for ex 7
    public int sumIntervalTo100(int start){
        int sum = 0;
        for (int i = start; i <= 100; i++){
            sum = sum + i;
        }
        return sum;
    }

    //for ex 8
    public int averageSumIntervalTo100(int start){
        int sum = 0;
        for (int i = start; i <= 100; i++){
            sum = sum + i;
        }
        return sum / (100 - start+1);
    }

    //for ex 9
    public void displayStars(int stars) {
        for (int j = 1; j <= stars; j++) {
            for (int i = stars; i >= j; i--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // WHILE LOOP
    // While ex 1
    public void countTo100While(int countStart) {
        if (countStart > 100)
            System.out.println("Please enter a number between 0 and 99!");
        else {
            System.out.println("We are counting from " + countStart + " to 100!");
            int i = countStart;
            while (i <= 100) {
                System.out.print(i + " ");
                i++;
            }
        }
        System.out.println();
    }
    // While ex 2
    public void countToNegative100While(int countStart) {
        if (countStart > 100)
            System.out.println("Please enter a number between 0 and 99!");
        else {
            System.out.println("We are counting from " + countStart + " to -100!");
            int i = countStart;
            while (i >= -100) {
                System.out.print(i + " ");
                i--;
            }
        }
        System.out.println();
    }
    // While ex 3
    public void countBetweenNumbersWhile(int start, int stop) {
        int i = start;
        if (start < stop) {
            System.out.println("We are counting up from " + start + " to " + stop);
            while(i <= stop) {
                System.out.print(i + " ");
                i++;
            }
        } else {
            System.out.println("We are counting down from " + start + " to " + stop);
            while (i >= stop) {
                System.out.print(i + " ");
                i--;
            }
        }
        System.out.println();
    }

    //While ex 4
    public void countUpWhile(int start, int stop) {
        if (start < stop) {
            System.out.println("We are counting up from " + start + " to " + stop);
            int i = start;
            while (i <= stop) {
                System.out.print(i + " ");
                i++;
            }
        }
        else {
            System.out.println("We are counting from " + stop + " to " + start);
            int i = stop;
            while (i <= start) {
                System.out.print(i + " ");
                i++;
            }
        }
        System.out.println();
    }
    //While ex 5
    public void allOddNumbersTo100While(){
        System.out.println("All odd numbers between 0 and 100 are: ");
        int i = 0;
        while (i <= 100){
            if (i % 2 != 0)
                System.out.print(i + " ");
            i++;
        }
        System.out.println();
    }
    //while ex 6
    public void allEvenNumbersWhile(){
        System.out.println("All even numbers between 0 and 100 are: ");
        int i = 0;
        while (i <= 100){
            if (i % 2 == 0)
                System.out.print(i + " ");
            i++;
        }
        System.out.println();
    }
}