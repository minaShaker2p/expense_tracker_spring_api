package com.mina.expensetrackerapi.service;

import com.mina.expensetrackerapi.exception.EtAuthException;
import com.mina.expensetrackerapi.model.User;

public interface UserService {

    User validateUser(String email, String password) throws EtAuthException;

    User registerUser(String firstName, String lastName, String email, String password) throws EtAuthException;
}
