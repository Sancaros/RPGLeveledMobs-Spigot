package iomatix.spigot.rpgleveledmobs.spawnsController;

import java.util.HashMap;

import org.bukkit.entity.EntityType;

import iomatix.spigot.rpgleveledmobs.config.ConfigKey;
import iomatix.spigot.rpgleveledmobs.config.cfgModule;
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
			//Polish
			MobNamesMap.languageMapping.get(Language.POLISH).put(EntityType.BAT, "Nietoperz");
			MobNamesMap.languageMapping.get(Language.POLISH).put(EntityType.BLAZE, "Płomyk");
			MobNamesMap.languageMapping.get(Language.POLISH).put(EntityType.CAVE_SPIDER, "Pająk Jaskiniowy");
			MobNamesMap.languageMapping.get(Language.POLISH).put(EntityType.CHICKEN, "Kurczak");
			MobNamesMap.languageMapping.get(Language.POLISH).put(EntityType.COW, "Krowa");
			MobNamesMap.languageMapping.get(Language.POLISH).put(EntityType.CREEPER, "Creeper");
			MobNamesMap.languageMapping.get(Language.POLISH).put(EntityType.DONKEY, "Osioł");
			MobNamesMap.languageMapping.get(Language.POLISH).put(EntityType.ELDER_GUARDIAN, "Starszy Strażnik");
			MobNamesMap.languageMapping.get(Language.POLISH).put(EntityType.ENDER_DRAGON, "Smok");
			MobNamesMap.languageMapping.get(Language.POLISH).put(EntityType.ENDERMAN, "Enderman");
			MobNamesMap.languageMapping.get(Language.POLISH).put(EntityType.ENDERMITE, "Endermite");
			MobNamesMap.languageMapping.get(Language.POLISH).put(EntityType.EVOKER, "Przywoływacz");
			MobNamesMap.languageMapping.get(Language.POLISH).put(EntityType.GHAST, "Ghast");
			MobNamesMap.languageMapping.get(Language.POLISH).put(EntityType.GIANT, "Olbrzym");
			MobNamesMap.languageMapping.get(Language.POLISH).put(EntityType.GUARDIAN, "Strażnik");
			MobNamesMap.languageMapping.get(Language.POLISH).put(EntityType.HORSE, "Koń");
			MobNamesMap.languageMapping.get(Language.POLISH).put(EntityType.HUSK, "Posuch");
			MobNamesMap.languageMapping.get(Language.POLISH).put(EntityType.IRON_GOLEM, "Golem");
			MobNamesMap.languageMapping.get(Language.POLISH).put(EntityType.MAGMA_CUBE, "Kostka Magmy");
			MobNamesMap.languageMapping.get(Language.POLISH).put(EntityType.LLAMA, "Lama");
			MobNamesMap.languageMapping.get(Language.POLISH).put(EntityType.MULE, "Muł");
			MobNamesMap.languageMapping.get(Language.POLISH).put(EntityType.MUSHROOM_COW, "Zmutowana Krowa");
			MobNamesMap.languageMapping.get(Language.POLISH).put(EntityType.OCELOT, "Ocelot");
			MobNamesMap.languageMapping.get(Language.POLISH).put(EntityType.PIG, "Świnia");
			MobNamesMap.languageMapping.get(Language.POLISH).put(EntityType.PIG_ZOMBIE, "Zombie Pigman");
			MobNamesMap.languageMapping.get(Language.POLISH).put(EntityType.POLAR_BEAR, "Niedźwiedź Polarny");
			MobNamesMap.languageMapping.get(Language.POLISH).put(EntityType.RABBIT, "Królik");
			MobNamesMap.languageMapping.get(Language.POLISH).put(EntityType.SHEEP, "Owca");
			MobNamesMap.languageMapping.get(Language.POLISH).put(EntityType.SHULKER, "Shulker");
			MobNamesMap.languageMapping.get(Language.POLISH).put(EntityType.SILVERFISH, "Silverfish");
			MobNamesMap.languageMapping.get(Language.POLISH).put(EntityType.SKELETON, "Szkielet");
			MobNamesMap.languageMapping.get(Language.POLISH).put(EntityType.SKELETON_HORSE, "Kościany Koń");
			MobNamesMap.languageMapping.get(Language.POLISH).put(EntityType.SLIME, "Slime");
			MobNamesMap.languageMapping.get(Language.POLISH).put(EntityType.SNOWMAN, "Lodowy Golem");
			MobNamesMap.languageMapping.get(Language.POLISH).put(EntityType.SPIDER, "Pająk");
			MobNamesMap.languageMapping.get(Language.POLISH).put(EntityType.SQUID, "Kałamarnica");
			MobNamesMap.languageMapping.get(Language.POLISH).put(EntityType.STRAY, "Zbłąkany");
			MobNamesMap.languageMapping.get(Language.POLISH).put(EntityType.VEX, "Vex");
			MobNamesMap.languageMapping.get(Language.POLISH).put(EntityType.VILLAGER, "Osadnik");
			MobNamesMap.languageMapping.get(Language.POLISH).put(EntityType.VINDICATOR, "Obrońca");
			MobNamesMap.languageMapping.get(Language.POLISH).put(EntityType.WITCH, "Wiedźma");
			MobNamesMap.languageMapping.get(Language.POLISH).put(EntityType.WITHER, "Wither");
			MobNamesMap.languageMapping.get(Language.POLISH).put(EntityType.WITHER_SKELETON, "Obumarły Szkielet");
			MobNamesMap.languageMapping.get(Language.POLISH).put(EntityType.WOLF, "Wilk");
			MobNamesMap.languageMapping.get(Language.POLISH).put(EntityType.ZOMBIE, "Zombie");
			MobNamesMap.languageMapping.get(Language.POLISH).put(EntityType.ZOMBIE_HORSE, "Koń Zombie");
			MobNamesMap.languageMapping.get(Language.POLISH).put(EntityType.ZOMBIE_VILLAGER, "Zombie");
			// 1.13:
			MobNamesMap.languageMapping.get(Language.POLISH).put(EntityType.PARROT, "Papuga");
			MobNamesMap.languageMapping.get(Language.POLISH).put(EntityType.DOLPHIN, "Delfin");
			MobNamesMap.languageMapping.get(Language.POLISH).put(EntityType.DROWNED, "Topielec");
			MobNamesMap.languageMapping.get(Language.POLISH).put(EntityType.PHANTOM, "Fantom");
			MobNamesMap.languageMapping.get(Language.POLISH).put(EntityType.COD, "Dorsz");
			MobNamesMap.languageMapping.get(Language.POLISH).put(EntityType.SALMON, "Łosoś");
			MobNamesMap.languageMapping.get(Language.POLISH).put(EntityType.PUFFERFISH, "Ryba Dymka");
			MobNamesMap.languageMapping.get(Language.POLISH).put(EntityType.TROPICAL_FISH, "Ryba Tropikalna");
			MobNamesMap.languageMapping.get(Language.POLISH).put(EntityType.TURTLE, "Żółw");
			// 1.14
			MobNamesMap.languageMapping.get(Language.POLISH).put(EntityType.CAT, "Kot");
			MobNamesMap.languageMapping.get(Language.POLISH).put(EntityType.FOX, "Lis");
			MobNamesMap.languageMapping.get(Language.POLISH).put(EntityType.PANDA, "Panda");
			MobNamesMap.languageMapping.get(Language.POLISH).put(EntityType.PILLAGER, "Grabieżca");
			MobNamesMap.languageMapping.get(Language.POLISH).put(EntityType.RAVAGER, "Niszczyciel");
			MobNamesMap.languageMapping.get(Language.POLISH).put(EntityType.TRADER_LLAMA, "Lama Handlarza");
			MobNamesMap.languageMapping.get(Language.POLISH).put(EntityType.WANDERING_TRADER, "Wędrowny Handlarz");
	        // Korean
	        MobNamesMap.languageMapping.get(Language.KOREAN).put(EntityType.BAT, "박쥐");
			MobNamesMap.languageMapping.get(Language.KOREAN).put(EntityType.BLAZE, "블레이즈");
			MobNamesMap.languageMapping.get(Language.KOREAN).put(EntityType.CAVE_SPIDER, "동굴 거미");
			MobNamesMap.languageMapping.get(Language.KOREAN).put(EntityType.CHICKEN, "닭");
			MobNamesMap.languageMapping.get(Language.KOREAN).put(EntityType.COW, "소");
			MobNamesMap.languageMapping.get(Language.KOREAN).put(EntityType.CREEPER, "크리퍼");
			MobNamesMap.languageMapping.get(Language.KOREAN).put(EntityType.DONKEY, "당나귀");
			MobNamesMap.languageMapping.get(Language.KOREAN).put(EntityType.ELDER_GUARDIAN, "엘더 가디언");
			MobNamesMap.languageMapping.get(Language.KOREAN).put(EntityType.ENDER_DRAGON, "엔더 드래곤");
			MobNamesMap.languageMapping.get(Language.KOREAN).put(EntityType.ENDERMAN, "엔더맨");
			MobNamesMap.languageMapping.get(Language.KOREAN).put(EntityType.ENDERMITE, "엔더마이트");
			MobNamesMap.languageMapping.get(Language.KOREAN).put(EntityType.EVOKER, "소환사");
			MobNamesMap.languageMapping.get(Language.KOREAN).put(EntityType.GHAST, "가스트");
			MobNamesMap.languageMapping.get(Language.KOREAN).put(EntityType.GIANT, "자이언트");
			MobNamesMap.languageMapping.get(Language.KOREAN).put(EntityType.GUARDIAN, "가디언");
			MobNamesMap.languageMapping.get(Language.KOREAN).put(EntityType.HORSE, "말");
			MobNamesMap.languageMapping.get(Language.KOREAN).put(EntityType.HUSK, "허스크");
			MobNamesMap.languageMapping.get(Language.KOREAN).put(EntityType.ILLUSIONER, "마술사");
			MobNamesMap.languageMapping.get(Language.KOREAN).put(EntityType.IRON_GOLEM, "철 골렘");
			MobNamesMap.languageMapping.get(Language.KOREAN).put(EntityType.MAGMA_CUBE, "마그마 큐브");
			MobNamesMap.languageMapping.get(Language.KOREAN).put(EntityType.LLAMA, "라마");
			MobNamesMap.languageMapping.get(Language.KOREAN).put(EntityType.MULE, "노새");
			MobNamesMap.languageMapping.get(Language.KOREAN).put(EntityType.MUSHROOM_COW, "버섯소");
			MobNamesMap.languageMapping.get(Language.KOREAN).put(EntityType.OCELOT, "오실롯");
			MobNamesMap.languageMapping.get(Language.KOREAN).put(EntityType.PIG, "돼지");
			MobNamesMap.languageMapping.get(Language.KOREAN).put(EntityType.PIG_ZOMBIE, "좀비 피그맨");
			MobNamesMap.languageMapping.get(Language.KOREAN).put(EntityType.POLAR_BEAR, "북극곰");
			MobNamesMap.languageMapping.get(Language.KOREAN).put(EntityType.RABBIT, "토끼");
			MobNamesMap.languageMapping.get(Language.KOREAN).put(EntityType.SHEEP, "양");
			MobNamesMap.languageMapping.get(Language.KOREAN).put(EntityType.SHULKER, "셜커");
			MobNamesMap.languageMapping.get(Language.KOREAN).put(EntityType.SILVERFISH, "좀벌레");
			MobNamesMap.languageMapping.get(Language.KOREAN).put(EntityType.SKELETON, "스켈레톤");
			MobNamesMap.languageMapping.get(Language.KOREAN).put(EntityType.SKELETON_HORSE, "스켈레톤 말");
			MobNamesMap.languageMapping.get(Language.KOREAN).put(EntityType.SLIME, "슬라임");
			MobNamesMap.languageMapping.get(Language.KOREAN).put(EntityType.SNOWMAN, "눈사람");
			MobNamesMap.languageMapping.get(Language.KOREAN).put(EntityType.SPIDER, "거미");
			MobNamesMap.languageMapping.get(Language.KOREAN).put(EntityType.SQUID, "오징어");
			MobNamesMap.languageMapping.get(Language.KOREAN).put(EntityType.STRAY, "스트레이");
			MobNamesMap.languageMapping.get(Language.KOREAN).put(EntityType.VEX, "벡스");
			MobNamesMap.languageMapping.get(Language.KOREAN).put(EntityType.VILLAGER, "주민");
			MobNamesMap.languageMapping.get(Language.KOREAN).put(EntityType.VINDICATOR, "변명자");
			MobNamesMap.languageMapping.get(Language.KOREAN).put(EntityType.WITCH, "마녀");
			MobNamesMap.languageMapping.get(Language.KOREAN).put(EntityType.WITHER, "위더");
			MobNamesMap.languageMapping.get(Language.KOREAN).put(EntityType.WITHER_SKELETON, "위더 스켈레톤");
			MobNamesMap.languageMapping.get(Language.KOREAN).put(EntityType.WOLF, "늑대");
			MobNamesMap.languageMapping.get(Language.KOREAN).put(EntityType.ZOMBIE, "좀비");
			MobNamesMap.languageMapping.get(Language.KOREAN).put(EntityType.ZOMBIE_HORSE, "좀비 말");
			MobNamesMap.languageMapping.get(Language.KOREAN).put(EntityType.ZOMBIE_VILLAGER, "좀비 주민");
			// 1.13:
			MobNamesMap.languageMapping.get(Language.KOREAN).put(EntityType.PARROT, "앵무새");
			MobNamesMap.languageMapping.get(Language.KOREAN).put(EntityType.DOLPHIN, "돌고래");
			MobNamesMap.languageMapping.get(Language.KOREAN).put(EntityType.DROWNED, "드라운드");
			MobNamesMap.languageMapping.get(Language.KOREAN).put(EntityType.PHANTOM, "팬텀");
			MobNamesMap.languageMapping.get(Language.KOREAN).put(EntityType.COD, "대구");
			MobNamesMap.languageMapping.get(Language.KOREAN).put(EntityType.SALMON, "연어");
			MobNamesMap.languageMapping.get(Language.KOREAN).put(EntityType.PUFFERFISH, "복어");
			MobNamesMap.languageMapping.get(Language.KOREAN).put(EntityType.TROPICAL_FISH, "열대어");
			MobNamesMap.languageMapping.get(Language.KOREAN).put(EntityType.TURTLE, "거북");
			// 1.14
			MobNamesMap.languageMapping.get(Language.KOREAN).put(EntityType.CAT, "고양이");
			MobNamesMap.languageMapping.get(Language.KOREAN).put(EntityType.FOX, "여우");
			MobNamesMap.languageMapping.get(Language.KOREAN).put(EntityType.PANDA, "판다");
			MobNamesMap.languageMapping.get(Language.KOREAN).put(EntityType.PILLAGER, "약탈자");
			MobNamesMap.languageMapping.get(Language.KOREAN).put(EntityType.RAVAGER, "파괴수");
			MobNamesMap.languageMapping.get(Language.KOREAN).put(EntityType.TRADER_LLAMA, "상인 라마");
			MobNamesMap.languageMapping.get(Language.KOREAN).put(EntityType.WANDERING_TRADER, "떠돌이 상인");
			//Japanese
			 MobNamesMap.languageMapping.get(Language.JAPANESE).put(EntityType.BAT, "コウモリ");
				MobNamesMap.languageMapping.get(Language.JAPANESE).put(EntityType.BLAZE, "ブレイズ");
				MobNamesMap.languageMapping.get(Language.JAPANESE).put(EntityType.CAVE_SPIDER, "ケイブスパイダー");
				MobNamesMap.languageMapping.get(Language.JAPANESE).put(EntityType.CHICKEN, "ニワトリ");
				MobNamesMap.languageMapping.get(Language.JAPANESE).put(EntityType.COW, "ウシ");
				MobNamesMap.languageMapping.get(Language.JAPANESE).put(EntityType.CREEPER, "クリーパー");
				MobNamesMap.languageMapping.get(Language.JAPANESE).put(EntityType.DONKEY, "ロバ");
				MobNamesMap.languageMapping.get(Language.JAPANESE).put(EntityType.ELDER_GUARDIAN, "エルダーガーディアン");
				MobNamesMap.languageMapping.get(Language.JAPANESE).put(EntityType.ENDER_DRAGON, "エンダードラゴン");
				MobNamesMap.languageMapping.get(Language.JAPANESE).put(EntityType.ENDERMAN, "エンダーマン");
				MobNamesMap.languageMapping.get(Language.JAPANESE).put(EntityType.ENDERMITE, "エンダーマイト");
				MobNamesMap.languageMapping.get(Language.JAPANESE).put(EntityType.EVOKER, "エヴォーカー");
				MobNamesMap.languageMapping.get(Language.JAPANESE).put(EntityType.GHAST, "ガスト");
				MobNamesMap.languageMapping.get(Language.JAPANESE).put(EntityType.GIANT, "ジャイアント");
				MobNamesMap.languageMapping.get(Language.JAPANESE).put(EntityType.GUARDIAN, "ガーディアン");
				MobNamesMap.languageMapping.get(Language.JAPANESE).put(EntityType.HORSE, "ウマ");
				MobNamesMap.languageMapping.get(Language.JAPANESE).put(EntityType.HUSK, "ハスク");
				MobNamesMap.languageMapping.get(Language.JAPANESE).put(EntityType.ILLUSIONER, "イリュージョン");
				MobNamesMap.languageMapping.get(Language.JAPANESE).put(EntityType.IRON_GOLEM, "アイアンゴーレム");
				MobNamesMap.languageMapping.get(Language.JAPANESE).put(EntityType.MAGMA_CUBE, "マグマキューブ");
				MobNamesMap.languageMapping.get(Language.JAPANESE).put(EntityType.LLAMA, "ラマ");
				MobNamesMap.languageMapping.get(Language.JAPANESE).put(EntityType.MULE, "ラバ");
				MobNamesMap.languageMapping.get(Language.JAPANESE).put(EntityType.MUSHROOM_COW, "ムーシュルームのウシ");
				MobNamesMap.languageMapping.get(Language.JAPANESE).put(EntityType.OCELOT, "ヤマネコ");
				MobNamesMap.languageMapping.get(Language.JAPANESE).put(EntityType.PIG, "ブタ");
				MobNamesMap.languageMapping.get(Language.JAPANESE).put(EntityType.PIG_ZOMBIE, "ゾンビピッグマン");
				MobNamesMap.languageMapping.get(Language.JAPANESE).put(EntityType.POLAR_BEAR, "シロクマ");
				MobNamesMap.languageMapping.get(Language.JAPANESE).put(EntityType.RABBIT, "ウサギ");
				MobNamesMap.languageMapping.get(Language.JAPANESE).put(EntityType.SHEEP, "ヒツジ");
				MobNamesMap.languageMapping.get(Language.JAPANESE).put(EntityType.SHULKER, "シュルカー");
				MobNamesMap.languageMapping.get(Language.JAPANESE).put(EntityType.SILVERFISH, "シルバーフィッシュ");
				MobNamesMap.languageMapping.get(Language.JAPANESE).put(EntityType.SKELETON, "スケルトン");
				MobNamesMap.languageMapping.get(Language.JAPANESE).put(EntityType.SKELETON_HORSE, "スケルトンホース");
				MobNamesMap.languageMapping.get(Language.JAPANESE).put(EntityType.SLIME, "スライム");
				MobNamesMap.languageMapping.get(Language.JAPANESE).put(EntityType.SNOWMAN, "スノーゴーレム");
				MobNamesMap.languageMapping.get(Language.JAPANESE).put(EntityType.SPIDER, "スパイダー");
				MobNamesMap.languageMapping.get(Language.JAPANESE).put(EntityType.SQUID, "イカ");
				MobNamesMap.languageMapping.get(Language.JAPANESE).put(EntityType.STRAY, "ストレイ");
				MobNamesMap.languageMapping.get(Language.JAPANESE).put(EntityType.VEX, "ヴェックス");
				MobNamesMap.languageMapping.get(Language.JAPANESE).put(EntityType.VILLAGER, "村人");
				MobNamesMap.languageMapping.get(Language.JAPANESE).put(EntityType.VINDICATOR, "ヴィンディケーター");
				MobNamesMap.languageMapping.get(Language.JAPANESE).put(EntityType.WITCH, "ウィッチ");
				MobNamesMap.languageMapping.get(Language.JAPANESE).put(EntityType.WITHER, "ウィザー");
				MobNamesMap.languageMapping.get(Language.JAPANESE).put(EntityType.WITHER_SKELETON, "ウィザースケルトン");
				MobNamesMap.languageMapping.get(Language.JAPANESE).put(EntityType.WOLF, "オオカミ");
				MobNamesMap.languageMapping.get(Language.JAPANESE).put(EntityType.ZOMBIE, "ゾンビ");
				MobNamesMap.languageMapping.get(Language.JAPANESE).put(EntityType.ZOMBIE_HORSE, "ゾンビホース");
				MobNamesMap.languageMapping.get(Language.JAPANESE).put(EntityType.ZOMBIE_VILLAGER, "村人ゾンビ");
				// 1.13:
				MobNamesMap.languageMapping.get(Language.JAPANESE).put(EntityType.PARROT, "オウム");
				MobNamesMap.languageMapping.get(Language.JAPANESE).put(EntityType.DOLPHIN, "イルカ");
				MobNamesMap.languageMapping.get(Language.JAPANESE).put(EntityType.DROWNED, "ドラウンド");
				MobNamesMap.languageMapping.get(Language.JAPANESE).put(EntityType.PHANTOM, "ファントム");
				MobNamesMap.languageMapping.get(Language.JAPANESE).put(EntityType.COD, "タラ");
				MobNamesMap.languageMapping.get(Language.JAPANESE).put(EntityType.SALMON, "サケ");
				MobNamesMap.languageMapping.get(Language.JAPANESE).put(EntityType.PUFFERFISH, "フグ");
				MobNamesMap.languageMapping.get(Language.JAPANESE).put(EntityType.TROPICAL_FISH, "熱帯魚");
				MobNamesMap.languageMapping.get(Language.JAPANESE).put(EntityType.TURTLE, "カメ");
				// 1.14
				MobNamesMap.languageMapping.get(Language.JAPANESE).put(EntityType.CAT, "ネコ");
				MobNamesMap.languageMapping.get(Language.JAPANESE).put(EntityType.FOX, "キツネ");
				MobNamesMap.languageMapping.get(Language.JAPANESE).put(EntityType.PANDA, "パンダ");
				MobNamesMap.languageMapping.get(Language.JAPANESE).put(EntityType.PILLAGER, "ピリジャー");
				MobNamesMap.languageMapping.get(Language.JAPANESE).put(EntityType.RAVAGER, "ラヴェジャー");
				MobNamesMap.languageMapping.get(Language.JAPANESE).put(EntityType.TRADER_LLAMA, "行商人のラマ");
				MobNamesMap.languageMapping.get(Language.JAPANESE).put(EntityType.WANDERING_TRADER, "行商人");
				//Spanish
				 MobNamesMap.languageMapping.get(Language.SPANISH).put(EntityType.BAT, "Murciélago");
					MobNamesMap.languageMapping.get(Language.SPANISH).put(EntityType.BLAZE, "Blaze");
					MobNamesMap.languageMapping.get(Language.SPANISH).put(EntityType.CAVE_SPIDER, "Araña de Cueva");
					MobNamesMap.languageMapping.get(Language.SPANISH).put(EntityType.CHICKEN, "Gallina");
					MobNamesMap.languageMapping.get(Language.SPANISH).put(EntityType.COW, "Vaca");
					MobNamesMap.languageMapping.get(Language.SPANISH).put(EntityType.CREEPER, "Creeper");
					MobNamesMap.languageMapping.get(Language.SPANISH).put(EntityType.DONKEY, "Burro");
					MobNamesMap.languageMapping.get(Language.SPANISH).put(EntityType.ELDER_GUARDIAN, "Elder Guardian");
					MobNamesMap.languageMapping.get(Language.SPANISH).put(EntityType.ENDER_DRAGON, "Dragón del End");
					MobNamesMap.languageMapping.get(Language.SPANISH).put(EntityType.ENDERMAN, "Enderman");
					MobNamesMap.languageMapping.get(Language.SPANISH).put(EntityType.ENDERMITE, "Endermite");
					MobNamesMap.languageMapping.get(Language.SPANISH).put(EntityType.EVOKER, "Invocador");
					MobNamesMap.languageMapping.get(Language.SPANISH).put(EntityType.GHAST, "Ghast");
					MobNamesMap.languageMapping.get(Language.SPANISH).put(EntityType.GIANT, "Monstruo");
					MobNamesMap.languageMapping.get(Language.SPANISH).put(EntityType.GUARDIAN, "Guardian");
					MobNamesMap.languageMapping.get(Language.SPANISH).put(EntityType.HORSE, "Caballo");
					MobNamesMap.languageMapping.get(Language.SPANISH).put(EntityType.HUSK, "Zombi Momificado");
					MobNamesMap.languageMapping.get(Language.SPANISH).put(EntityType.ILLUSIONER, "Ilusionista");
					MobNamesMap.languageMapping.get(Language.SPANISH).put(EntityType.IRON_GOLEM, "Gólem de Hierro");
					MobNamesMap.languageMapping.get(Language.SPANISH).put(EntityType.MAGMA_CUBE, "Cubo de Magma");
					MobNamesMap.languageMapping.get(Language.SPANISH).put(EntityType.LLAMA, "Llama");
					MobNamesMap.languageMapping.get(Language.SPANISH).put(EntityType.MULE, "Mulo");
					MobNamesMap.languageMapping.get(Language.SPANISH).put(EntityType.MUSHROOM_COW, "Champiñaca");
					MobNamesMap.languageMapping.get(Language.SPANISH).put(EntityType.OCELOT, "Ocelote");
					MobNamesMap.languageMapping.get(Language.SPANISH).put(EntityType.PIG, "Cerdo");
					MobNamesMap.languageMapping.get(Language.SPANISH).put(EntityType.PIG_ZOMBIE, "Hombrecerdo Zombi");
					MobNamesMap.languageMapping.get(Language.SPANISH).put(EntityType.POLAR_BEAR, "Oso Polar");
					MobNamesMap.languageMapping.get(Language.SPANISH).put(EntityType.RABBIT, "Conejo");
					MobNamesMap.languageMapping.get(Language.SPANISH).put(EntityType.SHEEP, "Oveja");
					MobNamesMap.languageMapping.get(Language.SPANISH).put(EntityType.SHULKER, "Shulker");
					MobNamesMap.languageMapping.get(Language.SPANISH).put(EntityType.SILVERFISH, "Lepisma");
					MobNamesMap.languageMapping.get(Language.SPANISH).put(EntityType.SKELETON, "Esqueleto");
					MobNamesMap.languageMapping.get(Language.SPANISH).put(EntityType.SKELETON_HORSE, "Caballo Hueso");
					MobNamesMap.languageMapping.get(Language.SPANISH).put(EntityType.SLIME, "Slime");
					MobNamesMap.languageMapping.get(Language.SPANISH).put(EntityType.SNOWMAN, "Gólem de Nieve");
					MobNamesMap.languageMapping.get(Language.SPANISH).put(EntityType.SPIDER, "Araña");
					MobNamesMap.languageMapping.get(Language.SPANISH).put(EntityType.SQUID, "Calamar");
					MobNamesMap.languageMapping.get(Language.SPANISH).put(EntityType.STRAY, "Esqueleto Glacial");
					MobNamesMap.languageMapping.get(Language.SPANISH).put(EntityType.VEX, "Ánima");
					MobNamesMap.languageMapping.get(Language.SPANISH).put(EntityType.VILLAGER, "Aldeano");
					MobNamesMap.languageMapping.get(Language.SPANISH).put(EntityType.VINDICATOR, "Vindicador");
					MobNamesMap.languageMapping.get(Language.SPANISH).put(EntityType.WITCH, "Bruja");
					MobNamesMap.languageMapping.get(Language.SPANISH).put(EntityType.WITHER, "Wither");
					MobNamesMap.languageMapping.get(Language.SPANISH).put(EntityType.WITHER_SKELETON, "Esqueleto Wither");
					MobNamesMap.languageMapping.get(Language.SPANISH).put(EntityType.WOLF, "Lobo");
					MobNamesMap.languageMapping.get(Language.SPANISH).put(EntityType.ZOMBIE, "Zombie");
					MobNamesMap.languageMapping.get(Language.SPANISH).put(EntityType.ZOMBIE_HORSE, "Caballo Zombi");
					MobNamesMap.languageMapping.get(Language.SPANISH).put(EntityType.ZOMBIE_VILLAGER, "Aldeano Zombi");
					// 1.13:
					MobNamesMap.languageMapping.get(Language.SPANISH).put(EntityType.PARROT, "Loro");
					MobNamesMap.languageMapping.get(Language.SPANISH).put(EntityType.DOLPHIN, "Delfín");
					MobNamesMap.languageMapping.get(Language.SPANISH).put(EntityType.DROWNED, "Ahogado");
					MobNamesMap.languageMapping.get(Language.SPANISH).put(EntityType.PHANTOM, "Fantasma");
					MobNamesMap.languageMapping.get(Language.SPANISH).put(EntityType.COD, "Bacalao");
					MobNamesMap.languageMapping.get(Language.SPANISH).put(EntityType.SALMON, "Salmón");
					MobNamesMap.languageMapping.get(Language.SPANISH).put(EntityType.PUFFERFISH, "Pez Globo");
					MobNamesMap.languageMapping.get(Language.SPANISH).put(EntityType.TROPICAL_FISH, "Pez Tropical");
					MobNamesMap.languageMapping.get(Language.SPANISH).put(EntityType.TURTLE, "Tortuga");
					// 1.14
					MobNamesMap.languageMapping.get(Language.SPANISH).put(EntityType.CAT, "GATO");
					MobNamesMap.languageMapping.get(Language.SPANISH).put(EntityType.FOX, "Zorro");
					MobNamesMap.languageMapping.get(Language.SPANISH).put(EntityType.PANDA, "Panda");
					MobNamesMap.languageMapping.get(Language.SPANISH).put(EntityType.PILLAGER, "Saqueador");
					MobNamesMap.languageMapping.get(Language.SPANISH).put(EntityType.RAVAGER, "Ravager");
					MobNamesMap.languageMapping.get(Language.SPANISH).put(EntityType.TRADER_LLAMA, "Llama del Merchante");
					MobNamesMap.languageMapping.get(Language.SPANISH).put(EntityType.WANDERING_TRADER, "Merchant");
				
			
			/////English
			MobNamesMap.languageMapping.get(Language.ENGLISH).put(EntityType.BAT, "Bat");
			MobNamesMap.languageMapping.get(Language.ENGLISH).put(EntityType.BLAZE, "Blaze");
			MobNamesMap.languageMapping.get(Language.ENGLISH).put(EntityType.CAVE_SPIDER, "Cave Spider");
			MobNamesMap.languageMapping.get(Language.ENGLISH).put(EntityType.CHICKEN, "Chicken");
			MobNamesMap.languageMapping.get(Language.ENGLISH).put(EntityType.COW, "Cow");
			MobNamesMap.languageMapping.get(Language.ENGLISH).put(EntityType.CREEPER, "Creeper");
			MobNamesMap.languageMapping.get(Language.ENGLISH).put(EntityType.DONKEY, "Donkey");
			MobNamesMap.languageMapping.get(Language.ENGLISH).put(EntityType.ELDER_GUARDIAN, "Elder Guardian");
			MobNamesMap.languageMapping.get(Language.ENGLISH).put(EntityType.ENDER_DRAGON, "Dragon");
			MobNamesMap.languageMapping.get(Language.ENGLISH).put(EntityType.ENDERMAN, "Enderman");
			MobNamesMap.languageMapping.get(Language.ENGLISH).put(EntityType.ENDERMITE, "Endermite");
			MobNamesMap.languageMapping.get(Language.ENGLISH).put(EntityType.EVOKER, "Evoker");
			MobNamesMap.languageMapping.get(Language.ENGLISH).put(EntityType.GHAST, "Ghast");
			MobNamesMap.languageMapping.get(Language.ENGLISH).put(EntityType.GIANT, "Giant Zombie");
			MobNamesMap.languageMapping.get(Language.ENGLISH).put(EntityType.GUARDIAN, "Guardian");
			MobNamesMap.languageMapping.get(Language.ENGLISH).put(EntityType.HORSE, "Horse");
			MobNamesMap.languageMapping.get(Language.ENGLISH).put(EntityType.HUSK, "Husk");
			MobNamesMap.languageMapping.get(Language.ENGLISH).put(EntityType.IRON_GOLEM, "Golem");
			MobNamesMap.languageMapping.get(Language.ENGLISH).put(EntityType.ILLUSIONER, "Illusioner");
			MobNamesMap.languageMapping.get(Language.ENGLISH).put(EntityType.MAGMA_CUBE, "Magma Cube");
			MobNamesMap.languageMapping.get(Language.ENGLISH).put(EntityType.LLAMA, "Llama");
			MobNamesMap.languageMapping.get(Language.ENGLISH).put(EntityType.MULE, "Mule");
			MobNamesMap.languageMapping.get(Language.ENGLISH).put(EntityType.MUSHROOM_COW, "Mushroom Cow");
			MobNamesMap.languageMapping.get(Language.ENGLISH).put(EntityType.OCELOT, "Ocelot");
			MobNamesMap.languageMapping.get(Language.ENGLISH).put(EntityType.PIG, "Pig");
			MobNamesMap.languageMapping.get(Language.ENGLISH).put(EntityType.PIG_ZOMBIE, "Pig Zombie");
			MobNamesMap.languageMapping.get(Language.ENGLISH).put(EntityType.POLAR_BEAR, "Bear");
			MobNamesMap.languageMapping.get(Language.ENGLISH).put(EntityType.RABBIT, "Rabbit");
			MobNamesMap.languageMapping.get(Language.ENGLISH).put(EntityType.SHEEP, "Sheep");
			MobNamesMap.languageMapping.get(Language.ENGLISH).put(EntityType.SHULKER, "Shulker");
			MobNamesMap.languageMapping.get(Language.ENGLISH).put(EntityType.SILVERFISH, "Silverfish");
			MobNamesMap.languageMapping.get(Language.ENGLISH).put(EntityType.SKELETON, "Skeleton");
			MobNamesMap.languageMapping.get(Language.ENGLISH).put(EntityType.SKELETON_HORSE, "Skeleton Horse");
			MobNamesMap.languageMapping.get(Language.ENGLISH).put(EntityType.SLIME, "Slime");
			MobNamesMap.languageMapping.get(Language.ENGLISH).put(EntityType.SNOWMAN, "Snowman");
			MobNamesMap.languageMapping.get(Language.ENGLISH).put(EntityType.SPIDER, "Spider");
			MobNamesMap.languageMapping.get(Language.ENGLISH).put(EntityType.SQUID, "Squid");
			MobNamesMap.languageMapping.get(Language.ENGLISH).put(EntityType.STRAY, "Stray");
			MobNamesMap.languageMapping.get(Language.ENGLISH).put(EntityType.VEX, "Vex");
			MobNamesMap.languageMapping.get(Language.ENGLISH).put(EntityType.VILLAGER, "Villager");
			MobNamesMap.languageMapping.get(Language.ENGLISH).put(EntityType.VINDICATOR, "Vindicator");
			MobNamesMap.languageMapping.get(Language.ENGLISH).put(EntityType.WITCH, "Witch");
			MobNamesMap.languageMapping.get(Language.ENGLISH).put(EntityType.WITHER, "Wither");
			MobNamesMap.languageMapping.get(Language.ENGLISH).put(EntityType.WITHER_SKELETON, "Wither Skeleton");
			MobNamesMap.languageMapping.get(Language.ENGLISH).put(EntityType.WOLF, "Wolf");
			MobNamesMap.languageMapping.get(Language.ENGLISH).put(EntityType.ZOMBIE, "Zombie");
			MobNamesMap.languageMapping.get(Language.ENGLISH).put(EntityType.ZOMBIE_HORSE, "Zombie Horse");
			MobNamesMap.languageMapping.get(Language.ENGLISH).put(EntityType.ZOMBIE_VILLAGER, "Zombie");
			// 1.13:
			MobNamesMap.languageMapping.get(Language.ENGLISH).put(EntityType.PARROT, "Parrot");
			MobNamesMap.languageMapping.get(Language.ENGLISH).put(EntityType.DOLPHIN, "Dolphin");
			MobNamesMap.languageMapping.get(Language.ENGLISH).put(EntityType.DROWNED, "Drowned");
			MobNamesMap.languageMapping.get(Language.ENGLISH).put(EntityType.PHANTOM, "Phantom");
			MobNamesMap.languageMapping.get(Language.ENGLISH).put(EntityType.COD, "Cod");
			MobNamesMap.languageMapping.get(Language.ENGLISH).put(EntityType.SALMON, "Salmon");
			MobNamesMap.languageMapping.get(Language.ENGLISH).put(EntityType.PUFFERFISH, "Pufferfish");
			MobNamesMap.languageMapping.get(Language.ENGLISH).put(EntityType.TROPICAL_FISH, "Tropical Fish");
			MobNamesMap.languageMapping.get(Language.ENGLISH).put(EntityType.TURTLE, "Turtle");
			// 1.14
			MobNamesMap.languageMapping.get(Language.ENGLISH).put(EntityType.CAT, "Cat");
			MobNamesMap.languageMapping.get(Language.ENGLISH).put(EntityType.FOX, "Fox");
			MobNamesMap.languageMapping.get(Language.ENGLISH).put(EntityType.PANDA, "Panda");
			MobNamesMap.languageMapping.get(Language.ENGLISH).put(EntityType.PILLAGER, "Pillager");
			MobNamesMap.languageMapping.get(Language.ENGLISH).put(EntityType.RAVAGER, "Ravager");
			MobNamesMap.languageMapping.get(Language.ENGLISH).put(EntityType.TRADER_LLAMA, "Llama");
			MobNamesMap.languageMapping.get(Language.ENGLISH).put(EntityType.WANDERING_TRADER, "Wandering Trader");
			// 1.15
			//BEE		
			
			
			
			
		} catch (NoSuchFieldError e) {
			LogsModule.warning("Upgrade server to the 1.14.4 for full language support.");
		}
	}

}
