package ar.edu.itba;

public class MySoundex {
    String output;
    public MySoundex(String input) {
        input=input.toUpperCase().trim().replaceAll("[^A-Z]","");
        String output = String.valueOf(input.charAt(0));
        String c;
        String last=output;
        int amount=0;
        for (int i = 1; amount < 3 && input.length()>i;i++) {
            c=getMapping(input.charAt(i));
            if (!c.equals("0") && !c.equals(last)){
                output=output.concat(c);
                amount++;
            }
            last=c;
        }
        while (output.length()<4) {
            output=output.concat("0");
        }
        this.output=output;
    }
    public String toString(){
        return output;
    }
    private static String getMapping(char input) {
        if (String.valueOf(input).matches("[BFPV]")) {
            return "1";
        } else if (String.valueOf(input).matches("[CGJKQSXZ]")) {
            return "2";
        } else if (String.valueOf(input).matches("[DT]")) {
            return "3";
        } else if (String.valueOf(input).matches("L")) {
            return "4";
        } else if (String.valueOf(input).matches("[MN]")) {
            return "5";
        } else if (String.valueOf(input).matches("[R]")) {
            return "6";
        } else{
            return "0";
        }
    }
}