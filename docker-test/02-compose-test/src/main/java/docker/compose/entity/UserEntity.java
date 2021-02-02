package docker.compose.entity;

import lombok.Data;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Table(name = "user")
@Entity
@Data
@ToString
public class UserEntity {
    @Id
    @GenericGenerator(name="idGenerator", strategy="uuid") //这个是hibernate的注解/生成32位UUID
    @GeneratedValue(generator="idGenerator")
    @Column(name = "id",length = 36)
    private String id;
    private String name;
    private int age ;
    private String phone ;

    public UserEntity(String name, int age, String phone) {
        this.name = name;
        this.age = age;
        this.phone = phone;
    }

    public UserEntity() {
    }
}
