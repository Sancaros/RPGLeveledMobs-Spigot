package iomatix.spigot.rpgleveledmobs.spawnsController;

import java.util.HashMap;

import org.bukkit.entity.EntityType;

import iomatix.spigot.rpgleveledmobs.logging.LogsModule;
import iomatix.spigot.rpgleveledmobs.tools.Language;

public class MobNamesMap {
private static HashMap<Language, HashMap<EntityType, String>> languageMapping;
    
    public static String getMobName(final Language lang, final EntityType mobType) {
        return MobNamesMap.languageMapping.get(lang).get(mobType);
    }
    
    static {
    	MobNamesMap.languageMapping = new HashMap<Language, HashMap<EntityType, String>>();
        for (final Language lang : Language.values()) {
        	MobNamesMap.languageMapping.put(lang, new HashMap<EntityType, String>());
        }
        try {
            MobNamesMap.languageMapping.get(Language.POLISH).put(EntityType.BAT, "Nietoperz");
            MobNamesMap.languageMapping.get(Language.POLISH).put(EntityType.BLAZE, "P�omyk");
            MobNamesMap.languageMapping.get(Language.POLISH).put(EntityType.CAVE_SPIDER, "Paj�k Jaskiniowy");
            MobNamesMap.languageMapping.get(Language.POLISH).put(EntityType.CHICKEN, "Kurczak");
            MobNamesMap.languageMapping.get(Language.POLISH).put(EntityType.COW, "Krowa");
            MobNamesMap.languageMapping.get(Language.POLISH).put(EntityType.CREEPER, "Creeper");
            MobNamesMap.languageMapping.get(Language.POLISH).put(EntityType.DONKEY, "Osio�");
            MobNamesMap.languageMapping.get(Language.POLISH).put(EntityType.ELDER_GUARDIAN, "Starszy Stra�nik");
            MobNamesMap.languageMapping.get(Language.POLISH).put(EntityType.ENDER_DRAGON, "Smok");
            MobNamesMap.languageMapping.get(Language.POLISH).put(EntityType.ENDERMAN, "Enderman");
            MobNamesMap.languageMapping.get(Language.POLISH).put(EntityType.ENDERMITE, "Endermite");
            MobNamesMap.languageMapping.get(Language.POLISH).put(EntityType.EVOKER, "Przywo�ywacz");
            MobNamesMap.languageMapping.get(Language.POLISH).put(EntityType.GHAST, "Ghast");
            MobNamesMap.languageMapping.get(Language.POLISH).put(EntityType.GIANT, "Olbrzym");
            MobNamesMap.languageMapping.get(Language.POLISH).put(EntityType.GUARDIAN, "Stra�nik");
            MobNamesMap.languageMapping.get(Language.POLISH).put(EntityType.HORSE, "Ko�");
            MobNamesMap.languageMapping.get(Language.POLISH).put(EntityType.HUSK, "Posuch");
            MobNamesMap.languageMapping.get(Language.POLISH).put(EntityType.IRON_GOLEM, "Golem");
            MobNamesMap.languageMapping.get(Language.POLISH).put(EntityType.MAGMA_CUBE, "Kostka Magmy");
            MobNamesMap.languageMapping.get(Language.POLISH).put(EntityType.LLAMA, "Lama");
            MobNamesMap.languageMapping.get(Language.POLISH).put(EntityType.MULE, "Mu�");
            MobNamesMap.languageMapping.get(Language.POLISH).put(EntityType.MUSHROOM_COW, "Zmutowana Krowa");
            MobNamesMap.languageMapping.get(Language.POLISH).put(EntityType.OCELOT, "Ocelot");
            MobNamesMap.languageMapping.get(Language.POLISH).put(EntityType.PIG, "�winia");
            MobNamesMap.languageMapping.get(Language.POLISH).put(EntityType.PIG_ZOMBIE, "Zombie Pigman");
            MobNamesMap.languageMapping.get(Language.POLISH).put(EntityType.POLAR_BEAR, "Nied�wied� Polarny");
            MobNamesMap.languageMapping.get(Language.POLISH).put(EntityType.RABBIT, "Kr�lik");
            MobNamesMap.languageMapping.get(Language.POLISH).put(EntityType.SHEEP, "Owca");
            MobNamesMap.languageMapping.get(Language.POLISH).put(EntityType.SHULKER, "Shulker");
            MobNamesMap.languageMapping.get(Language.POLISH).put(EntityType.SILVERFISH, "Silverfish");
            MobNamesMap.languageMapping.get(Language.POLISH).put(EntityType.SKELETON, "Szkielet");
            MobNamesMap.languageMapping.get(Language.POLISH).put(EntityType.SKELETON_HORSE, "Ko�ciany Smok");
            MobNamesMap.languageMapping.get(Language.POLISH).put(EntityType.SLIME, "Slime");
            MobNamesMap.languageMapping.get(Language.POLISH).put(EntityType.SNOWMAN, "Lodowy Golem");
            MobNamesMap.languageMapping.get(Language.POLISH).put(EntityType.SPIDER, "Paj�k");
            MobNamesMap.languageMapping.get(Language.POLISH).put(EntityType.SQUID, "Ka�amarnica");
            MobNamesMap.languageMapping.get(Language.POLISH).put(EntityType.STRAY, "Zb��kany");
            MobNamesMap.languageMapping.get(Language.POLISH).put(EntityType.VEX, "Vex");
            MobNamesMap.languageMapping.get(Language.POLISH).put(EntityType.VILLAGER, "Osadnik");
            MobNamesMap.languageMapping.get(Language.POLISH).put(EntityType.VINDICATOR, "Obro�ca");
            MobNamesMap.languageMapping.get(Language.POLISH).put(EntityType.WITCH, "Wied�ma");
            MobNamesMap.languageMapping.get(Language.POLISH).put(EntityType.WITHER, "Wither");
            MobNamesMap.languageMapping.get(Language.POLISH).put(EntityType.WITHER_SKELETON, "Obumar�y Szkielet");
            MobNamesMap.languageMapping.get(Language.POLISH).put(EntityType.WOLF, "Wilk");
            MobNamesMap.languageMapping.get(Language.POLISH).put(EntityType.ZOMBIE, "Zombie");
            MobNamesMap.languageMapping.get(Language.POLISH).put(EntityType.ZOMBIE_HORSE, "Ko� Zombie");
            MobNamesMap.languageMapping.get(Language.POLISH).put(EntityType.ZOMBIE_VILLAGER, "Zombie");
        //1.13:
            MobNamesMap.languageMapping.get(Language.POLISH).put(EntityType.PARROT, "Papuga");
            MobNamesMap.languageMapping.get(Language.POLISH).put(EntityType.DOLPHIN, "Delfin");
            MobNamesMap.languageMapping.get(Language.POLISH).put(EntityType.DROWNED, "Topielec");
            MobNamesMap.languageMapping.get(Language.POLISH).put(EntityType.PHANTOM, "Fantom");
            MobNamesMap.languageMapping.get(Language.POLISH).put(EntityType.COD, "Dorsz");
            MobNamesMap.languageMapping.get(Language.POLISH).put(EntityType.SALMON, "�oso�");
            MobNamesMap.languageMapping.get(Language.POLISH).put(EntityType.PUFFERFISH, "Ryba Dymka");
            MobNamesMap.languageMapping.get(Language.POLISH).put(EntityType.TROPICAL_FISH, "Ryba Tropikalna");
            MobNamesMap.languageMapping.get(Language.POLISH).put(EntityType.TURTLE, "��w");
        //1.14
            MobNamesMap.languageMapping.get(Language.POLISH).put(EntityType.CAT, "Kot");
            MobNamesMap.languageMapping.get(Language.POLISH).put(EntityType.FOX, "Lis");
            MobNamesMap.languageMapping.get(Language.POLISH).put(EntityType.PANDA, "Panda");
            MobNamesMap.languageMapping.get(Language.POLISH).put(EntityType.PILLAGER, "Grabie�ca");
            MobNamesMap.languageMapping.get(Language.POLISH).put(EntityType.RAVAGER, "Niszczyciel");
            MobNamesMap.languageMapping.get(Language.POLISH).put(EntityType.TRADER_LLAMA, "Lama Handlarza");
            MobNamesMap.languageMapping.get(Language.POLISH).put(EntityType.WANDERING_TRADER, "W�drowny Handlarz");
        }
        catch (NoSuchFieldError e) {
            LogsModule.warning("Upgrade server to the 1.14.4 for full language support.");
        }
    }
	
}
