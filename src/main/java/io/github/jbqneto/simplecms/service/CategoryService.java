package io.github.jbqneto.simplecms.service;

import io.github.jbqneto.simplecms.infrastructure.model.Category;
import io.github.jbqneto.simplecms.infrastructure.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryService {

    private final CategoryRepository categoryRepository;

    public List<Category> listAll() {

        return categoryRepository.findAll();
    }

    public Category save(Category category) {
        return categoryRepository.save(category);
    }

}
