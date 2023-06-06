import java.util.ArrayList;

public class Operation {
    public int addition(ArrayList<Integer> numberList, String operator){
        int sum = numberList.get(0);
        for(int i = 1 ; i < numberList.size(); i++){
            System.out.println(operator + numberList.get(i) + "(=" + (numberList.get(i) + sum) + ")");
            sum = numberList.get(i) + sum;
        }
        return sum;
    }
    public int soustraction(ArrayList<Integer> numberList, String operator){
        int sum = numberList.get(0);
        for(int i = 1 ; i < numberList.size(); i++){
            System.out.println(operator + numberList.get(i) + "(=" + (sum - numberList.get(i)) + ")");
            sum = sum - numberList.get(i);
        }
        return sum;
    }
    public int multiplication(ArrayList<Integer> numberList, String operator){
        int sum = numberList.get(0);
        for(int i = 1 ; i < numberList.size(); i++){
            System.out.println(operator + numberList.get(i) + "(=" + (numberList.get(i) * sum) + ")");
            sum = numberList.get(i) * sum;
        }
        return sum;
    }
}
