package davsdd.design.patterns.creationalpatterns.abstractFactory;

public class BlackProtector implements IProtectors{

    public BlackProtector(int count) {
        System.out.println("BlackProtectors count: " + count);
    }

    @Override
    public void make() {
        System.out.println("BlackProtector: protected the server!");
    }

}
