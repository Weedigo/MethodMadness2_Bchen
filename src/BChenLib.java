import java.sql.SQLOutput;

public class BChenLib {
    /**
     * String
     *Change the format of the date from mm/dd/yyyy to dd-mm-yyyy.
     *
     * @param date The date entered in the format of "mm/dd/yyyy".
     * @return     Change the format of the date into dd-mm-yyyy.
     */
    public static String dateStr(String date){
        String m = date.substring(0,2);
        String d = date.substring(3,5);
        String y = date.substring(6,10);
        return (d+"-"+m+"-"+y);
    }

    /**
     * String
     *Remove the first occurrence of the unwanted string within the original string.
     *
     * @param mainString The original string.
     * @param subString  The string that we want to cut out from the original string
     * @return           The new string which is the original string without the string inside which we want to remove.
     */
    public static String cutOut(String mainString, String subString){
        int start = mainString.indexOf(subString.substring(0,1));
        String part1= mainString.substring(0, start);
        String part2= mainString.substring(start+subString.length(), mainString.length());
        String answer = part1+part2;
        return answer;
    }

    /**
     * String
     *Check if the value below the input integer is divisble by 3, 5, or both.
     * The ones divisible by 3 comes out as "foo", the ones divisible by 5 turns to "bar", and the one that is divisible by both 3 and 5 is "baz".
     * The rest of the numbers are printed out as their normal value.
     *
     * @param num1 The highest number that the the return value will print up to.
     * @return     a series of number and strings(foobarbaz) seperated by each line.
     */
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

    /**
     * Math
     *Find the sum of the number from 0 to the input.
     *
     * @param number The number that we want to add the sum up to.
     * @return       The sum of all the preceding numbers from 0 and the number itself.
     */
    public static int sumUpToCombine(int number){
        int answer = 0;
        for(int i=0;i<number+1;i++){
            answer += i;
        }
        return answer;
    }

    /**
     * Math
     *Print out the prime numbers within 0 to input.
     *
     * @param number The input which is the maximum to which we will be checking prime for.
     * @return       Multiple lines of prime numbers preceding the input.
     */
    public static void primePrinter(int number){
        for (int i=2; i<number+1; i++){
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

    /**
     * Math Challenge
     * Find the roots of the quadratic if it is not imaginary. If it is imaginary, explain why it is imaginary.
     *
     * @param a The x^2 coefficient of the quadratic
     * @param b The x coefficient of the quadratic
     * @param c The constant of the quadratic
     * @return  The roots of the quadratic. If they are imaginary, there will be an explanation explaining it.
     */
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

    /**
     * Math Challenge
     * Find the least common multiple of the 3 numbers.
     * The numbers limited to integers here because to divide by decimals, the for loop would have to go by smaller increments.
     * But as the decimal gets infinitely smaller, it would have to go infinitely smaller.
     *
     * @param num1 The first number
     * @param num2 The second number
     * @param num3 The third number
     * @return     Return the LCD of the 3 numbers.
     */
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
        return(0);
    }

    /**
     * String Challenge
     *Find the number of shared letters by at least two of the three words from the input.
     *
     * @param word1 First word to be compared for shared letters
     * @param word2 Second word to be compared for shared letters
     * @param word3 Third word to be compared for shared letters
     * @return Give the number of the letters shared by at least two of the words.
     */
    public static int stringUnion(String word1, String word2, String word3){
        int answer = 0;
        int all3 = 0;
        String nword1="";
        for(int i=0;i<word1.length();i++){
            if(word1.indexOf(word1.substring(i,i+1))==i){
                nword1+= word1.substring(i,i+1);
            }
        }
        String nword2="";
        for(int i=0;i<word2.length();i++){
            if(word2.indexOf(word2.substring(i,i+1))==i){
                nword2+= word2.substring(i,i+1);
            }
        }
        String nword3="";
        for(int i=0;i<word3.length();i++){
            if(word3.indexOf(word3.substring(i,i+1))==i){
                nword3+= word3.substring(i,i+1);
            }
        }

        for(int i= 0; i< nword1.length(); i++){
            for(int j= 0; j< nword2.length(); j++){
                for(int k= 0; k< nword3.length(); k++){
                    String letter1 = nword1.substring(i,i+1);
                    String letter2 = nword2.substring(j,j+1);
                    String letter3 = nword3.substring(k,k+1);
                    if(letter1.equals(letter2)) {
                        if(letter2.equals(letter3)){
                            all3++;
                        }
                    }
                }
            }
        }
        for(int i= 0; i< nword1.length(); i++) {
            for(int j= 0; j< nword2.length(); j++){
                if(nword1.substring(i,i+1).equals(nword2.substring(j,j+1)))
                    answer++;
            }
        }
        for(int i= 0; i< nword1.length(); i++) {
            for(int j= 0; j< nword3.length(); j++){
                if(nword1.substring(i,i+1).equals(nword3.substring(j,j+1)))
                    answer++;
            }
        }
        for(int i= 0; i< nword2.length(); i++) {
            for(int j= 0; j< nword3.length(); j++){
                if(nword2.substring(i,i+1).equals(nword3.substring(j,j+1)))
                    answer++;
            }
        }
        return(answer-2*all3);
    }

}
