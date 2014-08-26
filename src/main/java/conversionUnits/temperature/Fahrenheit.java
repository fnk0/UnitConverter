package conversionUnits.temperature;

import conversionUnits.ConversionUnit;
import conversionUnits.UnitConstants;

/**
 * Created by <a href="mailto:marcusandreog@gmail.com">Marcus Gabilheri</a>
 *
 * @author Marcus Gabilheri
 * @version 1.0
 * @since 8/24/14
 */
public class Fahrenheit extends ConversionUnit {

    /**
     *
     * @param value
     */
    public Fahrenheit(double value) {
        super(value);
    }

    @Override
    public double convertTo(int type) {
        switch (type) {
            case UnitConstants.FAHRENHEIT:
                return getValue();
            case UnitConstants.CELSIUS:
                return (getValue() - 32) * 0.5555555555555556;
            case UnitConstants.KELVIN:
                return 0.5555555555555556 * (getValue() - 32) + 273.15;
            case UnitConstants.RANKINE:
                return getValue() + 459.67;

        }
        return 0;
    }

    @Override
    public int getType() {
        return UnitConstants.FAHRENHEIT;
    }

    @Override
    public int getGroup() {
        return UnitConstants.TEMPERATURE;
    }
}
