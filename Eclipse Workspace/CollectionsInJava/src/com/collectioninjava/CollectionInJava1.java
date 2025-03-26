package com.collectioninjava;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionInJava1 {
    public static void main(String[] args) {
        /*
         * Collection:
         * ===========
         * - Collection is the root interface in the Collection framework.
         * - It provides utility methods to work with collections.
         * - When we represent a group of individual objects as a single entity, we use a collection.
         * - This interface provides built-in methods to work with any collection class.
         */

        // Creating a Collection using ArrayList
        Collection<Object> collection = new ArrayList<>();

        // Adding elements to the collection
        collection.add(10);       // Adding an Integer
        collection.add("Name");    // Adding a String
        collection.add(10.89);     // Adding a Double

        // Removing an element
        collection.remove(10);

        // Printing the collection before clearing
        System.out.println("Collection before clear: " + collection);

        // Clearing all elements
        collection.clear();

        // Printing the collection after clearing
        System.out.println("Collection after clear: " + collection);
    }
}
