package org.example;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Builder
@ToString
@Getter
public class Person {
    String name;
    double height;
    double weight;
}
