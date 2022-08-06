package com.github.majidshoorabi.tacocloud.jdbctempalte;

import com.github.majidshoorabi.tacocloud.jdbctempalte.repo.IngredientRepository;
import com.github.majidshoorabi.tacocloud.entities.Ingredient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author majid.shoorabi
 * @created 2022-03-August
 * @project IntelliJ IDEA
 */

@Service
public class IngredientService {

    private final IngredientRepository ingredientRepository;

    @Autowired
    public IngredientService(IngredientRepository ingredientRepository) {
        this.ingredientRepository = ingredientRepository;
    }

    public void insert(Ingredient ingredient) {
        ingredientRepository.save(ingredient);
    }

    public List<Ingredient> getAll() {
        List<Ingredient> list = new ArrayList<>();
        ingredientRepository.findAll().forEach(list::add);
        return list;
    }
}
