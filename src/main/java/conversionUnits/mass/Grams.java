package conversionUnits.mass;

import conversionUnits.ConversionUnit;
import conversionUnits.UnitConstants;

/**
 * Created by <a href="mailto:marcusandreog@gmail.com">Marcus Gabilheri</a>
 *
 * @author Marcus Gabilheri
 * @version 1.0
 * @since 8/24/14.
 */
public class Grams extends ConversionUnit {

    public Grams(double value) {
        super(value);
    }

    @Override
    public double convertTo(int type) {
        switch (type) {
            case UnitConstants.OUNCE:
                return getValue() / 28.34952;
            case UnitConstants.POUND:
                return getValue() / 453.6;
            case UnitConstants.SHORT_TON:
                return getValue() / 907184.7;
            case UnitConstants.LONG_TON:
                return getValue() / 1106047;
            case UnitConstants.MILIGRAMS:
                return getValue() * 1000;
            case UnitConstants.GRAMS:
                return getValue();
            case UnitConstants.KILOGRAMS:
                return getValue() / 1000;
        }
        return 0;
    }

    @Override
    public int getType() {
        return UnitConstants.GRAMS;
    }

    @Override
    public int getGroup() {
        return UnitConstants.MASS;
    }
}
