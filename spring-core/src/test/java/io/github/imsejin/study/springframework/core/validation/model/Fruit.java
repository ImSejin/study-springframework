package io.github.imsejin.study.springframework.core.validation.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Builder
public class Fruit {

    private String name;

    private String color;

    private Integer weight;

}
