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
public class Rankine extends ConversionUnit {

    /**
     *
     * @param value
     */
    public Rankine(double value) {
        super(value);
    }

    @Override
    public double convertTo(int type) {
        switch (type) {
            case UnitConstants.FAHRENHEIT:
                return getValue() - 459.67;
            case UnitConstants.CELSIUS:
                return (getValue() * 0.5555555555555556) - 273.15;
            case UnitConstants.KELVIN:
                return (getValue() * 0.5555555555555556);
            case UnitConstants.RANKINE:
                return getValue();

        }
        return 0;
    }

    @Override
    public int getType() {
        return UnitConstants.RANKINE;
    }

    @Override
    public int getGroup() {
        return UnitConstants.TEMPERATURE;
    }
}
