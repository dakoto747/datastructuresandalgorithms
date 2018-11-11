package com.dakoto.datastructuresandalgorithms.algorithms.sort;

import java.util.ArrayList;
import java.util.List;

public interface Sort<T extends Comparable> {

    enum Order{Ascending, Descending};

    default void topologicalSort()
    {
        /*
         * Run DFS and output reverse of finishing times of vertices.
         * Everytime you visit a vertex, you can add it to a list.
         *
         */
    };

    // 2359
    // 8762
    default List<T> mergeSort(List<T> elements, Order order){

        if(elements.size() > 1)
        {
            return merge(mergeSort(elements.subList(0, elements.size()/2), order),
                         mergeSort(elements.subList(elements.size()/2 +1 , elements.size()), order),
                         order);
        }
        else
        {
            return elements;
        }
    }

    default List<T> merge(List<T> elements1, List<T> elements2, Order order)
    {
        int totalSize = elements1.size() + elements2.size();

        List<T> merged = new ArrayList<>(totalSize);

        int tracker1 = 0, tracker2 = 0;

        for (int i = 0; i < totalSize; i++)
        {
            T element1 = (tracker1 <= (elements1.size() - 1)) ?
                                                               elements1.get(tracker1) :
                                                               elements2.get(tracker2);

            T element2 = (tracker2 <= (elements2.size() - 1)) ?
                                                               elements2.get(tracker2) :
                                                               elements1.get(tracker1);

            //array1 currentElement less than array2 currentElement
            if(element1.compareTo(element2) == 1)
            {
                if(order == Order.Ascending){
                    merged.add(elements1.get(tracker1));
                    tracker1++;
                }
                else
                {
                    merged.add(elements2.get(tracker2));
                    tracker2++;
                }
            }
            else if(element1.compareTo(element2) == -1)
            {

                if(order == Order.Ascending){
                    merged.add(elements2.get(tracker2));
                    tracker2++;
                }
                else
                {
                    merged.add(elements1.get(tracker1));
                    tracker1++;
                }
            }
            else
            {
                merged.add(element2);
                tracker1++;
                tracker2++;
            }
        }

        return merged;
    }


    default List<T> quickSort(List<T> elements){

        return null;
    }
}
