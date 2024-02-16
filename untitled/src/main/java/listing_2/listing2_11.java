package listing_2;

public class listing2_11 {
    public static void main(String[] args){
        int count = 1;
        System.out.println("count = " + count);
        {

            //int count = 2;
            System.out.println("Первый независимый блок: count = " + count);

            int n = 3;
            System.out.println("Первый неизависимый блок: n = " + n);
        }
        {
            int n = 5;
            System.out.println("Второй неизависимый блок: n = " + n);

        }
    }
}
