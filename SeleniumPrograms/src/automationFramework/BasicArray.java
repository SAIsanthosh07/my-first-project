package automationFramework;

public class BasicArray {

	public static void main(String[] args) {
		//int a = 10;
		int []b = {10,20,30,40,50};
		
		for(int i=0; i<5; i++) {
			
			System.out.println(b[i]);
		}
		
		for(int x:b) {
			
			System.out.println(x);
			
		}

	}

}
