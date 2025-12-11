import java.util.Scanner;
public class ArrayNumberOfOccurances {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter size of an array : ");//intilizing size of an array
        int size = input.nextInt();
        int []num = new int[size];
        for (int i=0;i<size;i++){
            System.out.print("Enter array elements : "+(i+1)+" : ");
            num[i]=input.nextInt();


        }
        System.out.print("Enter the target value : ");
        int target = input.nextInt();
        int count =0;
        for (int i=0;i<size;i++){
            if(target==num[i]){
                count++;
                
            }

        }
        System.out.println("The number of occurances of the given target  "+(target)   +  "   count :   "+count);

    }

    
}
