package ar.edu.itba;

public class ExtractSearch {
    public static int indexOf(char[] query, char[] target){
        int start;
        boolean rompe;
        for (int i = 0; i < query.length; i++){
            start = 0;
            rompe = false;
            for (int j = 0; j < target.length && !rompe; j++){
                if ( i+j < query.length && query[i+j] == target[j]){
                    start++;
                }
                else {
                    rompe=true;
                }
            }
            if(start == target.length){
                return i;
            }
        }
        return -1;
    }
}
