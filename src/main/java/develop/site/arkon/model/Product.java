package develop.site.arkon.model;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="product")

public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String name;

    @NotNull
    private double minPrice;

    @NotNull
    private double minWidth;

    @NotNull
    private double minHeight;

    @NotNull
    private String photo;

    @NotNull
    @ManyToOne
    @JoinColumn(name="category_id")
    private Category category;

    private String glass;
    private String furniture;
    private String color_glass;
    private String color_furniture;













}
