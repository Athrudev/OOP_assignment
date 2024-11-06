import java.util.ArrayList;

class GenericArrayList<T> {
    private ArrayList<T> list = new ArrayList<>();

    public void addItem(T item) {
        list.add(item);
    }

    public T getItem(int index) {
        try {
            return list.get(index);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index out of bounds: " + e.getMessage());
            return null;
        }
    }

    public void displayItems() {
        for (T item : list) {
            System.out.println(item);
        }
    }
}

class five {
    public static void main(String[] args) {
        GenericArrayList<String> stringList = new GenericArrayList<>();
        stringList.addItem("Hello");
        stringList.addItem("World");
        stringList.displayItems();

        // Attempting to access an index that does not exist
        System.out.println("Item at index 5: " + stringList.getItem(5));
    }
}
