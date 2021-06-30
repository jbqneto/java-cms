package io.github.jbqneto.simplecms.application.presentation;

import io.github.jbqneto.simplecms.Fixture.CategoryFixture;
import io.github.jbqneto.simplecms.application.representation.CategoryRepresentation;
import io.github.jbqneto.simplecms.infrastructure.model.Category;
import io.github.jbqneto.simplecms.service.CategoryService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Collections;
import java.util.List;

@ExtendWith(MockitoExtension.class)
public class CategoryControllerTest {

    @Mock
    private CategoryService service;

    @InjectMocks
    private CategoryController controller;

    @Test
    void mustListCategories() {
        List<CategoryRepresentation> expected = CategoryFixture.singleListCategoryRepresentations();

        List<Category> categories = CategoryFixture.singleListCategory();

        Mockito.when(service.listAll())
                .thenReturn(categories);

        var response = controller.listALl();

        Assertions.assertEquals(expected, response);
    }

}
