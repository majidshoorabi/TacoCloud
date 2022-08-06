package com.github.majidshoorabi.tacocloud.entities;

import lombok.Data;

/**
 * @author majid.shoorabi
 * @created 2022-03-August
 * @project IntelliJ IDEA
 */

@Data
public class Ingredient {

    private final String id;
    private final String name;
    private final Type type;

    public enum Type {
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
    }
}
