package com.github.majidshoorabi.tacocloud.spring_data_jdbc.repo;

import com.github.majidshoorabi.tacocloud.entities.Ingredient;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

/**
 * @author majid.shoorabi
 * @created 2022-03-August
 * @project IntelliJ IDEA
 */

public interface IngredientRepository extends CrudRepository<Ingredient, String> {
}
