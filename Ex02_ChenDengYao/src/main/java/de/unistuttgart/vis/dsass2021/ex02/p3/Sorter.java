package de.unistuttgart.vis.dsass2021.ex02.p3;

public class Sorter {
		
	public static <T extends Comparable<T>> void selectionSort(ISimpleList<T> list) {
	       
           for (int i=0 ; i< list.size() ; i++) {
        	   
        	   int maxIndex = i;
        	   
        	   T max = list.get(i);
   	    	
        	    
        	    for(int j= i+1; j<list.size(); j++) {
        	    	
        	    	if (max.compareTo(list.get(j))<0) {
        	    	    
        	    		max = list.get(j) ;
        	    		
        	    		maxIndex = j;
        	    		
        	    	}
        	    }
        	    list.swap(i, maxIndex);
          }
           for (int k=0 ; k< list.size() ; k++) {
              System.out.println(list.get(k));
           }
              System.out.println("\n");
              
	}
        	
	
	public static <T extends Comparable<T>> void insertionSort(ISimpleList<T> list) {
	
		  for(int i=1; i<list.size()-1; i++){
			  
			  T temp = list.get(i);
			  int j=i;
			  
			  while(j>0){
				
				  if(temp.compareTo(list.get(j))>0){
					  list.swap(j,j-1);
					  j--;
				    }
				  else {break;}
			     }
               list.swap(i, j);
	       }
		  for (int k=0 ; k< list.size() ; k++) {
		        System.out.println(list.get(k));
		  }
		        System.out.println("\n");
		  
	 }
	
	public static <T extends Comparable<T>> void bubbleSort(ISimpleList<T> list) {

		for(int i=0; i<list.size()-1;i++) {
			
		  for(int j=0; j<list.size()-1;j++) {
			
			T temp = list.get(j);
			
			if (temp.compareTo(list.get(j+1))<0) {
				
				list.swap(j, j+1);
			}
		}
		}
		for (int k=0 ; k< list.size() ; k++) {
	        System.out.println(list.get(k));
		}
		    System.out.println("\n");
	}
	
	
}


