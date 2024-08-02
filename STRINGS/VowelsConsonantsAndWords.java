
import java.util.*;

public class VowelsConsonantsAndWords {
   
    public static void main(String[] args) {
      
        Scanner sc=new Scanner(System.in);
       
            String line=sc.nextLine();

           
            func(line);
            
        
    }


    public static void func(String line)
    {      int wordCount=0;
            int vowelCount=0;
            int ConsonantCount=0;

            line=line.trim();
            char arr[]=line.toCharArray();
            String vowels="aeiouAEIOU";
            boolean inword=false;
            for(char ch:arr)
            {
                    if(Character.isLetter(ch))
                    {
                        if(vowels.contains(String.valueOf(ch)))
                            vowelCount++;
                        else
                            ConsonantCount++;


                        if(!inword){
                            wordCount++;
                            inword=true;
                        }
                    }
                    else
                    {
                        inword=false;
                    }
            }

            System.out.println(wordCount+" "+vowelCount+" "+ConsonantCount);
        
        

}
}