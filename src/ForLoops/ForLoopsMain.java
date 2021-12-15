package ForLoops;

public class ForLoopsMain {

    public static void main(String[] args) {

//        displayStars(21);
        fibonacci(21);
    }

    public void displayStars(int stars) {
        for (int j = 1; j <= stars; j++) {
            for (int i = stars; i >= j; i--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static int fibonacci(int n){
        int a = 0, b = 1, c;
        if (n == 0)
            return a;
        for (int i = 2; i <=n; i++){
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
}