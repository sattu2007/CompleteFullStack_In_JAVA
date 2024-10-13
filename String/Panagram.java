import java.util.*;


public class Panagram{
    public static void main(String[] args){
        String s1 = "THE QUICK BRWON FOX JUMPS OVER THE LAZY DOG";
        s1 = s1.replace(" ","");
        char [] ch = s1.toCharArray();

        int arr[] = new int[26];
        boolean hyder = false;
        for(int i=0;i<ch.length;i++){
            int index = ch[i]-65;
            arr[index]++;
            //ar[ch[i]-65]++;
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                System.out.println("It is not panagram");
                hyder =true;
            }
        }
        if(hyder == false){
            System.out.println("It is panagram");
        }
    }
}