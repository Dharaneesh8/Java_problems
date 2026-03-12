import java.util.*;
public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        int[] arr1=new int[n];
        int[] arr2=new int[m];
        
        for(int i=0;i<arr1.length;i++){
            arr1[i]=s.nextInt();
        }
        for(int i=0;i<arr2.length;i++){
            arr2[i]=s.nextInt();
        }
        Set <Integer> a=new HashSet<>();
        for(int i:arr1){
            a.add(i);
        }
        Set <Integer> b=new HashSet<>();
        for(int j:arr2){
            if(a.contains(j)){
                b.add(j);
            }
        }
        int [] arr=new int[b.size()];
        int index=0;
        for(Integer i:b){
            arr[index++]=i;
        }
        System.out.println(Arrays.toString(arr));
    }
}