package davsdd.design.patterns.creationalpatterns.abstractFactory.blackteam.blackmembers;

import davsdd.design.patterns.creationalpatterns.abstractFactory.whiteteam.whitemembers.IProtectors;

public interface IAttackers {
    void make();
    void accept(IProtectors whiteMember);
}
