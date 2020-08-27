package day02;

//1 ~ 10 사이의 어떤 수로도 나누어 떨어지는 가장 작은 수는 2520입니다.
//
//    그러면 1 ~ 20 사이의 어떤 수로도 나누어 떨어지는 가장 작은 수는 얼마입니까?

public class Problem05 {

  public static void main(String[] args) {

    int number = 20;
    boolean flag = true;

    while (flag) {
      number++;
      for (int operand = 1; operand <= 20; ++operand) {
        if (number % operand == 0) {
          flag = false;
        } else {
          flag = true;
          break;
        }
      }
    }
    System.out.println(number);
  }
}
