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
public class MeterSecond extends ConversionUnit {

    public MeterSecond(double value) {
        super(value);
    }

    @Override
    public double convertTo(int type) {
        switch (type) {
            case UnitConstants.FEET_SECOND:
                return getValue() * 3.28084;
            case UnitConstants.FEET_MINUTE:
                return getValue() * 196.8504;
            case UnitConstants.MILES_MINUTE:
                return getValue() * 0.0372822;
            case UnitConstants.MILES_HOUR:
                return getValue() * 2.236936;
            case UnitConstants.METER_SECOND:
                return getValue();
            case UnitConstants.KILOMETER_MINUTE:
                return getValue() * 0.06;
            case UnitConstants.KILOMETER_HOUR:
                return getValue() * 3.6;
            case UnitConstants.KNOTS:
                return getValue() * 1.943844;
        }
        return 0;
    }

    @Override
    public int getType() {
        return UnitConstants.METER_SECOND;
    }

    @Override
    public int getGroup() {
        return UnitConstants.SPEED;
    }
}
