/**
 * Q5
 */
public class Q5 {

    public static void main(String[] args) {
        System.out.println(new Q5().putCommas("1234567890"));
    }

    public String putCommas(String str) {
        int length = str.length();
        if (str.length() < 4) { return str; }
            int cdex = str.indexOf(",");
            if (cdex == -1) {
                str =  str.substring(0, length-3) + "," +str.substring(length-3);
                return putCommas(str);
            } else if(cdex > 3){
                str = str.substring(0, cdex-3) + "," + str.substring(cdex-3);
                return putCommas(str);
            } else {
                return str;
            }

    }
    // 012,
    //0123,
}