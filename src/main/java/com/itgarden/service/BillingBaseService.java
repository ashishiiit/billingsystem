package com.itgarden.service;

import com.itgarden.entity.BaseObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Component
public class BillingBaseService<T, ID> {

    @Autowired
    private JpaRepository<T, ID> repository;

    public BaseObject save(T entity) {
        return (BaseObject)repository.save(entity);
    }

    public List<T> findAll() {

        return repository.findAll();
    }

    public Optional<T> findById(ID id) {

        return repository.findById(id);
    }

    public void deleteById(ID id) {

        repository.deleteById(id);
    }

    public void delete(T type) {

        repository.delete(type);
    }


}
