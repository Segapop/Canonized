package com.lsb.entity.abilities;

import com.gempire.entities.abilities.base.Ability;
import com.gempire.entities.abilities.interfaces.IIdleAbility;
import net.minecraft.network.chat.Component;

public class DancerAbility extends Ability implements IIdleAbility {

    //Idle abilities are used for abilities like torch bearer, or beastmaster
    public DancerAbility() {
        // The id and weight of your ability
        // the id should be in a new 100s digit depending on your addon
        // this prevents compat issues
        // the weight is what determines how likely gems are to have the ability
        super(303,5);
    }

    @Override
    public Component getName() {
        return Component.translatable("ability.lsb.dancer");
    }

    @Override
    public void execute() {
        // Will spin in circles and generate XP if music is playing

    }
}
