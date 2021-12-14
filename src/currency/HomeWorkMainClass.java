package currency;

public class HomeWorkMainClass {
    public static void main(String[] args) {
        Dollar dollar = new Dollar(26);
        Euro euro = new Euro(32);
        Bitcoin bitcoin = new Bitcoin(50000);

        System.out.println(bitcoin.exchangeCurrencyToGrn(1000));
        System.out.println(bitcoin.exchangeGrnToCurrency(1000));

    }
}
