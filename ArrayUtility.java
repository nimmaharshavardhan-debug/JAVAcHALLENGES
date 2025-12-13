import java.util.Scanner;
import java.util.Arrays;
public class ArrayUtility {
    public static int[] ArrayInput(){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter size of an array : ");
        int size = obj.nextInt();
        int [] arr = new int [size];
        for(int i=0;i<size;i++){
            System.out.print("Enter array elements "+(i+1)+" : ");
            arr[i]=obj.nextInt();
        }
        obj.close();
        for(int nums : arr){
            System.out.print(nums+" ");
        }
        System.out.println();
        System.out.println(Arrays.toString(arr));
        return arr;

    }

}
