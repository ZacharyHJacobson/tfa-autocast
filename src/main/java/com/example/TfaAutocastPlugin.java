package com.example;

import com.google.inject.Provides;
import javax.inject.Inject;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Client;
import net.runelite.api.events.MenuOptionClicked;
import net.runelite.api.gameval.VarbitID;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;

import static com.example.TfaAutocastConstants.Door;
import static com.example.TfaAutocastConstants.doorByDoorId;
import static com.example.TfaAutocastConstants.Spell;
import static com.example.TfaAutocastConstants.spellIdBySpell;

@Slf4j
@PluginDescriptor(
	name = "TFA Autocast"
)
public class TfaAutocastPlugin extends Plugin
{
	@Inject
	private Client client;

	@Inject
	private TfaAutocastConfig config;

	@Subscribe void onMenuOptionClicked(MenuOptionClicked event)
	{
		//! only run in TFA
		if(!checkAutocast(event.getId())) event.consume();
		else if (event.getMenuTarget().contains("Ocellus") || event.getMenuTarget().contains("Hooded Figure"))
		{
			//! only block proceed and talk to
			if(!checkAutocast(config.spell_ocellus())) event.consume();
		}
	}

    private boolean checkAutocast(int event_id) {
		Spell spell;
		Door door = doorByDoorId.get(event_id);
		if (door == null) return true;
		switch(door) {
			case GUARDIAN:
				spell = config.spell_guardian();
				break;
			case EZEKIEL:
				spell = config.spell_ezekiel();
				break;
			case BORK:
				spell = config.spell_bork();
				break;
			case MOIA:
				spell = config.spell_moia();
				break;
			case DREADNOTH:
				spell = config.spell_dreadnoth();
				break;
			case DAGONHAI:
				spell = config.spell_dagonhai();
				break;
			case XARTH:
				spell = config.spell_xarth();
				break;
			default:
				return true;
		}
        return checkAutocast(spell);
    }

    private boolean checkAutocast(Spell spell) {
		//! check last known
		if(spell == Spell.NONE_REQUIRED) return true;
		int autocastVarbit = client.getVarbitValue(VarbitID.AUTOCAST_SPELL);
		return(spellIdBySpell.get(spell) == autocastVarbit);
	}

	@Provides
	TfaAutocastConfig provideConfig(ConfigManager configManager)
	{
		return configManager.getConfig(TfaAutocastConfig.class);
	}
}
