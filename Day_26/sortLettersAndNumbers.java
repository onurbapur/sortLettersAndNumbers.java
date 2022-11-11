package Day_26;

public class sortLettersAndNumbers {
    public static void uygula(String str){
        if (!str.equals("")){
            if (str.charAt(0) < 91 && str.charAt(0) > 64){
                buyukHarfUygula(str);
            }else sayiUygula(str);
        }
    }
    public static void buyukHarfUygula(String str){
        String str2 = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) < 91 && str.charAt(i) > 64){
                str2 += str.substring(i, i+1);
                if(i == str.length()-1){
                    str = "";
                }
            }else {
                str = str.substring(i);
                break;
            }
        }
        siralaVeYaz(str2);
        uygula(str);
    }
    public static void sayiUygula(String str){
        String str2 = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) < 58 && str.charAt(i) > 47 ) {
                str2 += str.substring(i, i + 1);
                if(i == str.length()-1){
                    str = "";
                }
            } else {
                str = str.substring(i);
                break;
            }
        }
        siralaVeYaz(str2);
        uygula(str);
    }
    public  static void siralaVeYaz(String str){
        for (int i = 0; i < str.length()-1; i++) {
            for (int j = i+1; j< str.length(); j++) {
                if(str.charAt(j) < str.charAt(i)) {
                    str = str.substring(0,i) + str.charAt(j) + str.charAt(i) + str.substring(i+1,j) + str.substring(j+1);
                }
            }
        }
        System.out.print(str);
    }

    public static void main(String[] args) {

        String str = "DC501GCCCA098911";
        System.out.println(str);
        uygula(str);
    }
}
