package davsdd.design.patterns.creationalpatterns.abstractFactory;


public class BlackTeam extends Team {

    @Override
    protected IAttackers createAttackers(int count) {
        return new BlackAttacker(count);
    }

    @Override
    protected IProtectors createProtectors(int count) {
        return new BlackProtector(count);
    }
}
