package party.lemons.simpleteleporters.init;

import net.minecraft.block.Block;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.Identifier;

import java.util.function.Consumer;
import java.util.function.Supplier;

import party.lemons.simpleteleporters.block.entity.TeleporterBlockEntity;
import static party.lemons.simpleteleporters.SimpleTeleporters.MODID;

public class SimpleTeleportersBlockEntities
{
	public static BlockEntityType<TeleporterBlockEntity> TELE_BE;

	public static void init()
	{
		TELE_BE = registerBlockEntityType("teleporter", TeleporterBlockEntity::new, SimpleTeleportersBlocks.TELEPORTER);
	}

	public static BlockEntityType registerBlockEntityType(String name, Supplier<BlockEntity> be, Block... blocks)
	{
		return Registry.register(Registry.BLOCK_ENTITY, new Identifier(MODID, name), BlockEntityType.Builder.create(be, blocks).build(null)); // build == method_11034
	}
}
