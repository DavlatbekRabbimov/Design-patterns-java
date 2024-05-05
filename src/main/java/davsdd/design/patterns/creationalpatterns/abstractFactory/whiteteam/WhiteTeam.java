package davsdd.design.patterns.creationalpatterns.abstractFactory;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class WhiteTeam extends Team {

    @Override
    protected IAttackers createAttackers(int count) {
        return new WhiteAttacker(count);
    }

    @Override
    protected IProtectors createProtectors(int count) {
        return new WhiteProtector(count);
    }
}
