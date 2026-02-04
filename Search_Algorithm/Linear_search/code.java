import java.io.*;
public class Linear{
   public static void main(String[] args){
      int[] arr={20,30,40,50};
      int res=search(50,arr);
      if(res!=-1){
         System.out.println("Index :"+res);
      }
      else{
          System.out.println("Not found");
      }
   }
   public static int search(int val,int[] arr){
      int n=arr.length,i;
      for(i=0;i<n;i++){
         if(arr[i]==val){
            return i;
         }
      }
      return -1;
   }
}
