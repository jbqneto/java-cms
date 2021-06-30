package io.github.jbqneto.simplecms.application.representation;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CategoryRepresentation {
    private long id;
    private String name;
    private String slug;
}
