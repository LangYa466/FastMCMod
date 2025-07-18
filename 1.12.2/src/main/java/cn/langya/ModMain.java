package cn.langya;

import net.minecraftforge.fml.common.Mod;
import org.lwjgl.opengl.Display;

@Mod(modid = Client.name)
public class ModMain {
    public ModMain() {
        // test
        Display.setTitle(Client.name);
    }
}
