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
public class MilesMinute extends ConversionUnit {

    public MilesMinute(double value) {
        super(value);
    }

    @Override
    public double convertTo(int type) {
        switch (type) {
            case UnitConstants.FEET_SECOND:
                return getValue() * 88;
            case UnitConstants.FEET_MINUTE:
                return getValue() * 5280;
            case UnitConstants.MILES_MINUTE:
                return getValue();
            case UnitConstants.MILES_HOUR:
                return getValue() * 60;
            case UnitConstants.METER_SECOND:
                return getValue() * 26.8224;
            case UnitConstants.KILOMETER_MINUTE:
                return getValue() * 1.609344;
            case UnitConstants.KILOMETER_HOUR:
                return getValue() * 96.56064;
            case UnitConstants.KNOTS:
                return getValue() * 52.13858;
        }
        return 0;
    }

    @Override
    public int getType() {
        return UnitConstants.MILES_MINUTE;
    }

    @Override
    public int getGroup() {
        return UnitConstants.SPEED;
    }
}
