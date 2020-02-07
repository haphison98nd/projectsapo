package com.example.sapoproject.service;

import com.example.sapoproject.entity.ProductEntity;
import com.example.sapoproject.repository.ProductRepository;
import com.example.sapoproject.service.ipm.ProductServiceIpm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ProductService implements ProductServiceIpm {
    @Autowired
    private ProductRepository productRepository;


    @Override
    public ProductEntity saveGetId(ProductEntity entity) {
        return productRepository.saveAndFlush(entity);
    }

    @Override
    public Optional<ProductEntity> getId(int id) {
        return productRepository.findById(id);
    }

    @Override
    public Iterable<ProductEntity> getName(String name) {
        return productRepository.getNameProduct(name);
    }

    @Override
    public Iterable<ProductEntity> getListId(List<Integer> list) {
        return productRepository.getListId(list);
    }

    @Override
    public Iterable<ProductEntity> saveList(Iterable<ProductEntity> entities) {
        return productRepository.saveAll(entities);
    }
}
