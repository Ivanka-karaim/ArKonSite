package develop.site.arkon.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.util.List;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="work")
public class Work {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String name;

    @NotNull
    private String size;

    @NotNull
    private String description;

    @NotNull
    @ManyToOne
    @JoinColumn(name="product_id")
    private Product product;

    @NotNull
    private double price;

    @NotNull
    private Date date;

    @OneToMany(mappedBy = "work", fetch = FetchType.EAGER)
    private List<WorkPhoto> workPhotos;
}
