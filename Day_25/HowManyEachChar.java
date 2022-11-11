package Day_25;

public class HowManyEachChar {
    public static void calculate(String text){
        String temp = "";
        ;
        for (int i = 0; i < text.length(); i++) {
            int count = 0;
            if(!temp.contains(text.charAt(i)+"")){
                temp += text.charAt(i);
                for (int j = 0; j < text.length(); j++) {
                    if (text.charAt(i) == text.charAt(j)){
                        count++;
                    }

                }
                System.out.println("Number of '" + text.charAt(i) + "' in this string : " + count);
            }
        }
    }

    public static void main(String[] args) {
        calculate("kdhfmnvjdvhkdnlvkdjbvhnwkldbvkn");
    }
}
