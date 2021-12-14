package currency;

public class Som extends Currency implements IsFreeConverted{

    public Som(double kursNBU) {
        super(kursNBU);
    }

    @Override
    public String getCurrencyName() {
        return "Uz SOM";
    }

    @Override
    public boolean isFreeConv() {
        return false;
    }
}
