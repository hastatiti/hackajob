package hackajob;

public class StudentList {
	public static int run(int[] a) {
		 int k = 0;
		 int s = 0;
		 
		for (int i = 0; i < a.length; i++) {
			k = a[i];
			for(int j = 0; j < a.length; j++) {
				if(i ==j) continue;
				if(k == a[j]) 	{
					System.out.println(k + " equals " + a[j]);
					break;
				}
				else {
					s = k;
					System.out.println("s " + s);
				}
			} 
		}
		return s;
	}

	public static void main(String[] args) {
		int[] a = { 2, 4, 5, 4, 2 };
		System.out.println(run(a));
	}
}
