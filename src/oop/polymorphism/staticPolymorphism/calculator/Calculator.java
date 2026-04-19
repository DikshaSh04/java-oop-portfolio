package oop.polymorphism.staticPolymorphism.calculator;

public class Calculator {

    void calculate(int a,int b){
        System.out.println(a+b);
    }
    void calculate(int a,int b,int c){
        System.out.println(a+b+c);
     }

     void calculate(String a, String b){
         System.out.println(a+b);
     }

    void calculate(int a,int b,String op){
        switch(op){
            case "add":
                System.out.println(a+b);
                break;
            case "subtract":
                System.out.println(a-b);
                break;
            case "multiply":
                System.out.println(a*b);
                break;
            case "divide":
                try {
                    int c=a/b;
                    System.out.println(c);
                }
                catch(Exception e){
                   System.out.println("Can't divide by 0.");
                }
                break;

            default: throw new IllegalArgumentException("Invalid operation");


        }

    }

    Calculator(){

        }

}
