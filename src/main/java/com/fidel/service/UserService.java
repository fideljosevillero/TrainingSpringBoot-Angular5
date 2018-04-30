package com.fidel.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.fidel.model.User;
import com.fidel.repository.UserRepository;

@Service
public class UserService implements UserRepository  {
	
	@Autowired
	UserRepository repository;
	
	@Override
	public void deleteAllInBatch() {
		//repository.deleteAll();
	}

	@Override
	public void deleteInBatch(Iterable<User> arg0) {
//		repository.deleteInBatch(arg0);
	}

	@Override
	public List<User> findAll() {
		return repository.findAll();
	}

	@Override
	public List<User> findAll(Sort arg0) {
		return null;
	}

	@Override
	public <S extends User> List<S> findAll(Example<S> arg0) {
		return null;
	}

	@Override
	public <S extends User> List<S> findAll(Example<S> arg0, Sort arg1) {
		return null;
	}

	@Override
	public List<User> findAllById(Iterable<Integer> id) {
		return repository.findAllById(id);
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User getOne(Integer id) {
		return repository.getOne(id);
	}

	@Override
	public <S extends User> List<S> saveAll(Iterable<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends User> S saveAndFlush(S arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<User> findAll(Pageable arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		return repository.count();
	}

	@Override
	public void delete(User user) {
		repository.delete(user);
	}

	@Override
	public void deleteAll() {
		
	}

	@Override
	public void deleteAll(Iterable<? extends User> arg0) {
		
	}

	@Override
	public void deleteById(Integer id) {
		repository.deleteById(id);
	}

	@Override
	public boolean existsById(Integer id) {
		return repository.existsById(id);
	}

	@Override
	public Optional<User> findById(Integer arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends User> S save(S user) {
		return repository.save(user);
	}

	@Override
	public <S extends User> long count(Example<S> arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends User> boolean exists(Example<S> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public <S extends User> Page<S> findAll(Example<S> arg0, Pageable arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends User> Optional<S> findOne(Example<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

}
