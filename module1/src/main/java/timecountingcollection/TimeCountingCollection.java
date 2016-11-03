package timecountingcollection;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

/**
 * Created by SUSTAVOV on 30.10.2016.
 */
public class TimeCountingCollection {

    static Random random = new Random();

    public static long addCollection(Collection<Integer> collection, int cycle) throws IllegalAccessException, InstantiationException {
        long average = 0;
        long time;

        for (int i = 0; i < 100; i++) {

            time = System.currentTimeMillis();
            for (int j = 0; j < cycle; j++) {
                collection.add(random.nextInt());
            }
            average += System.currentTimeMillis() - time;

            collection = collection.getClass().newInstance();
        }

        return average / 100;

    }

    public static long getCollection(List<Integer> collection, int cycle) throws IllegalAccessException, InstantiationException {
        long average = 0;
        long time;

        collection = (List<Integer>) bufferCollection(collection, cycle);

        for (int i = 0; i < 100; i++) {

            time = System.currentTimeMillis();
            collection.get(random.nextInt(cycle));
            average += System.currentTimeMillis() - time;

        }
        return average / 100;
    }

    public static long removeCollection(Collection<Integer> collection, int cycle) throws IllegalAccessException, InstantiationException {
        long average = 0;
        long time;

        collection = bufferCollection(collection, cycle);

        for (int i = 0; i < 100; i++) {

            time = System.currentTimeMillis();
            collection.remove(random.nextInt(cycle));
            average += System.currentTimeMillis() - time;

        }
        return average / 100;
    }

    public static long containsCollection(Collection<Integer> collection, int cycle) throws IllegalAccessException, InstantiationException {
        long average = 0;
        long time;

        collection = bufferCollection(collection, cycle);

        for (int i = 0; i < 100; i++) {

            time = System.currentTimeMillis();
            collection.contains(random.nextInt(cycle));
            average += System.currentTimeMillis() - time;

        }
        return average / 100;
    }

    public static long populateCollection(Collection<Integer> collection, int cycle) throws IllegalAccessException, InstantiationException {
        long average = 0;
        long time;

        collection = bufferCollection(collection, cycle);

        for (int i = 0; i < 100; i++) {

            time = System.currentTimeMillis();
            collection.addAll(collection);
            average += System.currentTimeMillis() - time;

            collection = collection.getClass().newInstance();
        }
        return average / 100;
    }

    public static <T extends List<Integer>> long listIteratorAddCollection(T collection, int cycle) throws IllegalAccessException, InstantiationException {
        long average = 0;
        long time;

        ListIterator<Integer> listIterator = collection.listIterator();
        for (int i = 0; i < 100; i++) {

            time = System.currentTimeMillis();
            listIterator.add(random.nextInt());
            average += System.currentTimeMillis() - time;

        }

        return average / 100;

    }

    public static <T extends List<Integer>> long listIteratorRemoveCollection(T collection, int cycle) throws IllegalAccessException, InstantiationException {
        long average = 0;
        long time;

        addCollection(collection, cycle);
        ListIterator<Integer> listIterator = collection.listIterator();

        for (int i = 0; i < 100; i++) {

            time = System.currentTimeMillis();
            if (listIterator.hasNext()) {
                listIterator.next();
                listIterator.remove();
            }

            average += System.currentTimeMillis() - time;

        }

        return average / 100;

    }

    public static Collection<Integer> bufferCollection(Collection<Integer> collection, int cycle) throws IllegalAccessException, InstantiationException {

        for (int j = 0; j < cycle; j++) {
            collection.add(random.nextInt());
        }

        return collection;

    }


}
