package io.baraka._12_classes;

class AccessModifiers {

   static void display(){
        System.out.println("Hello world");
    }

    static void main() {
         /*
         access modifiers are used for security
         it allows for a certain object or variable to be accessed at certain levels

           public -class/package/subclass/world
           protected - class/package/subclass
           no modifier -class/package
           private -class

           When writing code program in a manner that
           only the intended packages/class/modules/application
           should be able to see what they are supposed to see

             a package is  an aggregation of classes
             if you have to write multiple classes and wrap all of them
             in  a single logical bundle that would be called a package

          */
        display();
    }
}
