package oop.inheritance.multiLevelInheritance.species;

public class Fish extends Animal{


    Fish(int age,String habitat,boolean isMammal){
        super(age,habitat,false);
        super.display();
    }

}
