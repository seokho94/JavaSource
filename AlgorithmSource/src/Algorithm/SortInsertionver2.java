package Algorithm;

public class SortInsertionver2 { //삽입정렬 ver.2 자신의 위치만 찾고 하나씩 뒤로 밀어내는 방식
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
	public static int[] Insertion(int Arr[],int index,int count) {
		for(int i=0; i<Arr.length; i++) {
			if(Arr[count]>Arr[i]) {
				if(count<i) {
					count=i;
				}
				else {
					if(Arr[index]<Arr[i]) {
						index=i;
					}
				}
			}
		}
		for(int i=count+1; i<index; i++) {
			
		}
		return Arr;
	}
	public static void main(String args[]) {
		int index=0,count=0;
		int result[] = Insertion(Sort,index,count);
		System.out.println(compare(Compare,result));
	}
}
