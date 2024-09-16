package ar.edu.itba;
import java.util.Scanner;
import java.util.Stack;

public class EvaluatorPostfija {


    private Scanner scannerLine;


    public EvaluatorPostfija()
    {
        Scanner inputScanner = new Scanner(System.in).useDelimiter("\\n");
        System.out.print("Introduzca la expresiOn en notaciOn postfija: ");
        inputScanner.hasNextLine();

        String line = inputScanner.nextLine();

        scannerLine = new Scanner(line).useDelimiter("\\s+");

    }

    public Double evaluate()
    {
        Stack<Double> auxi= new Stack<Double>();

        while( scannerLine.hasNext() )
        {
            String token=scannerLine.next();
            if (token.matches("-?[0-9]+(.[0-9]+)?")){
                auxi.push(Double.parseDouble(token));
            }
            else{
                if (auxi.size()<2){
                    throw new ArithmeticException("Faltan numeros");
                }
                Double last=auxi.pop();
                switch (token){
                    case "+": auxi.push(auxi.pop()+last);break;
                    case "-": auxi.push(auxi.pop()-last);break;
                    case "*": auxi.push(auxi.pop()*last);break;
                    case "/": auxi.push(auxi.pop()/last);break;
                    default: break;
                }
            }
        }
        return auxi.pop();
    }





    public static void main(String[] args) {
        Double rta = new EvaluatorPostfija().evaluate();
        System.out.println(rta);
    }


}
