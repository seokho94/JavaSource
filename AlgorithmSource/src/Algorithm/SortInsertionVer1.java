package Algorithm;

public class SortInsertionVer1 { //삽입정렬 Ver.1 삽입하면서 위치를 찾는 방식
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
	public static int[] Insertion(int Arr[],int count) {
		if(count==Arr.length-1) return Arr;
		if(Arr[count]>Arr[count+1]) {
			int change = Arr[count+1];
			Arr[count+1]=Arr[count];
			Arr[count]=change;
			if(count>=2) {
				count-=2;
				return Insertion(Arr,count);
			}
			else{
				count++;
				return Insertion(Arr,count);
			}
		}
		else {
			count++;
			return Insertion(Arr,count);
		}
	}
	public static void main(String args[]) {
		int count = 0;
		int result[] = Insertion(Sort,count);
		for(int i=0; i<result.length; i++) {
			System.out.print(result[i]+" ");
		}
		System.out.println(compare(Compare,result));
	}
}
