package conversionUnits.speed;

import conversionUnits.ConversionUnit;

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
        return 0;
    }

    @Override
    public int getType() {
        return 0;
    }

    @Override
    public int getGroup() {
        return 0;
    }
}
