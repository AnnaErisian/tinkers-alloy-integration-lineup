package blue.thejester.tail.modules;

import java.util.LinkedHashSet;
import java.util.Set;

public interface IModule {

    Set<IModule> modules = new LinkedHashSet();
    void init();

}
