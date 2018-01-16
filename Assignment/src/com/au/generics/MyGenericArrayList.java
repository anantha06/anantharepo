package com.au.generics;
import java.util.Arrays;

public class MyGenericArrayList<E> {
	   private int size;    
	   private Object[] elements;
	   

	public MyGenericArrayList() {
	      elements = new Object[10];  
	      size = 0;
	      }
	   
	   public void add(E e) {
	      if (size < elements.length) {
	         elements[size] = e;
	      } else {
	    	  increaseListSize();
	    	  }
	      ++size;
	   }
	 
	   public void put(int index,E val){
	        elements[index]=val;
	         
	    }
	   protected void swap(int i,int j) {
	        Object temp=elements[i];
	        elements[i]=elements[j];
	        elements[j]=temp;
	    }
	   
	@SuppressWarnings("unchecked")
	public E get(int index) {
	      if (index >= size)
	         throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
	      return (E)elements[index];
	   }
	   private void increaseListSize(){
	        elements = Arrays.copyOf(elements, elements.length*2);
	        System.out.println("\nNew length: "+elements.length);
	    }
	   
	   public int size() { return size; }
	  /* 
	   public static void main(String a[]){
		   MyGenericArrayList<Integer> mal = new MyGenericArrayList<Integer>();
	        mal.add(new Integer(2));
	        mal.add(new Integer(5));
	        mal.add(new Integer(1));
	        mal.add(new Integer(23));
	        mal.add(new Integer(14));
	        for(int i=0;i<mal.size();i++){
	            System.out.print(mal.get(i)+" ");
	        }
	        mal.add(new Integer(29));
	        System.out.println("Element at Index 5:"+mal.get(5));
	        System.out.println("List size: "+mal.size());
	        //System.out.println("Removing element at index 2: "+mal.remove(2));
	        for(int i=0;i<mal.size();i++){
	            System.out.print(mal.get(i)+" "+mal.get(i).getClass());
	            
	        }
	        
	        
	    }*/
	}