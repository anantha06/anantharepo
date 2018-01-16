package com.au.generics;

public class Utility<E> {


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

    public static void main(String[] args){
    	Utility firstsort = new Utility();
    	 MyGenericArrayList<Integer> mal = new MyGenericArrayList<Integer>();
	        mal.add(new Integer(2));
	        mal.add(new Integer(5));
	        mal.add(new Integer(1));
	        mal.add(new Integer(23));
	        mal.add(new Integer(14));
	        mal=firstsort.selectionSort(mal);
	        for(int i=0;i<mal.size();i++){
	            System.out.print(mal.get(i)+" ");
	        }
    }

}
