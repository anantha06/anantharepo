

package com.au.generics;

import java.util.Date;

public class SortDate<E> {


 public <E extends Comparable<E>> MyGenericArrayList<E> selectionSort(MyGenericArrayList<E> a) {
        int y=0;
    	while(y<1){
    		for (int i = 0; i < a.size() - 1; i++) {
                // find index of smallest element
                int smallest = i;
                
                for (int j=i+1; j < a.size(); j++) {
                    E k,l;
                    k=(E) a.get(i);
                    l=(E)a.get(j);
                    
    				if (k.compareTo(l)<=0) {
                        smallest = j;
                    }
                }

                a.swap(i,smallest);  // swap smallest to front
            }
    		y++;
        }
    	
        return a;
    }

    @SuppressWarnings("deprecation")
	public static void main(String[] args){
    	SortDate<?> firstsort = new SortDate();
    	 MyGenericArrayList<Date> mal = new MyGenericArrayList<Date>();
	        mal.add(new Date(1995,1,1));
	        mal.add(new Date(1999,1,1));
	        mal.add(new Date(1997,2,1));
	        mal.add(new Date(1998,1,1));
	        mal.add(new Date(1999,1,2));
	        mal=firstsort.selectionSort(mal);
	        for(int i=0;i<mal.size();i++){
	            System.out.println(mal.get(i).getYear()+" "+mal.get(i).getMonth()+" "+mal.get(i).getDate()+" ");
	        }
    }

}
