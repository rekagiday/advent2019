import java.util.Arrays;
import java.util.List;

public class Day2 {

    public static void main(String[] args) {
        part2(args);
    }

    private static int part1(int[] numbers) {

        for (int i = 0; i < numbers.length; i += 4) {
            if (numbers[i] == 99) {
                break;
            } else if (numbers[i] == 1) {
                numbers[numbers[i + 3]] = numbers[numbers[i + 1]] + numbers[numbers[i + 2]];
            } else if (numbers[i] == 2) {
                numbers[numbers[i + 3]] = numbers[numbers[i + 1]] * numbers[numbers[i + 2]];
            }
        }

        return numbers[0];

    }

    private static void part2(String[] args) {

        List<String> numberStringList = Arrays.asList(args[0].split(","));

        for (int noun = 0; noun <= 99; noun++) {
            for (int verb = 0; verb <= 99; verb++) {
                int n = numberStringList.size();
                int[] numbers = new int[n];
                for (int i = 0; i < numbers.length; i++) {
                    numbers[i] = Integer.parseInt(numberStringList.get(i));
                }
                numbers[1] = noun;
                numbers[2] = verb;

                part1(numbers);
                int currentValue = numbers[0];
                if (currentValue == 19690720) {
                    System.out.println(100 * noun + verb);
                    break;
                }
            }
        }
    }

}
