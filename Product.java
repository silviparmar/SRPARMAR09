package item_java;

public class Product {
	String name;
	double price;
	int quantity;
	static int totalsold;
	
	
	public void sell(int quantity) {
		 this.quantity -= quantity;
         totalsold += quantity;
         System.out.println(quantity + " quantity of " + name + " sold.");
}
    public static int getTotalSold() {
    	return totalsold;
    }
}
    class Main{
    	 public static void main(String args[]) {
    		        Product p1 = new Product();
    		        Product p2 = new Product();
    		        
    		        p1.name = "book";
    		        p1.price = 130;
    		        p1.quantity = 3;
    		        
    		        p2.name = "milk";
    		        p2.price = 28;
    		        p2.quantity = 10;
    		        

    		        p1.sell(20);
    		        p2.sell(50);
    	 }		 
}
     