package sort;


public class BubbleSort extends Base{
	
	@Override
	public void sort() {
		int i,j,te;
		int len=array.length;
		boolean isSorted;
		for(i=0;i<len-1;i++){
			isSorted=true;
			for(j=0;j<len-1-i;j++){
				if(array[j]>array[j+1]){
					te=array[j];
					array[j]=array[j+1];
					array[j+1]=te;
					isSorted=false;
				}
			}
			if(isSorted)
				break;
		}
	}

	
	
}	
