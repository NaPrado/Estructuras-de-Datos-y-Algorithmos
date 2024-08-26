package ar.edu.itba;

import info.debatty.java.stringsimilarity.NGram;
import info.debatty.java.stringsimilarity.QGram;
import org.apache.commons.codec.language.Soundex;

public class Main {
    public static void main(String[] args) {
        Soundex soundex = new Soundex();
        System.out.println(soundex.soundex("pepito"));
        MySoundex soundex2 = new MySoundex("pepito");
        System.out.println(soundex2);
        MyQGram myQGram = new MyQGram(2);
        System.out.println(myQGram.similarity("salesal","vale"));
        NGram qGram = new NGram(2);
        System.out.println(qGram.distance("salesal","vale"));
    }
}