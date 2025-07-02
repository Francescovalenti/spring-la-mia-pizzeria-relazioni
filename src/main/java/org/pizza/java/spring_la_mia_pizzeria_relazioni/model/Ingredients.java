package org.pizza.java.spring_la_mia_pizzeria_relazioni.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "Ingredients")

public class Ingredients {

    @Column(nullable = false)
    @NotBlank(message = "Name is required")
    private String name;

    @ManyToMany(mappedBy = "ingredients")
    private List<Pizza> pizzas;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Pizza> getPizzas() {
        return this.pizzas;
    }

    public void setPizzas(List<Pizza> pizzas) {
        this.pizzas = pizzas;
    }

}
