package viikko1;

public class NumberProperties {
    public static String describe(int n) {
        if (n==0){
            return "nolla";
        }
        else if (n%2==0 && n>0){
            return "positiivinen parillinen";
        }
        else if (n%2!=0 && n>0){
            return "positiivinen pariton";
        }
        else if (n%2==0 && n<0){
            return "negatiivinen parillinen";
        }
        else if (n%2!=0 && n<0){
            return "negatiivinen pariton";
        }
        return null;
    }
}
