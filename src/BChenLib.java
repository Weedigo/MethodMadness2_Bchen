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
        int max1 =0; int max2 =0; int max3 =0; int zero = 0;
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
        for(int i=0;i<max1;i++){
            if((max1%i)==(max2%i)==(max3%i)==(zero))
                return(i);
        }
        return(123);
        answre is on stack OVERFLOWWW
    }

}
