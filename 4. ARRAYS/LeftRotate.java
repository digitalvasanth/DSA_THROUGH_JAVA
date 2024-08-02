public class LeftRotate {
    public static void main(String [] args){
int arr[]={1,2,3,4,5};
int n=arr.length;
int k=3;
for(int i=0;i<n ;i++)
{
    System.out.println(arr[(i-k+n)%n]);
}

}
}
