package sort;


public class Main {
	public static void main(String[] args){
		//bubbleTest();
		//insertTest();
		//mergeTest();
		//quickTest();
		//heapTest();
		//selectTest();
		BucketTest();
	}

	private static void BucketTest() {
		Sort bucketSort=new BucketSort();
		bucketSort.init();
		bucketSort.show();
		bucketSort.sort();
		bucketSort.show();
	}

	private static void selectTest() {
		Sort selectSort=new SelectionSort();
		selectSort.init();
		selectSort.show();
		selectSort.sort();
		selectSort.show();
	}

	private static void heapTest() {
		Sort heapSort=new HeapSort();
		heapSort.init();
		heapSort.show();
		heapSort.sort();
		heapSort.show();
	}

	private static void quickTest() {
		Sort quickSort=new QuickSort();
		quickSort.init();
		quickSort.show();
		quickSort.sort();
		quickSort.show();
	}

	private static void mergeTest() {
		Sort mergeSort=new MergeSort();
		mergeSort.init();
		mergeSort.show();
		mergeSort.sort();
		mergeSort.show();
	}

	private static void insertTest() {
		Sort insertSort=new InsertSort();
		insertSort.init();
		insertSort.show();
		insertSort.sort();
		insertSort.show();
	}

	private static void bubbleTest() {
		Sort bubbleSort=new BubbleSort();
		bubbleSort.init();
		bubbleSort.show();
		bubbleSort.sort();
		bubbleSort.show();
	}

}
