import java.util.ArrayList;
import java.util.List;

public class ProgramMenu {

    public void printMenu(){
        System.out.println("Hello!");
        System.out.println("Choose an option from the list below: ");

        List<String> menuList = new ArrayList<>();
        menuList.add("Sum");
        menuList.add("Substract");
        menuList.add("Get Celsius temperatue from Fahrenheit");
        menuList.add("Print Stars");

        for (int i = 0; i < menuList.size(); i++){
            System.out.println((i+1) + " - " + menuList.get(i));
        }
        System.out.println("0 - Exist");
    }

}
