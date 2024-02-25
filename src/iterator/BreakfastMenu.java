package iterator;

import java.util.ArrayList;

public class BreakfastMenu implements Menu {
    private ArrayList<MenuItem> menuItems = new ArrayList<>();

    public BreakfastMenu() {
        addItem("Pancake", "Pancake with chocolate cream", 2.99);
        addItem("Waffles", "Crispy Golden Waffle", 2.59);
        addItem("Coffee", "Ice cold coffee", 1.99);
    }

    private void addItem(String name, String description, double price) {
        menuItems.add(new MenuItem(name, description, price));
    }

    @Override
    public MenuIterator createIterator() {
        return new BreakfastMenuIterator(menuItems);
    }
}
