public class Main {
    public static void main(String []args){
        Summator mySummator = new Summator();
        int result;
        mySummator.setFirstNumber(2_000_000_000);
        mySummator.setSecondNumber(2_000_000_000);
        result = mySummator.Summator() ;
        System.out.print(result);
    }
}
