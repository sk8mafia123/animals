package test.myapplication;

public class Dog extends Animal {

    public Dog(int teeth){
        super(teeth);
        this.animalLegs=4;
    }

    public Dog (int teeth, String color){
        super( color, teeth, 4);
    }

    public String DescribeTheDog(){
        return "";
    }


}

