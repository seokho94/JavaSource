package Algorithm;

import java.lang.StackOverflowError;
import java.util.Scanner;

public class SortHeap extends StackOverflowError {
	public static int Max_size = 1000050;
	public static int sort[] = new int[Max_size];
	public static int arr[] = new int[Max_size];
	public static int[] swap(int arr[],int i) {
		int tmp = arr[i];
		arr[i] = arr[i/2];
		arr[i/2]=tmp;
		return arr;
	}
	public static int[] HeapSort(int arr[],int i, int length) {
		int left = i*2;
		int right = i*2+1;
		if(arr[i]<arr[left]) {
			swap(arr,left);
		}
		if(arr[i]<arr[right]) {
			arr = swap(arr,right);
		}
		if(arr[i]>arr[left] && arr[i]>arr[right]) {
			if(arr[left]<arr[right]) {
				int tmp  = arr[left];
				arr[left] = arr[right];
				arr[right] = tmp;
			}
		}
		i++;
		if(i*2+1>length-1) {
			arr = MaxHipfy(arr,length);
			int tmp = arr[1];
			arr[1] = arr[length-1];
			arr[length-1]=tmp;
			i=1;
			length--;
			if(length==3) {
				if(arr[1]>arr[length-1]) {
				int tmep = arr[1];
				arr[1] = arr[length-1];
				arr[length-1]=tmep;
				}
				return arr;
			}
			return HeapSort(arr,i,length);
		}
		return HeapSort(arr,i,length);
	}
	public static int[] MaxHipfy(int arr[],int length) {
		if(arr[length-1]>arr[(length-1)/2]) {
			swap(arr,length-1);
		}
		length--;
		if(length==2) return arr;
		return MaxHipfy(arr,length);
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int sort[] = new int[N+1];
		int result[] = new int[N];
		for(int i=1; i<N+1; i++) {
			sort[i]=i;
		}
		int i=1;
		sort = HeapSort(sort,i,sort.length);
		result = Fill(result,sort,i);
		ArrayPrint(result,i);
		sc.close();
	}
	public static boolean ArrayPrint(int arr[],int cnt) {
		if(cnt==arr.length+1) return false;
		else {
			System.out.print(arr[cnt-1]+" ");
			cnt++;
			return ArrayPrint(arr,cnt);
		}
	}
	public static int[] Fill(int arr1[],int arr2[],int i) {
		if(i==arr2.length) return arr1;
		else{
			arr1[i-1]=arr2[i];
			i++;
			return Fill(arr1,arr2,i);
		}
	}
}
