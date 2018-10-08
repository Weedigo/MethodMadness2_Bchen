public class TestFile {
    public static void main(String [] args)
    {
        System.out.println(BChenLib.dateStr("11/22/3333"));
        System.out.println(BChenLib.cutOut("giantcatpoop","cat"));
        System.out.println(BChenLib.sumUpToCombine(5));
        BChenLib.fooBarBaz(15);
        BChenLib.primePrinter(7);
        System.out.println(BChenLib.quadSolver(1,-6,187));
        System.out.println(BChenLib.leastCommonMultiple(4,6,15));
        //System.out.println(BChenLib.vigCipher("computer", "ab"));
        System.out.println(BChenLib.stringUnion("bodje", "jobt", "bote"));
    }
}