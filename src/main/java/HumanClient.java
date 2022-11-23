public class HumanClient implements Client{
    StringBar stringBar;
    StringDrink stringDrink;
    StringRecipe stringRecipe;

    OrderingStrategy orderingStrategy;

    public void wants(StringDrink drink, StringRecipe recipe, StringBar bar){
        orderingStrategy.wants(drink, recipe, bar);
        stringBar = bar;
    }

    public void happyHourStarted(Bar bar){
        orderingStrategy.happyHourStarted(stringBar);
    }

    public void happyHourEnded(Bar bar){
        orderingStrategy.happyHourEnded(stringBar);
    }

    public HumanClient(OrderingStrategy strategy){
        orderingStrategy = strategy;
    }
}
