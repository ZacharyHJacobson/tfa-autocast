package com.example;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

import static com.example.TfaAutocastConstants.Spell;

@ConfigGroup("example")
public interface TfaAutocastConfig extends Config
{
    @ConfigItem(
            position = 0,
            keyName = "spell_guardian",
            name = "Archive Guardian",
            description = "Blocks entry into the raid unless spell is active"
    )
    default Spell spell_guardian()
    {
        return Spell.NONE_REQUIRED;
    }
    @ConfigItem(
            position = 1,
            keyName = "spell_ezekiel",
            name = "Ezekiel",
            description = "Blocks entry into Ezekiel unless spell is active"
    )
    default Spell spell_ezekiel()
    {
        return Spell.NONE_REQUIRED;
    }
    @ConfigItem(
            position = 2,
            keyName = "spell_bork",
            name = "Bork",
            description = "Blocks entry into Bork unless spell is active"
    )
    default Spell spell_bork()
    {
        return Spell.NONE_REQUIRED;
    }
    @ConfigItem(
            position = 3,
            keyName = "spell_moia",
            name = "Moia",
            description = "Blocks entry into Moia unless spell is active"
    )
    default Spell spell_moia()
    {
        return Spell.NONE_REQUIRED;
    }
    @ConfigItem(
            position = 4,
            keyName = "spell_dreadnoth",
            name = "Dreadnoth",
            description = "Blocks entry into Dreadnoth unless spell is active"
    )
    default Spell spell_dreadnoth()
    {
        return Spell.NONE_REQUIRED;
    }
    @ConfigItem(
            position = 5,
            keyName = "spell_dagon'hai",
            name = "Dagon'hai",
            description = "Blocks entry into Dagon'hai unless spell is active"
    )
    default Spell spell_dagonhai()
    {
        return Spell.NONE_REQUIRED;
    }
    @ConfigItem(
            position = 6,
            keyName = "spell_xarth",
            name = "Xarth",
            description = "Blocks entry into Xarth unless spell is active"
    )
    default Spell spell_xarth()
    {
        return Spell.NONE_REQUIRED;
    }
    @ConfigItem(
            position = 7,
            keyName = "spell_ocellus",
            name = "Ocellus",
            description = "Blocks the \"Proceed\" and \"Talk\" options on Ocellus unless spell is active"
    )
    default Spell spell_ocellus()
    {
        return Spell.NONE_REQUIRED;
    }
}
