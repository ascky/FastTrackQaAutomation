public class AppMain {

    public static void main(String[] args) {

        ProgramMenu menu = new ProgramMenu();
        menu.printMenu();
        ProgramLogic logic = new ProgramLogic();
        logic.runProgram();
    }
}
