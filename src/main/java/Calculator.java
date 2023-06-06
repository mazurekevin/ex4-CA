import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Calculator {
    String file;
    String operator;

    Calculator(String file, String operator){
        this.file = file;
        this.operator = operator;
    }
    ArrayList<String> numberListInFile = new ArrayList();
    ArrayList<Integer> numberList = new ArrayList();
    Operation op = new Operation();
    public void start() throws FileNotFoundException {
        numberListInFile = readFile();
        ListStringToInt(numberListInFile);
        System.out.println(numberList.get(0));
        int resultat = 0;
        switch (operator){
            case "+":
                resultat = op.addition(numberList, operator);
                break;
            case "-":
                resultat = op.soustraction(numberList,operator);
                break;
            case "x":
                resultat = op.multiplication(numberList,operator);
                break;
            default:
                System.out.println("Mauvais opérateur");
        }
        total(resultat);

    }

    private void ListStringToInt(ArrayList<String> numberListInFile) {
        for(int i = 0 ; i < numberListInFile.size(); i++){
            numberList.add(parseInt(numberListInFile.get(i)));
        }
    }

    public ArrayList<String> readFile() throws FileNotFoundException {

        FileInputStream file = new FileInputStream(this.file);
        Scanner scanner = new Scanner(file);
        while(scanner.hasNextLine())
        {
            numberListInFile.add(scanner.nextLine());

        }
        scanner.close();
        return numberListInFile;
    }


    public void total(int sum){
        System.out.println("------------");
        System.out.println("total: "+sum);
    }


}
