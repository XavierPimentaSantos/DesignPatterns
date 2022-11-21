import java.util.List;

public class StringTransformerGroup implements StringTransformer{
    List<StringTransformer> transformers;

    @Override
    public void execute(StringDrink drink){
        for(StringTransformer transformer: transformers){
            transformer.execute(drink);
        }
    }

    public StringTransformerGroup(List<StringTransformer> transformerList){
        transformers = transformerList;
    }

    @Override
    public void undo(StringDrink drink){
        for(int i = transformers.size() - 1; i >= 0; i--){
            transformers.get(i).execute(drink);
        }
    }
}
