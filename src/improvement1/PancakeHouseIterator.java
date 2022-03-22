package improvement1;

import java.util.ArrayList;

public class PancakeHouseIterator implements Iterator {
    private ArrayList<MenuItem> items;
    private int position = 0;

    public PancakeHouseIterator(ArrayList<MenuItem> items) {
        this.items = items;
    }

    @Override
    public Object next() {
        MenuItem menuItem = items.get(position);
        position = position + 1;
        return menuItem;
    }

    @Override
    public boolean hasNext() {
        return position < items.size();
    }
}