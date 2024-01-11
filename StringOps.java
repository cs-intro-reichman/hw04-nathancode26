public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        String s="Hello World";
        System.out.println(camelCase(s));
       
    }
    public static String capVowelsLowRest (String string) {
        String new_string= "";
        int len= string.length();
        int i =0;
        while (i<len){
            if(string.charAt(i)== 'a'||string.charAt(i)== 'e'||string.charAt(i)== 'i'||string.charAt(i)== 'o'||string.charAt(i)== 'u'){
                new_string+= (char)(string.charAt(i)-32);
            } else if (string.charAt(i)== 'A'||string.charAt(i)== 'E'||string.charAt(i)== 'I'||string.charAt(i)== 'O'||string.charAt(i)== 'U'){
                new_string+=string.charAt(i);

            } else{
                if(string.charAt(i)>='A' && string.charAt(i)<='Z' ){
                    new_string+= (char)(string.charAt(i)+32);
                }
                else {
                    new_string += string.charAt(i);
                }
            }
            i++;
        }
        return new_string;
    }

    public static String camelCase (String string) {
        boolean bool=true;
        String new_string= "";
        char char_prev=' ';
        int len= string.length();
        for(int i =0 ;i<len;i++){
            char c =string.charAt(i);
            if (bool && c!=' ') {
                if (c >= 41 && c <= 90) {
                    new_string += (char) (c + 32);
                } else {
                    new_string += c;
                }
            }
            else if (!(bool) && char_prev==32 && c!=32 ){
                if(c >65 && c <90){
                    new_string+=c;
                }
                else {
                    char nouv= (char) (c - 32);
                    new_string+=nouv;
                }
            }
            else if((!bool) && char_prev!=32 && c!=32){
                if (c >65 && c <90){
                    char nouvv= (char) (c + 32);
                    new_string+=nouvv;
                }
                else{
                    new_string+=c;
                }
            }
            if (char_prev!=' ' && c==' '){
                bool=false;
            }
            char_prev=c;
        }
        // Write your code here:
        return new_string;
    }

    public static int[] allIndexOf (String string, char chr) {
        int len = 0;
        int j = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == chr) {
                len++;
            }
        }
        int[] ar = new int[len];
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == chr) {
                ar[j] = i;
                j++;
            }
        }
        return ar;
    }
}

