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
public class ShortTon extends DefaultUnit implements ConversionUnit {

    public ShortTon(double value) {
        super(value);
    }

    @Override
    public double convertTo(int type) {
        switch (type) {
            case UnitConstants.OUNCE:
                return getValue() * 32000;
            case UnitConstants.POUND:
                return getValue() * 2000;
            case UnitConstants.SHORT_TON:
                return getValue();
            case UnitConstants.LONG_TON:
                return getValue() * 0.8928572;
            case UnitConstants.MILIGRAMS:
                return getValue() * 907184.7;
            case UnitConstants.GRAMS:
                return (getValue() * 9071847);
            case UnitConstants.KILOGRAMS:
                return getValue() * 907.1847;
        }
        return 0;
    }

    @Override
    public int getType() {
        return UnitConstants.SHORT_TON;
    }

    @Override
    public int getGroup() {
        return UnitConstants.MASS;
    }
}
