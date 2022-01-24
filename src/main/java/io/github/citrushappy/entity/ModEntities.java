package io.github.citrushappy.entity;

import io.github.citrushappy.CitrusThings;
import io.github.citrushappy.client.renderer.entity.RendererBakaMitaiCreeper;
import io.github.citrushappy.client.renderer.entity.RendererCrewMate;
import io.github.citrushappy.util.Reference;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.init.Biomes;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModEntities {

    public static void init()
    {
        int id = 1;
        EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID, "crewmate"), EntityCrewMate.class, "crewmate", id++, CitrusThings.instance, 30, 1, true,  16731716, 16777215);
        EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID, "bakamitai_creeper"), EntityBakaMitaiCreeper.class, "bakamitai_creeper", id++, CitrusThings.instance, 30, 1, true,  60474, 18490);

        EntityRegistry.addSpawn(EntityCrewMate.class, 100, 8,8, EnumCreatureType.CREATURE, Biomes.HELL, Biomes.PLAINS, Biomes.FOREST);
        EntityRegistry.addSpawn(EntityBakaMitaiCreeper.class, 100, 1,2,EnumCreatureType.MONSTER, Biomes.PLAINS);
    }

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        RenderingRegistry.registerEntityRenderingHandler(EntityCrewMate.class, RendererCrewMate::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityBakaMitaiCreeper.class, RendererBakaMitaiCreeper::new);
    }
}
