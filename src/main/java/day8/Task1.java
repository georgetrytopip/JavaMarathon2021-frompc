package day8;

public class Task1 {
    public static void main(String[] args) {

        int a = 0;
        String d = " ";
        StringBuilder sb = new StringBuilder(a);
        while (a <= 2000){
            sb.append(d).append(a);
            a++;
        }
        System.out.println(sb.toString());
    }
}
