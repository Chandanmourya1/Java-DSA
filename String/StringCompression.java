package String;

public class StringCompression {
    public static String Compress(String name){
        String newStr="";
        for(int i=0;i<name.length();i++){
            Integer count =1;
            while(i<name.length()-1 && name.charAt(i) == name.charAt(i+1)){
                count++;
                i++;
            }
            newStr += name.charAt(i);
            if(count>1){
                newStr +=count.toString();
            }   
        }
        return newStr;
    }
    public static void main(String[]args){
        String name ="aaabbcccdd";
        System.out.println(Compress(name));
    }
    
}
