package sort;

public class SelectionSort extends Base {
	public void sort(){
		int len=array.length;
		int i,j,k,min;
		for(i=0;i<len-1;i++){
			min=array[i];k=i;
			for(j=i+1;j<len;j++)
				if(array[j]<min){
					min=array[j];
					k=j;
				}
			array[k]=array[i];
			array[i]=min;
		}
	}
}
