
public class DescendingOrder {
	public static void main(String[] args) {          
        int [] arr = new int [] {2,4,6,9,5,3,1,0,7,8};     
        int t = 0;       
        System.out.println("original array: ");    
        for (int i = 0; i < arr.length; i++) {     
            System.out.print(arr[i] + " ");    
        }     
        for (int i = 0; i < arr.length; i++) {     
            for (int j = i+1; j < arr.length; j++) {     
               if(arr[i] < arr[j]) {    
                   t= arr[i];    
                   arr[i] = arr[j];    
                   arr[j] = t;    
               }     
            }     
        }       
        System.out.println();        
        System.out.println("descending order: ");    
        for (int i = 0; i < arr.length; i++) {     
            System.out.print(arr[i] + " ");    
        }    
    }    

}
