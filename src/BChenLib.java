public class BChenLib {
    public static String dateStr(String date){
        String m = date.substring(0,2);
        String d = date.substring(3,5);
        String y = date.substring(6,10);
        return (d+"-"+m+"-"+y);
    }
//////////////////////good
    public static String cutOut(String mainString, String subString){
        int start = mainString.indexOf(subString.substring(0,1));
        String part1= mainString.substring(0, start);
        String part2= mainString.substring(start+subString.length(), mainString.length());
        String answer = part1+part2;
        return answer;
    }
/////////////////////good
    public static void fooBarBaz(int num1){
        for(int i=1; i<num1+1; i++) {
            if(i%5==0 && i%3==0) {
                System.out.println("baz");;
            }
                else if(i%3==0) {
                    System.out.println("foo");
                }
                    else if(i%5==0) {
                        System.out.println("bar");
                    } else System.out.println(i);
        }
    }
///////////////////////goooooooooooooood
    public static int sumUpToCombine(int number){
        int answer = 0;
        for(int i=0;i<number+1;i++){
            answer += i;
        }
        return answer;
    }
///////////////////good
    public static int primePrinter(int number){
        for(int i=2; i<number; i++){
            if(number%i!=0){
                return(i);
            }
        }
        return(69);
    }
//////////ask about if number = 2, make it so that it gives all the prime, not just first
    //My league elo problem

}
