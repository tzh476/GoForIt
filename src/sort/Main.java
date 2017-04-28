package sort;


public class Main {
	public static void main(String[] args){
		//bubbleTest();
		//insertTest();
		mergeTest();
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
