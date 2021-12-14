package currency;

import java.text.DecimalFormat;

abstract class Currency {
    private double kursNBU;
    private double marga = 1.1;
    DecimalFormat df = new DecimalFormat("####0.00");
    DecimalFormat dfKurs = new DecimalFormat("####0.0000");

    public Currency(double kursNBU) {
        this.kursNBU = kursNBU;
    }

    public double getMarga() {
        return marga;
    }

    public void setMarga(double marga) {
        this.marga = marga;
    }

    public double getKursNBU() {
        return kursNBU;
    }

    public void setKursNBU(double kursNBU) {
        this.kursNBU = kursNBU;
    }

    public double getKursBuy() {
        return kursNBU * marga;
    }

    public double getKursSell() {
        return kursNBU / marga;
    }

    abstract public String getCurrencyName();

    private boolean checkCurrencyValue(double numberOfGrn){
        if (numberOfGrn < 0){
            System.out.println("The amount of GRNs is less than 0. You may try to use it somewhere else:-)");
            return false;
        }
        return true;
    }

    public double exchangeGrnToCurrency(double numberOfGrn) {
        if(checkCurrencyValue(numberOfGrn)) {
            double tmpResult = numberOfGrn / getKursBuy();
            System.out.println(String.format("For this %s GRN you get %s %s by kurs %s", numberOfGrn, df.format(tmpResult), getCurrencyName(), dfKurs.format(getKursBuy())));
            return tmpResult;
        }
        return numberOfGrn;
    }

    public double exchangeCurrencyToGrn(double numberOfCurrency) {
        if(checkCurrencyValue(numberOfCurrency)) {
            double tmpResult = numberOfCurrency * getKursSell();
            System.out.println(String.format("For this %s %s you get %s Grn by kurs %s", numberOfCurrency, getCurrencyName(), df.format(tmpResult), dfKurs.format(getKursSell())));
            return tmpResult;
        }
        return numberOfCurrency;
    }
}
