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
public class MilesHour extends ConversionUnit {

    public MilesHour(double value) {
        super(value);
    }

    @Override
    public double convertTo(int type) {
        switch (type) {
            case UnitConstants.FEET_SECOND:
                return getValue() * 1.466667;
            case UnitConstants.FEET_MINUTE:
                return getValue() * 88;
            case UnitConstants.MILES_MINUTE:
                return getValue() * 0.0166666;
            case UnitConstants.MILES_HOUR:
                return getValue();
            case UnitConstants.METER_SECOND:
                return getValue() * 0.44704;
            case UnitConstants.KILOMETER_MINUTE:
                return getValue() * 0.0268224;
            case UnitConstants.KILOMETER_HOUR:
                return getValue() * 1.609344;
            case UnitConstants.KNOTS:
                return getValue() * 0.8689763;
        }
        return 0;
    }

    @Override
    public int getType() {
        return UnitConstants.MILES_HOUR;
    }

    @Override
    public int getGroup() {
        return UnitConstants.SPEED;
    }
}
