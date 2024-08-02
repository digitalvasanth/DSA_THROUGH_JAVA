public class PrintNto1 {
    
    public static void main(String [] args)
    {
        int n=13;
        generate(n,n);;
    }

    public static void generate(int i, int n)
    {
            if(i<1)
            return;

            System.out.println(i);

            generate(i-1,n);
    }
}
