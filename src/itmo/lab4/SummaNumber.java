package itmo.lab4;

public class SummaNumber {
    public static Boolean isSumOfTwoNumbers(int first, int second, int third){
        int sum = first+second;
        if(sum == third){
            return true;
        }
        else {return false;}

    }
}
