package io.javabrains.reactiveworkshop.delete;

public class WalterClient {
    public static void main(String[] args) {
        WalterCollection walterCollection = new WalterCollection();
        Iterator iterator = walterCollection.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
