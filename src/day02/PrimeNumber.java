package day02;

//소수를 크기 순으로 나열하면 2, 3, 5, 7, 11, 13, ... 과 같이 됩니다.
//
//    이 때 10,001번째의 소수를 구하세요.

public class PrimeNumber {

  public static void main(String[] args) {
    int operand = 4;
    int count = 3;

   for (int index = 1; count < 10001; index++) {
     if (operand % index != 0) {
       count++;
     }
     operand++;
     System.out.println(index);
   }

    System.out.println("소수 : " + operand);
    System.out.println("순서 : " + count);
  }
}
