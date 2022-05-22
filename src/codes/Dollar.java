package codes;

public class Dollar extends Money {

   private int amount;

   private String currency;
	
   Dollar(int amount)  {
      this.amount = amount;
      currency = "USD";
   }

   Dollar(int amount, String currency)  {
      super(amount, currency);
   }
	
   Money times(int multiplier)  {
      return Money.dollar(amount * multiplier);
   }
   
   String currency() {
      return currency;
   }
   void times(int multiplier) {
      amount= amount * multiplier;
   }

   Dollar times(int multiplier) {
      return new Dollar(amount * multiplier);
   }

   Money times(int multiplier)  {
      return new Dollar(amount * multiplier);
   }
  
  public void testMultiplication() {
     Dollar five = new Dollar(5);
     Dollar product = five.times(2);
     assertEquals(10, product.amount);
     product = five.times(3);
     assertEquals(new Dollar(15), product);
   }

   public boolean equals(Object object)  {
      Dollar dollar = (Dollar) object;
      return amount == dollar.amount;
   }
}

