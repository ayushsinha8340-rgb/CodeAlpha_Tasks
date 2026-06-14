import java.util.Scanner;

public class AIChatbot {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== AI Chatbot ===");
        System.out.println("Type 'bye' to exit.");

        while (true) {

            System.out.print("You: ");
            String input = sc.nextLine().toLowerCase();

            if (input.equals("bye")) {
                System.out.println("Bot: Goodbye! Have a nice day.");
                break;
            }
            else if (input.contains("hello") || input.contains("hi")) {
                System.out.println("Bot: Hello! How can I help you?");
            }
            else if (input.contains("name")) {
                System.out.println("Bot: I am an AI Chatbot created in Java.");
            }
            else if (input.contains("how are you")) {
                System.out.println("Bot: I am fine. Thanks for asking!");
            }
            else if (input.contains("time")) {
                System.out.println("Bot: Sorry, I cannot tell the exact time right now.");
            }
            else if (input.contains("java")) {
                System.out.println("Bot: Java is a powerful object-oriented programming language.");
            }
            else {
                System.out.println("Bot: Sorry, I don't understand that question.");
            }
        }

        sc.close();
    }
}
