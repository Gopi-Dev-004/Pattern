public class B{
	public static void main(String[] args){
	int n=15;
	for(int i=0;i<n;i++){
		for(int j=0;j<n;j++){
		if(j==0 || j==n-1 || n/2==i || i==0 || i==n-1)
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