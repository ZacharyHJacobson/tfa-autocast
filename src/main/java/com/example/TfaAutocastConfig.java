package com.example;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("example")
public interface TfaAutocastConfig extends Config
{
    enum Spell {
        NONE_REQUIRED,
        WIND_SURGE,
        WATER_SURGE,
        EARTH_SURGE,
        FIRE_SURGE,
        BLOOD_BARRAGE,
        ICE_BARRAGE,
        UNDEAD_GRASP
    }

    @ConfigItem(
            position = 0,
            keyName = "spell1",
            name = "Archive Guardian",
            description = "Blocks entry into the raid unless spell is active"
    )
    default Spell spell1()
    {
        return Spell.NONE_REQUIRED;
    }
    @ConfigItem(
            position = 1,
            keyName = "spell2",
            name = "Ezekiel/Bork",
            description = "Blocks entry into the second boss unless spell is active"
    )
    default Spell spell2()
    {
        return Spell.NONE_REQUIRED;
    }
    @ConfigItem(
            position = 2,
            keyName = "spell3",
            name = "Moia/Dreadnoth",
            description = "Blocks entry into the third boss unless spell is active"
    )
    default Spell spell3()
    {
        return Spell.NONE_REQUIRED;
    }
    @ConfigItem(
            position = 3,
            keyName = "spell4",
            name = "Dagon'hai/Xarth",
            description = "Blocks entry into the fourth boss unless spell is active"
    )
    default Spell spell4()
    {
        return Spell.NONE_REQUIRED;
    }
    @ConfigItem(
            position = 4,
            keyName = "spell5",
            name = "Ocellus",
            description = "Blocks the \"Proceed\" option on Ocellus unless spell is active"
    )
    default Spell spell5()
    {
        return Spell.NONE_REQUIRED;
    }
}
