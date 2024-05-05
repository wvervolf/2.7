import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        List<String> words = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));
        task1(nums);
        task2(nums);
        task3(words);
        task4(words);
    }

    private static void task1(List<Integer> list) {
        for (Integer number : list) {
            if (number % 2 != 0) {
                System.out.println(number);
            }
        }
    }

    private static void task2(List<Integer> list) {
        Set<Integer> set = new TreeSet<>(list);
        for (Integer number : set) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }
    }

    private static void task3(List<String> list) {
        Set<String> set = new HashSet<>(list);
        for (String number : set) {
            System.out.println(number);
        }
    }

    private static void task4(List<String> list) {
        Set<String> words = new HashSet<>(list);
        for (String word : words) {
            System.out.println(word + " -> " + Collections.frequency(list, word));
        }
    }
}