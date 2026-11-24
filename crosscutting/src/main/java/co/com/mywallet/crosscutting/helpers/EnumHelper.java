package co.com.mywallet.crosscutting.helpers;

import java.util.Arrays;

public class EnumHelper {

    private EnumHelper() {
    }

    public static <E extends Enum<E>> boolean exists(Class<E> enumClass, String value) {
        return Arrays.stream(enumClass.getEnumConstants())
                .anyMatch(constant -> constant.name().equals(value));
    }
}
