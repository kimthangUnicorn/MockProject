package com.management.JOBIT.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import com.management.JOBIT.model.User;
import com.management.JOBIT.model.PackageName;
import com.management.JOBIT.repository.PackageRepository;
import com.management.JOBIT.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private PackageRepository packageRepository;

	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	@Override
	public void saveUser(User user) {
		// TODO Auto-generated method stub
		this.userRepository.save(user);
	}

	@Override
	public User getUserById(Integer id) {
		// TODO Auto-generated method stub
		Optional<User> optional = userRepository.findById(id);
		User user = null;
		if (optional.isPresent()) {
			user = optional.get();
		} else {
			throw new RuntimeException(" User not found for id :: " + id);
		}
		return user;

	}

	@Override
	public User getUserByLogin(String email, String password) {
		// TODO Auto-generated method stub
		Optional<User> optional = userRepository.findByEmailAndPassword(email, password);
		User user = null;
		if (optional.isPresent()) {
			user = optional.get();
		} else {
			throw new RuntimeException(" User not found for id :: " + email + password);
		}
		return user;

	}

	@Override
	public void deleteUserById(Integer id) {
		// TODO Auto-generated method stub
		this.userRepository.deleteById(id);
	}

	@Override
	public User getUserByEmail(String email) {
		// TODO Auto-generated method stub
		Optional<User> optional = userRepository.findByEmail(email);
		User user = null;
		if (optional.isPresent()) {
			user = optional.get();
		} else {
			throw new RuntimeException(" User not found for id :: " + email);
		}
		return user;
	}

//	------------- Package --------------
	@Override
	public List<PackageName> getAllPackage() {
		// TODO Auto-generated method stub
		return packageRepository.findAll();
	}

	@Override
	public void savePackage(PackageName pack) {
		// TODO Auto-generated method stub
		this.packageRepository.save(pack);
	}

	@Override
	public PackageName getByPackageName(String name) {
				Optional < PackageName > optional = packageRepository.findByPackageName(name);
				PackageName pack = null;
		        if (optional.isPresent()) {
		        	pack = optional.get();
		        } else {
		            throw new RuntimeException(" Package not found for packname :: " + name);
		        }
		        return pack;	
	}

	@Modifying
	@Query("delete from package p where p.package_name = ?2")
	@Override
	public void deleteByPackageName(String name) {
		// TODO Auto-generated method stub
		Optional<PackageName> optional = packageRepository.findByPackageName(name);
	    if (optional.isPresent()) {
	        packageRepository.delete(optional.get());
	    } else {
	        throw new RuntimeException("Package not found for packname :: " + name);
	    }
	}



	@Override
	public void deletePackageByName(String name) {
		// TODO Auto-generated method stub
		
	}

	


}
