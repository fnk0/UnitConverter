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
public class MiliGrams extends DefaultUnit implements ConversionUnit {

    public MiliGrams(double value) {
        super(value);
    }

    @Override
    public double convertTo(int type) {
        switch (type) {
            case UnitConstants.OUNCE:
                return getValue() / 28000.3492;
            case UnitConstants.POUND:
                return getValue() / 453000.6;
            case UnitConstants.SHORT_TON:
                return getValue() / 907184.700;
            case UnitConstants.LONG_TON:
                return getValue() / 1106047000;
            case UnitConstants.MILIGRAMS:
                return getValue();
            case UnitConstants.GRAMS:
                return (getValue() / 1000);
            case UnitConstants.KILOGRAMS:
                return getValue() /1000000;
        }
        return 0;
    }

    @Override
    public int getType() {
        return UnitConstants.MILIGRAMS;
    }

    @Override
    public int getGroup() {
        return UnitConstants.MASS;
    }
}
