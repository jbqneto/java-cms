package io.github.jbqneto.simplecms.application.mapping;

import io.github.jbqneto.simplecms.application.representation.CategoryRepresentation;
import io.github.jbqneto.simplecms.infrastructure.model.Category;
import lombok.experimental.UtilityClass;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.stream.Collectors;

@UtilityClass
public class CategoryMapper {

    public CategoryRepresentation toRepresentation(Category category) {
        return new CategoryRepresentation(
                category.getId(),
                category.getName(),
                category.getSlug()
        );
    }

    public List<CategoryRepresentation> toRepresentation(List<Category> categories) {
        return categories.stream()
                .map(CategoryMapper::toRepresentation)
                .collect(Collectors.toList());
    }

    public Category toDomain(CategoryRepresentation representation) {
        return new Category(
                representation.getId(),
                representation.getName(),
                representation.getSlug()
        );
    }

}
