/*Write a Java program to capitalize the first letter of each word in a sentence. */
public class FirstletterCapital {
    public static void main(String[] args) {
        String s="yoGesh";
        String fletter=s.substring(0,1);
        String rletter=s.substring(1, s.length());
        fletter=fletter.toUpperCase();
        rletter=rletter.toLowerCase();
        

    }
    
}