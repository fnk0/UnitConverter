package conversionUnits;

/**
 * Created by <a href="mailto:marcusandreog@gmail.com">Marcus Gabilheri</a>
 *
 * @author Marcus Gabilheri
 * @version 1.0
 * @since 8/25/14
 */
public abstract class ConversionGroup {

    private int unitType;
    private double value;
    private ConversionUnit conversionUnit;

    protected ConversionGroup(int unitType, double value) {
        this.unitType = unitType;
        this.value = value;
    }

    public void setUnitType(int unitType) {
        this.unitType = unitType;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public void setConversionUnit(ConversionUnit conversionUnit) {
        this.conversionUnit = conversionUnit;
    }

    public int getUnitType() {
        return unitType;
    }

    public double getValue() {
        return value;
    }

    public abstract ConversionUnit getConversionUnit();
}
