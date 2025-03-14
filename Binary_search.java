public class Binary_search{
     public static void main(String[] args){
        int[] array = {7,10,17,18,45,19,54};
        int search = 19;
        int left = 0;
        int right = array.length-1;
        int result = -1; 
        while(left<=right){
            int mid = left + (right-left)/2;
            if(array[mid]==search){
               result = mid;
               break;
            }
            if(array[mid]<search){
                left = mid+1;
            }else{
                right=mid-1;
            }
         }
         if(result==-1){
            System.out.println("Element not found.");
        }else{
              System.out.println("the element is  found at index : "+result);    
        }
}}   