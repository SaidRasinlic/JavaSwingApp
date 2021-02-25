package ponavljanje;

import java.util.Base64;

public final class JavaVolTwo {
    static String surname;
    int age;
final String name = "Said";
    public static void main(String[] args) {

        String str = "Said is the greatest";

        String basic64 = Base64.getEncoder().encodeToString(str.getBytes());

        System.out.println(basic64);

        String encoded = "U2FpZCBpcyB0aGUgZ3JlYXRlc3Q=";

        byte[] decoder = Base64.getDecoder().decode(encoded);
  
        String str2 = new String(decoder);

        System.out.println(str2);

        String said = "Said";
        String said1 = "Said";
        String said3 = new String("Said");
        System.out.println(said.equals(said1));
        System.out.println(said == said1);
        System.out.println(said.equals(said3));
        String said4 = new String("Said");
        System.out.println(said==said3);
        System.out.println(said3==said4);
        
       byte byt =127;
        
        
    }
}

class Clazz{
    public static void main(String[] args) {
        
        JavaVolTwo vol2 = new JavaVolTwo();
        
        vol2.age=10;
        System.out.println(vol2.age);
        System.out.println(vol2.name);
        
    }
}