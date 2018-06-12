package com.dakoto.datastructuresandalgorithms.datastructures.bugs;

public interface List {

    default Object detectCycle(){
    //  if cycle doesn't exist, return null, else return loop start
        return null;
    }

    default Object createDeepCopy(){

        return null;
    }

    default Object createFromString(String string){

        return null;
    }

    default Object createFromInteger(int integer){

        return null;
    }

    default boolean isIdenticalTo(List otherList){

        return false;
    }



}
