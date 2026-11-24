package co.com.mywallet.model.user.valueobject;

import co.com.mywallet.crosscutting.helpers.TextHelper;
import co.com.mywallet.model.exception.BusinessError;
import co.com.mywallet.model.exception.BusinessException;

public record Location(String city, String department) {
    public Location {
        city = TextHelper.applyTrim(city);
        department = TextHelper.applyTrim(department);

        if (TextHelper.isEmpty(city) || TextHelper.isEmpty(department)) {
            throw new BusinessException(BusinessError.INVALID_LOCATION);
        }
    }
}
