/*
  @author   ${USER}
  @project   ${PROJECT_NAME}
  @class  ${NAME}
  @version  1.0.0
  @since ${DATE} - ${HOUR}.${MINUTE}
*/

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        // 8 primitive types in java
        // byte +-127
        byte myAge = 22; // +-127
        System.out.println(" My age is " + age + " years.");

        // short 2^16 ~ 65000
        short year = 2021;
        System.out.println(" We have " + year + " year now.");

        // int 2^32 ~ 2 000 000 000
        int salary = 100_000;
        System.out.println(" My salary is " + salary + "$ a month.");

        // long 2^64
        long population = 7_000_000_000l;
        System.out.println(" Global population is about " + population + " humans.");

        // float
        float height = 185.5f;
        System.out.println(" My height is " + height + " cms.");

        // double 2.4444444444444444444444
        double weight = 95.9;
        System.out.println(" My weight is " + weight + " kgs.");

        //char
        char sign = 'K';
        System.out.println(" the first letter of my surname is " + sign);

        //boolean true/false
        boolean abcd = true;
        System.out.println(" Today it is the 1st of March. It is" + abcd);

        //string
        String str = "Hello Java";
        System.out.println(str);

        // 2 * 2 = 4 "Сколько будет 2 * 2 = 4?" 1 - True  0 - False
        // 10 * 10 = 100  (2 + 2 = 100) двоичный код
    }
}
