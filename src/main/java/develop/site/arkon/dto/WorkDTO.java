package develop.site.arkon.dto;

import develop.site.arkon.model.Product;
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
public class WorkDTO {
    private Long id;
    private String name;
    private String description;
    private Long product_id;
    private String product_name;
    private double price;
    private Date date;
    private List<String> photos;
}
