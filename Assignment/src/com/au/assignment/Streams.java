package com.au.assignment;
import java.util.Arrays;
import java.util.stream.Collectors;
public class Streams {

	public static void main(String[] args) {
		int[] num =new int[1000];
		for(int i=0;i<1000;i++){
			num[i]=i;	
		}
		String csn = Arrays.stream(num).filter(p->p%5==0)
			    .mapToObj(Integer::toString)
			    .collect(Collectors.joining(", "));
		System.out.println(csn);
	}

}
