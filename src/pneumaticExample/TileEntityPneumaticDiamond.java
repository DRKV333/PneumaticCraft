package pneumaticExample;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.common.util.ForgeDirection;
import pneumaticCraft.api.tileentity.AirHandlerSupplier;
import pneumaticCraft.api.tileentity.IAirHandler;
import pneumaticCraft.api.tileentity.IPneumaticMachine;

public class TileEntityPneumaticDiamond extends TileEntity implements IPneumaticMachine{
    private IAirHandler airHandler;

    @Override
    public IAirHandler getAirHandler(){
        if(airHandler == null) airHandler = AirHandlerSupplier.getAirHandler(5, 7, 50, 2000);
        return airHandler;
    }

    @Override
    public boolean isConnectedTo(ForgeDirection side){
        return side != ForgeDirection.UP;
    }

    @Override
    public void updateEntity(){
        getAirHandler().updateEntityI();
    }

    @Override
    public void writeToNBT(NBTTagCompound tag){
        super.writeToNBT(tag);
        getAirHandler().writeToNBTI(tag);
    }

    @Override
    public void readFromNBT(NBTTagCompound tag){
        super.readFromNBT(tag);
        getAirHandler().readFromNBTI(tag);
    }

    @Override
    public void validate(){
        super.validate();
        getAirHandler().validateI(this);
    }

}
