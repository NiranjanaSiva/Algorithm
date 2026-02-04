import java.io.*;
public class bin{
   public static void main(String args[]){
      int a[]={20,30,40,50};
      int find[]={40,70};
      for(int i=0;i<find.length;i++){
         int res=binary_search(find[i],a);
         if(res==-1){
            System.out.println("Element "+find[i]+" not found");
         }
         else{
            System.out.println("Element "+find[i]+" found at "+res);
         }
      }

   }
   public static int binary_search(int val,int[] arr){
      int left=0,right=arr.length-1,mid;
      while(left<right){
         mid=(left+right)/2;
         if(arr[mid]==val){
            return mid;
         }
         else if(arr[mid]>val){
            right=mid-1;

         }

         else if(arr[mid]<val){
            left=mid+1;
         }
      }
      return -1;
   }
}
