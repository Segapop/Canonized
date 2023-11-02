package com.lsb.init;

import com.lsb.entity.abilities.*;
import com.gempire.init.ModAbilities;

public class AddonAbilities {
    public static void registerAbilities() {
        ModAbilities.abilities.add(new DancerAbility());
        ModAbilities.abilities.add(new SharpshooterAbility());
    }
}
