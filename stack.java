import java.util.Scanner;

public class stack {

    int max = 100;
    int s[] = new int[max];
    int top = -1;

    void push(int ele) {
        if (top == max - 1)
            System.out.println("stack overflow");
        else
            s[++top] = ele;
    }

    int pop() {
        int z = 0;
        if (top == -1)
            System.out.println("stack underflow");
        else
            z = s[top--];
        return z;
    }

    void display() {
        if (top == -1)
            System.out.println("stack is empty");
        else
            for (int i = top; i > -1; i--)
                System.out.println("The stack element are" + " " + s[i] + " ");
    }

    public static void main(String[] args) {
        int g = -1;
        stack m = new stack();
        System.out.println("program to perfome stack opretion");
        Scanner sc = new Scanner(System.in);
        while (g != 0) {
            System.out.println("Enter. 1push 2pop 3display 4exit");
            System.out.println("Enter your choice");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter element to be insertrecord");
                    int ele = sc.nextInt();
                    m.push(ele);
                    break;

                case 2:
                    int popele;
                    popele = m.pop();
                    System.out.println("The poped element are");
                    System.out.println("poped" + " ");
                    break;

                case 3:
                    System.out.println("Element in the stack are" + " ");
                    m.display();
                    break;

                case 4:
                    g = 0; {
                    sc.close();
                }

            }
        }

    }

}
