package codes;

public class Franc extends Money {
    
   private int amount;

   private String currency;

   Franc(int amount, String currency) {
      super(amount, currency);
   }
     
   Money times(int multiplier)  {
      return Money.franc(amount * multiplier);
   } 

   String currency() {
    return currency;
    }

    Franc times(int multiplier)  {      
       return new Franc(amount * multiplier);					
    }

    public boolean equals(Object object) {					
       Franc franc = (Franc) object;      
       return amount == franc.amount;					
    }
}
