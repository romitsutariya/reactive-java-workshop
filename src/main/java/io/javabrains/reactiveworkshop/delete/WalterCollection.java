package io.javabrains.reactiveworkshop.delete;

public class WalterCollection implements Container {

    private String[] name = {"Romit", "Darshan", "Darsak", "lalabhia"};

    @Override
    public Iterator iterator() {
        return new WalterCollectionItr();
    }

    private class WalterCollectionItr implements Iterator {
        private int count;

        @Override
        public boolean hasNext() {
            return count < name.length;
        }

        @Override
        public Object next() {
            return name[count++].toUpperCase();
        }
    }
}
