import java.util.*;
public class CurrencyConverter
{
	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
     System.out.println("Available Currencies : USD, EUR, GBP, JPY, INR");
     System.out.print("Enter base Currency code: ");
     String baseCurr = sc.nextLine().toUpperCase();
     System.out.print("Enter target Currency code: ");
     String targetCurr = sc.nextLine().toUpperCase();
     System.out.print("Enter the amount to be converted: ");
     double amount = sc.nextDouble();
     double ConvertedAmount = CurrencyConversion(amount,baseCurr,targetCurr);
     System.out.printf("%.2f %s = %.2f %s%n",amount,baseCurr,ConvertedAmount,targetCurr);
     sc.close();
	}
	public static double CurrencyConversion(double amount,String baseCurr,String targetCurr){
	 Map<String,Double> exchangeRates = new HashMap<>();
	 exchangeRates.put("USD",1.0);
	 exchangeRates.put("EUR", 0.85);  
     exchangeRates.put("GBP", 0.73);  
     exchangeRates.put("JPY", 109.80);
     exchangeRates.put("INR", 74.80);
	    if(exchangeRates.containsKey(baseCurr)&& exchangeRates.containsKey(targetCurr)){
	        double base = exchangeRates.get(baseCurr);
	        double target = exchangeRates.get(targetCurr);
	        double conversion = (amount/base)*target;
	        return conversion;
	    }
	    else{
	        System.out.println("Invalid Currency Code.Please enter the Available currency code");
	        return 0;
	    }
	}
}
