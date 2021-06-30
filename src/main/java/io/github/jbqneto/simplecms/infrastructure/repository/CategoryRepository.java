package io.github.jbqneto.simplecms.infrastructure.repository;

import io.github.jbqneto.simplecms.infrastructure.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
