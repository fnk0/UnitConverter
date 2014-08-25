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
public class Pound extends DefaultUnit implements ConversionUnit {

    public Pound(double value) {
        super(value);
    }

    @Override
    public double convertTo(int type) {
        switch (type) {
            case UnitConstants.OUNCE:
                return getValue() * 16;
            case UnitConstants.POUND:
                return getValue();
            case UnitConstants.SHORT_TON:
                return getValue() / 2000;
            case UnitConstants.LONG_TON:
                return getValue() / 2240;
            case UnitConstants.MILIGRAMS:
                return (getValue() * 453.6) / 1000;
            case UnitConstants.GRAMS:
                return (getValue() * 453.6);
            case UnitConstants.KILOGRAMS:
                return getValue() / 2.2;
        }
        return 0;
    }

    @Override
    public int getType() {
        return UnitConstants.POUND;
    }

    @Override
    public int getGroup() {
        return UnitConstants.MASS;
    }
}
