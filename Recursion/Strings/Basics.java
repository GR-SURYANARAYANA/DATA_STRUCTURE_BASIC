package Recursion.Strings;

import java.util.ArrayList;

public class Basics {
    public static void main(String[] args) {
        String givenString="I am surya naryanayana from cs branch13";
//        System.out.println(removeValue(givenString,"a",0));
//        System.out.println(removeValue1(givenString,"a",0,""));
//        String skipResult = replace(givenString, "a", "12");
//        System.out.println(skipResult);
//        System.out.println(contains(givenString,0,givenString.length(),"na"));
    }

    static StringBuilder builder=new StringBuilder();
    public static String removeValue(String str,String value,int index){
        if(index==str.length())
            return builder.toString();
        if(!value.equalsIgnoreCase(String.valueOf(str.charAt(index)))){
            builder.append(str.charAt(index));
        }
        return removeValue(str,value,index+1);
    }
    public static String removeValue1(String str,String value,int index,String ans){
        if(index==str.length())
            return ans;
        char ch = str.charAt(index);
        if(!value.equalsIgnoreCase(String.valueOf(ch))){
           ans=ans+ch;
        }
        return removeValue1(str,value,index+1,ans);
    }
    public static String skip(String original,String value,String removedString){
        if(original.isEmpty()){
            return removedString;
        }
        char ch=original.charAt(0);
        if(original.startsWith(value)){
          return skip(original.substring(value.length()),value,removedString);
        }
        return  ch+skip(original.substring(1),value,removedString);
    }
    public static String replace(String original,String value,String replace){
        if(original.isEmpty()){
            return "";
        }
        char ch=original.charAt(0);
        if(original.startsWith(value)){
            return replace+replace(original.substring(value.length()),value,replace);
        }
        return  ch+replace(original.substring(1),value,replace);
    }
    public static boolean contains(String original,int start,int end,String search){
        if(start>=search.length() && start==end){
            return false;
        }
            int index=0;
            while((original.charAt(start)==search.charAt(index))){
                start=start+1;
                index=index+1;
                if(index==search.length())
                    return true;
            }
                return contains(original,start+1,end,search);
    }
}
