package day01;

//  어떤 수를 소수의 곱으로만 나타내는 것을 소인수분해라 하고, 이 소수들을 그 수의 소인수라고 합니다.
//    예를 들면 13195의 소인수는 5, 7, 13, 29 입니다.
//
//    600851475143의 소인수 중에서 가장 큰 수를 구하세요.

public class APrimeFactor {
  public static void main(String[] args) {

    long number = 0;

    for (long i = 2; i < 600851475143L; i++) {
      if (600851475143L % i != 0) {
        number = i;
      }
    }
//    for (long i = 600851475143L; i > 0; --i) {
//      if (600851475143L % i != 0) {
//        number = i;
//      }
//    }
    System.out.println(number);
  }
}


