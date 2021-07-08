package com.pchmn.libohosverify.validator;

import ohos.utils.CommonPattern;

/**
 * Basic unit that validates URL addresses.
 */
public class UrlValidator extends AbstractValidator {

    public UrlValidator() {
        mErrorMessage = "This url is not valid";
    }

    @Override
    public boolean isValid(String value) {
        return CommonPattern.getWebUrl().matcher(value).matches();
    }

    @Override
    public String getErrorMessage() {
        return mErrorMessage;
    }
}
