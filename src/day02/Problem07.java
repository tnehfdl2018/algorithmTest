package day02;

//소수를 크기 순으로 나열하면 2, 3, 5, 7, 11, 13, ... 과 같이 됩니다.
//
//    이 때 10,001번째의 소수를 구하세요.

public class Problem07 {

  public static void main(String[] args) {
    int count = 0;
    int primary = 0;

    for (int oIndex = 2; count < 10001; oIndex++) {
      int ckPrimary = 0;
      for (int Iindex = 2; Iindex < oIndex; Iindex++) {
        if (oIndex % Iindex == 0) {
          break;
        }
        ckPrimary++;
      }
      if (ckPrimary == oIndex-2) {
        primary = oIndex;
        count++;
      }
    }
    System.out.println(count + "번째의 소수는 " + primary);



//    int operand = 4;
//    int count = 3;


//    for (int operand = 0; operand <  )


//   for (int index = 2; count < 10001; index++) {
//     if (operand % index != 0) {
//       count++;
//     }
//     operand++;
//     System.out.println(index);
//   }
//
//    System.out.println("소수 : " + operand);
//    System.out.println("순서 : " + count);
  }
}
