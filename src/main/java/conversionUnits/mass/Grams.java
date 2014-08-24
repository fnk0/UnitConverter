package conversionUnits.mass;

import conversionUnits.ConversionUnit;
import conversionUnits.DefaultUnit;
import conversionUnits.UnitConstants;

/**
 * Created by <a href="mailto:marcusandreog@gmail.com">Marcus Gabilheri</a>
 *
 * @author Marcus Gabilheri
 * @version 1.0
 * @since 8/24/14.
 */
public class Grams extends DefaultUnit implements ConversionUnit {

    public Grams(double value) {
        super(value);
    }

    @Override
    public double convertTo(int type) {
        return 0;
    }

    @Override
    public int getType() {
        return UnitConstants.GRAMS;
    }
}
