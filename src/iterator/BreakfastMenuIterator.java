package iterator;

import java.util.ArrayList;

public class BreakfastMenuIterator implements MenuIterator {
    private ArrayList<MenuItem> menuItems;
    private int position = 0;

    public BreakfastMenuIterator(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        return position < menuItems.size();
    }

    @Override
    public MenuItem next() {
        return menuItems.get(position++);
    }
}
