package factoryDesignPattern;

class Food{
	
}

class Biryani extends Food{
	@Override
	public String toString() {
		return "Eating Biryani";
	}
}
class CurdRice extends Food{
	@Override
	public String toString() {
		return "Eating CurdRice";
	}

}
class EggFriedRice extends Food{
	@Override
	public String toString() {
		return "Eating EggFriedRice";
	}

}
class Hotel{
	Food OrderFood(int choice) {
		if(choice ==1) {
		Biryani b = new Biryani();
		return b; // return new Biryani();
		}	
		else if(choice == 2) {
			CurdRice c = new CurdRice();
            return c; // return new CurdRice();
		}
		else if(choice == 3) {
		EggFriedRice e = new EggFriedRice();
		 return e;// return new EggFriedRice(); 
		}
		else {
		return null;
	}
}
}




public class Solution {
public static void main(String[] args) {
	Hotel hotel = new Hotel();
	
	/** Generalization
	 *  Food obj = new Biryani();
	 *   Food obj = new CurdRice();
	 *    Food obj = new EggFriedRice();
	 *     Food obj = null;
	 */
	
	Food  obj = hotel.OrderFood(2);
	System.out.println(obj);
	
	// method returning different types of object by having generalized returntype
}
}
