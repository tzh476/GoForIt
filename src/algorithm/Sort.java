package algorithm;

public class Sort {
	public static void main(String[] args){
		int[] arr = {3,5,3,0,8,6,1,5,8,6,2,4,9,4,7,0,1,8,9,7,3,1,2,5,9,7,4,0,2,6};
		//int[] arr = {2,1,9};
		quickSortTest(arr);
		show(arr);
	}
	public static void mergeSortTest(int[] arr){
		MergeSort mergeSort = new MergeSort(arr);
		int[] res = new int[arr.length - 1];
		mergeSort.mergeSort(res, 0, arr.length - 1);;
	}
	public static void quickSortTest(int[] arr){
		QuickSort quickSort = new QuickSort(arr);
		quickSort.quickSort(0,arr.length - 1);
	}
	public static void heapSortTest(int[] arr){
		HeapSort heapSort = new HeapSort(arr);
		heapSort.heapSort();
	}
	private static void show(int[] arr) {
		for(int temp:arr)
			System.out.print(temp+" ");
		System.out.println();
	}
	
}

class QuickSort{
	private int[] arr;
	public QuickSort(int[] arr){
		this.arr = arr;
	}
	public void quickSort(int start, int end){
		int key = arr[start];
		int key_pos = start;
		int l = start, r = end;
		while(l < r){
			while(l < r && arr[r] >= key) 
				r--;
			arr[l] = arr[r];
			while(l < r && arr[l] < key)
				l++;
			arr[r] = arr[l];
		}
		arr[r] = key;
		
		if(end - r > 1) quickSort(r + 1, end);
		if(l - start >1) quickSort(start, l - 1);
	}
}
class HeapSort{
	private int[] arr;
	public HeapSort(int[] arr){
		this.arr = arr;
	}
	public void heapSort(){
		int end = arr.length - 1;
		int start = (end - 1) >> 1;
		for(int i = start; i >= 0; i--){
			maxHeap(i, end);
		}
		
		for(int i = end; i > 0; i--){
			swap(i, 0);
			maxHeap(0, i - 1);
		}
	}
	public void maxHeap(int index, int end){
		int left = (index << 1) + 1;
		int right = left + 1;
		int max_son = left;
		if(left > end) return;
		if(right <= end && arr[right] > arr[left]){
			max_son = right;
		}
		if(left <= end && arr[index] < arr[max_son]){
			swap(index, max_son);
			maxHeap(max_son, end);
		}
	}
	public void swap(int index, int max_son) {
		int temp = arr[index];
		arr[index] = arr[max_son];
		arr[max_son] = temp;
	}
}
class MergeSort {
	private int[] arr;
	public MergeSort(int[] arr){
		this.arr = arr;
	}
	public void mergeSort(int[] res,int start,int end){
		int mid = (start + end) / 2;
		if(start < end){
			mergeSort(res, start, mid);
			mergeSort(res, mid + 1, end);
			mergeArr(res, start, mid, mid + 1, end);
		}
	}
	//合并两个数组
	private void mergeArr(int[] res, int start1, int end1, int start2, int end2) {
		int i = start1, j = start2;
		int m = start1;
		while(i <= end1 && j <= end2){
			if(arr[i] < arr[j]){
				res[m++] = arr[i++];
			}else{
				res[m++] = arr[j++];
			}
		}
		for(; i <= end1; i++)
			res[m++] = arr[i++];
		for(; j <= end2; j++)
			res[m++] = arr[j++];
		
		for(i = start1; i < end2; i++)
			arr[i] = res[i];
	}
}
