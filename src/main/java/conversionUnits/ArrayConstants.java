package conversionUnits;

/**
 * Created by <a href="mailto:marcusandreog@gmail.com">Marcus Gabilheri</a>
 *
 * @author Marcus Gabilheri
 * @version 1.0
 * @since 8/24/14
 */
public class ArrayConstants {

    public static final int[] UNIT_TYPES = {
            UnitConstants.MASS,
            UnitConstants.SPEED,
            UnitConstants.LENGTH,
            UnitConstants.TEMPERATURE,
            UnitConstants.VOLUME,
            UnitConstants.AREA,
            UnitConstants.DATA
    };


    public static final int[] MASS_UNITS = {
            UnitConstants.OUNCE,
            UnitConstants.POUND,
            UnitConstants.SHORT_TON,
            UnitConstants.LONG_TON,
            UnitConstants.MILIGRAMS,
            UnitConstants.GRAMS,
            UnitConstants.KILOGRAMS
    };

    public static final int[] SPEED_UNITS = {
            UnitConstants.FEET_SECOND,
            UnitConstants.FEET_MINUTE,
            UnitConstants.MILES_MINUTE,
            UnitConstants.MILES_HOUR,
            UnitConstants.METER_SECOND,
            UnitConstants.KILOMETER_MINUTE,
            UnitConstants.KILOMETER_HOUR,
            UnitConstants.KNOTS
    };

    public static final int[] TEMPERATURE_UNITS = {
            UnitConstants.FAHRENHEIT,
            UnitConstants.CELSIUS,
            UnitConstants.KELVIN,
            UnitConstants.RANKINE
    };

}
