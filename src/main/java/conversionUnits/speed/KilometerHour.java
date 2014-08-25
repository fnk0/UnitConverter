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
public class KilometerHour extends ConversionUnit {

    public KilometerHour(double value) {
        super(value);
    }

    @Override
    public double convertTo(int type) {
         switch (type) {
            case UnitConstants.FEET_SECOND:
                return getValue() * 0.9113444;
            case UnitConstants.FEET_MINUTE:
                return getValue() * 54.68066;
            case UnitConstants.MILES_MINUTE:
                return getValue() * 0.0103561;
            case UnitConstants.MILES_HOUR:
                return getValue() * 0.6213712;
            case UnitConstants.METER_SECOND:
                return getValue() * 0.277778;
            case UnitConstants.KILOMETER_MINUTE:
                return getValue() * 0.0166666;
            case UnitConstants.KILOMETER_HOUR:
                return getValue();
            case UnitConstants.KNOTS:
                return getValue() * 0.5399568;
        }
        return 0;
    }

    @Override
    public int getType() {
        return UnitConstants.KILOMETER_HOUR;
    }

    @Override
    public int getGroup() {
        return UnitConstants.SPEED;
    }
}
