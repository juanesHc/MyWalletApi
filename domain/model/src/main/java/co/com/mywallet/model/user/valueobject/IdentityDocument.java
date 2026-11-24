package co.com.mywallet.model.user.valueobject;

import co.com.mywallet.crosscutting.helpers.ObjectHelper;
import co.com.mywallet.crosscutting.helpers.TextHelper;
import co.com.mywallet.model.exception.BusinessError;
import co.com.mywallet.model.exception.BusinessException;
import co.com.mywallet.model.user.enums.DocumentType;

public record IdentityDocument(DocumentType type,String number) {
    public IdentityDocument {
        number= TextHelper.applyTrim(number);
        if (ObjectHelper.isNull(type) || !type.isValid(number)) {
            throw new BusinessException(BusinessError.INVALID_DOCUMENT);
        }
    }
}
