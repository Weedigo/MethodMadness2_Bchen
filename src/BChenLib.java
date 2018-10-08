import java.sql.SQLOutput;

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
    public static void primePrinter(int number){
        for (int i=2; i<number; i++){
            int check = 0;
            for (int k=2; k<i; k++){
                if (i % k == 0) {
                    check = 1;
                }
            }
            if (check == 0) {
                System.out.println(i);
            }
        }
    }
//////////ask about if number = 2, make it so that it gives all the prime, not just first
    public static String quadSolver(double a, double b, double c){
        double desc= Math.pow(b, 2)- 4*a*c;
        if (desc >= 0) {
            double ans1= (-b+ Math.sqrt(Math.pow(b, 2)- 4*a*c))/ (2*a);
            double ans2= (-b- Math.sqrt(Math.pow(b, 2)- 4*a*c))/ (2*a);
            return(String.valueOf(ans1) + "," + String.valueOf(ans2));
        } else {
            return("The root of this quadratic is imaginary, this is because it's descriminant is negative");
        }
    }

    ////////////////////
    public static int leastCommonMultiple(int num1, int num2, int num3){
        int max1 =0; int max2 =0; int max3 =0;
        if(num2>num1 && num1>num3){
            max1= num2;
            max2= num1;
            max3= num3;
        }
        if(num3>num1 && num1>num2){
            max1= num3;
            max2= num1;
            max3= num2;
        }
        if(num1>num2 && num2>num3){
            max1= num1;
            max2= num2;
            max3= num3;
        }
        if(num3>num2 && num2>num1){
            max1= num3;
            max2= num2;
            max3= num1;
        }
        if(num1>num3 && num3>num2){
            max1= num1;
            max2= num3;
            max3= num2;
        }
        if(num2>num3 && num3>num1){
            max1= num2;
            max2= num3;
            max3= num1;
        }
        for(int i=2;i<max1;i++){
            double rem1 = max1%i;
            double rem2 = max2%i;
            double rem3 = max3%i;
            if(rem1== 0){
                if(rem2==0){
                    if(rem3== 0){
                        return(i);
                    }
                }
            }
        }
        return(1);
    }
    ///////////////////////
    public static String vigCipher(String msg, String key){
        String keymsg = "";
        String answer = "";
        for(int i= 0; i<msg.length(); i++){
            keymsg = keymsg + key.substring(i%key.length());
        }
        //keymsg too long
        for(int k= 1; k<msg.length(); k++){
            int ascii = Integer.parseInt(keymsg.substring(k));
            answer = answer + (char)(msg.charAt(k)+ ascii);
        }
        return(answer);
    }
    ///////////
    public static int stringUnion(String word1, String word2, String word3){
        int answer = 0;
        int all3 = 0;
        for(int i= 0; i< word1.length(); i++){
            for(int j= 0; j< word2.length(); j++){
                for(int k= 0; k< word3.length(); k++){
                    String letter1 = word1.substring(i);
                    String letter2 = word1.substring(j);
                    String letter3 = word1.substring(k);
                    if(letter1.equals(letter2)) {
                        if(letter2.equals(letter3)){
                            all3++;
                        }
                    }
                }
            }
        }
        for(int i=0; i< word1.length(); i++){
            for(int j=0; j< word2.length(); j++){
                String letter1 = word1.substring(i);
                String letter2 = word2.substring(j);
                if(letter1.equals(letter2)) {
                    answer++;
                }
            }
        }
        for(int i=0; i< word2.length(); i++){
            for(int j=0; j< word3.length(); j++){
                String letter1 = word1.substring(i);
                String letter2 = word2.substring(j);
                if(letter1.equals(letter2)){
                    answer++;
                }
            }
        }
        for(int i=0; i< word1.length(); i++){
            for(int j=0; j< word3.length(); j++){
                String letter1 = word1.substring(i);
                String letter2 = word2.substring(j);
                if(letter1.equals(letter2)) {
                    answer++;
                }
            }
        }
        answer = answer - 2*all3;
        return answer;
    }

}
