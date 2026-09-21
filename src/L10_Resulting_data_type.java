public class L10_Resulting_data_type {
    static void main(String[] args) {
        /*
        byte x = 5;
        int y = 6;
        short z = 8;
        int a = y + z;
        float b = 6.54f + x;
        System.out.println(b);
         */

        // INCREMENT AND DECREMENT OPERATORS
        int i = 56;
        // int b = i++; //first b is assigned i (56) then i is incremented
        int j = 67;
        int c = ++j; //first j is incremented then c is assigned j (68)
        System.out.println(i++);
        System.out.println(i);
        System.out.println(++i);
        System.out.println(i);

        //QUICK QUIZ
        int y = 7;
        int x = ++y * 8;
        System.out.println(x);
        char ch = 'a';
        System.out.println(++ch);
    }
}
