package advance.exercises.day2.task18_19;

import java.util.Objects;

public class Computer {
    private String procesor;
    private int ram;
    private String graphic;
    private String producent;
    private String model;

    public Computer(String procesor, int ram, String graphic, String producent, String model) {
        this.procesor = procesor;
        this.ram = ram;
        this.graphic = graphic;
        this.producent = producent;
        this.model = model;
    }

    public String getProcesor() {
        return procesor;
    }

    public int getRam() {
        return ram;
    }

    public String getGraphic() {
        return graphic;
    }

    public String getProducent() {
        return producent;
    }

    public String getModel() {
        return model;
    }

    public void setProcesor(String procesor) {
        this.procesor = procesor;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setGraphic(String graphic) {
        this.graphic = graphic;
    }

    public void setProducent(String producent) {
        this.producent = producent;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "procesor='" + procesor + '\'' +
                ", ram=" + ram +
                ", graphic='" + graphic + '\'' +
                ", producent='" + producent + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return ram == computer.ram && Objects.equals(procesor, computer.procesor) && Objects.equals(graphic, computer.graphic) && Objects.equals(producent, computer.producent) && Objects.equals(model, computer.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(procesor, ram, graphic, producent, model);
    }
}
