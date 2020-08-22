public class Driver {

    public static void main(String[] args) {

        // Exercise 1

        ArrayStack arrayd = new ArrayStack(); //creates instance of ArrayStack
        LinkedStack linkd = new LinkedStack(); //creates instance of LinkedStack

        //pushes ints from assignment onto instanced array stack
        arrayd.push(1);
        arrayd.push(7);
        arrayd.push(3);
        arrayd.push(4);
        arrayd.push(9);
        arrayd.push(2);

        //pushes ints from assignment onto instanced linked stack
        linkd.push(1);
        linkd.push(7);
        linkd.push(3);
        linkd.push(4);
        linkd.push(9);
        linkd.push(2);

        //popping off each int from array stack, displaying each number
        while (arrayd.size() > 0) {
            System.out.println(arrayd.pop());
        }
        System.out.println("");

        //popping off each int from linked stack, displaying each number
        while (linkd.size() > 0) {
            System.out.println(linkd.pop());
        }

        //Exercise 2

        //pushing linked stack for Exercise 2
        linkd.push(1);
        linkd.push(7);
        linkd.push(3);
        linkd.push(4);
        linkd.push(9);
        linkd.push(2);

        linkd.removeBottomHalf();
    }
}
