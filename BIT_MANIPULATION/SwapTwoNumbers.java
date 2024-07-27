public class SwapTwoNumbers {
    
    public static void main(String [] args)
    {
        int a=10;
        int b=15;

        System.out.println("Before Swap: ");
        System.out.println("A "+a+" B "+b);

        a=a^b;
        b=a^b;
        a=a^b;

        System.out.println("After Swap: ");
        System.out.println("A "+a+" B "+b);
        
    }
}
