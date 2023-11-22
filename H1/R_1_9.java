package H1;

public class R_1_9 {
    public static String remove(String string){
        string = string.replaceAll("\\p{P}", "");
//p{P}..for punctuation character "المطلوب"
        return string;
    }

    public static void main(String[] args) {
        System.out.println("After:  "+remove("sara.,!? Let’s try, Mike!"));
    }
}
