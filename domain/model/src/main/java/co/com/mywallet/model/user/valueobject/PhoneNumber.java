package co.com.mywallet.model.user.valueobject;

import co.com.mywallet.crosscutting.helpers.TextHelper;
import co.com.mywallet.model.exception.BusinessError;
import co.com.mywallet.model.exception.BusinessException;

public record PhoneNumber(String value) {
    private static final String PATTERN = "(\\+57)?3\\d{9}";

    public PhoneNumber {
        value = TextHelper.applyTrim(value);
        if (!TextHelper.patternIsValid(value, PATTERN)) {
            throw new BusinessException(BusinessError.INVALID_PHONE);
        }
    }
}
