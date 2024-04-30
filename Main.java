package assignment5;

public class Main {
	public static void main(String[] args) {
		int a[] = {0, 5, 10, 9, 2, 3, 4, 8, 1, 6};
		for(int i = 1; i < a.length; i++)
			System.out.print(a[i] + " ");
		System.out.println();
		Heap.buildMinHeap(a);
		for(int i = 1; i < a.length; i++)
			System.out.print(a[i] + " ");
	}
}
