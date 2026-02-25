import java.util.Vector;

public class VectorBasics {
    public static void main(String[] args) {
        // Part A: Basic Vector Operations
        Vector<String> items = new Vector<>(); // Create empty Vector

        // Add items
        items.add("Sword");
        items.add("Shield");
        items.add("Potion");
        items.add("Map");
        items.add("Key");

        // Print Vector
        System.out.println("Items: " + items);
        System.out.println("Size: " + items.size());
        System.out.println("Capacity: " + items.capacity());

        // Get element at index 2
        System.out.println("Element at index 2: " + items.get(2));

        // Change element at index 1
        items.set(1, "Magic Shield");

        // Remove "Potion"
        items.remove("Potion");

        // Print after changes
        System.out.println("Items after changes: " + items);
        System.out.println("Size: " + items.size());
        System.out.println("Capacity: " + items.capacity());

        // Part B: Capacity Management
        Vector<Integer> numbers = new Vector<>(5); // initial capacity 5

        for (int i = 0; i < 10; i++) {
            numbers.add(i);
            if (i == 4 || i == 9) { // print at key points
                System.out.println("After adding " + (i+1) + " elements -> Size: " + numbers.size() + ", Capacity: " + numbers.capacity());
            }
        }

        // Trim capacity to match size
        numbers.trimToSize();
        System.out.println("After trimToSize -> Size: " + numbers.size() + ", Capacity: " + numbers.capacity());
    }
}