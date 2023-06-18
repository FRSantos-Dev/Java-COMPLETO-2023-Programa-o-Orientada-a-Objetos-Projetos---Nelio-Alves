package entities;

public class Employees {//objeto funcionário
    
    private String name;
    private Integer hours;
    private Double valuePerHour;

    public Employees() {//construtuor vazio
    }

    public Employees(String name, Integer hours, Double valuePerHour) {//construtor com as caracteristicas
        this.name = name;
        this.hours = hours;
        this.valuePerHour = valuePerHour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public Double getValuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(Double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public Double payment(){//método pagamento original
        return hours * valuePerHour;
    } 
}
