package viikko1;

public class TimesTable {
    public static String table(int n) {
        String row = "";
        for(int i=1;i<=10;i++){
            int tulos = n*i;
            row += n + " x " + i + " = " + tulos + "\n";
        }
        return row;
    }
}
