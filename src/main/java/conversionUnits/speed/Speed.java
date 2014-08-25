package conversionUnits.speed;

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
public class Speed extends ConversionGroup {

    public Speed(int unitType, double value) {
        super(unitType, value);
    }

    @Override
    public ConversionUnit getConversionUnit() {

        switch (getUnitType()) {
            case UnitConstants.FEET_SECOND:
                return new FeetSec(getValue());
            case UnitConstants.FEET_MINUTE:
                return new FeetMinute(getValue());
            case UnitConstants.MILES_MINUTE:
                return new MilesMinute(getValue());
            case UnitConstants.MILES_HOUR:
                return new MilesHour(getValue());
            case UnitConstants.METER_SECOND:
                return new MeterSecond(getValue());
            case UnitConstants.KILOMETER_MINUTE:
                return new KilometerMinute(getValue());
            case UnitConstants.KILOMETER_HOUR:
                return new KilometerHour(getValue());
            case UnitConstants.KNOTS:
                return new Knot(getValue());
        }

        return null;
    }
}
