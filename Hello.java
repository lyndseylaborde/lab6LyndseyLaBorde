import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hello. What is your name? ");
        String name = scanner.next(); //User inputs name
        System.out.print("It's nice to meet you, " + name + ". How old are you? ");
        String age = scanner.next(); //User inputs age
        System.out.println("I see that you are still quite young at only " + age + ".");
        System.out.print("Where do you live? ");
        String live = scanner.next(); //User inputs where they live
        System.out.println("Wow! I've always wanted to go to " + live + ". Thanks for chatting with me. Bye!");
    }
}