package com.smith.round;

import java.util.Map;

/**
 * edited by AndersonKim
 * at 2018/10/30
 */
public class Item {
    private final String id;
    private final String type;
    private final String name;
    private final String description;
    private final EquipmentLocation position;
    private final Map<String, Integer> properties;

    public Item(String id, String type, String name, String description, EquipmentLocation position, Map<String, Integer> properties) {
        this.id = id;
        this.type = type;
        this.name = name;
        this.description = description;
        this.position = position;
        this.properties = properties;
    }
}
