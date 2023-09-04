import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age;
        String firstName;
        String favoriteFood;
        System.out.println("Please input your age.");
        age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Please input your first name.");
        firstName = scanner.nextLine();
        System.out.println("Please enter your favorite food.");
        favoriteFood = scanner.nextLine();
        System.out.println("First Name: " + firstName + "\n\nAge: " + age + "\n\nFavorite Food: " + favoriteFood);
    }
}
