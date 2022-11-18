import static java.lang.Character.isLowerCase;
import static java.lang.Character.isUpperCase;
import static java.lang.Character.toUpperCase;
import static java.lang.Character.toLowerCase;

public class StringCaseChanger implements StringTransformer {
    @Override
    public void execute(StringDrink drink) {
        StringBuilder stringBuilder = new StringBuilder();
        for(char c : drink.getText().toCharArray()){
            if(isLowerCase(c)){
                c = toUpperCase(c);
                stringBuilder.append(c);
            }
            else if(isUpperCase(c)){
                c = toLowerCase(c);
                stringBuilder.append(c);
            }
            else{
                stringBuilder.append(c);
            }
        }
        drink.setText(stringBuilder.toString());
    }

    @Override
    public void undo(StringDrink drink){
        execute(drink);
    }
}
