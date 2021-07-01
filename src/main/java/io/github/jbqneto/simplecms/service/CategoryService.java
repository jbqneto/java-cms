package io.github.jbqneto.simplecms.service;

import io.github.jbqneto.simplecms.infrastructure.model.Category;
import io.github.jbqneto.simplecms.infrastructure.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

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

    public Category findById(long id) {
        return categoryRepository
                .findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    public void delete(long id) {
        Category category = this.findById(id);

        categoryRepository.delete(category);
    }
}
