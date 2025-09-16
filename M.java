public class M{
	public static void main(String[] M){
		int n=15;
	for(int i=0;i<n;i++){
		for(int j=0;j<n;j++){
			if(j==0 || j==n-1 || i<n/2 && i==j || i<n/2+1 && i+j==n-1)
			System.out.print(" M ");
			else 
			System.out.print("   ");
		}
		System.out.println();
	}
	}
}