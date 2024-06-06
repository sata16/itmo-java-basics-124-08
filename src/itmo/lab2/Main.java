package itmo.lab2;

public class Main {
    public static void main(String[] args) {
        //1.sum
        int sum = Calculator.getSum(5, 12);
        long sum1 = Calculator.getSum(900000L, 12L);
        double sum2 = Calculator.getSum(5.5, 12.9);
        int sum3 = Calculator.getSum(25, 10,7);
        System.out.println(sum +"\n"+sum1 +"\n"+sum2+"\n"+sum3);
        //1.sub
        int sub1 = Calculator.getSub(25,10);
        long sub2 = Calculator.getSub(25000L,100L);
        double sub3 = Calculator.getSub(25.5,10);
        System.out.println(sub1 +"\n"+sub2 +"\n"+sub3);
        //1.div
        double div1 = Calculator.getDiv(240,9);
        double div2 = Calculator.getDiv(250L,100L);
        double div3 = Calculator.getDiv(25.5,10);
        System.out.println(div1 +"\n"+div2 +"\n"+div3);
        //1.multiplication
        int mul1 = Calculator.getMulti(25,10);
        long mul2 = Calculator.getMulti(25000L,100L);
        double mul3 = Calculator.getMulti(25.5,15);
        System.out.println(mul1 +"\n"+mul2 +"\n"+ mul3);


        //2
        Telefon telefon = new Telefon("Huawei", "Y91",Color.PINK);
        System.out.println(telefon);



    }

}
