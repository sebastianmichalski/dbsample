package dbsample;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by shekerama on 2017-01-21.
 */
@Entity
@Data
@NoArgsConstructor
@Table(name = "person")
class Person implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String magicField;

}
