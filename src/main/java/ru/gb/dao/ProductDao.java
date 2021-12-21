package ru.gb.dao;

import org.springframework.data.domain.Sort;
import org.springframework.data.repository.PagingAndSortingRepository;
import ru.gb.entity.Product;

import java.util.List;

public interface ProductDao extends PagingAndSortingRepository<Product, Long> {
    List<Product> findAllBy (Sort sort);
}
