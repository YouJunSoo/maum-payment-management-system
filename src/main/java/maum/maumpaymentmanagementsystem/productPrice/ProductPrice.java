package maum.maumpaymentmanagementsystem.productPrice;

import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;

import javax.persistence.Entity;

@Document(collection="product_price")
@Builder
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ProductPrice {

    @MongoId(value = FieldType.OBJECT_ID)
    @Field("_id")
    private ObjectId _id;
    @Field("product_id")
    private String product_id;
    @Field("cost")
    private String cost;
    @Field("supply")
    private String supply;
    @Field("consumer")
    private String consumer;
    @Field("staff")
    private String staff;
    @Field("create_date")
    private String create_date;
}
