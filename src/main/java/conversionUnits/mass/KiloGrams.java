package conversionUnits.mass;

import conversionUnits.ConversionUnit;
import conversionUnits.DefaultUnit;
import conversionUnits.UnitConstants;

/**
 * Created by <a href="mailto:marcusandreog@gmail.com">Marcus Gabilheri</a>
 *
 * @author Marcus Gabilheri
 * @version 1.0
 * @since 8/24/14.
 */
public class KiloGrams extends DefaultUnit implements ConversionUnit {

    public KiloGrams(double value) {
        super(value);
    }

    @Override
    public double convertTo(int type) {
        switch (type) {
            case UnitConstants.OUNCE:
                return (getValue() * 2.2) * 16;
            case UnitConstants.POUND:
                return getValue() * 2.2;
            case UnitConstants.SHORT_TON:
                return getValue() / 907.1847;
            case UnitConstants.LONG_TON:
                return getValue() / 1106.047;
            case UnitConstants.MILIGRAMS:
                return getValue() * 1000000;
            case UnitConstants.GRAMS:
                return getValue() * 1000;
            case UnitConstants.KILOGRAMS:
                return getValue();
        }
        return 0;
    }

    @Override
    public int getType() {
        return UnitConstants.KILOGRAMS;
    }

    @Override
    public int getGroup() {
        return UnitConstants.MASS;
    }
}
