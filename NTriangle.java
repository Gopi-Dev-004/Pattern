public class NTriangle{
	public static void main(String[] pattern){
	int n=5;
	for(int i=0;i<n;i++){
		for(int j=0;j<n;j++){
		if(j<=i){System.out.print(n-j+" ");}
		else{System.out.print("  ");}
		}
	System.out.println();
	}
	}
}