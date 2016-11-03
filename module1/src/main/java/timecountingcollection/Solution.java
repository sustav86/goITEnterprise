package timecountingcollection;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

/**
 * Created by SUSTAVOV on 02.11.2016.
 */
public class Solution {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {

        long time10000;
        long time100000;
        long time1000000;

        String[][] timesTable = {
                {"", "add", "get", "remove", "contains", "populate", "iterator.add", "iterator.remove"},
                {"ArrayList", "", "", "", "", "", "", ""},
                {"LinkedList", "", "", "", "", "", "", ""},
                {"HashSet", "", "", "", "", "", "", "", ""},
                {"TreeSet", "", "", "", "", "", "", "", ""}};

        //ArrayList
        //add
        time10000 = TimeCountingCollection.addCollection(new ArrayList<>(), 10000);
        time100000 = TimeCountingCollection.addCollection(new ArrayList<>(), 100000);
        time1000000 = TimeCountingCollection.addCollection(new ArrayList<>(), 1000000);

        timesTable[1][1] = String.valueOf((time10000 + time100000 + time1000000) / 3);

        //get
        time10000 = TimeCountingCollection.getCollection(new ArrayList<>(), 10000);
        time100000 = TimeCountingCollection.getCollection(new ArrayList<>(), 100000);
        time1000000 = TimeCountingCollection.getCollection(new ArrayList<>(), 1000000);

        timesTable[1][2] = String.valueOf((time10000 + time100000 + time1000000) / 3);

        //remove
        time10000 = TimeCountingCollection.removeCollection(new ArrayList<>(), 10000);
        time100000 = TimeCountingCollection.removeCollection(new ArrayList<>(), 100000);
        time1000000 = TimeCountingCollection.removeCollection(new ArrayList<>(), 1000000);

        timesTable[1][3] = String.valueOf((time10000 + time100000 + time1000000) / 3);

        //contains
        time10000 = TimeCountingCollection.containsCollection(new ArrayList<>(), 10000);
        time100000 = TimeCountingCollection.containsCollection(new ArrayList<>(), 100000);
        time1000000 = TimeCountingCollection.containsCollection(new ArrayList<>(), 1000000);

        timesTable[1][4] = String.valueOf((time10000 + time100000 + time1000000) / 3);

        //populate
        time10000 = TimeCountingCollection.populateCollection(new ArrayList<>(), 10000);
        time100000 = TimeCountingCollection.populateCollection(new ArrayList<>(), 100000);
        time1000000 = TimeCountingCollection.populateCollection(new ArrayList<>(), 1000000);

        timesTable[1][5] = String.valueOf((time10000 + time100000 + time1000000) / 3);

        //listIterator.add
        time10000 = TimeCountingCollection.listIteratorAddCollection(new ArrayList<>(), 10000);
        time100000 = TimeCountingCollection.listIteratorAddCollection(new ArrayList<>(), 100000);
        time1000000 = TimeCountingCollection.listIteratorAddCollection(new ArrayList<>(), 1000000);

        timesTable[1][6] = String.valueOf((time10000 + time100000 + time1000000) / 3);

        //listIterator.remove
        time10000 = TimeCountingCollection.listIteratorRemoveCollection(new ArrayList<>(), 10000);
        time100000 = TimeCountingCollection.listIteratorRemoveCollection(new ArrayList<>(), 100000);
        time1000000 = TimeCountingCollection.listIteratorRemoveCollection(new ArrayList<>(), 1000000);

        timesTable[1][7] = String.valueOf((time10000 + time100000 + time1000000) / 3);

        //LinkedList
        //add
        time10000 = TimeCountingCollection.addCollection(new LinkedList<>(), 10000);
        time100000 = TimeCountingCollection.addCollection(new LinkedList<>(), 100000);
        time1000000 = TimeCountingCollection.addCollection(new LinkedList<>(), 1000000);

        timesTable[2][1] = String.valueOf((time10000 + time100000 + time1000000) / 3);

        //get
        time10000 = TimeCountingCollection.getCollection(new LinkedList<>(), 10000);
        time100000 = TimeCountingCollection.getCollection(new LinkedList<>(), 100000);
        time1000000 = TimeCountingCollection.getCollection(new LinkedList<>(), 1000000);

        timesTable[2][2] = String.valueOf((time10000 + time100000 + time1000000) / 3);

        //remove
        time10000 = TimeCountingCollection.removeCollection(new LinkedList<>(), 10000);
        time100000 = TimeCountingCollection.removeCollection(new LinkedList<>(), 100000);
        time1000000 = TimeCountingCollection.removeCollection(new LinkedList<>(), 1000000);

        timesTable[2][3] = String.valueOf((time10000 + time100000 + time1000000) / 3);

        //contains
        time10000 = TimeCountingCollection.containsCollection(new LinkedList<>(), 10000);
        time100000 = TimeCountingCollection.containsCollection(new LinkedList<>(), 100000);
        time1000000 = TimeCountingCollection.containsCollection(new LinkedList<>(), 1000000);

        timesTable[2][4] = String.valueOf((time10000 + time100000 + time1000000) / 3);

        //populate
        time10000 = TimeCountingCollection.populateCollection(new LinkedList<>(), 10000);
        time100000 = TimeCountingCollection.populateCollection(new LinkedList<>(), 100000);
        time1000000 = TimeCountingCollection.populateCollection(new LinkedList<>(), 1000000);

        timesTable[2][5] = String.valueOf((time10000 + time100000 + time1000000) / 3);

        //listIterator.add
        time10000 = TimeCountingCollection.listIteratorAddCollection(new LinkedList<>(), 10000);
        time100000 = TimeCountingCollection.listIteratorAddCollection(new LinkedList<>(), 100000);
        time1000000 = TimeCountingCollection.listIteratorAddCollection(new LinkedList<>(), 1000000);

        timesTable[2][6] = String.valueOf((time10000 + time100000 + time1000000) / 3);

        //listIterator.remove
        time10000 = TimeCountingCollection.listIteratorRemoveCollection(new LinkedList<>(), 10000);
        time100000 = TimeCountingCollection.listIteratorRemoveCollection(new LinkedList<>(), 100000);
        time1000000 = TimeCountingCollection.listIteratorRemoveCollection(new LinkedList<>(), 1000000);

        timesTable[2][7] = String.valueOf((time10000 + time100000 + time1000000) / 3);
//
        //HashSet
        //add
        time10000 = TimeCountingCollection.addCollection(new HashSet<>(), 10000);
        time100000 = TimeCountingCollection.addCollection(new HashSet<>(), 100000);
        time1000000 = TimeCountingCollection.addCollection(new HashSet<>(), 1000000);

        timesTable[3][1] = String.valueOf((time10000 + time100000 + time1000000) / 3);

        //remove
        time10000 = TimeCountingCollection.removeCollection(new HashSet<>(), 10000);
        time100000 = TimeCountingCollection.removeCollection(new HashSet<>(), 100000);
        time1000000 = TimeCountingCollection.removeCollection(new HashSet<>(), 1000000);

        timesTable[3][3] = String.valueOf((time10000 + time100000 + time1000000) / 3);

        //contains
        time10000 = TimeCountingCollection.containsCollection(new HashSet<>(), 10000);
        time100000 = TimeCountingCollection.containsCollection(new HashSet<>(), 100000);
        time1000000 = TimeCountingCollection.containsCollection(new HashSet<>(), 1000000);

        timesTable[3][4] = String.valueOf((time10000 + time100000 + time1000000) / 3);

        //populate
        time10000 = TimeCountingCollection.populateCollection(new HashSet<>(), 10000);
        time100000 = TimeCountingCollection.populateCollection(new HashSet<>(), 100000);
        time1000000 = TimeCountingCollection.populateCollection(new HashSet<>(), 1000000);

        timesTable[3][5] = String.valueOf((time10000 + time100000 + time1000000) / 3);

        //TreeSet
        //add
        time10000 = TimeCountingCollection.addCollection(new TreeSet<>(), 10000);
        time100000 = TimeCountingCollection.addCollection(new TreeSet<>(), 100000);
        time1000000 = TimeCountingCollection.addCollection(new TreeSet<>(), 1000000);

        timesTable[4][1] = String.valueOf((time10000 + time100000 + time1000000) / 3);

        //remove
        time10000 = TimeCountingCollection.removeCollection(new TreeSet<>(), 10000);
        time100000 = TimeCountingCollection.removeCollection(new TreeSet<>(), 100000);
        time1000000 = TimeCountingCollection.removeCollection(new TreeSet<>(), 1000000);

        timesTable[4][3] = String.valueOf((time10000 + time100000 + time1000000) / 3);

        //contains
        time10000 = TimeCountingCollection.containsCollection(new TreeSet<>(), 10000);
        time100000 = TimeCountingCollection.containsCollection(new TreeSet<>(), 100000);
        time1000000 = TimeCountingCollection.containsCollection(new TreeSet<>(), 1000000);

        timesTable[4][4] = String.valueOf((time10000 + time100000 + time1000000) / 3);

        //populate
        time10000 = TimeCountingCollection.populateCollection(new TreeSet<>(), 10000);
        time100000 = TimeCountingCollection.populateCollection(new TreeSet<>(), 100000);
        time1000000 = TimeCountingCollection.populateCollection(new TreeSet<>(), 1000000);

        timesTable[4][5] = String.valueOf((time10000 + time100000 + time1000000) / 3);

        printArrayToConsole(timesTable);
        writeArrayToFile(timesTable);

    }

    public static void printArrayToConsole(String[][] timesTable) {
        for (int i = 0; i < timesTable.length; i++) {
            for (int j = 0; j < timesTable[i].length; j++) {
                System.out.print(timesTable[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void writeArrayToFile(String[][] timesTable) {
        try(FileWriter fileWriter = new FileWriter(new File("Arrays.txt"))) {

            fileWriter.write(Arrays.deepToString(timesTable));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

