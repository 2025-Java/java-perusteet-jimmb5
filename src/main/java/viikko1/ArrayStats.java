package viikko1;

public class ArrayStats {
    public static double average(int[] arr) {
        if (arr.length == 0){
            return 0.0;
        }
        else if (arr.length>0){
            double sum = 0;
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i];
            }
            return sum/arr.length; 
        }
        return 0.0;
    }
    public static int max(int[] arr) {
        if (arr.length == 0){
            return Integer.MIN_VALUE;
        }
        else if (arr.length>0){
            int max = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i]>max){
                    max = arr[i];
                }
            }
            return max;
        }
        return Integer.MIN_VALUE;
    }
}
