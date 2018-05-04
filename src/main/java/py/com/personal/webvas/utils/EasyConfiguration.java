package py.com.personal.webvas.utils;

import java.io.FileInputStream;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.util.Properties;

public class EasyConfiguration {

    public enum ConfigurationSource {
        RESOURCE, FILE
    }

    public static void mapConfigurableProperties(
            ConfigurationSource configurationSource, String sourceAddress,
            Object... t) throws IllegalArgumentException,
            IllegalAccessException {

        if (configurationSource == null || sourceAddress == null || t == null) {
            throw new IllegalArgumentException();
        }

        for (Object target : t) {

            if (target == null) {
                throw new IllegalArgumentException();
            }

            Properties sourceProperties = getSourceProperties(
                    configurationSource, sourceAddress, target);

            if (sourceProperties.isEmpty()) {
                throw new IllegalStateException("Configuration file is empty");
            }

            for (Field f : target.getClass().getDeclaredFields()) {
                String fieldName = f.getName();

                if (!fieldName.startsWith("_")) {
                    continue;
                }

                fieldName = fieldName.substring(1);

                if (!sourceProperties.containsKey(fieldName)) {
                    System.out
                            .println("No mapping key for field: " + fieldName);
                    continue;
                }

                boolean originalAccesibleValue = f.isAccessible();

                f.setAccessible(true);
                f.set(target,
                        getConvertedValueForType(
                                (String) sourceProperties.get(fieldName),
                                f.getType()));
                f.setAccessible(originalAccesibleValue);
            }
        }

    }

    private static Properties getSourceProperties(
            ConfigurationSource configurationSource, String sourceAddress,
            Object target) {
        Properties prop = new Properties();
        try {
            InputStream is = configurationSource == ConfigurationSource.FILE ? new FileInputStream(
                    sourceAddress) : target.getClass().getResourceAsStream(
                    sourceAddress);

            prop.loadFromXML(is);
            is.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return prop;
    }

    private static Object getConvertedValueForType(String sourceValue, @SuppressWarnings("rawtypes") Class c) {
        Object convertedValue = null;
        if (c == Long.class) {
            convertedValue = new Long((String) sourceValue);
        } else if (c == Integer.class) {
            convertedValue = new Integer((String) sourceValue);
        } else if (c == BigDecimal.class) {
            convertedValue = new BigDecimal((String) sourceValue);
        } else if (c == Boolean.class) {
            convertedValue = sourceValue.equals("true") ? Boolean.TRUE
                    : Boolean.FALSE;
        } else { // for string values
            convertedValue = sourceValue;
        }
        return convertedValue;
    }
}
