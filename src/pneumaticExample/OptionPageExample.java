package pneumaticExample;

import net.minecraft.client.gui.GuiButton;
import pneumaticCraft.api.client.pneumaticHelmet.IGuiScreen;
import pneumaticCraft.api.client.pneumaticHelmet.IOptionPage;

public class OptionPageExample implements IOptionPage{

    @Override
    public String getPageName(){
        return "Example Options";
    }

    @Override
    public void initGui(IGuiScreen gui){}

    @Override
    public void actionPerformed(GuiButton button){}

    @Override
    public void drawScreen(int x, int y, float partialTicks){}

    @Override
    public void keyTyped(char ch, int key){}

}
