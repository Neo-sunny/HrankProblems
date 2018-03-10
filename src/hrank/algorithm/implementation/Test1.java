package hrank.algorithm.implementation;

public class Test1 {

	public static void main(String[] args) {
		Integer[] arr ={110, 100, 90,89, 80, 79};
		System.out.println(BinarySearch(arr,190));
		int[] input = new int[]{1, 1, 3, 7, 7, 8, 9, 9, 9, 10};
		int current = input[0];
		boolean found = false;

	}

	public static int BinarySearch(Integer[] arr, int val){
//		int retindex
		int low = 0;
        int high = arr.length-1;
        while (low <= high) {
        	int midIndex = (low + high) >>> 1;
        	int midValue= arr[midIndex];
        	
        	if(midValue==val){
        		return midIndex;
        	}else if(val>midValue){
        		high=midIndex-1;
        	}else if(val<midValue){
        		low=midIndex+1;
        	}
        }
        return -(low );
	}
}
