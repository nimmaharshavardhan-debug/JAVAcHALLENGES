public class CheckArraySorted{
    public static void main(String[] args){
        int [] arr = ArrayUtility.ArrayInput();
        boolean isInc = IsIncresing(arr);
        boolean isDec =IsDescresing(arr);

        if (isInc || isDec){
            System.out.println("Array is in sorted oreder ");
        }
        else{
            System.out.println("Array is not in sorted order ");
        }
        
        
    }
    public static boolean IsIncresing(int [] arr){
        
        for(int i=0;i<arr.length-1;i++){
                if(arr[i]>arr[i+1]){
                     return  false;
                } 
        }return true;

    }
    public static boolean IsDescresing(int [] arr){
        
        for(int i=0;i<arr.length-1;i++){
                if(arr[i]<arr[i+1]){
                     return false;
                } 
        }return true;

    }


    


}