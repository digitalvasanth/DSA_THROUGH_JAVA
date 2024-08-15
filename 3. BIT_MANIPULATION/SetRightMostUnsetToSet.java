/*
 Input : 21
Output : 23
(21)10 = (10101)2
Rightmost unset bit is at position 2(from right) as 
highlighted in the binary representation of 21.
(23)10 = (10111)2
The bit at position 2 has been set.
 */
public class SetRightMostUnsetToSet {
    
    public static void main(String [] args){
        int n=10;

        int newNumber=n|(n+1);
        System.out.println(newNumber);
    }
}
