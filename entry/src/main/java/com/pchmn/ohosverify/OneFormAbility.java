package com.pchmn.ohosverify;

import com.pchmn.ohosverify.slice.OneFormAbilitySlice;
import ohos.aafwk.ability.Ability;
import ohos.aafwk.content.Intent;

/**
 * Form validation via form builder method and JSON InputValidators.
 */
public class OneFormAbility extends Ability {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setMainRoute(OneFormAbilitySlice.class.getName());
    }
}
