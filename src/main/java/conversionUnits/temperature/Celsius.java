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
public class Celsius extends ConversionUnit {

    /**
     *
     * @param value
     */
    public Celsius(double value) {
        super(value);
    }

    @Override
    public double convertTo(int type) {
        switch (type) {
            case UnitConstants.FAHRENHEIT:
                return (1.8 * getValue()) / 32;
            case UnitConstants.CELSIUS:
                return getValue();
            case UnitConstants.KELVIN:
                return getValue() - 32 + 273.15;
            case UnitConstants.RANKINE:
                return (getValue() + 273.15) * 1.8;

        }
        return 0;
    }

    @Override
    public int getType() {
        return UnitConstants.CELSIUS;
    }

    @Override
    public int getGroup() {
        return UnitConstants.TEMPERATURE;
    }
}
