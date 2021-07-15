package com.pchmn.sample;

import ohos.aafwk.ability.fraction.Fraction;
import ohos.aafwk.content.Intent;
import ohos.agp.components.Button;
import ohos.agp.components.Component;
import ohos.agp.components.ComponentContainer;
import ohos.agp.components.DirectionalLayout;
import ohos.agp.components.LayoutScatter;
import ohos.agp.window.dialog.ToastDialog;

/**
 * Form validation inside a Fraction.
 */
public class FormFraction extends Fraction {

    Form mForm;
    Button mValidate;

    @Override
    protected Component onComponentAttached(LayoutScatter scatter, ComponentContainer container, Intent intent) {
        Component mComponent = scatter.parse(ResourceTable.Layout_layout_fraction_detail, container, false);
        initComponents(mComponent);
        return mComponent;
    }

    private void initComponents(Component mComponent) {

        DirectionalLayout mViewForm = (DirectionalLayout) mComponent.findComponentById(ResourceTable.Id_fragment_form1);
        mForm = new Form.Builder(this, mViewForm)
                .showErrors(true)
                .build();
        mValidate = (Button) mComponent.findComponentById(ResourceTable.Id_validate_fraction);
        mValidate.setClickedListener(component -> {
            if (mForm.isValid()) {
                String msg = "Form is valid";
                new ToastDialog(mComponent.getContext()).setDuration(1000).setText(msg).show();
            } else {
                String msg = "Form is invalid";
                new ToastDialog(mComponent.getContext()).setDuration(1000).setText(msg).show();
            }
        });

    }

}
