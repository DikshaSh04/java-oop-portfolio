package oop.inheritance.multiLevelInheritance.species;


public class Animal extends Species {
    boolean isMammal;

    Animal(int age,String habitat,boolean isMammal){
        super(age,habitat);
        this.isMammal=isMammal;

    }

    public String display(){
        return "Age: "+this.age+"\nHabitat: "+this.habitat+"\nIs a mammal? "+this.isMammal;
    }

}
