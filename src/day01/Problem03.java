package day01;

//  어떤 수를 소수의 곱으로만 나타내는 것을 소인수분해라 하고, 이 소수들을 그 수의 소인수라고 합니다.
//    예를 들면 13195의 소인수는 5, 7, 13, 29 입니다.
//
//    600851475143의 소인수 중에서 가장 큰 수를 구하세요.

public class Problem03 {
  public static void main(String[] args) {

    int count = 0;
    int number = 0;

    for (long oIndex = 2; oIndex < 13195; oIndex++) {
      int ckPrimary = 0;
      for (long Iindex = 2; Iindex < oIndex; Iindex++) {
        if (oIndex % Iindex == 0) {
          break;
        }
        ckPrimary++;
      }
      if (ckPrimary == oIndex - 2) {
        number = (int)oIndex;
        count++;
      }
    }
    System.out.println("가장 큰 소인수 : " + number);
  }
}


