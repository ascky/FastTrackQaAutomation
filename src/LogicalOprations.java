public class LogicalOprations {

    //ex 4

    public void isTheSameString(String inputString){
        if (inputString.equals("Barcelona")){
            System.out.println(inputString + " is the same as Barcelona.");
        }
        else {
            System.out.println("Please try a different String");
        }
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
}
