package data_types_oca_ch_1;

public class TypeCasting {

    public static void main(String[] args) {
        
        double ethStockPriceDouble = 3609.783;
        System.out.println("Before changed to an int: " + ethStockPriceDouble);
        
        int numberOfEthTokens = 200_000;

        double currentBalance = ethStockPriceDouble * numberOfEthTokens;

        System.out.println("Your current balance: " + currentBalance);

        // type casting of larger data type to a smaller type is called a narrowing casting
        // or explicit casting or converting one data type to another type
        // Explicit -> means manual
        // Implicit -> means automatically
        // we have to manually [explicitly] type cast it by
        // adding the desired data type in parenthesis before the assigning variable
        int eth$StockPriceWholeValue = (int) ethStockPriceDouble;
        System.out.println("After casting double to an int: " + eth$StockPriceWholeValue);

        // when converting from smaller data type to larger one it's done implicitly
        // widening casting
        byte var1 = 12;
        System.out.println(var1);

        short var2 = var1;
        System.out.println(var2);

        double var3 = var1;
        System.out.println(var3);

        // since float is smaller than double data type
        // we have to explicitly type cast by adding the data type of the variable
        // we are converting to.
        float var4 = (float) var3;

    }
}
