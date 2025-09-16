public class A{
	public static void main(String[] args){
	int n=15;
	for(int i=0;i<n;i++){
		for(int j=0;j<n;j++){
		if(n/2+i==j || i==n/2-j || i>=n/2 && j==0 || i>=n/2 && j==n-1 ||  n/2==i)
			{
			System.out.print(" A ");	
			}else{
			System.out.print("   ");
			}
		}
	System.out.println();
	}
	}
}