package com.pchmn.ohosverify.slice;

import com.pchmn.libohosverify.Form;
import com.pchmn.libohosverify.InputValidator;
import com.pchmn.ohosverify.ResourceTable;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.agp.components.Button;
import ohos.agp.window.dialog.ToastDialog;

/**
 * Form validation via JSON InputValidators and Forms.
 */
public class TwoFormAbilitySlice extends AbilitySlice {

    Form mForm1;
    Form mForm2;
    Button mValidateForm1;
    Button mValidateForm2;

    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_ability_two_form);

        InputValidator mTIV1 = (InputValidator) findComponentById(ResourceTable.Id_tiv1);
        mTIV1.setRequired(true);

        mForm1 = (Form) findComponentById(ResourceTable.Id_form1);
        mForm2 = (Form) findComponentById(ResourceTable.Id_form2);

        mValidateForm1 = (Button) findComponentById(ResourceTable.Id_validate_form1);
        mValidateForm2 = (Button) findComponentById(ResourceTable.Id_validate_form2);

        mValidateForm1.setClickedListener(component ->
                showToast(mForm1.isValid() ? "Form 1 is valid" : "Form 1 is not valid"));

        mValidateForm2.setClickedListener(component ->
                showToast(mForm2.isValid() ? "Form 2 is valid" : "Form 2 is not valid"));
    }

    private void showToast(String msg) {
        new ToastDialog(this).setDuration(1000).setText(msg).show();
    }

    @Override
    public void onActive() {
        super.onActive();
    }

    @Override
    public void onForeground(Intent intent) {
        super.onForeground(intent);
    }
}
