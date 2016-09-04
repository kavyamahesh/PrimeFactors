import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Kavya on 9/4/2016.
 */
public class Primefactors {
    public int read() {
        String inputline = null;
        try {
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
            inputline = is.readLine();
        } catch (IOException e) {
            System.out.println("IOException:" + e);
        }
        return Integer.parseInt(inputline);
    }

    public static void main(String[] args) {
        Primefactors pf=new Primefactors();
        System.out.println("Enter the number");
        int number=pf.read();
        pf.factors(number);

    }

    public void factors(int n){
        while(n%2==0){
            System.out.println("2");
            n=n/2;
        }
        for(int i=3;i<=Math.sqrt(n);i=i+2){
            while(n%i==0){
                System.out.println(i);
                n=n/i;
            }
        }
        if(n>2){
            System.out.println(n);
        }

    }

}
