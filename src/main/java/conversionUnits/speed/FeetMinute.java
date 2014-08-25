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
public class FeetMinute extends ConversionUnit {

    /**
     *
     * @param value
     */
    public FeetMinute(double value) {
        super(value);
    }

    @Override
    public double convertTo(int type) {
        switch (type) {
            case UnitConstants.FEET_SECOND:
                return getValue() * 0.0166666;
            case UnitConstants.FEET_MINUTE:
                return getValue();
            case UnitConstants.MILES_MINUTE:
                return getValue() * 0.0001893;
            case UnitConstants.MILES_HOUR:
                return getValue() * 0.0113636;
            case UnitConstants.METER_SECOND:
                return getValue() * 0.00508;
            case UnitConstants.KILOMETER_MINUTE:
                return getValue() * 0.0003048;
            case UnitConstants.KILOMETER_HOUR:
                return getValue() * 0.018288;
            case UnitConstants.KNOTS:
                return getValue() * 0.0098747;
        }
        return 0;
    }

    @Override
    public int getType() {
        return UnitConstants.FEET_MINUTE;
    }

    @Override
    public int getGroup() {
        return UnitConstants.SPEED;
    }
}
