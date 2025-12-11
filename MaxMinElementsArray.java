import java.util.Scanner;
public class MaxMinElementsArray {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size of an array : ");
        int size = input.nextInt();
        int num [] = new int[size];

        for (int i =0;i<size;i++){
            System.out.print("Enter array elements :  " +(i+1)+" :");
            num[i]=input.nextInt();

        }
        System.out.println("The array elements are : ");
        for (int arr : num){
            System.out.print(arr+" " );
        }
        System.out.println();
        int max=num[0];
        for(int i=0;i<size;i++){
            if (max<num[i]){
                max = num[i];
                
            }


        }
        int min=num[0];
        for(int i=0;i<size;i++){
            if(min>num[i]){
                min=num[i];
            }
        }
        System.out.println("The maximun array element : "+max);
        System.out.println("The minimum array element : "+min);


    }
    
}
