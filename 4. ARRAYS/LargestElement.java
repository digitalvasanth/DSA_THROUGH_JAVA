// Find Maximum Value in the array
public class LargestElement {
        public static void main(String [] args)
        {
            int max=Integer.MIN_VALUE;

            int arr[]={1,222,-4,21,65};

            for(int i:arr)
            {
                if(i>max)
                max=i;
            }
            System.out.println(max);
        }
}
