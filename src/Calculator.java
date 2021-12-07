public class Calculator {

    public double averageThreeNumbers(int nrOne, int nrTwo, int nrThree){
        return (nrOne + nrTwo + nrThree) / 3d;
    }

    public int divisionModuloDisplay(int nrOne,int nrTwo ){
        return nrOne % nrTwo;
    }

    public int fahrenheitToCelsius(int fahrenheit){
         float celsius = 5/9f * (fahrenheit -32);
         return (int) celsius;
    }

    public double inchToMeter(double inch){
        return 0.0254 * inch;
    }

    public void speedCalculator (double distance, double hours, double minutes, double seconds){
        double speedMetersPerSecond = distance / (hours * 60 * 60 + minutes * 60 + seconds);
        System.out.println("Speed in Meters per second is " + speedMetersPerSecond);
        double speedKilometersPerHour = (speedMetersPerSecond * 3600) / 1000;
        System.out.println("Speed in KM per Hour is "+ speedKilometersPerHour);
        double speedMilesPerHour = speedKilometersPerHour / 1.609;
        System.out.println("Speed in MILES per Hour is "+ speedMilesPerHour);
        //return speedMetersPerSecond;
    }
}
