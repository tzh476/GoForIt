package swordoffer;

public class FindMinOfMatrix {
	public static void main(String[] args){
		FindMinOfMatrix f = new FindMinOfMatrix();
		
	}
	public boolean Find(int target, int [][] array) {
		boolean isExist = false;
		int high = array.length;
		int weight = array[0].length;
		int i = 0, j = 0;
		while(i < weight && j < high){
			int position_value = array[high - 1 - i][j];
			if(position_value == target){
				isExist = true;
				break;
			}else if(position_value > target){
				i++;
			}else{
				j++;
			}
		}
		return isExist;
    }
}
