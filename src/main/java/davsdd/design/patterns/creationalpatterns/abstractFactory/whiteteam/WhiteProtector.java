package davsdd.design.patterns.creationalpatterns.abstractFactory;

public class WhiteProtector implements IProtectors {

    public WhiteProtector(int count){
        System.out.println("White protector count: " + count);
    }

    @Override
    public void make() {
        System.out.println("WhiteProtector: protected!");
    }
}
