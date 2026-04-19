package oop.polymorphism.staticPolymorphism.calculator;

//This is an example of static polymorphism which uses method overloading.
//Method overloading = same method name, different parameters.

public class Main {
    public static void main(String[] args) {
        Calculator cal1=new Calculator();


        cal1.calculate(3,4);
        cal1.calculate(3,5,"subtract");
        cal1.calculate("Hello","World");
        cal1.calculate(4,8,10);
        cal1.calculate(5,4,"multiply");
        cal1.calculate(10,0,"divide");

    }
}
