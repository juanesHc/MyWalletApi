package co.com.mywallet.model.transaction.valueobject;

import co.com.mywallet.crosscutting.helpers.EnumHelper;
import co.com.mywallet.crosscutting.helpers.ObjectHelper;
import co.com.mywallet.crosscutting.helpers.TextHelper;
import co.com.mywallet.model.exception.BusinessError;
import co.com.mywallet.model.exception.BusinessException;
import co.com.mywallet.model.transaction.enums.ExpenseCategory;
import co.com.mywallet.model.transaction.enums.IncomeCategory;
import co.com.mywallet.model.transaction.enums.TransactionType;

import static co.com.mywallet.model.transaction.enums.TransactionType.EXPENSE;
import static co.com.mywallet.model.transaction.enums.TransactionType.INCOME;

public record TransactionCategory(TransactionType type, String name) {

    public TransactionCategory {
        name = TextHelper.toUpperCase(name);

        if (ObjectHelper.isNull(type)) {
            throw new BusinessException(BusinessError.TRANSACTION_TYPE_REQUIRED);
        }
        if (TextHelper.isEmpty(name)) {
            throw new BusinessException(BusinessError.CATEGORY_REQUIRED);
        }
        if (!belongsTo(type, name)) {
            throw new BusinessException(BusinessError.INVALID_CATEGORY);
        }
    }

    public boolean isExpense() {
        return type == EXPENSE;
    }

    public boolean isIncome() {
        return type == INCOME;
    }

    private static boolean belongsTo(TransactionType type, String name) {
        return switch (type) {
            case EXPENSE -> EnumHelper.exists(ExpenseCategory.class, name);
            case INCOME  -> EnumHelper.exists(IncomeCategory.class, name);
        };
    }
}
