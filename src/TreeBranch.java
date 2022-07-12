public class TreeBranch {
    private int value;
    private TreeBranch rightBranch;
    private TreeBranch leftBranch;

    TreeBranch() {
        rightBranch = null;
        leftBranch = null;
    }

    public void setValue(int value) {
        this.value = value;
    }
    public int getValue() {
        return this.value;
    }
    public void addChild(int value) {
        if(value > this.value) {
            if(rightBranch == null) {
                rightBranch = new TreeBranch();
                rightBranch.setValue(value);
            } else
                rightBranch.addChild(value);
        } else if(value < this.value) {
            if(leftBranch == null) {
                leftBranch = new TreeBranch();
                leftBranch.setValue(value);
            } else
                leftBranch.addChild(value);
        }
    }

    public TreeBranch getRightChild() {
        return this.rightBranch;
    }

    public TreeBranch getLeftChild() {
        return this.leftBranch;
    }

    public void setRightChild(TreeBranch treeBranch) { this.rightBranch = treeBranch; }

    public void setLeftChild(TreeBranch treeBranch) { this.leftBranch = treeBranch; }
}
