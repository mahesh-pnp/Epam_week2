
public class Candies implements Gifts {
	int c,w;
	public Candies() {
    	System.out.println("In candies constructor");
    }
    public Candies(int n){
        c=n;
    }
	public int Weight_method() {
		w=weight*c; 
		// TODO Auto-generated method stub
		return w;
	}

}
