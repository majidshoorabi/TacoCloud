package com.github.majidshoorabi.tacocloud.entities;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.util.Date;
import java.util.List;

/**
 * @author majid.shoorabi
 * @created 2022-03-August
 * @project IntelliJ IDEA
 */

@Data
@Table
public class Taco {


    private String name;
    private List<Ingredient> ingredients;
    @Id
    private Long id;
    private Date createdAt = new Date();
}
