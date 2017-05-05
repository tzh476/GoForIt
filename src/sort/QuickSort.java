package sort;

public class QuickSort extends Base{
	@Override
	public void sort() {
		int len=array.length;
		quickSort(0,len-1);
	}

	private void quickSort(int start, int end) {
		int len=end-start+1;
		if(len<2)
			return ;
		int pivot=array[start];
		int left=start,right=end;
		while (left < right) {
			while (left < right && pivot <= array[right])
				right--;
			array[left] = array[right];
			while (left < right && pivot >= array[left])
				left++;
			array[right] = array[left];
		//	System.out.println(left+" "+right);
		}
		array[left]=pivot;
		if(left-start>1)
			quickSort(start,left-1);
		if(end-left>1)
			quickSort(left+1,end);
	}
}
