package test.myapplication;

public class Animal {
    int animalsTeeth;
    int animalLegs;
    String animalColor;

    public Animal(){

    }

    public Animal(int teeth){
        animalsTeeth=teeth;
    }

    public Animal (int legs, int teeth){
        this(teeth);
        animalLegs=legs;
    }

    public Animal( String color, int legs, int teeth){
        this(legs, teeth);
        animalColor=color;
    }

    public String describeTheAnimal(){
      String description;
      if (animalColor==null){
          description="My Animal has "+animalLegs +" legs and "+animalsTeeth +" teeth";
      }else {
          description = "My Animal has a color whose name has : " + animalColor.length() + " characters, and has: " + animalLegs + " legs and " + animalsTeeth + " teeth";
      }
      return description;
    }
    public String describeTheDog(){
       return "";
    }


}
