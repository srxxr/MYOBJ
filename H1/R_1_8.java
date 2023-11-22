package H1;

public class R_1_8 {
    public static int countVowels(String string) {
        string.toLowerCase();
        string = string.replaceAll("\\a", "");
        int NumOfVowels = 0;
        char Array[] = string.toCharArray();
        for (int i = 0; i < string.length(); i++) {

            if (Array[i] == 'a' || Array[i] == 'e' || Array[i] == 'i' ||Array[i] == 'o'
                    || Array[i] == 'u') {

                NumOfVowels++;

            }

        }

        return NumOfVowels;

    }

    public static void main(String[] args) {
        System.out.println(countVowels("Sara Faisal"));
    }
}
