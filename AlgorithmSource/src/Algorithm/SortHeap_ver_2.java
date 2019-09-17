package Algorithm;

import java.util.Scanner;

public class SortHeap_ver_2 {
	public static int Max_size = 1000050;
	public static int Num[] = new int[Max_size];
	public static int[] swap(int Num[], int size) {
		int tmp = Num[size];
		Num[size]=Num[size/2];
		Num[size/2]=tmp;
		return Num;
	}
	public static int[] Max_Heap(int Num[],int size) {
		if(size==1) {
			return Num;
		}
		int parent = size/2;
		if(Num[parent]<Num[size]) {
			swap(Num,size);
			size--;
		}
		else size--;
		return Max_Heap(Num,size);
	}
	public static int[] insert(int Num[],int size) {
		int tmp = Num[1];
		Num[1] = Num[size];
		Num[size] = tmp;
		return Num;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Num[] = new int[N+1];
		for(int i=1; i<N+1; i++) {
			Num[i] = (int)(Math.random()*100);
		}
		int size = Num.length-1;
		for(int i=size; i>1; i--) {
		Max_Heap(Num,i);
		insert(Num,i);
		}
		for(int i=1; i<Num.length; i++){
			System.out.println(Num[i]);
		}
	}
}
