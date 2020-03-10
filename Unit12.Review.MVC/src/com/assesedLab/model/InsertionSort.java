package com.assesedLab.model;

import com.assesedLab.view.ArrayUtility;

public class InsertionSort {

    public static void sort(Comparable[] values) {
        /* algorithm
            for each object from the second object in the array loop // current object
                set insertion point to the first object
                while insertion position not yet found loop
                    if current object is less than the insertion point element then
                        note insertion point found
                        for each object from the current down to the insertion point loop
                            copy from previous position into the object position
                        end loop
                        insert current object at insertion point
                    else
                        set insertion point to the next position
                        if insertion position is the same as the current position then
                            // object already in correct position
                            note insertion position found
                        end if
                    end if
                end loop
            end loop
         */
        Boolean insertionPositionFound;
        Comparable insertValue;
        Integer size = ArrayUtility.getNumberOfObjects(values);
        for (Integer current = 1; current < size; current++) {
            insertionPositionFound = false;
            Integer insertion = 0;
            while (!insertionPositionFound) {
                if (values[current].compareTo(values[insertion]) < 0) {
                    insertionPositionFound = true;
                    insertValue = values[current];
                    for (Integer index = current; index > insertion; index--) {
                        values[index] = values[index - 1];
                    }
                    values[insertion] = insertValue;
                } else {
                    insertion++;
                    if (insertion == current) {
                        insertionPositionFound = true;
                    }
                }
            }
        }
    }
}

