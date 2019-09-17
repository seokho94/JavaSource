package Algorithm;

public class SortQuick {
	public static int Sort[] = {28,15,10,25,32,17};
	public static int Compare[] = {10,15,17,25,28,32};
	public static boolean compare(int arr1[],int arr2[]) {
		boolean result=false;
		for(int i=0; i<arr1.length; i++) {
			if(arr1[i]!=arr2[i]) {result=false; break;}
			else result=true;
		}
		return result;
	}
	public static int[] Quick(int Arr[]) {
		
		return Arr;
	}
	public static void main(String args[]) {
		int result[] = Quick(Sort);
		System.out.println(compare(Compare,result));
	}
}
