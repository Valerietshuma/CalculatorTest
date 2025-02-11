package calcu.java;

public class   Calcu {
    //Add fuction that adds two intergers

//public int add(int a , int b){
//    return a + b;
//}
//Multiply functions
   //  public int multiply(int a , int b){
  //  return a * b;

public int add(int... numbers) {
    int sum = 0;
    for (int number : numbers) {
        sum += number;
    }
    return sum;
}
    public int multiply(int... numbers) {
        int result = 1;
        for (int number : numbers) {
            result *= number;
        }
        return result;
    }
}

