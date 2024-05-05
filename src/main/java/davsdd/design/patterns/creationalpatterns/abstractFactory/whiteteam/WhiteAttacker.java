package davsdd.design.patterns.creationalpatterns.abstractFactory;

public class WhiteAttacker implements IAttackers {

    public WhiteAttacker(int count){
        System.out.println("White attacker count: " + count);
    }

    @Override
    public void make() {
        System.out.println("WhiteAttacker: attacked!");
    }

    @Override
    public void accept(IProtectors protector) {
        System.out.println("WhiteAttacker: accepted -> " + protector.getClass().getSimpleName());
    }
}
