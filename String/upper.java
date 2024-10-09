import java.util.*;

// 'a' //97-32 = 65/A

public class upper{
    public static void main(String[] args){
        String s1 = "SATYAM";
        // String s2 ="";
        // for(int i=0;i<s1.length();i++){
        //     s2 =s2+ (char)(s1.charAt(i)-32);
            
        // }
        // System.out.println(s2);
        String s3 ="";
        for(int i=0;i<s1.length();i++){
            s3 =s3+ (char)(s1.charAt(i)+32);
            
        }
        System.out.println(s3);
    }
}