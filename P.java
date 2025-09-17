public class P{
	public static void main(String[] p){
		int n=15;
	for(int i=0;i<n;i++){
		for(int j=0;j<n;j++){
			if(j==0 || i==0 || j==n-1 && i<n/2 || i==n/2  )
			System.out.print(" P ");
			else 
			System.out.print("   ");
		}
		System.out.println();
	}
	}
}