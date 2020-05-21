package exmple.designpatterns.structural.decorator;

public abstract class TreeDecorator implements ChristmasTree {
    private ChristmasTree tree;

    public TreeDecorator(ChristmasTree decoratedTree) {
        tree = decoratedTree;
    }

    // standard constructors
    @Override
    public String decorate() {
        return tree.decorate();
    }
}