package com.mina.expensetrackerapi.service;

import com.mina.expensetrackerapi.exception.EtAuthException;
import com.mina.expensetrackerapi.model.User;

public class UserServiceImpl implements UserService {

    @Override
    public User validateUser(String email, String password) throws EtAuthException {
        return null;
    }

    @Override
    public User registerUser(String firstName, String lastName, String email, String password) throws EtAuthException {
        return null;
    }
}
