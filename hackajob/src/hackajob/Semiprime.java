package hackajob;

/*product of two prime numbers*/
public class Semiprime {
	public static boolean run(int number) {
		double d = number;
		boolean isSemiprime = true;
		if(number <= 2 || number > Math.pow(10,8) ) return false;
		for(int i = 2; i <= d; i++) {
			double a = d / i;
			if(a % 1 != 0 ) continue;
			System.out.println(a);
			if(a == 1) return false;
			if(a == 2) return false;
			if(a == 0 || number == 1) return false;
			if(a % i == 0) return false;
			else return true;
		} 
		return isSemiprime;
	}
	public static void main(String[] args) {
		System.out.println(run(13));
	}
}
