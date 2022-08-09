package com.github.majidshoorabi.tacocloud.security;

import org.springframework.data.repository.CrudRepository;

/**
 * @author majid.shoorabi
 * @created 2022-09-August
 * @project IntelliJ IDEA
 */

public interface UserRepository extends CrudRepository<User, Long> {

    User findByUsername(String username);
}
