import java.util.ArrayList;
import java.util.List;

public class StringBar extends Bar{

    List<BarObserver> observers = new ArrayList<>();
    @Override
    public boolean isHappyHour(){
        return happyHour;
    }

    public void startHappyHour(){
        happyHour = true;
        notifyObservers();
    }

    public void endHappyHour(){
        happyHour = false;
        notifyObservers();
    }

    public void order(StringDrink drink, StringRecipe recipe){
        recipe.mix(drink);
    }

    @Override
    public void addObserver(BarObserver observer){
        observers.add(observer);
    }

    @Override
    public void removeObserver(BarObserver observer){
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(){
        for(BarObserver observer : observers){
            if(isHappyHour()) observer.happyHourStarted(this);
            else observer.happyHourEnded(this);
        }
    }
}
