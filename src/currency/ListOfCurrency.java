package currency;

import java.util.HashMap;

public class ListOfCurrency {
    private static HashMap<String,Currency > currencyHasMap = new HashMap<>();

    public static void addCurrency(Currency currency){
        currencyHasMap.put(currency.getCurrencyName(), currency);
    }

    public static HashMap<String, Currency> getCurrencyHasMap(){
        return currencyHasMap;
    }
}
