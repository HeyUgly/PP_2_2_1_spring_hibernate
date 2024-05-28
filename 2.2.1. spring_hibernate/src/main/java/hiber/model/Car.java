package hiber.model;

import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.OneToOne;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;

@Entity
@Table(name="cars")
public class Car {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "model")
    private String model;

    @Column(name = "series")
    private int series;

    @OneToOne
    @JoinColumn(name = "id")
    @MapsId
    private User user;

    public Car() {}

    public Car(String model, int series) {
        this.model = model;
        this.series = series;
    }

    public String getModel() {return model;}

    public void setModel(String model) {this.model = model;}

    public int getSeries() {return series;}

    public void setSeries(int series) {this.series = series;}

    public User getUser() {return user;}

    public void setUser(User user) {this.user = user;}
}
