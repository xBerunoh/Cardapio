package com.brunoeduardo61.cardapio.food;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "foods")
@Entity(name = "foods")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Food {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) // Gerar ID aleatorio
    private Long id;
    private String title;
    private Integer price;
    private String image;


public Food(FoodRequestDTO data){

    this.image = data.image();
    this.price = data.price();
    this.title = data.title();
}

}
