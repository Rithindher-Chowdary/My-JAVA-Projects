public class Linear_search{
     public static void main(String[] args){
        int[] array = {7,10,17,18,45,18};
        int search = 17;
        int result= -1;
        for(int i=0;i<array.length;i++){
             if(array[i]==search){
                result = i;
                break;
             }
        }
        if(result==-1){
              System.out.println("the element is not found.");
        }else{
              System.out.println("the element is  found at index : "+result);    
        }
}}  