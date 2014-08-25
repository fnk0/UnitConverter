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
public class Ounce extends DefaultUnit implements ConversionUnit {

    public Ounce(double value) {
        super(value);
    }

    @Override
    public double convertTo(int type) {

        switch (type) {
            case UnitConstants.OUNCE:
                return getValue();
            case UnitConstants.POUND:
                return getValue() / 16;
            case UnitConstants.SHORT_TON:
                return getValue() / 3200;
            case UnitConstants.LONG_TON:
                return getValue() / 35840;
            case UnitConstants.MILIGRAMS:
                return (getValue() * 28.34952) * 1000;
            case UnitConstants.GRAMS:
                return (getValue() * 28.34952);
            case UnitConstants.KILOGRAMS:
                return (getValue() / 16) / 2.2;
        }
        return 0;
    }

    @Override
    public int getType() {
        return UnitConstants.OUNCE;
    }

    @Override
    public int getGroup() {
        return UnitConstants.MASS;
    }
}
