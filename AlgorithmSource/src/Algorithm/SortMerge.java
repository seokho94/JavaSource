package Algorithm;

import java.util.Scanner;

public class SortMerge {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arr[] = new int[N];
		for(int i=0; i<N; i++) {
			arr[i] = (int)(Math.random()*100);
		}
		merge(arr);
	}
	public static void merge(int arr[]) {
		int left = 0;
		int right = arr.length-1;
		int mid = (left+right)/2;
		Leftmerge(arr,left,mid);
		Rightmerge(arr,mid+1,right);
		return;
	}
	public static void Leftmerge(int arr[], int left, int mid) {
		if(mid-left<2) {
			return;
		}
		left = 0;
		mid = (left+mid)/2;
		Leftmerge(arr,left,mid);
	}
	public static void Rightmerge(int arr[],int mid, int right) {
		if(right-mid<2) return;
		right = arr.length-1;
		mid = (right+mid)/2;
		Rightmerge(arr,mid+1,right);
	}
	public static void sort(int arr[],int left, int rigth) {
		
	}
}
