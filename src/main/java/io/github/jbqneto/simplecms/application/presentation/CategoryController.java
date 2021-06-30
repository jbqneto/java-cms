package io.github.jbqneto.simplecms.application.presentation;

import io.github.jbqneto.simplecms.application.mapping.CategoryMapper;
import io.github.jbqneto.simplecms.application.representation.CategoryRepresentation;
import io.github.jbqneto.simplecms.infrastructure.model.Category;
import io.github.jbqneto.simplecms.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/v1/categories")
@RequiredArgsConstructor
public class CategoryController {

    private final CategoryService service;

    @GetMapping
    public List<CategoryRepresentation> listALl() {
        return service.listAll().stream()
                .map(CategoryMapper::toRepresentation)
                .collect(Collectors.toList());
    }

    @PostMapping
    public CategoryRepresentation create(@RequestBody CategoryRepresentation representation) {
        Category savedCategory = service.save(CategoryMapper.toDomain(representation));

        return CategoryMapper.toRepresentation(savedCategory);
    }

}
