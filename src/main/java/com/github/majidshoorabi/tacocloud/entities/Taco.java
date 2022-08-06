package com.github.majidshoorabi.tacocloud.entities;

import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * @author majid.shoorabi
 * @created 2022-03-August
 * @project IntelliJ IDEA
 */

@Data
public class Taco {

    private String name;
    private List<Ingredient> ingredients;
    private Long id;
    private Date createdAt = new Date();
}
