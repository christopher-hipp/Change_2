import java.util.Scanner;

public class Interface {
    Scanner scanner = new Scanner(System.in);

    int value = 0;

    public void mainLoop() {
        while (true) {
            System.out.println("Enter m to continue\n");
            System.out.println("Enter q to quit\n");
            
            String input = scanner.nextLine();
            if (input.equals("q")) {
                System.exit(0);
            }

            if (input.equals("m")) {
                menu();
            }
        }
    }

    public void menu() {
        while (true) {
            System.out.println("""
                    Select what you want to do:
                    1 - Use Rahakratt array
                    2 - Use custom array
                    """);

            String input = scanner.nextLine();
            if (input.equals("1")) {
                rahakrattMenu();
            }
            if (input.equals("2")) {
                customMenu();
            }
        }
    }

    public void rahakrattMenu() {
        ChangeRK change = new ChangeRK();
        change.setInitialArray();

        while (true) {
            System.out.println("""
                               Select what you want to do:
                               1 - Pick a random value
                               2 - Show remaining values
                               3 - Show used values
                               4 - Show total of used values
                               m - back to main menu (loses current progress)
                               """);

            String input = scanner.nextLine();
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
            if (input.equals("m")) {
                mainLoop();
            }
        }
    }

    public void customMenu() {
        ChangeCustom custom = new ChangeCustom(0);

        while (true) {
            System.out.println("""
                               1 - Add custom value as total
                               2 - Display custom value
                               3 - Display custom value split up
                               4 - Show remaining values
                               m - back to main menu (loses current progress)
                               """);

            String input = scanner.nextLine();
            if (input.equals("1")) {
                System.out.println("Enter a value" + "\n");
                value = Integer.parseInt(scanner.nextLine());
                custom = new ChangeCustom(value);
            }
            if (input.equals("2")) {
                System.out.println(custom.getTotal() + "\n");
            }
            if (input.equals("3")) {
                if (custom.arraySize() == 0) {
                    System.out.println("How many section would you like to divide the total into?");
                    value = Integer.parseInt(scanner.nextLine());
                    System.out.println(custom.totalSplitter(value) + "\n");
                } else {
                    System.out.println("Array already contains values!\n");
                }
            }
            if (input.equals("4")) {
                System.out.println(custom.getValues());
            }
            if (input.equals("m")) {
                mainLoop();
            }
        }
    }
}
