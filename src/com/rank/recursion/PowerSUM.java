package com.rank.recursion;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class PowerSUM {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
	//	double n1=in.nextInt();
	//	int n2=in.nextInt();
	//	int n3=(int)(Math.sqrt(n1));
	//	System.out.println(n3);
		Set<Integer> oset= new HashSet<>();
		oset.add(1);oset.add(2);oset.add(3);
		powerSet(oset);
		System.out.println(powerSet(oset));
	}
	public static Set<Set<Integer>> powerSet(Set<Integer> originalSet) {
        Set<Set<Integer>> sets = new HashSet<Set<Integer>>();
        if (originalSet.isEmpty()) {
            sets.add(new HashSet<Integer>());
            return sets;
        }
        List<Integer> list = new ArrayList<Integer>(originalSet);
        Integer head = list.get(0);
        Set<Integer> rest = new HashSet<Integer>(list.subList(1, list.size()));
        for (Set<Integer> set : powerSet(rest)) {
            Set<Integer> newSet = new HashSet<Integer>();
            newSet.add(head);
            newSet.addAll(set);
            sets.add(newSet);
            sets.add(set);
        }
        return sets;
    }
	 
}
