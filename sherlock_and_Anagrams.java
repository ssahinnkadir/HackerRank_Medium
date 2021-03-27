import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class sherlock_and_Anagrams {

    // Complete the sherlockAndAnagrams function below.
    static int sherlockAndAnagrams(String s) {
        
        int len = s.length();
        
        int count = 0;
        
        int i;
        
        for(i=0;i<len-1;i++){
            

            List<List<Character>> charCombList = new ArrayList<List<Character>>();
        

            int k;
            
            for(k=0;k<len-i;k++){
                List<Character> charset = new ArrayList<Character>();
                for (char c : s.substring(k,k+i+1).toCharArray()) {
                 charset.add(c);
                }
                Collections.sort(charset);
                charCombList.add(charset);
            }

         //   System.out.println(setList);
            
            for(k=0;k<charCombList.size()-1;k++){
                int l;
                for(l=k+1;l<charCombList.size();l++){
                    if((charCombList.get(k)).equals((charCombList.get(l))) ){
                        count++;   
                    }
                }
            }
        
        }
        return count;
}

    public static void main(String[] args) {{



        String input1 ="abba";
        String input2 ="abcd";
        String input3 ="ifailuhkqq";
        String input4 ="kkkk";
        String input5 ="cdcd";
        

        System.out.println( sherlockAndAnagrams(input1));
        System.out.println( sherlockAndAnagrams(input2));
        System.out.println( sherlockAndAnagrams(input3));
        System.out.println( sherlockAndAnagrams(input4));
        System.out.println( sherlockAndAnagrams(input5));

            
        }

    }
}
