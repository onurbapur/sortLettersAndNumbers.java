package Day_25;


public class ReverseString {
    public static String reverse(String str){
        String reverseword = "";
        for (int i = str.length() - 1; i >=0 ; i--) {
            reverseword += str.charAt(i);

        }
        return reverseword;
    }

    public static void main(String[] args) {
        System.out.println(reverse("ASDFFGGFF"));
    }
}
