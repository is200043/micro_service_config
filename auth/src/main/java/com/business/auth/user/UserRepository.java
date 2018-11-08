/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.business.auth.user;

import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author chonlakornpunphopthaworn
 */
public interface UserRepository extends CrudRepository<User, Long> {

    User findByEmail(String email);
}
