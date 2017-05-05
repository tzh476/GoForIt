package sort;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BucketSort extends Base{
	private final static int BUCKET_NUM=10;
	public void sort(){
		int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
		int len=array.length;
		int i;
		for(i=0;i<len;i++){
			if(array[i]>max)
				max=array[i];
			if(array[i]<min)
				min=array[i];
		}
		int step=(max-min)/BUCKET_NUM+1;
		 // Cannot create a generic array of List<String>

	    // List<String>[] lists = new List<String>[10];

	    // 但是你可以使用集合数组, 如果你非要这样做的话

	    //List[] test2 = new List[10];

	    // 我不确定你这样做的动机是什么, 如果非要使用到泛型集合数组的话, 也可以这样

	    // Key: 索引
	    // Value: 泛型集合
	    // 缺点: 索引需要自己维护
	   // Map<Integer, List<String>> collectionArray = new LinkedHashMap<Integer,     List<String>>();
		//https://zhidao.baidu.com/question/920692050584217179.html
		
		
		List[] buckets = new List[BUCKET_NUM];
		for(i=0;i<BUCKET_NUM;i++)
			buckets[i]=new ArrayList<Integer>();
		for(i=0;i<len;i++){
			buckets[(array[i]-min)/step].add(array[i]);
		}
		for(i=0;i<BUCKET_NUM;i++){
			if(buckets[i].size()!=0)
				selectSort(buckets[i]);
			//System.out.println(buckets[i]);
		}
		int j,u=0;
		for(i=0;i<BUCKET_NUM;i++){
			for(j=0;j<buckets[i].size();j++)
				array[u++]=(int) buckets[i].get(j);
		}
	}
	private void selectSort(List list) {
		int len=list.size();
		int i=0,j,min,k;
		for(i=0;i<len-1;i++){
			min=(int) list.get(i);
			k=i;
			for(j=i+1;j<len;j++){
				if((int)list.get(j)<min){
					min=(int) list.get(j);
					k=j;
				}
			}
			list.set(k, list.get(i));
			list.set(i,min);
		}
	}
}
