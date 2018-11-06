package com.dakoto.datastructuresandalgorithms.datastructures;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SkipList<T> {
/*
A.K.A Union Find.

    Have a bunch of nodes.

    some of which are connected.

    is there a path between two given nodes?

    what/which groups of nodes are connected

    it lets us find if two things are connected.


    think sets/disjoint sets
    OPS:

    Makeset: add objects to the datastructure
    union: link objects together
    Find: are objects connected?

*/

    private Map<T, Set<T>> sets;

    public void makeSet(T... things)
    {
        for(T thing : things)
        {
            Set<T> set = new HashSet<>();
            set.add(thing);
            this.sets.put(thing, set);
        }
    }

    public void union(T zero, T one)
    {

    }

    public void find()
    {

    }

    public class SkipListObject<T>
    {
        private T object;

        private long objectID;

        public SkipListObject(T object, long objectID) {
            this.object = object;
            this.objectID = objectID;
        }

        public SkipListObject(T object) {
            this.object = object;
        }

        public T getObject() {
            return object;
        }

        public void setObject(T object) {
            this.object = object;
        }

        public long getObjectID() {
            return objectID;
        }

        public void setObjectID(long objectID) {
            this.objectID = objectID;
        }
    }
}
