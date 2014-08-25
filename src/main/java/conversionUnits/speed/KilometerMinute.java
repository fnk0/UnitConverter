package conversionUnits.speed;

import conversionUnits.ConversionUnit;
import conversionUnits.UnitConstants;

/**
 * Created by <a href="mailto:marcusandreog@gmail.com">Marcus Gabilheri</a>
 *
 * @author Marcus Gabilheri
 * @version 1.0
 * @since 8/24/14
 */
public class KilometerMinute extends ConversionUnit {

    public KilometerMinute(double value) {
        super(value);
    }

    @Override
    public double convertTo(int type) {
        switch (type) {
            case UnitConstants.FEET_SECOND:
                return getValue() * 54.68066;
            case UnitConstants.FEET_MINUTE:
                return getValue() * 3280.84;
            case UnitConstants.MILES_MINUTE:
                return getValue() * 0.6213712;
            case UnitConstants.MILES_HOUR:
                return getValue() * 37.28227;
            case UnitConstants.METER_SECOND:
                return getValue() * 16.66667;
            case UnitConstants.KILOMETER_MINUTE:
                return getValue();
            case UnitConstants.KILOMETER_HOUR:
                return getValue() * 60;
            case UnitConstants.KNOTS:
                return getValue() * 32.39741;
        }
        return 0;
    }

    @Override
    public int getType() {
        return UnitConstants.KILOMETER_MINUTE;
    }

    @Override
    public int getGroup() {
        return UnitConstants.SPEED;
    }
}
