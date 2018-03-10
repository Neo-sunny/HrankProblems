package hrank.algorithm.implementation;

import java.util.Arrays;
import java.util.Scanner;

public class BetweenTwoSets {

	static int getTotalX(int[] a, int[] b) {
        // Complete this function
		int lcmOfa = lcmOfNumbers(a);
		Arrays.sort(b);
		int gcdofb = b[0];
		for(int i=1; i<b.length; i++){
			gcdofb =gcd(gcdofb,b[i]);
		}
		System.out.println("LCM is "+lcmOfa +" GCD is "+gcdofb);
		int count = 0,sum=lcmOfa;
		int i=0; 
		
		while(true){
			if(sum*(int)Math.pow(2, i)<=gcdofb){
				count++;
			}else if(sum*(int)Math.pow(2, i)>gcdofb){
				break;
			}i++;
		}
		
		
		
		return count;
    }

	
	
static int gcd(int a, int b){
	
	if(b==0) 
		return a;
	
	return gcd(b, a%b);
	
}

static int lcmOfNumbers(int[] a){
	int lcm =1;
	for(int i=0; i<a.length; i++){
		lcm = lcm*a[i]/gcd(lcm, a[i]);
	}
	
	return lcm;
}
	
	
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] b = new int[m];
        for(int b_i = 0; b_i < m; b_i++){
            b[b_i] = in.nextInt();
        }
        int total = getTotalX(a, b);
        System.out.println(total);
        in.close();
    }
}
