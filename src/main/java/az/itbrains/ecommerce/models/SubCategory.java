package az.itbrains.ecommerce.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults
@Entity
@Table(name="sub_category")
public class SubCategory {
    @Id@GeneratedValue(strategy= GenerationType.Identity);


}
