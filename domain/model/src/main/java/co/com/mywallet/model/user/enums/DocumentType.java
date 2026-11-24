package co.com.mywallet.model.user.enums;

import co.com.mywallet.crosscutting.helpers.TextHelper;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum DocumentType {

    CC("\\d{6,10}"),
    CE("[A-Za-z0-9]{6,12}"),
    PASSPORT("[A-Za-z0-9]{6,12}");

    private final String pattern;

    public boolean isValid(String type) {
        return TextHelper.patternIsValid(type, pattern);
    }
}
