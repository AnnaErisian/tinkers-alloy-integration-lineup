package blue.thejester.tail.modules;

import blue.thejester.tail.Tail;
import slimeknights.tconstruct.library.materials.Material;

import java.util.LinkedHashSet;
import java.util.Set;

public interface IModule {

    Set<IModule> modules = new LinkedHashSet();

    void init();

    void initLate();

    default void setRenderInfo(Material mat, int color) {
        if(!Tail.proxy.isDedicatedServer()) {
            mat.setRenderInfo(color);
        }
    }

}
