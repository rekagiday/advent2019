import java.util.Arrays;
import java.util.List;

public class Day2 {

    public static void main(String[] args) {
        List<String> numberStringList = Arrays.asList(args[0].split(","));

        int n = numberStringList.size();
        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(numberStringList.get(i));
            numbers[1] = 12;
            numbers[2] = 2;
        }

        for (int i = 0; i < numbers.length; i += 4) {
            if (numbers[i] == 99) {
                System.out.println("Stopped");
                break;
            } else if (numbers[i] == 1) {
                numbers[numbers[i + 3]] = numbers[numbers[i + 1]] + numbers[numbers[i + 2]];
            } else if (numbers[i] == 2) {
                numbers[numbers[i + 3]] = numbers[numbers[i + 1]] * numbers[numbers[i + 2]];
            } else {
                System.out.println("Error");
                break;
            }
            System.out.println(Arrays.toString(numbers));
        }

        System.out.println(numbers[0]);
    }
}
