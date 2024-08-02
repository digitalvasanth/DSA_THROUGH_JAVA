

public class LCMandGCD {
    
public static void main(String [] args)
{
    int a=20;
    int b=15;

    int hcf=hcfunction(a,b);
    int lcm=(a*b)/hcf;
    System.out.println("Lcm is "+lcm +" Hcf is "+hcf);
}


public static int hcfunction(int a , int b)
{
    while(a>0&&b>0)
    {
        if(a>b)
        {
            a=a%b;
        }
        else
        b=b%a;
    }

    if(a==0)
    return b;
    else
    return a;
}

}
