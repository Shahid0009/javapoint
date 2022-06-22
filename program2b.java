import java.util.Scanner;
import java.util.StringTokenizer;

public class program2b {
    String name;
    String date;

    public void read() {
        try (Scanner input = new Scanner(System.in)) {
            name = input.next();
            date = input.next();
        }

    }

    public void display() {
        System.out.println("Name"+name + ",");
        String delims = "/";
        StringTokenizer st = new StringTokenizer(date, delims);
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken() + ",");
        }
        System.out.println();

    }

    public static void main(String[] args) {
        System.out.println("Enter customer details");
        program2b[] customer = new program2b[30];
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number of customer");
            int n = sc.nextInt();
            System.out.println("Enter customer name and date");
            for (int i = 0; i < n; i++) {
                customer[i] = new program2b();
                customer[i].read();

            }
            for (int i = 0; i < n; i++) {
                customer[i].display();
            }
        }
    }
}
