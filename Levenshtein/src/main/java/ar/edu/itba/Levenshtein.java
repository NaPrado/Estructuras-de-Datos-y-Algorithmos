package ar.edu.itba;

public class Levenshtein {
    public Levenshtein() {
    }

    public static int distance(String word1, String word2) {
        int [][] matriz= new int[word1.length()+1][word2.length()+1];
        for (int i = 0; i <= word1.length(); i++) {
            matriz[i][0] = i;
        }
        for (int j = 0; j <= word2.length(); j++) {
            matriz[0][j] = j;
        }
        for (int i = 1; i <= word1.length(); i++) {
            for (int j = 1; j <= word2.length(); j++) {
                int izq = matriz[i-1][j]+1;
                int arr =  matriz[i][j-1]+1;
                int diag = matriz[i-1][j-1];
                diag+=(word1.charAt(i-1) == word2.charAt(j-1))?0:1;
                matriz[i][j] = Math.min(Math.min(izq, arr), diag);
            }
        }
        return matriz[word1.length()][word2.length()];
    }
    public static double normalizada(String word1, String word2){
        int distance = distance(word1, word2);
        return 1- (double) (distance) /Math.max(word1.length(), word2.length());
    }
}
