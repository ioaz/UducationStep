package Stack;

/**
 * Created by ioa on 16.04.17.
 */
class Stack {
    int[] stck = new int[10];
    int tos;

    Stack() {
        tos = -1;
    }

    void push(int item) {
        if (tos == 9)
            System.out.println("zpolnen");
        else
            stck[++tos] = item;
    }

    int pop() {
        if (tos < 0) {
            System.out.println("nr zagruzhen");
            return 0;
        }
        else
            return stck[tos--];
    }
}

class testStack{
    public static void main(String[] args) {
        Stack mystack1 = new Stack();
        Stack mystack2 = new Stack();

        for (int i = 0; i < 10; i++)
            mystack1.push(i);
        for (int i = 10; i < 20; i++)
            mystack2.push(i);

        System.out.println();

        for (int i = 0; i < 10; i++)
            System.out.println(mystack1.pop());
        for (int i = 0; i < 10; i++)
            System.out.println(mystack2.pop());

    }
}
