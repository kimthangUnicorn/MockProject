package com.management.JOBIT.service;

import java.util.List;

import com.management.JOBIT.model.User;
import com.management.JOBIT.model.PackageName;

public interface UserService {
//	USER
	List < User > getAllUser();
    void saveUser(User user);
    User getUserById(Integer id);
    User getUserByEmail(String email);
    void deleteUserById(Integer id);
	User getUserByLogin(String email, String password);
	
// PACKAGE	
	List < PackageName > getAllPackage();
    void savePackage(PackageName pack);
    void deletePackageByName(String name);
    PackageName getByPackageName(String name);
    void deleteByPackageName(String name);
}
