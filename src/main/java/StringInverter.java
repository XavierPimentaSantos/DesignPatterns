public class StringInverter implements StringTransformer {
    @Override
    public void execute(StringDrink drink) {
        StringBuilder stringBuilder = new StringBuilder(drink.getText());
        String inverted = stringBuilder.reverse().toString();
        drink.setText(inverted);
    }

    @Override
    public void undo(StringDrink drink){
        execute(drink);
    }
}
