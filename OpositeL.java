public class OpositeL {// 
	public static void main(String[] args){
	int n=15;
	for(int i=0;i<n;i++){
		for(int j=0;j<n;j++){
		if( j==n-1 || i==n-1 ){
		System.out.print(" @ ");
		}else{System.out.print(" * ");}
		}
		System.out.println();
	}
System.out.println();

	for(int i=0;i<n;i++){
		for(int j=0;j<n;j++){
		if( i==0 ){
		System.out.print(" @ ");
		}else{System.out.print(" * ");}
		}
		System.out.println();
	}
	}
	
}