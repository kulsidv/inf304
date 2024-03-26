package Iterator;

import java.util.Iterator;
import java.util.function.Consumer;

public class Main {
    public static void main(String args[]) {
        MyArrayList<Integer> list = new MyArrayList<Integer>();
        list.add(0);
        list.add(1);
        list.add(2);

        Iterator<Integer> iterator = list.iterator();

        //напрямую через итератор
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //через функциональный 
        list.iterator().forEachRemaining(new MyConsumer<Integer>());
    }
}
