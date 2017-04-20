
public class GCD4 {

	public static void main(String[] args) {
		int a = 24, b = 18, c = 27, d = 45;
		
		System.out.println("The gcd of " + a + ", " + b + ", " + c + ", " + d +  " is:");
		int gcd4 = gcd(gcd (a,b) , gcd(c,d));
		System.out.println(gcd4);
		
	}
	
	public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        else
            return gcd(b, a % b);
    }
}
