package davsdd.design.patterns.creationalpatterns.abstractFactory;

public class BlackAttacker implements IAttackers {

    public BlackAttacker(int count){
        System.out.println("BlackAttackers count: " + count);
    }

    @Override
    public void make() {
        System.out.println("BlackAttacker: attacked the server!");
    }

    @Override
    public void accept(IProtectors protector) {
        System.out.println("BlackAttacker: accept -> " + protector.getClass().getSimpleName());
    }
}
