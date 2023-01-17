package maum.maumpaymentmanagementsystem.product;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;

import javax.persistence.Entity;
import java.io.Serializable;

@Document(collection="product")
@Builder
@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class Product  implements Serializable {

    private static final long serialVersionUID = -3377220080164325744L;

    @MongoId(value = FieldType.OBJECT_ID)
    @Field("_id")
    private ObjectId _id;
    @Field("title")
    private String title;
    @Field("sub_title")
    private String sub_title;
    @Field("code")
    private String code;
    @Field("version")
    private String version;
    @Field("sale_start_date")
    private String sale_start_date;
    @Field("sale_finish_date")
    private String sale_finish_date;
    @Field("create_date")
    private String create_date;
}
