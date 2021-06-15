/**
 * kadai 09-02
 *
 * @author haruna wataru
 * @version 2021-06-15
 */

import com.sun.japan.edu.labs.CheckData;

class UsePackage
{
  public static void main(String args[]) {
    int num[] = {-1, 2, -50, 100};
    for (int i = 0; i < num.length; i++) {
      System.out.printf(
        "%d is a %s number\n",
        num[i],
        CheckData.checkNumber(num[i]) ? "positive" : "negative"
      );
    }
  }
}


