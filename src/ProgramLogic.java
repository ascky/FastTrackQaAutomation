public class ProgramLogic {

    public void runProgram() {
        ReadFromKeyboard read = new ReadFromKeyboard();

        int number = read.getInt();
        Calculator calc = new Calculator();
//add while
        switch (number) {
            case 1:
                System.out.println("Please enter the numbers"); // needs refactor
                calc.averageThreeNumbers(read.getInt(), read.getInt(), read.getInt());
                break;
            case 2:
                System.out.println("Please enter numbers "); // needs refactor
                calc.inchToMeter(read.getInt());
                break;
        }
    }

}
