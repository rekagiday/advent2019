public class Day1 {

    public static void main(String[] args) {

        int totalFuelRequirement = 0;

        for (String numberString: args) {
            int number = Integer.parseInt(numberString);
            int fuelRequirement = calculateFuel(number);
            totalFuelRequirement += fuelRequirement;
            while (fuelRequirement > 0) {
                totalFuelRequirement += calculateFuel(fuelRequirement);
                fuelRequirement = calculateFuel(fuelRequirement);
            }
        }

        System.out.println(totalFuelRequirement);

    }

    private static int calculateFuel(int number) {
        return (number / 3 - 2) >= 0 ? (number / 3 -2) : 0;
    }

}
