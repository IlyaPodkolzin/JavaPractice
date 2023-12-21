package java6.task11;

// температура
public class Temperature implements Convertable {

    // в цельсиях
    public double value;

    public Temperature(double value) {
        this.value = value;
    }

    // перевод температуры в другие градусы
    @Override
    public double convert(TemperatureCategory category) {
        if (category == TemperatureCategory.KELVIN)
            return value + 273;
        else if (category == TemperatureCategory.FAHRENHEIT)
            return value * 1.8 + 32;
        return 0;
    }
}
