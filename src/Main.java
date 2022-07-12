import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//        Добавление элементов в дерево
        Bst tree = new Bst(14);
        tree.add(11);
        tree.add(10);
        tree.add(5);
        tree.add(7);
        tree.add(6);
        tree.add(8);
        tree.add(3);
        tree.add(4);
        tree.add(1);
        tree.add(16);
        tree.add(13);
        tree.add(7);
        tree.add(12);
        tree.add(15);
        tree.add(25);
        tree.add(17);
        tree.add(26);

//        Двоичный поиск
        TreeBranch branch = tree.findBranch(14,false);
        if(branch != null) {
            System.out.println("Значение элемента: "+branch.getValue());
            if(branch.getRightChild() != null)
                System.out.println("Значение правого потомка: "+branch.getRightChild().getValue());
            if(branch.getLeftChild() != null)
                System.out.println("Значение левого потомка: "+branch.getLeftChild().getValue());
        }

//        Удалние элемента
//        tree.removeBranch(5);

        System.out.println("Конец");
    }
}