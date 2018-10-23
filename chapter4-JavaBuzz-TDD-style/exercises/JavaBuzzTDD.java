

public class JavaBuzzTDD {
    public static void main(String[] args) {
        for(int n = 1; n < 101; n++){
            System.out.println(check(n));

        }
    }



        public static String check (int n){

            { if (n % 15 == 0) {
            return "JavaBuzz";
            } else if (n % 3 == 0) {
            return "Java";
            } else if (n % 5 == 0) {
            return "Buzz";
            } else return Integer.toString(n);
    }
    }
}