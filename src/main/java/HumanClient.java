public class HumanClient implements Client{
    StringBar stringBar;
    StringDrink stringDrink;
    StringRecipe stringRecipe;

    public void wants(StringDrink drink, StringRecipe recipe, StringBar bar){
        stringBar = bar;
        stringDrink = drink;
        stringRecipe = recipe;
    }

    public void happyHourStarted(Bar bar){
        if(stringBar == bar) {
            stringBar.startHappyHour();
        }
    }

    public void happyHourEnded(Bar bar){
        if(stringBar == bar){
            stringBar.endHappyHour();
        }
    }
}
