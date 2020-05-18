package oefeningen;

import java.util.Observable;

public class Model extends Observable {
    int counter = 0;

    public void increase(){
        counter++;

        setChanged();
        notifyObservers();
    }

    public Integer getCounter(){
        return counter;
    }

}
