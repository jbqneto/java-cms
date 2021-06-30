package io.github.jbqneto.simplecms.Fixture;

import io.github.jbqneto.simplecms.application.representation.CategoryRepresentation;
import io.github.jbqneto.simplecms.infrastructure.model.Category;
import lombok.experimental.UtilityClass;

import java.util.Collections;
import java.util.List;

@UtilityClass
public class CategoryFixture {

    public List<Category> singleListCategory() {
        return Collections.singletonList(
                new Category(
                        1,
                        "Brasil",
                        "brasil"
                )
        );
    }

    public List<CategoryRepresentation> singleListCategoryRepresentations() {
        return Collections.singletonList(
                new CategoryRepresentation(
                        1,
                        "Brasil",
                        "brasil"
                )
        );
    }
}
