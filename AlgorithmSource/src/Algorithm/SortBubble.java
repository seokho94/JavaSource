package Algorithm;

public class SortBubble { //버블정렬
	public static int Sort[] = {28,15,10,25,32,17};
	public static int Compare[] = {10,15,17,25,28,32};
	public static int[] Bubble(int Arr[]){
		int n=0, count=0;
		while(n<Arr.length) {
			if(Arr[count]>Arr[count+1]) {
				int change = Arr[count];
				Arr[count] = Arr[count+1];
				Arr[count+1] = change;
			}
			count++;
			if(count==Arr.length-1) {
				n++;
				count=0;
			}
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
		int result[] = Bubble(Sort);
		System.out.println(compare(Compare,result));
	}
}
