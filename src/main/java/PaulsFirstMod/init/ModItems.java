package PaulsFirstMod.init;

import PaulsFirstMod.items.ItemBase;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ModItems {

	public static ItemBase cheese = new ItemBase("cheese").setCreativeTab(CreativeTabs.MATERIALS);
	public static void register(IForgeRegistry<Item> registry) {
		registry.registerAll(
				cheese
		);
	}
	
	public static void registerModels() {
		cheese.registerItemModel();
	}

}
