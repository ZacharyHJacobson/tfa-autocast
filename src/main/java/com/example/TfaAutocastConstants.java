package com.example;

import java.util.HashMap;
import java.util.Map;

import static net.runelite.api.ObjectID.ARCHIVE_DOOR;	// guardian
import static net.runelite.api.ObjectID.DOOR_63090;		// ezekiel
import static net.runelite.api.ObjectID.DOOR_63093;		// bork
import static net.runelite.api.ObjectID.DOOR_63098;		// moia
import static net.runelite.api.ObjectID.DOOR_63101;		// dreadnoth
import static net.runelite.api.ObjectID.DOOR_63104;		// dagon'hai
import static net.runelite.api.ObjectID.DOOR_63107;		// xarth

public abstract class TfaAutocastConstants {
    public enum Spell {
        NONE_REQUIRED,
        WIND_SURGE,
        WATER_SURGE,
        EARTH_SURGE,
        FIRE_SURGE,
        BLOOD_BARRAGE,
        ICE_BARRAGE,
        UNDEAD_GRASP
    }

    public static final HashMap<Spell, Integer> spellIdBySpell = new HashMap<>(Map.of(
            TfaAutocastConstants.Spell.WIND_SURGE, 48,
            TfaAutocastConstants.Spell.WATER_SURGE, 49,
            TfaAutocastConstants.Spell.EARTH_SURGE, 50,
            TfaAutocastConstants.Spell.FIRE_SURGE, 51,
            TfaAutocastConstants.Spell.BLOOD_BARRAGE, 45,
            TfaAutocastConstants.Spell.ICE_BARRAGE, 46,
            TfaAutocastConstants.Spell.UNDEAD_GRASP, 58
    ));

    public enum Door {
        GUARDIAN,
        EZEKIEL,
        BORK,
        MOIA,
        DREADNOTH,
        DAGONHAI,
        XARTH
    }

    public static final HashMap<Integer, Door> doorByDoorId = new HashMap<>(Map.of(
        ARCHIVE_DOOR, Door.GUARDIAN,
        DOOR_63090, Door.EZEKIEL,
        DOOR_63093, Door.BORK,
        DOOR_63098, Door.MOIA,
        DOOR_63101, Door.DREADNOTH,
        DOOR_63104, Door.DAGONHAI,
        DOOR_63107, Door.XARTH
    ));
}
