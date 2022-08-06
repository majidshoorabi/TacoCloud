package com.github.majidshoorabi.tacocloud.spring_data_jdbc.repo;

import com.github.majidshoorabi.tacocloud.entities.TacoOrder;
import org.springframework.data.repository.CrudRepository;

/**
 * @author majid.shoorabi
 * @created 2022-03-August
 * @project IntelliJ IDEA
 */

public interface OrderRepository extends CrudRepository<TacoOrder, Long> {

}
