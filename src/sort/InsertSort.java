package sort;

public class InsertSort extends Base{


	@Override
	public void sort() {
		int i,j,te;
		int len=array.length;
		if(len<2)
			return;
		for(i=1;i<len;i++){
			te=array[i];
			for(j=i-1;j>=0;j--){
				if(te<array[j]){
					array[j+1]=array[j];
				}
				else
					break;
			}
			array[j+1]=te;
		}
	}

	
}
