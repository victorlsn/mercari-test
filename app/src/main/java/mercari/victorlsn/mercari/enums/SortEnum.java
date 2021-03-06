package mercari.victorlsn.mercari.enums;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by victorlsn on 25/07/18.
 */

public enum SortEnum {
    DEFAULT("DEFAULT"),
    NAME("NAME"),
    STATUS("STATUS"),
    PRICE("PRICE"),
    LIKES("LIKES"),
    COMMENTS("COMMENTS");


    private static final Map<String, SortEnum> map = new HashMap<>();

    static {
        for (SortEnum en : values()) {
            map.put(en.text, en);
        }
    }

    private String text;

    SortEnum(String text) {
        this.text = text;
    }

    public static SortEnum valueFor(String name) {
        return map.get(name);
    }

    @Override
    public String toString() {
        return text;
    }
}
