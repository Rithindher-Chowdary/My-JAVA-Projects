import java.util.*;
public class 2DArray_search
{
	public static void main(String[] args) {
	int[][] arr = {{1,2,5},{4,5,16},{5,0,5}}; 
                int search = 0,res1=0,res2=0;        
	for(int i=0;i<arr.length;i++){
	    for(int j=0;j<arr[i].length;j++){
                        if(arr[i][j]==search){
                         res1 =i;
                         res2 =j;
                    }
	}
	}
	System.out.println("The element is found at :"+res1+" "+res2);
	}
}