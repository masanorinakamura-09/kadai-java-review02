
public class Review02 {

    public static void main(String[] args) {
        for(int i=1;i<=100;i++) {
        switch (casei(i)) {
        case 0:
            System.out.println("FizzBuzz");
            break;

        case 1:
            System.out.println("Fizz");
            break;

        case 2:
            System.out.println("Buzz");
            break;

        case 3:
            System.out.println(i);
            break;
        }
        }

    }

    public static int casei(int i) {
        if(i%3==0&&i%5==0) {
            i=0;
        }else if(i%3==0) {
            i=1;
        }else if(i%5==0) {
            i=2;
        }else {
            i=3;
        }
        return i;
    }

}
