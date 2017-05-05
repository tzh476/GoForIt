package sort;

public class HeapSort extends Base{
	@Override
	public void sort(){
		int len=array.length;
		int end=len-1;
		int i;
		for(i=(end-1)/2;i>=0;i--){
			heapSort(i,end);
		}
		int temp;
		for(i=end;i>0;i--){
			temp=array[0];
			array[0]=array[i];
			array[i]=temp;
			heapSort(0,i-1);
		}
	}

	private void heapSort(int dad, int end) {
		int son=2*dad+1;
		int temp;
		while (son <= end) {
			if (son + 1 <= end) {
				if (array[son] < array[son + 1])
					son++;
			}
			if (array[son] <= array[dad])
				return;
			else {
				temp=array[son];
				array[son]=array[dad];
				array[dad]=temp;
				dad=son;
				son=2*dad+1;
			}
		}
	}
}
