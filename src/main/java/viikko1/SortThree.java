package viikko1;

import java.util.Arrays;

public class SortThree {
    public static String ascending(int a, int b, int c) {
        int array []= {a,b,c};
        Arrays.sort(array);
        String result = "";

        for(int i=0;i<array.length;i++){
            result += Integer.toString(array[i]);
            if (i<array.length -1){
                result += ",";
            }
        }
        return result;
    }
}
