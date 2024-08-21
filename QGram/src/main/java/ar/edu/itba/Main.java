package ar.edu.itba;

public class Main {
    public static void main(String[] args) {
        MyQGram qGram= new MyQGram(2);
        qGram.printTokens("vale");
        System.out.println(qGram.similarity("salesal","vale"));
    }
}
