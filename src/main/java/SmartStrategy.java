import java.util.ArrayList;
import java.util.List;

public class SmartStrategy implements OrderingStrategy{
    List<StringDrink> drinkList = new ArrayList<>();
    List<StringRecipe> recipeList = new ArrayList<>();

    public SmartStrategy(){}

    @Override
    public void wants(StringDrink drink, StringRecipe recipe, StringBar bar){
        if(bar.isHappyHour()){
            bar.order(drink, recipe);
        }
        else{
            drinkList.add(drink);
            recipeList.add(recipe);
        }
    }

    @Override
    public void happyHourStarted(StringBar bar){
        for(int i = 0; i < drinkList.size(); i++){
            bar.order(drinkList.get(i), recipeList.get(i));
        }
    }

    @Override
    public void happyHourEnded(StringBar bar){
        drinkList.clear();
        recipeList.clear();
    }
}
