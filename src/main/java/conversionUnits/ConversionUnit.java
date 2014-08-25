package conversionUnits;

/**
 * Created by <a href="mailto:marcusandreog@gmail.com">Marcus Gabilheri</a>
 *
 * @author Marcus Gabilheri
 * @version 1.0
 * @since 8/24/14.
 */
public interface ConversionUnit {


    public double convertTo(int type);

    public int getType();

    public int getGroup();

}
