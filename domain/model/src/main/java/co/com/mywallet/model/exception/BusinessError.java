package co.com.mywallet.model.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum BusinessError {

    EMAIL_ALREADY_REGISTERED("MW-001", "El email ya está registrado"),
    INVALID_CREDENTIALS("MW-002", "Email o contraseña incorrectos"),
    USER_INACTIVE("MW-003", "La cuenta está inactiva"),
    TRANSACTION_NOT_FOUND("MW-004", "Movimiento no encontrado"),
    INVALID_AMOUNT("MW-005", "El monto debe ser mayor que 0"),
    FUTURE_DATE("MW-006", "La fecha no puede ser futura"),
    CATEGORY_REQUIRED("MW-007", "El movimiento requiere categoría"),
    WEAK_PASSWORD("MW-008", "La contraseña no cumple los requisitos"),
    INVALID_DOCUMENT("MW-009", "El número no es válido para el tipo de documento"),
    INVALID_PHONE("MW-010", "El teléfono no es válido"),
    INVALID_LOCATION("MW-011", "Ciudad y departamento son obligatorios"),
    UNDERAGE_USER("MW-012", "Debes ser mayor de 18 años"),
    INVALID_SPENDING_LIMIT("MW-013", "El límite de gasto debe ser mayor que 0"),
    NOTIFICATION_NOT_FOUND("MW-014", "Notificación no encontrada"),
    USER_NOT_FOUND("MW-015", "Usuario no encontrado"),
    INVALID_CATEGORY("MW-016", "La categoría no corresponde al tipo de movimiento"),
    TRANSACTION_TYPE_REQUIRED("MW-017", "El movimiento requiere un tipo, Gasto o Ingreso");

    private final String code;
    private final String message;
}
