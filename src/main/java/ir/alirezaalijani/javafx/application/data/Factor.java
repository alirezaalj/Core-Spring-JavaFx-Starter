package ir.alirezaalijani.javafx.application.data;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "factor")
public class Factor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false)
    private int totalPrice;
    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private Date createAt;
    @OneToMany(fetch = FetchType.LAZY,mappedBy = "factor",cascade = CascadeType.ALL)
    private List<SubFactor> subFactors;

    public void addSubFactor(SubFactor subFactor){
        if (subFactors==null) subFactors=new ArrayList<>();
        subFactors.add(subFactor);
    }
}
