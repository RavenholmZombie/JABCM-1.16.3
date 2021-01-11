package rz.mod.jabcm.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.monster.*;
import net.minecraft.entity.passive.horse.SkeletonHorseEntity;
import net.minecraft.entity.passive.horse.ZombieHorseEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.common.ToolType;
import rz.mod.jabcm.JABCMConfig;

public class RainbowSlab extends SlabBlock
{
    public RainbowSlab(Properties properties)
    {
        super(Block.Properties.create(Material.ROCK)
                .sound(SoundType.STONE)
                .harvestLevel(0)
                .harvestTool(ToolType.PICKAXE)
        );
    }

    public void onEntityWalk(World world, BlockPos pos, Entity entity)
    {
        if(JABCMConfig.COMMON.rainbowConcreteEffects.get() == true)
        {
            if(entity instanceof PlayerEntity)
            {
                ((PlayerEntity) entity).addPotionEffect(new EffectInstance(Effects.SPEED, 10, 3, true, false));
                ((PlayerEntity) entity).addPotionEffect(new EffectInstance(Effects.STRENGTH, 5000, 3, true, false));
                ((PlayerEntity) entity).addPotionEffect(new EffectInstance(Effects.JUMP_BOOST, 10, 1, true, false));
                ((PlayerEntity) entity).setHealth(100F);
            }else if(entity instanceof MobEntity)
            {
                ((MobEntity) entity).addPotionEffect(new EffectInstance(Effects.INSTANT_DAMAGE, 10, 10, true, false));
            }
            if(entity instanceof ZombieEntity)
            {
                ((ZombieEntity) entity).addPotionEffect(new EffectInstance(Effects.INSTANT_HEALTH, 10, 10, true, false));
            }
            if(entity instanceof SkeletonEntity)
            {
                ((SkeletonEntity) entity).addPotionEffect(new EffectInstance(Effects.INSTANT_HEALTH, 10, 10, true, false));
            }
            if(entity instanceof ZombieHorseEntity)
            {
                ((ZombieHorseEntity) entity).addPotionEffect(new EffectInstance(Effects.INSTANT_HEALTH, 10, 10, true, false));
            }
            if(entity instanceof WitherSkeletonEntity)
            {
                ((WitherSkeletonEntity) entity).addPotionEffect(new EffectInstance(Effects.INSTANT_HEALTH, 10, 10, true, false));
            }
            if(entity instanceof SkeletonHorseEntity)
            {
                ((SkeletonHorseEntity) entity).addPotionEffect(new EffectInstance(Effects.INSTANT_HEALTH, 10, 10, true, false));
            }
            if(entity instanceof SlimeEntity)
            {
                ((SlimeEntity) entity).addPotionEffect(new EffectInstance(Effects.INSTANT_DAMAGE, 10, 10, true, false));
            }
            if(entity instanceof MagmaCubeEntity)
            {
                ((MagmaCubeEntity) entity).addPotionEffect(new EffectInstance(Effects.INSTANT_DAMAGE, 10, 10, true, false));
            }
            if(entity instanceof StrayEntity)
            {
                ((StrayEntity) entity).addPotionEffect(new EffectInstance(Effects.INSTANT_HEALTH, 10, 10, true, false));
            }
            if(entity instanceof PhantomEntity)
            {
                ((PhantomEntity) entity).addPotionEffect(new EffectInstance(Effects.INSTANT_DAMAGE, 10, 10, true, false));
            }
        }
    }
}
