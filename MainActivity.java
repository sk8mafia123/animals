package test.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {
    String TAG= "animal";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        main();
    }

    public void main(){

        List<Animal> animals=new ArrayList<Animal>();
        Cat myCat= new Cat();
        myCat.setCatColor("brown");

        animals.add(new Animal( 4, 10));
        animals.add(new Dog(0, "Brown"));
        int i=0;

        while (i<10){
            i++;
        }
        do{
            i++;
        } while (i<10);

        for ( i=0; i<animals.size(); i++){
            animals.get(i).describeTheAnimal();
        }

        for (Animal animal: animals){
            Log.e(TAG, animal.describeTheAnimal());

        }
    }

}
