package WhileLoop;

public class CozaLozaWoza {

    public static void main(String[] args) {

        cozaLozaWoza(0,110);
    }

    public static void cozaLozaWoza(int start, int end) {
        for (int i = start; i <= end; i++) {
            if ( i % 11 == 0 ){
                System.out.println();
            }
            if (i % 3 == 0 && i % 7 == 0 &&  i % 5 == 0){
                System.out.print("CozaLozaWozas ");
            }
            else if (i % 3 == 0 && i % 5 == 0){
                System.out.print("CozaLoza ");
            }
            else if (i % 3 == 0 && i % 7 == 0){
                System.out.print("WozaLoza ");
            }
            else if (i % 3 == 0) {
                System.out.print("Coza ");
            }
            else if ( i % 5 == 0){
                System.out.print("Loza ");
            }
            else if (i % 7 == 0){
                System.out.print("Woza ");
            }
            else {
                System.out.print(i + " ");
            }
        }
    }
}
