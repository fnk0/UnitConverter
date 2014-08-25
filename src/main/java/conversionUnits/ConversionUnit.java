package conversionUnits;

/**
 * Created by <a href="mailto:marcusandreog@gmail.com">Marcus Gabilheri</a>
 *
 * @author Marcus Gabilheri
 * @version 1.0
 * @since 8/24/14.
 */
public class ConversionUnit implements DefaultUnit {

    private double value;

    public ConversionUnit(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
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
