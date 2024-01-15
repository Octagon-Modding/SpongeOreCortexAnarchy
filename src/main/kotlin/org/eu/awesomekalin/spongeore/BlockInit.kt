package org.eu.awesomekalin.spongeore

import xyz.xenondevs.nova.addon.registry.BlockRegistry
import xyz.xenondevs.nova.initialize.Init
import xyz.xenondevs.nova.initialize.InitStage.PRE_PACK
import org.eu.awesomekalin.spongeore.SpongeOre
import xyz.xenondevs.nova.item.options.BlockOptions
import xyz.xenondevs.nova.item.tool.VanillaToolCategories
import xyz.xenondevs.nova.item.tool.VanillaToolTiers
import xyz.xenondevs.nova.world.block.sound.SoundGroup
import org.bukkit.Material

@Init(stage = PRE_PACK)
object BlockInit: BlockRegistry by SpongeOre.registry {
    // Block Options
    private val SPONGE_COAL = BlockOptions(2.0, VanillaToolCategories.HOE, VanillaToolTiers.WOOD, true, SoundGroup.STONE, Material.SPONGE)

    // Register blocks
    val SPONGE_COAL_ORE = block("sponge_coal_ore").blockOptions(SPONGE_COAL).register()
}