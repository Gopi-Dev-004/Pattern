//Wajap to print the union of two array?
/*

Eg:
input1:
arr1= 1 2 3 4 

input2:
arr2= 3 4 5 6 

o/p:
unionArris= 1 2 3 4 5 6

*/

public class UnionArray{
	
	public static int[] find(int[] a1, int[] a2){

	for(int i=0;i<a1.length();i++){System.out.print(a1[i]+" ")}

	for(int i=0;i<a2.length();i++){
	boolean isPresent=true;
		for(int j=0;j<a1.length; j++ ){
		if(a1[i]==a2[j]){ isPresent=false;}
		}
		if(!isPresent)
		System.out.print(a2[i]);
		}	

	}

	public static void main(String[] args){
	int[] a1={1,2,3,4};
	int[] a2={3,4,5,6};

	int[] union=find(a1,a2);
	}
}