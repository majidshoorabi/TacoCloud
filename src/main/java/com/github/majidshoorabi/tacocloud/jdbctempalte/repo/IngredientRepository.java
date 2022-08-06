package com.github.majidshoorabi.tacocloud.jdbctempalte.repo;

import com.github.majidshoorabi.tacocloud.entities.Ingredient;

import java.util.Optional;

/**
 * @author majid.shoorabi
 * @created 2022-03-August
 * @project IntelliJ IDEA
 */

public interface IngredientRepository {

    Iterable<Ingredient> findAll();

    Optional<Ingredient> findById(String id);

    Ingredient save(Ingredient ingredient);
}
