package com.pchmn.ohosverify;

import com.pchmn.ohosverify.slice.JavaFormAbilitySlice;
import ohos.aafwk.ability.Ability;
import ohos.aafwk.content.Intent;

/**
 * Form validation via builder methods in Java.
 */
public class JavaFormAbility extends Ability {

    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setMainRoute(JavaFormAbilitySlice.class.getName());
    }
}
