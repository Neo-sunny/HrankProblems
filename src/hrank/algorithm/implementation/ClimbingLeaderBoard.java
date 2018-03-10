package hrank.algorithm.implementation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClimbingLeaderBoard {
	static int[] climbingLeaderboard(int[] scores, int[] alice) {
        // Complete this function
		int[] rank = new int[alice.length];
		List<Integer> rankset= new ArrayList();
		int current =scores[0];
		boolean found = false;
		for(int i=0; i<scores.length;i++){
			if(current==scores[i] && !found){
				found=true;
			}else if(current!=scores[i]){
				rankset.add(current);
				current=scores[i];
				found=false;
			}
		}
		rankset.add(current);
		Integer[] setArr= rankset.toArray(new Integer[0]);
		int ind=0;
		for(int a:alice){
			int val=BinarySearch(setArr,a);
			if(val>0){
				rank[ind++]=val+1;
			}else if(val==0){
				rankset.add((val),a);
				rank[ind++]=(val)+1;
				setArr= rankset.toArray(new Integer[0]);
			}
		}
		/*
		Set<Integer> score = new HashSet<>();
		for(int i:scores){
			score.add(i);
		}
		Integer[] scored = score.toArray(new Integer[0]);
		Arrays.sort(scored);
		List<Integer> scoreinList = new ArrayList(Arrays.asList(scored));
		int ind=0;
		for(int a:alice){
			int val = Collections.binarySearch(scoreinList, a);
			if((val>=0)){
				rank[ind++]=scoreinList.size()-val;
			}else if(val<0){
					int index=(-(val)-1);
				scoreinList.add(index, a);
				rank[ind++]=scoreinList.size()-(-(val)-1);
			}
		}
		
		int ind=0;
		for(int a:alice){
			int val = Arrays.binarySearch(scored, a);
			if(val>=0){
				rank[ind++]=scored.length-val;
			}else if(val<0){
				scored=insertElement(a,scored,-(val)-1);
				rank[ind++]=scored.length-(-(val)-1);
			}
		}
		*/
		return rank;
    }
	public static int BinarySearch(Integer[] arr, int val){
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
        return (low );
	}
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] scores = new int[n];
        for(int scores_i = 0; scores_i < n; scores_i++){
            scores[scores_i] = in.nextInt();
        }
        int m = in.nextInt();
        int[] alice = new int[m];
        for(int alice_i = 0; alice_i < m; alice_i++){
            alice[alice_i] = in.nextInt();
        }
        int[] result = climbingLeaderboard(scores, alice);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");


        in.close();
    }
}
