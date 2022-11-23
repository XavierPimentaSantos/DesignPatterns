public class FerengiClient extends AlienClient{
    SmartStrategy strategy = new SmartStrategy();
    StringBar stringBar;
    FerengiClient(){}

    @Override
    public void wants(StringDrink drink, StringRecipe recipe, StringBar bar) {
        stringBar = bar;
        strategy.wants(drink, recipe, bar);
    }

    public void happyHourStarted(Bar bar){
        strategy.happyHourStarted(stringBar);
    }

    public SmartStrategy createOrderingStrategy(){
        SmartStrategy smartStrategy = new SmartStrategy();
        return smartStrategy;
    }
}
