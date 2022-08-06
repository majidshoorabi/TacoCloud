package com.github.majidshoorabi.tacocloud.jdbctempalte.repo;

import com.github.majidshoorabi.tacocloud.entities.TacoOrder;

/**
 * @author majid.shoorabi
 * @created 2022-03-August
 * @project IntelliJ IDEA
 */

public interface OrderRepository {

    TacoOrder save(TacoOrder order);

}
