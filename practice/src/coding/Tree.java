package coding;
class Tree {
    void print () {System.out.println("Tree");}

    public static void main(String args[]) {
        Tree[] a = new Tree[3];
        a[0] = new Tree();
        a[1] = new Banyan();
        a[2] = new Peepal();
        for (int i=0; i<a.length; i++) {
            ((Tree)a[i]).print();
        }
    }

};

class Banyan extends Tree {
    void print () {System.out.println("Banyan");}
};

class Peepal extends Tree {
    void print () {System.out.println("Peepal");}
};