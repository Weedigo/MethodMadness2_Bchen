public class BChenLib {
    public static String dateStr(String date){
        String m = date.substring(0,2);
        String d = date.substring(3,5);
        String y = date.substring(6,10);
        return (d+"-"+m+"-"+y);
    }
    public static String cutOut(String mainString, String subString){
        int start = mainString.indexOf(subString);
        String part1= subString.substring(0, start);
        String part2= subString.substring(start+subString.length(), mainString.length());
        return (part1+part2);
    }
}
