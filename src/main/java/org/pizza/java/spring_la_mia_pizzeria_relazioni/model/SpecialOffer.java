package org.pizza.java.spring_la_mia_pizzeria_relazioni.model;

import java.time.LocalDate;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;

@Entity
@Table(name= "offerte speciali")
public class SpecialOffer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
   
    @NotNull(message="Inserisci un titolo")
    @PastOrPresent(message="Non puoi mettere una data del futuro")
     private LocalDate startDate;

    @NotNull(message = "Inserisci una data")
    @PastOrPresent(message="non puoi mettere una data del passato rispetto all'inizio della offerta")
    private LocalDate  enDate;

    @NotBlank(message = "Inserisci un titolo")
    @NotNull
    private String Title;
    
    @ManyToOne
    @JoinColumn(name="pizza_id",nullable = false)
    private Pizza pizza;
    
     
}
