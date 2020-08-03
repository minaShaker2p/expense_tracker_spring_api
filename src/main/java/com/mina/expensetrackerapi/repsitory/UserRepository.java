package com.mina.expensetrackerapi.repsitory;

import com.mina.expensetrackerapi.exception.EtAuthException;
import com.mina.expensetrackerapi.model.User;

public interface UserRepository {

    Integer create(String firstName, String lastName, String email, String password) throws EtAuthException;

    User findByEmailAndPassword(String email, String password) throws EtAuthException;

    Integer getCountByEmail(String email);

    User findById(Integer userId);
}
