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
public class Knot extends ConversionUnit {

    public Knot(double value) {
        super(value);
    }

    @Override
    public double convertTo(int type) {
         switch (type) {
            case UnitConstants.FEET_SECOND:
                return getValue() * 1.68781;
            case UnitConstants.FEET_MINUTE:
                return getValue() * 101.2686;
            case UnitConstants.MILES_MINUTE:
                return getValue() * 0.0191796;
            case UnitConstants.MILES_HOUR:
                return getValue() * 1.150779;
            case UnitConstants.METER_SECOND:
                return getValue() * 0.5144444;
            case UnitConstants.KILOMETER_MINUTE:
                return getValue() * 0.0308666;
            case UnitConstants.KILOMETER_HOUR:
                return getValue() * 1.852;
            case UnitConstants.KNOTS:
                return getValue();
        }
        return 0;
    }

    @Override
    public int getType() {
        return UnitConstants.KNOTS;
    }

    @Override
    public int getGroup() {
        return UnitConstants.SPEED;
    }
}
