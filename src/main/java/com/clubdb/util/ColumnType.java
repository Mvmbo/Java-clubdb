
package com.clubdb.util;

import java.math.BigDecimal;
import java.time.LocalDate;

public enum ColumnType {
    INT {
        @Override
        public Object parse(String value) {
            if (value == null || value.isBlank()) {
                return null;
            }
            return Integer.valueOf(value.trim());
        }
    },
    STRING {
        @Override
        public Object parse(String value) {
            if (value == null) {
                return null;
            }
            String trimmed = value.trim();
            return trimmed.isEmpty() ? null : trimmed;
        }
    },
    DATE {
        @Override
        public Object parse(String value) {
            if (value == null || value.isBlank()) {
                return null;
            }
            return LocalDate.parse(value.trim());
        }

        @Override
        public String format(Object value) {
            if (value == null) {
                return "";
            }
            if (value instanceof LocalDate date) {
                return date.toString();
            }
            return value.toString();
        }
    },
    DECIMAL {
        @Override
        public Object parse(String value) {
            if (value == null || value.isBlank()) {
                return null;
            }
            return new BigDecimal(value.trim());
        }
    },
    BOOLEAN {
        @Override
        public Object parse(String value) {
            if (value == null || value.isBlank()) {
                return null;
            }
            return Boolean.valueOf(value.trim());
        }
    };

    public Object parse(String value) {
        return value;
    }

    public String format(Object value) {
        return value == null ? "" : value.toString();
    }
}
