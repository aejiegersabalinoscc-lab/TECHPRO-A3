public class ShoppingList {

    public static void main(String[] args) {
        String[] shoppingList = new String[5];
        int itemCount = 0;

        System.out.println("Enter up to 5 items to buy:");

        java.util.Scanner scanner = new java.util.Scanner(System.in); 
        while (itemCount < 5) {
            System.out.print("> ");
            String item = scanner.nextLine();
            shoppingList[itemCount] = item;
            itemCount++;

            System.out.print("Do you want to add more items? (yes/no): ");
            String addMore = scanner.nextLine().toLowerCase();
            if (!addMore.equals("yes")) {
                break;
            }
        }

        System.out.println("\nYour shopping list:");
        for (int i = 0; i < itemCount; i++) {
            System.out.print(shoppingList[i]);
            if (i < itemCount - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println("\nYou entered " + itemCount + " items");        
        System.out.print("\nEnter an item to search for: ");
        String searchItem = scanner.nextLine().toLowerCase(); 
        boolean found = false;
        for (int i = 0; i < itemCount; i++) {
            if (shoppingList[i].toLowerCase().equals(searchItem)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println(searchItem + " is in your shopping list.");
        } else {
            System.out.println(searchItem + " is not in your shopping list.");
        }

        scanner.close(); 
    }
}
