package conversionUnits.temperature;

import conversionUnits.ConversionGroup;
import conversionUnits.ConversionUnit;
import conversionUnits.UnitConstants;

/**
 * Created by <a href="mailto:marcusandreog@gmail.com">Marcus Gabilheri</a>
 *
 * @author Marcus Gabilheri
 * @version 1.0
 * @since 8/25/14
 */
public class Temperature extends ConversionGroup {

    public Temperature(int unitType, double value) {
        super(unitType, value);
    }

    @Override
    public ConversionUnit getConversionUnit() {

        switch (getUnitType()) {
            case UnitConstants.FAHRENHEIT:
                return new Fahrenheit(getValue());
            case UnitConstants.CELSIUS:
                return new Celsius(getValue());
            case UnitConstants.RANKINE:
                return new Rankine(getValue());
            case UnitConstants.KELVIN:
                return new Kelvin(getValue());

        }

        return null;
    }
}
