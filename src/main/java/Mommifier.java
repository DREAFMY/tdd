import javafx.scene.chart.Chart;

public class Mommifier {
    public Boolean isMoreThan30(String str) {
        int j = 0;
        for (int i = 0; i < str.length(); i++) {
            if (isVowel(str.charAt(i))) {
                j += 1;
            }
        }
        return  30 <= j * 100 / str.length();
    }

    public Boolean isVowel(char c) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            return true;
        }
        return false;
    }

    public String insertMommy(String str) {
        StringBuilder stringBuilder = new StringBuilder(str);
        int j = 0;
        if (str.length() == 1 || !isMoreThan30(str)) { return str; }
        for (int i = 0; i < str.length() - 1; i++) {
            if (isVowel(str.charAt(i)) && isVowel(str.charAt(i + 1))) {
                stringBuilder.insert(i + 1 + j * 5, "mommy");
                j += 1;
            }
        }
        return stringBuilder.toString();
    }
}
