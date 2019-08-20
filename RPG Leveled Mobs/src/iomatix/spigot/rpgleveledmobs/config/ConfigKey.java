package iomatix.spigot.rpgleveledmobs.config;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Collection;

import org.bukkit.plugin.Plugin;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.World;
import org.bukkit.entity.EntityType;

import iomatix.spigot.rpgleveledmobs.logging.LogsModule;
import iomatix.spigot.rpgleveledmobs.Main;
import iomatix.spigot.rpgleveledmobs.tools.Language;

public enum ConfigKey {

    MIN_LEVEL("Leveling.MinLevel", "The minimum level a mob is allowed to be."), 
    MAX_LEVEL("Leveling.MaxLevel", "The maximum level a mob is allowed to be."), 
    START_LEVEL("Leveling.StartLevel", "The base level every mob starts at when calculating level."), 
    DISTANCE_PER_LEVEL("Leveling.DistancePerLevel", "How many blocks until the level of a mob is increased."), 
    HEALTH_MOD_ENABLED("Stats.Health.Enabled", "Whether or not to increase a mobs health with their level."), 
    HEALTH_PER_LEVEL("Stats.Health.Multiplier", "The percentage of health increase per level. Formula = [BaseHealth + (BaseHealth * level * multiplier)]"), 
    DAMAGE_MOD_ENABLE("Stats.Damage.Enabled", "Whether or not to increase the damage a mob will do by their level."), 
    DAMAGE_PER_LEVEL("Stats.Damage.Multiplier", "The percentage of damage increase per level. Formula = [BaseDamage + (BaseDamage * level * mulitplier)]"), 
    DEFENSE_MOD_ENABLE("Stats.Defense.Enabled", "Wheter or not to increase the total mob defense by their level. Formula = [DamageTaken - (DamageTaken * level * mulitplier/100)]"),
    DEFENSE_PER_LEVEL("Stats.Defense.Multiplier", "The percentage of damage resited per level."),
    EXPERIENCE_MOD_ENABLED("Stats.Experience.Enabled", "Whether or not to increase the amount of experience dropped by a monster"), 
    EXPERIENCE_MODIFIER("Stats.Experience.Multiplier", "The percentage of experience increase per level. Formula = [BaseExp + (BaseExp * level * multiplier)]"), 
    LEVELED_MOBS("Spawning.LeveledMobs", "A list of mobs that are assigned levels when spawned."), 
    BLOCKED_MOBS("Spawning.BlockedMobs", "A list of mobs that are prevented from spawning."), 
    LEVELED_SPAWNERS("Spawning.LeveledSpawners", "Should mobs from spawners be leveled?"), 
    USE_SUFFIX("Naming.Suffix.Enabled", "Whether or not to end the mob's name with their level."), 
    USE_PREFIX("Naming.Prefix.Enabled", "Whether or not to start the mobs name with their level."), 
    SUFFIX_FORMAT("Naming.Suffix.Format", "The format for the suffix. Use %l for the mobs level."), 
    PREFIX_FORMAT("Naming.Prefix.Format", "The format for the prefix. Use %l for the mobs level."), 
    ALWAYS_SHOW_MOB_NAME("Naming.AlwaysShowName.Enabled", "Whether or not to always display mob's name no matter distance."), 
    NAME_LANGUAGE("Naming.Language", "What language to use for the mob's name."), 
    MOB_ARENA_ENABLED("MobArena.Enabled", "Whether or not to allow MobArena mobs to be assigned a level."), 
    MOB_ARENA_WAVE_LEVELING("MobArena.WaveLeveling", "Whether or not to level the mobs in a mob arena by the wave number."), 
    MOB_ARENA_WAVES_PER_LEVEL("MobArena.WavesPerLevel", "How many waves before increasing level"), 
    MOB_ARENA_MULTIPLIER("MobArena.Multiplier", "What percentage of experience to drop for mobs killed inside of a mob arena. [ModifiedExperience * multiplier]");
    
    private String path;
    private String description;
    public static HashMap<ConfigKey, Object> defaultMap;
    public static ArrayList<EntityType> defaultLeveled;
    private static final ArrayList<EntityType> defaultBlockedVanilla;
    private static final ArrayList<EntityType> defaultBlockedNether;
    private static final ArrayList<EntityType> defaultBlockedEnd;
    
    private  ConfigKey(final String path, final String description) {
        this.path = path;
        this.description = description;
    }
    
    @Override
    public String toString() {
        return this.path;
    }
    
    public String getDescription() {
        return this.description;
    }
    
    public static ArrayList<EntityType> getDefaultBlocked(final World world) {
        if (world == null) {
            return ConfigKey.defaultBlockedVanilla;
        }
        switch (world.getEnvironment()) {
            case THE_END: {
                return ConfigKey.defaultBlockedEnd;
            }
            case NETHER: {
                return ConfigKey.defaultBlockedNether;
            }
            case NORMAL: {
                return ConfigKey.defaultBlockedVanilla;
            }
            default: {
                return ConfigKey.defaultBlockedVanilla;
            }
        }
    }
    
    static {
        ConfigKey.defaultMap = new HashMap<ConfigKey, Object>();
        ConfigKey.defaultLeveled = new ArrayList<EntityType>();
        defaultBlockedVanilla = new ArrayList<EntityType>();
        defaultBlockedNether = new ArrayList<EntityType>();
        defaultBlockedEnd = new ArrayList<EntityType>();
        ConfigKey.defaultBlockedVanilla.add(EntityType.ENDER_DRAGON);
        ConfigKey.defaultBlockedVanilla.add(EntityType.GHAST);
        ConfigKey.defaultBlockedVanilla.add(EntityType.MAGMA_CUBE);
        ConfigKey.defaultBlockedVanilla.add(EntityType.PIG_ZOMBIE);
        ConfigKey.defaultLeveled.add(EntityType.BLAZE);
        ConfigKey.defaultLeveled.add(EntityType.CAVE_SPIDER);
        ConfigKey.defaultLeveled.add(EntityType.CREEPER);
        ConfigKey.defaultLeveled.add(EntityType.ENDER_DRAGON);
        ConfigKey.defaultLeveled.add(EntityType.ENDERMAN);
        ConfigKey.defaultLeveled.add(EntityType.GHAST);
        ConfigKey.defaultLeveled.add(EntityType.GIANT);
        ConfigKey.defaultLeveled.add(EntityType.ZOMBIE);
        ConfigKey.defaultLeveled.add(EntityType.IRON_GOLEM);
        ConfigKey.defaultLeveled.add(EntityType.MAGMA_CUBE);
        ConfigKey.defaultLeveled.add(EntityType.PIG_ZOMBIE);
        ConfigKey.defaultLeveled.add(EntityType.WITHER);
        ConfigKey.defaultLeveled.add(EntityType.SILVERFISH);
        ConfigKey.defaultLeveled.add(EntityType.SKELETON);
        ConfigKey.defaultLeveled.add(EntityType.SLIME);
        ConfigKey.defaultLeveled.add(EntityType.SNOWMAN);
        ConfigKey.defaultLeveled.add(EntityType.SPIDER);
        ConfigKey.defaultLeveled.add(EntityType.WITCH);
        ConfigKey.defaultBlockedEnd.addAll(ConfigKey.defaultLeveled);
        ConfigKey.defaultBlockedEnd.add(EntityType.MAGMA_CUBE);
        ConfigKey.defaultBlockedEnd.remove(EntityType.ENDER_DRAGON);
        ConfigKey.defaultBlockedEnd.remove(EntityType.ENDERMAN);
        ConfigKey.defaultBlockedEnd.add(EntityType.HORSE);
        ConfigKey.defaultBlockedEnd.add(EntityType.BAT);
        ConfigKey.defaultBlockedEnd.add(EntityType.PIG);
        ConfigKey.defaultBlockedEnd.add(EntityType.COW);
        ConfigKey.defaultBlockedEnd.add(EntityType.MUSHROOM_COW);
        ConfigKey.defaultBlockedEnd.add(EntityType.CHICKEN);
        ConfigKey.defaultBlockedEnd.add(EntityType.OCELOT);
        ConfigKey.defaultBlockedEnd.add(EntityType.SHEEP);
        ConfigKey.defaultBlockedEnd.add(EntityType.SQUID);
        ConfigKey.defaultBlockedEnd.add(EntityType.VILLAGER);
        ConfigKey.defaultBlockedEnd.add(EntityType.WOLF);
        ConfigKey.defaultBlockedNether.addAll(ConfigKey.defaultBlockedEnd);
        ConfigKey.defaultBlockedNether.add(EntityType.ENDERMAN);
        ConfigKey.defaultBlockedNether.add(EntityType.ENDER_DRAGON);
        ConfigKey.defaultBlockedNether.remove(EntityType.GHAST);
        ConfigKey.defaultBlockedNether.remove(EntityType.PIG_ZOMBIE);
        ConfigKey.defaultBlockedNether.remove(EntityType.BLAZE);
        ConfigKey.defaultBlockedNether.remove(EntityType.SKELETON);
        ConfigKey.defaultBlockedNether.remove(EntityType.MAGMA_CUBE);
        ConfigKey.defaultMap.put(ConfigKey.MIN_LEVEL, 1);
        ConfigKey.defaultMap.put(ConfigKey.MAX_LEVEL, 100);
        ConfigKey.defaultMap.put(ConfigKey.START_LEVEL, 1);
        ConfigKey.defaultMap.put(ConfigKey.DISTANCE_PER_LEVEL, 35.0);
        ConfigKey.defaultMap.put(ConfigKey.HEALTH_MOD_ENABLED, true);
        ConfigKey.defaultMap.put(ConfigKey.HEALTH_PER_LEVEL, 0.2);
        ConfigKey.defaultMap.put(ConfigKey.DAMAGE_MOD_ENABLE, true);
        ConfigKey.defaultMap.put(ConfigKey.DAMAGE_PER_LEVEL, 1.0);
        ConfigKey.defaultMap.put(ConfigKey.DEFENSE_MOD_ENABLE, true);
        ConfigKey.defaultMap.put(ConfigKey.DEFENSE_PER_LEVEL, 0.35);
        ConfigKey.defaultMap.put(ConfigKey.LEVELED_MOBS, ConfigKey.defaultLeveled);
        ConfigKey.defaultMap.put(ConfigKey.BLOCKED_MOBS, ConfigKey.defaultBlockedVanilla);
        ConfigKey.defaultMap.put(ConfigKey.LEVELED_SPAWNERS, true);
        ConfigKey.defaultMap.put(ConfigKey.MOB_ARENA_ENABLED, false);
        ConfigKey.defaultMap.put(ConfigKey.MOB_ARENA_WAVE_LEVELING, false);
        ConfigKey.defaultMap.put(ConfigKey.MOB_ARENA_MULTIPLIER, 0.1);
        ConfigKey.defaultMap.put(ConfigKey.MOB_ARENA_WAVES_PER_LEVEL, 1.0);
        ConfigKey.defaultMap.put(ConfigKey.USE_PREFIX, true);
        ConfigKey.defaultMap.put(ConfigKey.USE_SUFFIX, false);
        ConfigKey.defaultMap.put(ConfigKey.PREFIX_FORMAT, "[level #]");
        ConfigKey.defaultMap.put(ConfigKey.SUFFIX_FORMAT, "#");
        ConfigKey.defaultMap.put(ConfigKey.EXPERIENCE_MOD_ENABLED, true);
        ConfigKey.defaultMap.put(ConfigKey.EXPERIENCE_MODIFIER, 1.0);
        ConfigKey.defaultMap.put(ConfigKey.ALWAYS_SHOW_MOB_NAME, true);
        ConfigKey.defaultMap.put(ConfigKey.NAME_LANGUAGE, Language.ENGLISH);
        try {
            ConfigKey.defaultBlockedEnd.remove(EntityType.ENDERMITE);
            ConfigKey.defaultLeveled.add(EntityType.GUARDIAN);
            cfgModule.version = 1.8;
        }
        catch (NoSuchFieldError e) {
            e.printStackTrace();
            LogsModule.error(ChatColor.RED + "RPGLeveledMobs officialy supports 1.14.4 and above.");
            Bukkit.getPluginManager().disablePlugin((Plugin)Main.RPGMobs);
        }
        try {
            ConfigKey.defaultLeveled.add(EntityType.SHULKER);
            ConfigKey.defaultBlockedNether.add(EntityType.SHULKER);
            ConfigKey.defaultBlockedVanilla.add(EntityType.SHULKER);
            cfgModule.version = 1.9;
        }
        catch (NoSuchFieldError e) {}
        try {
            ConfigKey.defaultLeveled.add(EntityType.STRAY);
            ConfigKey.defaultLeveled.add(EntityType.HUSK);
            cfgModule.version = 1.1;
        }
        catch (NoSuchFieldError e) {
            e.printStackTrace();
        }
        try {
            ConfigKey.defaultLeveled.add(EntityType.EVOKER);
            ConfigKey.defaultLeveled.add(EntityType.VEX);
            ConfigKey.defaultLeveled.add(EntityType.VINDICATOR);
            ConfigKey.defaultLeveled.add(EntityType.ELDER_GUARDIAN);
            cfgModule.version = 1.11;
        }
        catch (NoSuchFieldError e) {}
}

}