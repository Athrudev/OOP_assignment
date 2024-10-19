import java.util.*;

public class Assignment7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();
        List<Integer> prime = new ArrayList<>();
        List<Integer> palindrome = new ArrayList<>();

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Enter list elements");
            System.out.println("2. Show even numbers");
            System.out.println("3. Show odd numbers");
            System.out.println("4. Show prime numbers");
            System.out.println("5. Show palindrome numbers");
            System.out.println("6. Show all lists");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    enterListElements(sc, list, even, odd, prime, palindrome);
                    break;
                case 2:
                    System.out.println("Even numbers: " + even);
                    break;
                case 3:
                    System.out.println("Odd numbers: " + odd);
                    break;
                case 4:
                    System.out.println("Prime numbers: " + prime);
                    break;
                case 5:
                    System.out.println("Palindrome numbers: " + palindrome);
                    break;
                case 6:
                    showAllLists(list, even, odd, prime, palindrome);
                    break;
                case 7:
                    System.out.println("Exiting the program. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void enterListElements(Scanner sc, List<Integer> list, List<Integer> even, List<Integer> odd, List<Integer> prime, List<Integer> palindrome) {
        System.out.print("Enter list size: ");
        int size = sc.nextInt();
        if (size < 0) {
            System.out.println("Invalid Size");
            return;
        }

        list.clear();
        even.clear();
        odd.clear();
        prime.clear();
        palindrome.clear();

        System.out.println("Enter " + size + " positive integers (press Enter after each):");
        for (int i = 0; i < size; i++) {
            int result = sc.nextInt();
            if (result < 0) {
                System.out.println("Please enter a positive integer. This input will be skipped.");
                i--;
                continue;
            }
            list.add(result);
            categorizeNumber(result, even, odd, prime, palindrome);
        }
        System.out.println("List updated successfully.");
    }

    private static void categorizeNumber(int num, List<Integer> even, List<Integer> odd, List<Integer> prime, List<Integer> palindrome) {
        if (num % 2 == 0) {
            even.add(num);
        } else {
            odd.add(num);
        }

        if (isPrime(num)) {
            prime.add(num);
        }

        if (isPalindrome(num)) {
            palindrome.add(num);
        }
    }

    private static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    private static boolean isPalindrome(int num) {
        int original = num;
        int reversed = 0;
        while (num > 0) {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }
        return original == reversed;
    }

    private static void showAllLists(List<Integer> list, List<Integer> even, List<Integer> odd, List<Integer> prime, List<Integer> palindrome) {
        System.out.println("Given List: " + list);
        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);
        System.out.println("Prime numbers: " + prime);
        System.out.println("Palindrome numbers: " + palindrome);
    }
}