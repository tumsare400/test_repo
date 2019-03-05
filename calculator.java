public class Calculator{
   public  static void main (String [] args){
     System.out.println("Helllo World!!!");
     System.out.println("Calculator java program");
   }
   public  static void Addition (int number1, int number2){
     System.out.println("HAddition="+(number1+number2));
   }

    public  static void DIVISION (int number1, int number2){
if(number2==0)
     System.out.println("division should not be 0");
else
    System.out.println("division="+(number1/number2) );


   public  static void Substraction (int number1, int number2){
     System.out.println("Substraction="+(number1-number2));
   }
   public  static void Multiplicatiion (int number1, int number2){
     System.out.println("Multiplication="+(number1*number2));

   }
}