package currency;

public class Dollar extends Currency implements IsFreeConverted {

    public Dollar(double kursNBU) {
        super(kursNBU);
    }

    @Override
    public String getCurrencyName() {
        return "Dollar";
    }

    @Override
    public boolean isFreeConv() {
        return true;
    }
}
