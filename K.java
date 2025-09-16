public class K{
	public static void main(String[] k){
		int n=15;
	for(int i=0;i<n;i++){
		for(int j=0;j<n;j++){
			if(j==0 || i<n/2 && n/2-i==j || i>n/2 && n/2+j==i )
			System.out.print(" K ");
			else 
			System.out.print("   ");
		}
		System.out.println();
	}
	}
}