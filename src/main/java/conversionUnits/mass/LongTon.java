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
public class LongTon extends ConversionUnit {

    public LongTon(double value) {
        super(value);
    }

    @Override
    public double convertTo(int type) {
        switch (type) {
            case UnitConstants.OUNCE:
                return getValue() * 35840;
            case UnitConstants.POUND:
                return getValue() * 2240;
            case UnitConstants.SHORT_TON:
                return getValue() * 1.12;
            case UnitConstants.LONG_TON:
                return getValue();
            case UnitConstants.MILIGRAMS:
                return getValue() * 1016047000;
            case UnitConstants.GRAMS:
                return (getValue() * 1016047);
            case UnitConstants.KILOGRAMS:
                return getValue() * 1016.047;
        }
        return 0;
    }

    @Override
    public int getType() {
        return UnitConstants.LONG_TON;
    }

    @Override
    public int getGroup() {
        return UnitConstants.MASS;
    }
}
