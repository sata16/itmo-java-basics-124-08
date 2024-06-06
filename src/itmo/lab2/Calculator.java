package itmo.lab2;

public class Calculator {
    //summa
    public static int getSum(int number1,int number2){
        return number1+number2;
    }
    public static int getSum(int number1,int number2,int number3){
        return number1+number2+number3;
    }
    public static double getSum(double number1,double number2){
        return number1+number2;
    }
    public static long getSum(long number1,long number2){
        return number1+number2;
    }
  //subtract
    public static int getSub(int number1,int number2){
        return number1-number2;
    }
    public static long getSub(long number1,long number2){
        return number1-number2;
    }
    public static double getSub(double number1,double number2){
        return number1-number2;
    }
    //division
    public static double getDiv(int number1,int number2){
        return (double)number1/number2;
    }
    public static double getDiv(long number1,long number2){
        return (double)number1/number2;
    }
    public static double getDiv(double number1,double number2){
        return number1/number2;
    }
    //multiplication
    public static int getMulti(int number1,int number2){
        return number1*number2;
    }
    public static long getMulti(long number1,long number2){
        return number1*number2;
    }
    public static double getMulti(double number1,double number2){
        return number1*number2;
    }

}
