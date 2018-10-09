public class TestFile {
    public static void main(String [] args)
    {
        System.out.println(BChenLib.dateStr("11/22/3333"));
        System.out.println(BChenLib.cutOut("giantcatpoop","cat"));
        BChenLib.fooBarBaz(69);
        System.out.println(BChenLib.sumUpToCombine(10));
        BChenLib.primePrinter(23);
        System.out.println(BChenLib.quadSolver(1,-6,187));
        System.out.println(BChenLib.quadSolver(1,4,4));
        System.out.println(BChenLib.leastCommonMultiple(9,6,15));
        System.out.println(BChenLib.leastCommonMultiple(7,6,15));
        System.out.println(BChenLib.stringUnion("aaadbaaaa", "bbacbbb", "ccccdca"));
    }
}