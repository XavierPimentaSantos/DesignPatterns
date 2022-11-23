public class RomulanClient extends AlienClient{
    ImpatientStrategy strategy = new ImpatientStrategy();
    StringBar stringBar;
    RomulanClient(){}

    @Override
    public void wants(StringDrink drink, StringRecipe recipe, StringBar bar) {
        strategy.wants(drink, recipe, bar);
    }

    public ImpatientStrategy createOrderingStrategy(){
        ImpatientStrategy impatientStrategy = new ImpatientStrategy();
        return impatientStrategy;
    }
}
