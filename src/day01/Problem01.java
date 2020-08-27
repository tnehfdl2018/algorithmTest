package day01;

//10보다 작은 자연수 중에서 3 또는 5의 배수는 3, 5, 6, 9 이고, 이것을 모두 더하면 23입니다.
//
//    1000보다 작은 자연수 중에서 3 또는 5의 배수를 모두 더하면 얼마일까요?

public class Problem01 {

  public static void main(String[] args) {
    int sum = 0;

    for (int index = 1; index < 1000; index++) {
      if (index % 3 == 0 || index % 5 == 0) {
        sum += index;
        System.out.println("인덱스 : " + index);
      }
    }
    System.out.println("총합 : " + sum);
  }
}
