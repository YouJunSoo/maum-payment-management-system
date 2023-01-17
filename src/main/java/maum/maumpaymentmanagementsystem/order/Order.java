package maum.maumpaymentmanagementsystem.order;

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

@Document(collection="order")
@Builder
@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class Order implements Serializable {
    private static final long serialVersionUID = -8226424206038407730L;
    @MongoId(value = FieldType.OBJECT_ID)
    @Field("_id")
    private ObjectId _id;
    @Field("user_id")
    private ObjectId userId;
    @Field("product_id")
    private ObjectId productId;
    @Field("order_status")
    private String orderStatus;
    @Field("order_uuid")
    private String orderUuid;
    @Field("pay_method")
    private String payMethod;
}
