package improvement1;

import java.util.Iterator;

public class DinerMenuIterator implements Iterator {
    MenuItem[] items;
    int position = 0;

    public DinerMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    @Override
    public Object next() {
        MenuItem menuItem = items[position];
        position = position + 1;
        return menuItem;
    }

    @Override
    public boolean hasNext() {
        // The null check handles the case where the position is greater than the MAX Size of the list
        if (position >= items.length || items[position] == null) {
            return false;
        } else {
            return true;
        }
    }
}
