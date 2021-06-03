package com.yzz.devapphm;

import com.yzz.devapphm.slice.MainAbilitySlice;
import ohos.aafwk.ability.Ability;
import ohos.aafwk.content.Intent;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.ability.ProviderFormInfo;

public class MainAbility extends Ability {
    private static final int DEFAULT_DIMENSION_2X2 = 2;

    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setMainRoute(MainAbilitySlice.class.getName());
    }

    @Override
    protected ProviderFormInfo onCreateForm(Intent intent) {
        String formName = intent.getStringParam(AbilitySlice.PARAM_FORM_NAME_KEY);
        int dimension = intent.getIntParam(AbilitySlice.PARAM_FORM_DIMENSION_KEY, DEFAULT_DIMENSION_2X2);
        if (formName.equals("service_widget")) {
            if (dimension == DEFAULT_DIMENSION_2X2) {
                return new ProviderFormInfo(ResourceTable.Layout_form_image_with_info_service_widget_2_2, this);
            }
        }
        return null;
    }

    @Override
    protected void onUpdateForm(long formId) {
        super.onUpdateForm(formId);
    }

    @Override
    protected void onDeleteForm(long formId) {
        super.onDeleteForm(formId);
    }
}
