package az.itbrains.ecommerce.dto.category;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults
public class CategoryFeaturedDTO {
    Long id;
    String name;
    String describtion;
}
