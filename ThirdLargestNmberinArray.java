public class ThirdLargestNmberinArray {
   public static void main(String args[]){
   int temp, size;
   int arr[] = {12, 15, 23, 66, 92, 60};
   size = arr.length;
   
   for(int i = 0; i<size; i++ ){
      for(int j = i+1; j<size; j++){
         if(arr[i]>arr[j]){
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
         }
      }
   }
   System.out.println("Third largest number is:: "+arr[size-3]);
   }
}