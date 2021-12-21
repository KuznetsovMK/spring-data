package ru.gb.service;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import ru.gb.dao.ProductDao;
import ru.gb.entity.Product;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class ProductService {
    private final ProductDao productDao;

    @Transactional(propagation = Propagation.NEVER)


    public List<Product> findAllSortedByCostDesc() {
        return productDao.findAllBy(Sort.by(Sort.Direction.DESC, "cost"));
    }

    public List<Product> findAllSortedByCostAsc() {
        return productDao.findAllBy(Sort.by(Sort.Direction.ASC, "cost"));
    }
}
