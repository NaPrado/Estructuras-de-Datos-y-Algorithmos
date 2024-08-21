package ar.edu.itba;

public class KMP {
    //O(m) espacial/temporal
    private static int[] nextComputation(char[] query){
        int[] next = new int[query.length];
        int border=0;
        int rec=1;
        while(rec < query.length){
            if(query[rec]!=query[border]){
                if(border!=0)
                    border=next[border-1];
                else
                    next[rec++]=0;
            } else {
                border++;
                next[rec]=border;
                rec++;
            }
        }
        return next;
    }

    public static int indexOf(char[] target, char[] query){
        int [] nextArray = nextComputation(query);
        int i = 0;
        for (int j = 0; j < target.length; j++) {
            if (i==query.length)
                return j - query.length;
            if (target[j] == query[i])
                i++;
            else
                i-=nextArray[i];
        }
        if (i==query.length)
            return target.length - query.length;
        return -1;
    }

}
