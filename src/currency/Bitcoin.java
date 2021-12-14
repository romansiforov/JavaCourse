package currency;

public class Bitcoin extends Currency implements Сyryptocurrency{

    public Bitcoin(double kursNBU) {
        super(kursNBU);
    }

    @Override
    public String getCurrencyName() {
        return "Bitcoin";
    }

    @Override
    public boolean isСyryptocurrency() {
        return true;
    }

    @Override
    public double exchangeGrnToCurrency(double numberOfGrn){
        System.out.println("You try to change "+numberOfGrn+" to Bitcoin");
        System.out.println("This operation is forbidden by National Bank of Ukraine");
        return numberOfGrn;
    }
}
