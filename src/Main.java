import functions.FilterOperations;
import utils.ImageUtils;
import utils.RgbMaster;
import java.awt.image.BufferedImage;
public class Main {
    public static void main(String[] args) throws Exception {
        final BufferedImage image = ImageUtils.getImage("images/bssp.png");
        final RgbMaster rgbMaster = new RgbMaster(image);
        rgbMaster.changeImage(FilterOperations::sepia);
        ImageUtils.saveImage(rgbMaster.getImage(), "images/cloned_bssp.png");
    }
}