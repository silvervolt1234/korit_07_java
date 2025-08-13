package org.example;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Person {
    String name;
    double height;
    double weight;
}
