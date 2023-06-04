import java.util.Scanner;

public class Interface {
    Scanner scanner = new Scanner(System.in);
    Change change = new Change();

    public void loop() {
        change.setInitialArray();

        while (true) {
            System.out.println("Select what you want to do:\n" +
                               "1 - Pick a random value\n" +
                               "2 - Show remaining values\n" +
                               "3 - Show used values\n" +
                               "4 - Show total of used values\n" +
                               "q - quit\n");
            
            String input = scanner.nextLine();
            if (input.equals("q")) {
                break;
            }

            if (input.equals("1")) {
                System.out.println("You picked " + change.selectValue() + "\n");
            }
            if (input.equals("2")) {
                System.out.println("Remaining values are: " + change.getArray() + "\n");
            }
            if (input.equals("3")) {
                System.out.println("List of used values: " + change.getUsedArray() + "\n");
            }
            if (input.equals("4")) {
                System.out.println("Total of used values: " + change.usedValuesTotal() + "\n");
            }
        }
    }
}
