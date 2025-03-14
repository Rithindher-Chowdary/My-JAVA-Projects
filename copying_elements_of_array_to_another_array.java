import java.util.Arrays;
public class copying_elements_of_array_to_another_array{
 public static void main(String[] args){
    int[] aaa= {1,2,3};
    int[] bbb= new int[aaa.length];
    for(int i =0;i<aaa.length;i++){
    bbb[i]=aaa[i];
    }
    bbb[0]=77;
    System.out.println(Arrays.toString(aaa));
    System.out.println(Arrays.toString(bbb));
}}
/*  CLONE METHOD
import java.util.Arrays;
public class Matrix{
 public static void main(String[] args){
    int[] aaa= {1,2,3};
    int[] bbb= aaa.clone();
    bbb[0]=77;
    System.out.println(Arrays.toString(aaa));
    System.out.println(Arrays.toString(bbb));
}}*/

/* in 2D array
import java.util.Arrays;
public class Matrix{
 public static void main(String[] args){
    int[][] aaa= {{1,2,3},{4,5,6}};
    int[][] bbb= new int[aaa.length][];
    for(int i=0;i<aaa.length;i++){
         bbb[i] = aaa[i].clone();
         }
    bbb[0][0]=77;
    System.out.println(Arrays.deepToString(aaa));
    System.out.println(Arrays.deepToString(bbb));
}}
*/