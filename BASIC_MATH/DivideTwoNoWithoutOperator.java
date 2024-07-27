public class DivideTwoNoWithoutOperator{

    public static void main(String [] args)
    {
        int a=15;
        int b=5;
        int count=0;
        while(a>=b)
        {
            a=a-b;
            count++;
        }

        System.out.println(count);
    }
}