package viikko1;

public class PasswordAttempts {
    public static String login(String[] tries) {
        if(tries.length < 0) {
            for(int i = 0; i < 3; i++) {
                if(tries[i].equals("java123")) {
                    return "Tervetuloa!";
                }
            }
        }
        else if(tries.length > 0) {
            for(int i = 0; i < tries.length && i < 3; i++) {
                if(tries[i].equals("java123")) {
                    return "Tervetuloa!";
                }
            }
            return "Liian monta virheellistä yritystä.";
        }
        return null;
    }
}
