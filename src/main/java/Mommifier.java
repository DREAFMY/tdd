public class Mommifier {
    public Boolean isMoreThan30(String str) {
        int j = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                j += 1;
            }
        }
        return  30 <= j * 100 / str.length();
    }
}
