package betteragriculture.blocks;

import betteragriculture.Main;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class LargeTileColorBlock extends Block {

	public LargeTileColorBlock(String unlocalizedName, Material material, float hardness, float resistance) {
		super(material);
		this.setUnlocalizedName(unlocalizedName);
	    this.setCreativeTab(Main.tab);
		this.setHardness(hardness);
		this.setResistance(resistance);
	}

	public LargeTileColorBlock(String unlocalizedName, float hardness, float resistance) {
		this(unlocalizedName, Material.ROCK, hardness, resistance);
	}

	public LargeTileColorBlock(String unlocalizedName, Material rock, Block whitesidingBlock, int i, int j) {
		this(unlocalizedName, 2.0f, 10.0f);
	}
}