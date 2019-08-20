package iomatix.spigot.rpgleveledmobs.config;

import java.util.ArrayList;
import java.util.HashMap;

import org.bukkit.entity.EntityType;

import iomatix.spigot.rpgleveledmobs.tools.Language;

public abstract class RPGLeveledMobsConfig {
	
	protected configHandler config;
	    protected HashMap<ConfigKey, Object> inheritedValues;
	    
	    public RPGLeveledMobsConfig() {
	        this.inheritedValues = new HashMap<ConfigKey, Object>();
	    }
	    
	    public abstract boolean isSuffixEnabled();
	    
	    public abstract void setSuffixEnabled(final boolean p0);
	    
	    public abstract boolean isPrefixEnabled();
	    
	    public abstract void setPrefixEnabled(final boolean p0);
	    
	    public abstract String getSuffixFormat();
	    
	    public abstract void setSuffixFormat(final String p0);
	    
	    public abstract String getPrefixFormat();
	    
	    public abstract void setPrefixFormat(final String p0);
	    
	    public abstract double getDistancePerLevel();
	    
	    public abstract void setDistancePerLevel(final double p0);
	    
	    public abstract int getMaxLevel();
	    
	    public abstract void setMaxLevel(final int p0);
	    
	    public abstract int getMinLevel();
	    
	    public abstract void setMinLevel(final int p0);
	    
	    public abstract int getStartLevel();
	    
	    public abstract void setStartLevel(final int p0);
	    
	    public abstract boolean isDamageModified();
	    
	    public abstract void setDamageModified(final boolean p0);
	    
	    public abstract boolean isDefenseModified();
	    
	    public abstract void setDefenseModified(final boolean p0);
	    
	    public abstract boolean isExperienceModified();
	    
	    public abstract void setExperienceModified(final boolean p0);
	    
	    public abstract boolean isHealthModified();
	    
	    public abstract void setHealthModified(final boolean p0);
	    
	    public abstract double getHealthMultiplier();
	    
	    public abstract void setHealthMultiplier(final double p0);
	    
	    public abstract double getDamageMultiplier();
	    
	    public abstract void setDamageMultiplier(final double p0);
	    
	    public abstract double getDefenseMultiplier();
	    
	    public abstract void setDefenseMultiplier(final double p0);
	    
	    public abstract double getExperienceMultiplier();
	    
	    public abstract void setExperienceMultiplier(final double p0);
	    
	    public abstract boolean isMobArenaLeveled();
	    
	    public abstract void setMobArenaLeveled(final boolean p0);
	    
	    public abstract boolean isMobArenaWaveLeveled();
	    
	    public abstract void setMobArenaWaveLeveled(final boolean p0);
	    
	    public abstract double getMobArenaMultiplier();
	    
	    public abstract void setMobArenaMultiplier(final double p0);
	    
	    public abstract double getMobArenaWavesPerLevel();
	    
	    public abstract void setMobArenaWavesPerLevel(final double p0);
	    
	    public abstract boolean canLevel(final EntityType p0);
	    
	    public abstract boolean isBlocked(final EntityType p0);
	    
	    public abstract void setLeveledMobs(final ArrayList<EntityType> p0);
	    
	    public abstract void addLeveledMob(final EntityType p0);
	    
	    public abstract void removeLeveledMob(final EntityType p0);
	    
	    public abstract void setBlockedMobs(final ArrayList<EntityType> p0);
	    
	    public abstract void addBlockedMob(final EntityType p0);
	    
	    public abstract void removeBlockedMob(final EntityType p0);
	    
	    public ArrayList<String> entListToStringList(final ArrayList<EntityType> entList) {
	        final ArrayList<String> strList = new ArrayList<String>();
	        for (final EntityType ent : entList) {
	            strList.add(ent.toString());
	        }
	        return strList;
	    }
	    
	    public HashMap<ConfigKey, Object> getSettings() {
	        final HashMap<ConfigKey, Object> configMap = new HashMap<ConfigKey, Object>();
	        for (final ConfigKey key : ConfigKey.values()) {
	            if (this.inheritedValues.containsKey(key)) {
	                configMap.put(key, this.inheritedValues.get(key));
	            }
	            else if (key == ConfigKey.LEVELED_MOBS || key == ConfigKey.BLOCKED_MOBS) {
	                final ArrayList<String> tempStringList = (ArrayList<String>)this.config.getConfig().get(key.toString());
	                if (tempStringList != null) {
	                    final ArrayList<EntityType> tempEntList = new ArrayList<EntityType>();
	                    for (final String mob : tempStringList) {
	                        tempEntList.add(EntityType.valueOf(mob));
	                    }
	                    configMap.put(key, tempEntList);
	                }
	            }
	            else if (key == ConfigKey.NAME_LANGUAGE) {
	                configMap.put(key, Language.valueOf(this.config.getConfig().get(key.toString()).toString().toUpperCase()));
	            }
	            else {
	                configMap.put(key, this.config.getConfig().get(key.toString()));
	            }
	        }
	        return configMap;
	    }
	    
	    public boolean isValueInherited(final ConfigKey key) {
	        return this.inheritedValues.containsKey(key);
	    }
	    
	    public abstract void useInheritedValue(final ConfigKey p0);
	    
	    public Object getValue(final ConfigKey key) {
	        if (this.inheritedValues.containsKey(key)) {
	            return this.inheritedValues.get(key);
	        }
	        if (key == ConfigKey.BLOCKED_MOBS || key == ConfigKey.LEVELED_MOBS) {
	            final ArrayList<String> tempStringList = (ArrayList<String>)this.config.getConfig().get(key.toString());
	            final ArrayList<EntityType> tempEntList = new ArrayList<EntityType>();
	            for (final String mob : tempStringList) {
	                tempEntList.add(EntityType.valueOf(mob));
	            }
	            return tempEntList;
	        }
	        if (key == ConfigKey.NAME_LANGUAGE) {
	            return Language.valueOf(this.config.getConfig().get(key.toString()).toString().toUpperCase());
	        }
	        return this.config.getConfig().get(key.toString());
	    }
	    
	    public abstract ArrayList<EntityType> getLeveledMobs();
	    
	    public abstract ArrayList<EntityType> getBlockedMobs();
	    
	    public abstract boolean isLeveledSpawners();
	    
	    public abstract void setLeveledSpawners(final boolean p0);
	    
	    public abstract boolean isAlwaysShowMobName();
	    
	    public abstract void setAlwaysShowMobName(final boolean p0);
	    
	    public abstract void setMobNameLanguage(final Language p0);
	    
	    public abstract Language getMobNameLanguage();
}