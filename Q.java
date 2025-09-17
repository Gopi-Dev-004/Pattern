public class Q{
	public static void main(String[] q){
		int n=15;
		int x=n+5;
	for(int i=0;i<n;i++){
		for(int j=0;j<n;j++){
			if(j==0 && i<=x/2 || i==0 && j<=x/2 || j==x/2 && i<=x/2 || i==x/2 && j<=x/2 || i==j && i>=n/2-2)
			System.out.print(" Q ");
			else 
			System.out.print("   ");
		}
		System.out.println();
	}
	}
}