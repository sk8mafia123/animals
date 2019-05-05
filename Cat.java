package test.myapplication;

public class Cat extends Animal {
    String cat = "cat";
    String catColor ="color";

    public Cat(){

    }
    public Cat (int teeth) {
        super(teeth);
        this.animalLegs = 4;
    }

    public String typeofcat(){
        return cat;
    }
    public String getDescription(String color){
        cat=color+"pussy";
        catColor=color;

        return "My Cat is called " + cat + " because my cat color is " + catColor;

    }

public void setCatColor (String color) {
      catColor= color;

}

}
