public class RightTry{
	public static void main(String[] pattern){
	int n=5;
	for(int i=0;i<n;i++){
		for(int j=0;j<n;j++){
		if(i+j>=n-1){System.out.print("* ");}
		else{System.out.print("  ");}
		}
	System.out.println();
	}
	}
}