public class StringReplacer implements StringTransformer {
    char o;
    char n;

    @Override
    public void execute(StringDrink drink) {
        drink.setText(drink.getText().replace(o, n));
    }

    public StringReplacer(char old, char new_){
        o = old;
        n = new_;
    }

    @Override
    public void undo(StringDrink drink){
        drink.setText(drink.getText().replace(n, o));
    }
}
