package Day_25;

public class UniqueChars {
    public static void uniquechars(String str){
        int counter;
        for (int i = 0; i < str.length(); i++) {
            counter = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i)==str.charAt(j)){
                    counter++;
                }
            }
            if (counter == 1){
                System.out.print(str.charAt(i));
            }
        }
    }

    public static void main(String[] args) {
        uniquechars("aadfggggjghjjlkli");
    }
}
