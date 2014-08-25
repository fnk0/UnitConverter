package conversionUnits.mass;

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
public class Mass extends ConversionGroup {

    public Mass(int unitType, double value) {
        super(unitType, value);
    }

    @Override
    public ConversionUnit getConversionUnit() {

        switch (getUnitType()) {
            case UnitConstants.OUNCE:
                return new Ounce(getValue());
            case UnitConstants.POUND:
                return new Pound(getValue());
            case UnitConstants.SHORT_TON:
                return new ShortTon(getValue());
            case UnitConstants.LONG_TON:
                return new LongTon(getValue());
            case UnitConstants.MILIGRAMS:
                return new MiliGrams(getValue());
            case UnitConstants.GRAMS:
                return new Grams(getValue());
            case UnitConstants.KILOGRAMS:
                return new KiloGrams(getValue());
        }

        return null;
    }
}
