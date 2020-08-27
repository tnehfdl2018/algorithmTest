package day03;

//10 이하의 소수를 모두 더하면 2 + 3 + 5 + 7 = 17 이 됩니다.
//
//    이백만(2,000,000) 이하 소수의 합은 얼마입니까?

public class Problem10 {

  public static void main(String[] args) {

    int sum = 0;
    boolean flag;

    for (int oIndex = 2; oIndex < 2000000; oIndex++) {
      flag = true;
      for (int iIndex = 2; iIndex < oIndex; iIndex++) {
        if (oIndex % iIndex == 0) {
          flag = false;
          break;
        }
      }
      if (flag) {
        System.out.print(oIndex+ "  ");
        sum += oIndex;
      }
    }
    System.out.println("");
    System.out.println(sum);
  }
}
