package sort;

public class MergeSort extends Base {
	@Override
	public void sort() {
		mergeSort();
	}

	private void mergeSort() {
		int i;
		int len = array.length;
		int[] temp = new int[len];
		for (i = 0; i < len; i++)
			temp[i] = array[i];
		merge(temp, array, 0, len - 1);
		
	}

	private void merge(int[] temp, int[] array, int start, int end) {
		if(end-start<1)
			return;
		int mid = (start + end) / 2;
	//	System.out.println(start+" "+mid+" "+end);
		merge(temp, array, start, mid);
		merge(temp, array, mid + 1, end);
		mergeArray(array, temp, start, mid, mid + 1, end);

	}

	private void mergeArray(int[] array, int[] temp, int start1, int end1,
			int start2, int end2) {
		int i = start1;
		int m = start1, n = start2;

		while (m <= end1 && n <= end2) {
			if (temp[m] < temp[n])
				array[i++] = temp[m++];
			else
				array[i++] = temp[n++];
		}

		while(m>end1&&i<=end2)
			array[i++]=temp[n++];
		while(n>end2&&i<=end2)
			array[i++]=temp[m++];
		for(i=start1;i<=end2;i++)
			temp[i]=array[i];
	}
}
