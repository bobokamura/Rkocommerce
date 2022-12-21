package com.bobokamura.rkocommerce.dtos;

import com.bobokamura.rkocommerce.entities.Category;
import com.bobokamura.rkocommerce.entities.Product;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ProductDTO {
    private Long id;
    @NotBlank(message = "Campo requerido")
    @Size(min = 3, max = 50, message = "Nome entre 3 e 50 caracteres!")
    private String name;
    @NotBlank(message = "Campo requerido")
    @Size(min = 10, message = "Descrição deve ter no mínimo 10 caracteres")
    private String description;
    @Positive(message = "Preço deve ser um valor positivo")
    private Double price;
    private String imgUrl;

    private List<CategoryDTO> categories = new ArrayList<>();

    public ProductDTO(Product entity) {
        id = entity.getId();
        name = entity.getName();
        description = entity.getDescription();
        price = entity.getPrice();
        imgUrl = entity.getImgUrl();
    }

    public ProductDTO(Product entity, Set<Category> categories) {
        this(entity);
        categories.forEach(cat -> this.categories.add(new CategoryDTO(cat)));
    }
}
