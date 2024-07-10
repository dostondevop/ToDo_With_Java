import sun.util.locale.LocaleUtils;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {

    }
    public  static  String endUp(String str) {
        String part = str.substring(str.length()-4);

        if( str.length() >= 3 ){
            return str.substring(0,str.length()-3) + part.toUpperCase();
        }else{
            return str.toUpperCase();
        }
    }



    /*public static StringBuilder withoutX2(String str) {
        StringBuilder sb = new StringBuilder(str);
        if(str.charAt(1) == 'x'){
            sb.delete(1,2);
        }
        if(str.charAt(0) == 'x'){
            sb.delete(0,1);
        }
        return sb;
        }*/
    }