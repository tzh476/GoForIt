package sort;

import java.util.Random;

public class Base implements Sort{
	protected int[] array;
	
	@Override
	public void init() {
		array=new int[10];
		Random random=new Random();
		int te;
		for(int i=0;i<array.length;i++){
			te=random.nextInt();
			te=te<0?(-te):te;
			array[i]=te%100;
		}
	}
	@Override
	public void show() {
		for(int te:array)
			System.out.print(te+" ");
		System.out.println();
	}
	@Override
	public void sort() {
		// TODO Auto-generated method stub
		
	}

}
