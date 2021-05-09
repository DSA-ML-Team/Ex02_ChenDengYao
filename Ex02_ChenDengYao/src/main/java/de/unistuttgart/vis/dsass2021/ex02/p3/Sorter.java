package de.unistuttgart.vis.dsass2021.ex02.p3;

public class Sorter {
		
	public static <T extends Comparable<T>> void selectionSort(ISimpleList<T> list) {
	       
           for (int i=0 ; i< list.size()-1 ; i++) {
        	   
        	   int maxIndex = i;
        	    T max = list.get(i);
        	    
        	    for(int j= i+1; j<list.size(); j++) {
        	        
        	    	if (max.compareTo(list.get(j))>0) {
        	    	   
        	    		maxIndex = j;
        	    	}
        	    }
          }
	}
        	
	
	public static <T extends Comparable<T>> void insertionSort(ISimpleList<T> list) {
		
		  for(int i=1; i<list.size()-1; i++){
			
			  for(int j=i; j>0; j--){
				
				  T temp = list.get(j);
				
				  if(temp.compareTo(list.get(i))<0){
					
					  list.swap(i, j);
				    }
			     }

	       }

	 }
	
	public static <T extends Comparable<T>> void bubbleSort(ISimpleList<T> list) {

		for(int i=0; i<list.size()-2;i++) {
			
			T temp = list.get(i);
			
			if (temp.compareTo(list.get(i+1))<0) {
				
				list.swap(i, i+1);
			}
		}
	}

}
