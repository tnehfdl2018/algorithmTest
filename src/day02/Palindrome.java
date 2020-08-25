package day02;

//앞에서부터 읽을 때나 뒤에서부터 읽을 때나 모양이 같은 수를 대칭수(palindrome)라고 부릅니다.
//
//    두 자리 수를 곱해 만들 수 있는 대칭수 중 가장 큰 수는 9009 (= 91 × 99) 입니다.
//
//    세 자리 수를 곱해 만들 수 있는 가장 큰 대칭수는 얼마입니까?

public class Palindrome {

  public static void main(String[] args) {
    int fOperand = 0;
    int sOperand = 0;
    int lastValue = 0;
    int value;
    String reverseValue;

    for (int oIndex = 100; oIndex < 1000; oIndex++) {
      for (int iIndex = 100; iIndex < 1000; iIndex++) {
        value = oIndex * iIndex;

        reverseValue = new StringBuffer(String.valueOf(value)).reverse().toString();

        if (lastValue < value) {
          if (reverseValue.equals(String.valueOf(value))) {
            lastValue = value;
            fOperand = oIndex;
            sOperand = iIndex;
          }
        }
      }
    }
    System.out.println(fOperand + " X " + sOperand + " = " + lastValue);
  }
}
