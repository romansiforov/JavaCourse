package currency;

public class MainClass {
    public static void main(String[] args) {
        Dollar dollar = new Dollar(26.00);
        System.out.println(dollar.getKursNBU());
        System.out.println(dollar.getMarga());

        dollar.setKursNBU(26.4);
        System.out.println(dollar.getKursNBU());

        System.out.println(dollar.exchangeGrnToCurrency(1000));
        System.out.println(dollar.exchangeCurrencyToGrn(1000));

        Euro euro = new Euro(32);
        euro.exchangeCurrencyToGrn(1000);
        euro.exchangeGrnToCurrency(1000);

        // Currency currency = new Currency(100);

        System.out.println(dollar.isFreeConv());

        Som som = new Som(0.0001);
        som.setMarga(1.3);
        som.exchangeCurrencyToGrn(100000);
        som.exchangeGrnToCurrency(1000);
        som.setKursNBU(0.0001);
        som.exchangeCurrencyToGrn(100000);
        som.exchangeGrnToCurrency(1000);

    }
}
