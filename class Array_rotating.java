public class Array_rotating{
 public static void main(String[] args){
    int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
    System.out.println("Original array");
    for(int[] i : arr){
       for(int j : i){
          System.out.print(j+" ");
          }
          System.out.println();
          }

     int[][] rotated = new int[arr[0].length][arr.length];
     for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[0].length;j++){
           rotated[j][arr.length-1-i] = arr[i][j]; //to rotate left->[arr.length-1-j][i]
         }
      }
    System.out.println("Rotated array");
    for(int[] i : rotated){
      for(int j : i){
       System.out.print(j+" ");
     }
          System.out.println();
     }
}}