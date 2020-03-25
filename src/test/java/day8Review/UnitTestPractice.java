package day8Review;

public class UnitTestPractice {
    public static void main(String[] args) {
      String expected = "cbav";
      String toReverse ="abc";
      String actual = reverseString(toReverse);
      verifyEquals(actual, expected);

    }
    public static boolean verifyEquals(String expected, String actual){
        if (expected.endsWith(actual)){
            System.out.println("Test passed");
            return true;
        } else {
            System.out.println("Test Failed");
            System.out.println("expected: " + expected );
            System.out.println("actual : "+ actual);

        }
        return false;

    }


    public static String reverseString (String str){
        String reversed = "";
        for (int i = str.length()-1; i >=0 ; i--) {
            reversed+= str.charAt(i);

        }
        return reversed;
    }
}
