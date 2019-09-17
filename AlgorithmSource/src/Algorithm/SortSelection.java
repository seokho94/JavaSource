package Algorithm;

public class SortSelection { //선택정렬
	public static int Sort[] = {28,15,10,25,32,17};
	public static int Compare[] = {10,15,17,25,28,32};
	public static int[] Selection(int Arr[]) {
		for(int i=0; i<Arr.length; i++) {
			int min=1000000,index=0;
			for(int j=i; j<Arr.length; j++) {
				if(Arr[j]<min) {
					min=Arr[j];
					index=j;
				}
			}
			Arr[index]=Arr[i];
			Arr[i]=min;
		}
		return Arr;
	}
	public static boolean compare(int arr1[],int arr2[]) {
		boolean result=false;
		for(int i=0; i<arr1.length; i++) {
			if(arr1[i]!=arr2[i]) {result=false; break;}
			else result=true;
		}
		return result;
	}
	public static void main(String args[]) {
		int result[] = Selection(Sort);
		for(int i=0; i<result.length; i++) {
			System.out.print(result[i]+" ");
		}
		System.out.println();//Array check
		System.out.println(compare(Compare,result));
	}
}
