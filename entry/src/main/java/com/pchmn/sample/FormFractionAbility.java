package com.pchmn.sample;

import ohos.aafwk.ability.fraction.FractionAbility;
import ohos.aafwk.ability.fraction.FractionManager;
import ohos.aafwk.content.Intent;

/**
 * Fraction ability for FormFraction.
 */
public class FormFractionAbility extends FractionAbility {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_ability_form_fraction);
        FractionManager fractionManager = getFractionManager();
        fractionManager.startFractionScheduler()
                .add(ResourceTable.Id_fragment1, new FormFraction(), FormFraction.class.getName())
                .submit();
    }
}
