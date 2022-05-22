package codes;

import codes.Money;

public class Dollar {

   private int amount;

   Dollar(int amount) {
      this.amount= amount;
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

