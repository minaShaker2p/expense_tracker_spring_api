package com.mina.expensetrackerapi.repsitory;

import com.mina.expensetrackerapi.exception.EtAuthException;
import com.mina.expensetrackerapi.model.User;

public class UserRepositoryImpl implements UserRepository {

    @Override
    public Integer create(String firstName, String lastName, String email, String password) throws EtAuthException {
        return null;
    }

    @Override
    public User findByEmailAndPassword(String email, String password) throws EtAuthException {
        return null;
    }

    @Override
    public Integer getCountByEmail(String email) {
        return null;
    }

    @Override
    public User findById(Integer userId) {
        return null;
    }
}
