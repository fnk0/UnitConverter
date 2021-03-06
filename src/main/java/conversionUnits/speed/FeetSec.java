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
public class FeetSec extends ConversionUnit {

    public FeetSec(double value) {
        super(value);
    }

    @Override
    public double convertTo(int type) {
        switch (type) {
            case UnitConstants.FEET_SECOND:
                return getValue();
            case UnitConstants.FEET_MINUTE:
                return getValue() * 60;
            case UnitConstants.MILES_MINUTE:
                return getValue() * 0.0113636;
            case UnitConstants.MILES_HOUR:
                return getValue() * 0.681812;
            case UnitConstants.METER_SECOND:
                return getValue() * 0.3048;
            case UnitConstants.KILOMETER_MINUTE:
                return getValue() * 0.018288;
            case UnitConstants.KILOMETER_HOUR:
                return getValue() * 1.09728;
            case UnitConstants.KNOTS:
                return getValue() * 0.5924838;
        }
        return 0;
    }

    @Override
    public int getType() {
        return UnitConstants.FEET_SECOND;
    }

    @Override
    public int getGroup() {
        return UnitConstants.SPEED;
    }
}
