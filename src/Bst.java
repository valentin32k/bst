public class Bst {
    private TreeBranch root;

    Bst(int rootValue) {
        root = new TreeBranch();
        this.root.setValue(rootValue);
    }

    public void add(int value) {
        this.root.addChild(value);
    }

    public TreeBranch findBranch(int value, boolean wantParrent) {
//        Поиск элемента в дереве.
//        Если элемент есть, возвращает указатель на него. Иначе - null
//        Если wantParrent = false, вернет ссылку на текущий элемент, иначе на его родителя
        TreeBranch tmpBranch = root;
        TreeBranch tmpParrent = null;
        while ((tmpBranch != null) && (tmpBranch.getValue() != value)) {
            tmpParrent = tmpBranch;
            if(value > tmpBranch.getValue())
                tmpBranch = tmpBranch.getRightChild();
            else if (value < tmpBranch.getValue())
                tmpBranch = tmpBranch.getLeftChild();
        }
        if(wantParrent)
            tmpBranch = tmpParrent;
        return tmpBranch;
    }

/*    public void removeBranch(int value) {
        TreeBranch tmpParrent, tmpCurrent = null, tmpNew, tmpNewParr = null;
        boolean isRightChildDeleting;
        tmpParrent = findBranch(value,true);
        if(tmpParrent == null) {
            root = null;
            return;
        } else if (value > tmpParrent.getValue()) {
            tmpCurrent = tmpParrent.getRightChild();
            isRightChildDeleting = true;
        }
        else {
            tmpCurrent = tmpParrent.getLeftChild();
            isRightChildDeleting = false;
        }

//        Ищем замену
        if(tmpCurrent.getRightChild() != null) {
//            Если правый потомок есть
            tmpNew = tmpCurrent.getRightChild();
            while (tmpNew.getLeftChild() != null) {
                tmpNewParr = tmpNew;
                tmpNew = tmpNew.getLeftChild();
            }
            if(isRightChildDeleting*//*tmpParrent.getValue() < tmpCurrent.getValue()*//*) { tmpParrent.setRightChild(tmpNew); }
            else { tmpParrent.setLeftChild(tmpNew); }
            tmpNew.setLeftChild(tmpCurrent.getLeftChild());
            tmpNew.setRightChild(tmpCurrent.getRightChild());
            tmpNewParr.setLeftChild(null);

        } else {
//            Если у текущего элемента нет правого потомка
            if(isRightChildDeleting *//*tmpParrent.getValue() < tmpCurrent.getValue()*//*)
                tmpParrent.setRightChild(tmpCurrent.getLeftChild());
            else tmpParrent.setLeftChild(tmpCurrent.getLeftChild());

        }

    }*/

}
