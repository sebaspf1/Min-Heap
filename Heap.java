package assignment5;

public class Heap {
	public static int[] swap(int a[], int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
		return a;
	}
	
	public static int[] minHeapify(int a[], int i) {
		int l = i * 2;
		int r = i * 2 + 1;
		int min = i;
		if(l < a.length && a[l] < a[min])
			min = l;
		if(r < a.length && a[r] < a[min])
			min = r;
		if(min != i) {
			swap(a, i, min);
			minHeapify(a, min);
		}
		return a;
	}
	
	public static int[] buildMinHeap(int a[]) {
		for(int i = (a.length-1)/2; i >= 1; i--)
			a = minHeapify(a, i);
		return a;
	}
}
