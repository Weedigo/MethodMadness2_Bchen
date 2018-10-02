public class BChenLib {
    public static String dateStr(String date){
        String m = date.substring(0,2);
        String d = date.substring(3,5);
        String y = date.substring(6,10);
        return (d+"-"+m+"-"+y);
    }
}
