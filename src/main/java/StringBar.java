public class StringBar extends Bar{
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

}
