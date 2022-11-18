import java.util.List;

public class StringRecipe {
    List<StringTransformer> transformerList;

    public StringRecipe(List<StringTransformer> transformers){
        transformerList = transformers;
    }

    public void mix(StringDrink drink){
        for(StringTransformer stringTransformer : transformerList){
            stringTransformer.execute(drink);
        }
    }
}
