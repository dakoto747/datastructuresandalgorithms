package com.dakoto.datastructuresandalgorithms.datastructures;

public class GenericsPrimer {

    /*
    There are a few confusing answers here so I will try and clear this up. You define a generic as such:

    public class Foo<T> {
        private T t;
        public void setWeight(T t) {
            this.t = t;
        }
        public T getWeight() {
            return t;
        }
    }
    If you want a generic on Foo to always extend a class Bar you would declare it as such:

    public class Foo<T extends Bar> {
        private T t;
        public void setWeight(T t) {
            this.t = t;
        }
        public T getWeight() {
            return t;
        }
    }
    The ? is used when you declare a variable.

    Foo<? extends Bar>foo = getFoo();
    OR
    DoSomething(List<? extends Bar> listOfBarObjects) {
        //internals
    }

    In Java generics, the ? operator means "any class". The extends keyword may be used to qualify that to "any class which extends/implements Something (or is Something).

    Thus you have "the Class of some class, but that class must be or extend/implement Something"

    Basically, Java has no concept of templates (C++ has). This is called generics. And this defines a generic class Class<> with the generics' attribute being any subclass of Something.

    I suggest reading up "What are the differences between “generic” types in C++ and Java?" if you want to get the difference between templates and generics.

    */
}
