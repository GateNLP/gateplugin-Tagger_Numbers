package gate.resources.img.svg;

import java.awt.*;
import java.awt.geom.*;
import java.awt.image.*;

import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 * This class has been automatically generated using <a
 * href="http://englishjavadrinker.blogspot.com/search/label/SVGRoundTrip">SVGRoundTrip</a>.
 */
@SuppressWarnings("unused")
public class NumbersIcon implements
		javax.swing.Icon {
	/**
	 * Paints the transcoded SVG image on the specified graphics context. You
	 * can install a custom transformation on the graphics context to scale the
	 * image.
	 * 
	 * @param g
	 *            Graphics context.
	 */
	public static void paint(Graphics2D g) {
        Shape shape = null;
        Paint paint = null;
        Stroke stroke = null;
        Area clip = null;
         
        float origAlpha = 1.0f;
        Composite origComposite = g.getComposite();
        if (origComposite instanceof AlphaComposite) {
            AlphaComposite origAlphaComposite = 
                (AlphaComposite)origComposite;
            if (origAlphaComposite.getRule() == AlphaComposite.SRC_OVER) {
                origAlpha = origAlphaComposite.getAlpha();
            }
        }
        
	    Shape clip_ = g.getClip();
AffineTransform defaultTransform_ = g.getTransform();
//  is CompositeGraphicsNode
float alpha__0 = origAlpha;
origAlpha = origAlpha * 1.0f;
g.setComposite(AlphaComposite.getInstance(3, origAlpha));
Shape clip__0 = g.getClip();
AffineTransform defaultTransform__0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
clip = new Area(g.getClip());
clip.intersect(new Area(new Rectangle2D.Double(0.0,0.0,48.0,48.0)));
g.setClip(clip);
// _0 is CompositeGraphicsNode
float alpha__0_0 = origAlpha;
origAlpha = origAlpha * 1.0f;
g.setComposite(AlphaComposite.getInstance(3, origAlpha));
Shape clip__0_0 = g.getClip();
AffineTransform defaultTransform__0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0 is CompositeGraphicsNode
float alpha__0_0_0 = origAlpha;
origAlpha = origAlpha * 0.7836257f;
g.setComposite(AlphaComposite.getInstance(3, origAlpha));
Shape clip__0_0_0 = g.getClip();
AffineTransform defaultTransform__0_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.7071080207824707f));
// _0_0_0 is ShapeNode
paint = new RadialGradientPaint(new Point2D.Double(24.306795120239258, 42.077980041503906), 15.821514f, new Point2D.Double(24.306795120239258, 42.077980041503906), new float[] {0.0f,1.0f}, new Color[] {new Color(0, 0, 0, 255),new Color(0, 0, 0, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 0.2849160134792328f, 0.0f, 30.089279174804688f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(40.128307, 42.07798);
((GeneralPath)shape).curveTo(40.130272, 43.688835, 37.115135, 45.17757, 32.219135, 45.98316);
((GeneralPath)shape).curveTo(27.323137, 46.78875, 21.290451, 46.78875, 16.394451, 45.98316);
((GeneralPath)shape).curveTo(11.498452, 45.17757, 8.483318, 43.688835, 8.485281, 42.07798);
((GeneralPath)shape).curveTo(8.483318, 40.467125, 11.498452, 38.97839, 16.394451, 38.172802);
((GeneralPath)shape).curveTo(21.290451, 37.36721, 27.323137, 37.36721, 32.219135, 38.172802);
((GeneralPath)shape).curveTo(37.115135, 38.97839, 40.130272, 40.467125, 40.128307, 42.07798);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
origAlpha = alpha__0_0_0;
g.setTransform(defaultTransform__0_0_0);
g.setClip(clip__0_0_0);
origAlpha = alpha__0_0;
g.setTransform(defaultTransform__0_0);
g.setClip(clip__0_0);
float alpha__0_1 = origAlpha;
origAlpha = origAlpha * 1.0f;
g.setComposite(AlphaComposite.getInstance(3, origAlpha));
Shape clip__0_1 = g.getClip();
AffineTransform defaultTransform__0_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1 is CompositeGraphicsNode
float alpha__0_1_0 = origAlpha;
origAlpha = origAlpha * 1.0f;
g.setComposite(AlphaComposite.getInstance(3, origAlpha));
Shape clip__0_1_0 = g.getClip();
AffineTransform defaultTransform__0_1_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1_0 is ShapeNode
paint = new RadialGradientPaint(new Point2D.Double(33.966678619384766, 35.736915588378906), 86.70845f, new Point2D.Double(33.966678619384766, 35.736915588378906), new float[] {0.0f,1.0f}, new Color[] {new Color(250, 250, 250, 255),new Color(187, 187, 187, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.9604930281639099f, 0.0f, 0.0f, 1.0411319732666016f, 0.0f, 0.0f));
shape = new RoundRectangle2D.Double(6.60355281829834, 3.6464462280273438, 34.875, 40.920494079589844, 2.2980971336364746, 2.2980971336364746);
g.setPaint(paint);
g.fill(shape);
paint = new RadialGradientPaint(new Point2D.Double(8.824419021606445, 3.7561285495758057), 37.751713f, new Point2D.Double(8.824419021606445, 3.7561285495758057), new float[] {0.0f,1.0f}, new Color[] {new Color(163, 163, 163, 255),new Color(76, 76, 76, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.9682729840278625f, 0.0f, 0.0f, 1.0327670574188232f, 3.353553056716919f, 0.6464470028877258f));
stroke = new BasicStroke(1.0f,1,1,4.0f,null,0.0f);
shape = new RoundRectangle2D.Double(6.60355281829834, 3.6464462280273438, 34.875, 40.920494079589844, 2.2980971336364746, 2.2980971336364746);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
origAlpha = alpha__0_1_0;
g.setTransform(defaultTransform__0_1_0);
g.setClip(clip__0_1_0);
float alpha__0_1_1 = origAlpha;
origAlpha = origAlpha * 1.0f;
g.setComposite(AlphaComposite.getInstance(3, origAlpha));
Shape clip__0_1_1 = g.getClip();
AffineTransform defaultTransform__0_1_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1_1 is ShapeNode
paint = new RadialGradientPaint(new Point2D.Double(8.143556594848633, 7.26789665222168), 38.158695f, new Point2D.Double(8.143556594848633, 7.26789665222168), new float[] {0.0f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(248, 248, 248, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.9682729840278625f, 0.0f, 0.0f, 1.0327670574188232f, 3.353553056716919f, 0.6464470028877258f));
stroke = new BasicStroke(1.0f,1,1,4.0f,null,0.0f);
shape = new RoundRectangle2D.Double(7.666053771972656, 4.583946228027344, 32.77588653564453, 38.94638442993164, 0.2980971336364746, 0.2980971336364746);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
origAlpha = alpha__0_1_1;
g.setTransform(defaultTransform__0_1_1);
g.setClip(clip__0_1_1);
float alpha__0_1_2 = origAlpha;
origAlpha = origAlpha * 1.0f;
g.setComposite(AlphaComposite.getInstance(3, origAlpha));
Shape clip__0_1_2 = g.getClip();
AffineTransform defaultTransform__0_1_2 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.6464470028877258f, -0.03798932954668999f));
// _0_1_2 is CompositeGraphicsNode
float alpha__0_1_2_0 = origAlpha;
origAlpha = origAlpha * 1.0f;
g.setComposite(AlphaComposite.getInstance(3, origAlpha));
Shape clip__0_1_2_0 = g.getClip();
AffineTransform defaultTransform__0_1_2_0 = g.getTransform();
g.transform(new AffineTransform(0.22970299422740936f, 0.0f, 0.0f, 0.22970299422740936f, 4.967081069946289f, 4.244972229003906f));
// _0_1_2_0 is CompositeGraphicsNode
float alpha__0_1_2_0_0 = origAlpha;
origAlpha = origAlpha * 1.0f;
g.setComposite(AlphaComposite.getInstance(3, origAlpha));
Shape clip__0_1_2_0_0 = g.getClip();
AffineTransform defaultTransform__0_1_2_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1_2_0_0 is ShapeNode
paint = new Color(255, 255, 255, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(23.428, 113.07);
((GeneralPath)shape).curveTo(23.428, 115.043, 21.828, 116.642, 19.855, 116.642);
((GeneralPath)shape).curveTo(17.881, 116.642, 16.282, 115.042, 16.282, 113.07);
((GeneralPath)shape).curveTo(16.282, 111.096, 17.882, 109.497, 19.855, 109.497);
((GeneralPath)shape).curveTo(21.828, 109.497, 23.428, 111.097, 23.428, 113.07);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
origAlpha = alpha__0_1_2_0_0;
g.setTransform(defaultTransform__0_1_2_0_0);
g.setClip(clip__0_1_2_0_0);
float alpha__0_1_2_0_1 = origAlpha;
origAlpha = origAlpha * 1.0f;
g.setComposite(AlphaComposite.getInstance(3, origAlpha));
Shape clip__0_1_2_0_1 = g.getClip();
AffineTransform defaultTransform__0_1_2_0_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1_2_0_1 is ShapeNode
paint = new Color(255, 255, 255, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(23.428, 63.07);
((GeneralPath)shape).curveTo(23.428, 65.043, 21.828, 66.643, 19.855, 66.643);
((GeneralPath)shape).curveTo(17.881, 66.643, 16.282, 65.043, 16.282, 63.07);
((GeneralPath)shape).curveTo(16.282, 61.096, 17.882, 59.497, 19.855, 59.497);
((GeneralPath)shape).curveTo(21.828, 59.497, 23.428, 61.097, 23.428, 63.07);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
origAlpha = alpha__0_1_2_0_1;
g.setTransform(defaultTransform__0_1_2_0_1);
g.setClip(clip__0_1_2_0_1);
origAlpha = alpha__0_1_2_0;
g.setTransform(defaultTransform__0_1_2_0);
g.setClip(clip__0_1_2_0);
float alpha__0_1_2_1 = origAlpha;
origAlpha = origAlpha * 1.0f;
g.setComposite(AlphaComposite.getInstance(3, origAlpha));
Shape clip__0_1_2_1 = g.getClip();
AffineTransform defaultTransform__0_1_2_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1_2_1 is ShapeNode
paint = new RadialGradientPaint(new Point2D.Double(20.892099380493164, 114.56839752197266), 5.256f, new Point2D.Double(20.892099380493164, 114.56839752197266), new float[] {0.0f,1.0f}, new Color[] {new Color(240, 240, 240, 255),new Color(154, 154, 154, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.22970299422740936f, 0.0f, 0.0f, 0.22970299422740936f, 4.613529205322266f, 3.9798080921173096f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(9.995011, 29.952326);
((GeneralPath)shape).curveTo(9.995011, 30.40553, 9.627486, 30.772825, 9.174282, 30.772825);
((GeneralPath)shape).curveTo(8.720848, 30.772825, 8.353554, 30.4053, 8.353554, 29.952326);
((GeneralPath)shape).curveTo(8.353554, 29.498892, 8.721078, 29.131598, 9.174282, 29.131598);
((GeneralPath)shape).curveTo(9.627486, 29.131598, 9.995011, 29.499123, 9.995011, 29.952326);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
origAlpha = alpha__0_1_2_1;
g.setTransform(defaultTransform__0_1_2_1);
g.setClip(clip__0_1_2_1);
float alpha__0_1_2_2 = origAlpha;
origAlpha = origAlpha * 1.0f;
g.setComposite(AlphaComposite.getInstance(3, origAlpha));
Shape clip__0_1_2_2 = g.getClip();
AffineTransform defaultTransform__0_1_2_2 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1_2_2 is ShapeNode
paint = new RadialGradientPaint(new Point2D.Double(20.892099380493164, 64.56790161132812), 5.257f, new Point2D.Double(20.892099380493164, 64.56790161132812), new float[] {0.0f,1.0f}, new Color[] {new Color(240, 240, 240, 255),new Color(154, 154, 154, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.22970299422740936f, 0.0f, 0.0f, 0.22970299422740936f, 4.613529205322266f, 3.9798080921173096f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(9.995011, 18.467176);
((GeneralPath)shape).curveTo(9.995011, 18.92038, 9.627486, 19.287905, 9.174282, 19.287905);
((GeneralPath)shape).curveTo(8.720848, 19.287905, 8.353554, 18.92038, 8.353554, 18.467176);
((GeneralPath)shape).curveTo(8.353554, 18.013742, 8.721078, 17.646446, 9.174282, 17.646446);
((GeneralPath)shape).curveTo(9.627486, 17.646446, 9.995011, 18.013971, 9.995011, 18.467176);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
origAlpha = alpha__0_1_2_2;
g.setTransform(defaultTransform__0_1_2_2);
g.setClip(clip__0_1_2_2);
origAlpha = alpha__0_1_2;
g.setTransform(defaultTransform__0_1_2);
g.setClip(clip__0_1_2);
float alpha__0_1_3 = origAlpha;
origAlpha = origAlpha * 1.0f;
g.setComposite(AlphaComposite.getInstance(3, origAlpha));
Shape clip__0_1_3 = g.getClip();
AffineTransform defaultTransform__0_1_3 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1_3 is ShapeNode
paint = new Color(0, 0, 0, 4);
stroke = new BasicStroke(0.9885531f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(11.505723, 5.4942765);
((GeneralPath)shape).lineTo(11.505723, 43.400867);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
origAlpha = alpha__0_1_3;
g.setTransform(defaultTransform__0_1_3);
g.setClip(clip__0_1_3);
float alpha__0_1_4 = origAlpha;
origAlpha = origAlpha * 1.0f;
g.setComposite(AlphaComposite.getInstance(3, origAlpha));
Shape clip__0_1_4 = g.getClip();
AffineTransform defaultTransform__0_1_4 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1_4 is ShapeNode
paint = new Color(255, 255, 255, 52);
stroke = new BasicStroke(1.0f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(12.5, 5.0205154);
((GeneralPath)shape).lineTo(12.5, 43.038227);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
origAlpha = alpha__0_1_4;
g.setTransform(defaultTransform__0_1_4);
g.setClip(clip__0_1_4);
origAlpha = alpha__0_1;
g.setTransform(defaultTransform__0_1);
g.setClip(clip__0_1);
float alpha__0_2 = origAlpha;
origAlpha = origAlpha * 1.0f;
g.setComposite(AlphaComposite.getInstance(3, origAlpha));
Shape clip__0_2 = g.getClip();
AffineTransform defaultTransform__0_2 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2 is CompositeGraphicsNode
float alpha__0_2_0 = origAlpha;
origAlpha = origAlpha * 1.0f;
g.setComposite(AlphaComposite.getInstance(3, origAlpha));
Shape clip__0_2_0 = g.getClip();
AffineTransform defaultTransform__0_2_0 = g.getTransform();
g.transform(new AffineTransform(0.9090909957885742f, 0.0f, 0.0f, 1.0f, 2.3636279106140137f, 0.0f));
// _0_2_0 is CompositeGraphicsNode
float alpha__0_2_0_0 = origAlpha;
origAlpha = origAlpha * 1.0f;
g.setComposite(AlphaComposite.getInstance(3, origAlpha));
Shape clip__0_2_0_0 = g.getClip();
AffineTransform defaultTransform__0_2_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_0 is ShapeNode
paint = new Color(155, 155, 155, 140);
shape = new RoundRectangle2D.Double(15.000001907348633, 9.0, 22.000003814697266, 1.0, 0.3031298518180847, 0.13078175485134125);
g.setPaint(paint);
g.fill(shape);
origAlpha = alpha__0_2_0_0;
g.setTransform(defaultTransform__0_2_0_0);
g.setClip(clip__0_2_0_0);
float alpha__0_2_0_1 = origAlpha;
origAlpha = origAlpha * 1.0f;
g.setComposite(AlphaComposite.getInstance(3, origAlpha));
Shape clip__0_2_0_1 = g.getClip();
AffineTransform defaultTransform__0_2_0_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_1 is ShapeNode
paint = new Color(155, 155, 155, 140);
shape = new RoundRectangle2D.Double(15.000001907348633, 11.0, 22.000003814697266, 1.0, 0.3031298518180847, 0.13078175485134125);
g.setPaint(paint);
g.fill(shape);
origAlpha = alpha__0_2_0_1;
g.setTransform(defaultTransform__0_2_0_1);
g.setClip(clip__0_2_0_1);
float alpha__0_2_0_2 = origAlpha;
origAlpha = origAlpha * 1.0f;
g.setComposite(AlphaComposite.getInstance(3, origAlpha));
Shape clip__0_2_0_2 = g.getClip();
AffineTransform defaultTransform__0_2_0_2 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_2 is ShapeNode
paint = new Color(155, 155, 155, 140);
shape = new RoundRectangle2D.Double(15.000001907348633, 13.0, 22.000003814697266, 1.0, 0.3031298518180847, 0.13078175485134125);
g.setPaint(paint);
g.fill(shape);
origAlpha = alpha__0_2_0_2;
g.setTransform(defaultTransform__0_2_0_2);
g.setClip(clip__0_2_0_2);
float alpha__0_2_0_3 = origAlpha;
origAlpha = origAlpha * 1.0f;
g.setComposite(AlphaComposite.getInstance(3, origAlpha));
Shape clip__0_2_0_3 = g.getClip();
AffineTransform defaultTransform__0_2_0_3 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_3 is ShapeNode
paint = new Color(155, 155, 155, 140);
shape = new RoundRectangle2D.Double(15.000001907348633, 15.0, 22.000003814697266, 1.0, 0.3031298518180847, 0.13078175485134125);
g.setPaint(paint);
g.fill(shape);
origAlpha = alpha__0_2_0_3;
g.setTransform(defaultTransform__0_2_0_3);
g.setClip(clip__0_2_0_3);
float alpha__0_2_0_4 = origAlpha;
origAlpha = origAlpha * 1.0f;
g.setComposite(AlphaComposite.getInstance(3, origAlpha));
Shape clip__0_2_0_4 = g.getClip();
AffineTransform defaultTransform__0_2_0_4 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_4 is ShapeNode
paint = new Color(155, 155, 155, 140);
shape = new RoundRectangle2D.Double(15.000001907348633, 17.0, 22.000003814697266, 1.0, 0.3031298518180847, 0.13078175485134125);
g.setPaint(paint);
g.fill(shape);
origAlpha = alpha__0_2_0_4;
g.setTransform(defaultTransform__0_2_0_4);
g.setClip(clip__0_2_0_4);
float alpha__0_2_0_5 = origAlpha;
origAlpha = origAlpha * 1.0f;
g.setComposite(AlphaComposite.getInstance(3, origAlpha));
Shape clip__0_2_0_5 = g.getClip();
AffineTransform defaultTransform__0_2_0_5 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_5 is ShapeNode
paint = new Color(155, 155, 155, 140);
shape = new RoundRectangle2D.Double(15.000001907348633, 19.0, 22.000003814697266, 1.0, 0.3031298518180847, 0.13078175485134125);
g.setPaint(paint);
g.fill(shape);
origAlpha = alpha__0_2_0_5;
g.setTransform(defaultTransform__0_2_0_5);
g.setClip(clip__0_2_0_5);
float alpha__0_2_0_6 = origAlpha;
origAlpha = origAlpha * 1.0f;
g.setComposite(AlphaComposite.getInstance(3, origAlpha));
Shape clip__0_2_0_6 = g.getClip();
AffineTransform defaultTransform__0_2_0_6 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_6 is ShapeNode
paint = new Color(155, 155, 155, 140);
shape = new RoundRectangle2D.Double(15.000001907348633, 21.0, 22.000003814697266, 1.0, 0.3031298518180847, 0.13078175485134125);
g.setPaint(paint);
g.fill(shape);
origAlpha = alpha__0_2_0_6;
g.setTransform(defaultTransform__0_2_0_6);
g.setClip(clip__0_2_0_6);
float alpha__0_2_0_7 = origAlpha;
origAlpha = origAlpha * 1.0f;
g.setComposite(AlphaComposite.getInstance(3, origAlpha));
Shape clip__0_2_0_7 = g.getClip();
AffineTransform defaultTransform__0_2_0_7 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_7 is ShapeNode
paint = new Color(155, 155, 155, 140);
shape = new RoundRectangle2D.Double(15.000001907348633, 23.0, 22.000003814697266, 1.0, 0.3031298518180847, 0.13078175485134125);
g.setPaint(paint);
g.fill(shape);
origAlpha = alpha__0_2_0_7;
g.setTransform(defaultTransform__0_2_0_7);
g.setClip(clip__0_2_0_7);
float alpha__0_2_0_8 = origAlpha;
origAlpha = origAlpha * 1.0f;
g.setComposite(AlphaComposite.getInstance(3, origAlpha));
Shape clip__0_2_0_8 = g.getClip();
AffineTransform defaultTransform__0_2_0_8 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_8 is ShapeNode
paint = new Color(155, 155, 155, 140);
shape = new RoundRectangle2D.Double(14.999992370605469, 25.0, 9.900005340576172, 1.0, 0.1364084780216217, 0.13078175485134125);
g.setPaint(paint);
g.fill(shape);
origAlpha = alpha__0_2_0_8;
g.setTransform(defaultTransform__0_2_0_8);
g.setClip(clip__0_2_0_8);
float alpha__0_2_0_9 = origAlpha;
origAlpha = origAlpha * 1.0f;
g.setComposite(AlphaComposite.getInstance(3, origAlpha));
Shape clip__0_2_0_9 = g.getClip();
AffineTransform defaultTransform__0_2_0_9 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_9 is ShapeNode
paint = new Color(155, 155, 155, 140);
shape = new RoundRectangle2D.Double(14.999992370605469, 29.0, 22.000003814697266, 1.0, 0.3031298518180847, 0.13078175485134125);
g.setPaint(paint);
g.fill(shape);
origAlpha = alpha__0_2_0_9;
g.setTransform(defaultTransform__0_2_0_9);
g.setClip(clip__0_2_0_9);
float alpha__0_2_0_10 = origAlpha;
origAlpha = origAlpha * 1.0f;
g.setComposite(AlphaComposite.getInstance(3, origAlpha));
Shape clip__0_2_0_10 = g.getClip();
AffineTransform defaultTransform__0_2_0_10 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_10 is ShapeNode
paint = new Color(155, 155, 155, 140);
shape = new RoundRectangle2D.Double(14.999992370605469, 31.0, 22.000003814697266, 1.0, 0.3031298518180847, 0.13078175485134125);
g.setPaint(paint);
g.fill(shape);
origAlpha = alpha__0_2_0_10;
g.setTransform(defaultTransform__0_2_0_10);
g.setClip(clip__0_2_0_10);
float alpha__0_2_0_11 = origAlpha;
origAlpha = origAlpha * 1.0f;
g.setComposite(AlphaComposite.getInstance(3, origAlpha));
Shape clip__0_2_0_11 = g.getClip();
AffineTransform defaultTransform__0_2_0_11 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_11 is ShapeNode
paint = new Color(155, 155, 155, 140);
shape = new RoundRectangle2D.Double(14.999992370605469, 33.0, 22.000003814697266, 1.0, 0.3031298518180847, 0.13078175485134125);
g.setPaint(paint);
g.fill(shape);
origAlpha = alpha__0_2_0_11;
g.setTransform(defaultTransform__0_2_0_11);
g.setClip(clip__0_2_0_11);
float alpha__0_2_0_12 = origAlpha;
origAlpha = origAlpha * 1.0f;
g.setComposite(AlphaComposite.getInstance(3, origAlpha));
Shape clip__0_2_0_12 = g.getClip();
AffineTransform defaultTransform__0_2_0_12 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_12 is ShapeNode
paint = new Color(155, 155, 155, 140);
shape = new RoundRectangle2D.Double(14.999992370605469, 35.0, 22.000003814697266, 1.0, 0.3031298518180847, 0.13078175485134125);
g.setPaint(paint);
g.fill(shape);
origAlpha = alpha__0_2_0_12;
g.setTransform(defaultTransform__0_2_0_12);
g.setClip(clip__0_2_0_12);
float alpha__0_2_0_13 = origAlpha;
origAlpha = origAlpha * 1.0f;
g.setComposite(AlphaComposite.getInstance(3, origAlpha));
Shape clip__0_2_0_13 = g.getClip();
AffineTransform defaultTransform__0_2_0_13 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_13 is ShapeNode
paint = new Color(155, 155, 155, 140);
shape = new RoundRectangle2D.Double(14.999992370605469, 37.0, 15.40001392364502, 1.0, 0.21219104528427124, 0.13078175485134125);
g.setPaint(paint);
g.fill(shape);
origAlpha = alpha__0_2_0_13;
g.setTransform(defaultTransform__0_2_0_13);
g.setClip(clip__0_2_0_13);
origAlpha = alpha__0_2_0;
g.setTransform(defaultTransform__0_2_0);
g.setClip(clip__0_2_0);
float alpha__0_2_1 = origAlpha;
origAlpha = origAlpha * 1.0f;
g.setComposite(AlphaComposite.getInstance(3, origAlpha));
Shape clip__0_2_1 = g.getClip();
AffineTransform defaultTransform__0_2_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1 is TextNode of '4'
shape = new GeneralPath();
((GeneralPath)shape).moveTo(22.684412, 12.295994);
((GeneralPath)shape).lineTo(19.387537, 17.176203);
((GeneralPath)shape).lineTo(22.684412, 17.176203);
((GeneralPath)shape).lineTo(22.684412, 12.295994);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(22.184412, 9.816827);
((GeneralPath)shape).lineTo(25.528162, 9.816827);
((GeneralPath)shape).lineTo(25.528162, 17.176203);
((GeneralPath)shape).lineTo(27.194828, 17.176203);
((GeneralPath)shape).lineTo(27.194828, 19.358494);
((GeneralPath)shape).lineTo(25.528162, 19.358494);
((GeneralPath)shape).lineTo(25.528162, 21.483494);
((GeneralPath)shape).lineTo(22.684412, 21.483494);
((GeneralPath)shape).lineTo(22.684412, 19.358494);
((GeneralPath)shape).lineTo(17.512537, 19.358494);
((GeneralPath)shape).lineTo(17.512537, 16.780369);
((GeneralPath)shape).lineTo(22.184412, 9.816827);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(-13.280769348144531, 1.3334579467773438), new Point2D.Double(6.523918151855469, 1.3334579467773438), new float[] {0.0f,1.0f}, new Color[] {new Color(71, 126, 197, 255),new Color(45, 88, 144, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 30.582368850708008f, 5.8336310386657715f));
g.setPaint(paint);
g.fill(shape);
origAlpha = alpha__0_2_1;
g.setTransform(defaultTransform__0_2_1);
g.setClip(clip__0_2_1);
float alpha__0_2_2 = origAlpha;
origAlpha = origAlpha * 1.0f;
g.setComposite(AlphaComposite.getInstance(3, origAlpha));
Shape clip__0_2_2 = g.getClip();
AffineTransform defaultTransform__0_2_2 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_2 is TextNode of '2'
shape = new GeneralPath();
((GeneralPath)shape).moveTo(30.893646, 31.29077);
((GeneralPath)shape).lineTo(36.029064, 31.29077);
((GeneralPath)shape).lineTo(36.029064, 33.50431);
((GeneralPath)shape).lineTo(27.549896, 33.50431);
((GeneralPath)shape).lineTo(27.549896, 31.29077);
((GeneralPath)shape).lineTo(31.810312, 27.53556);
((GeneralPath)shape).quadTo(32.37802, 27.019936, 32.65146, 26.527748);
((GeneralPath)shape).quadTo(32.924896, 26.03556, 32.924896, 25.50431);
((GeneralPath)shape).quadTo(32.924896, 24.681395, 32.375416, 24.181395);
((GeneralPath)shape).quadTo(31.825937, 23.681395, 30.909271, 23.681395);
((GeneralPath)shape).quadTo(30.206146, 23.681395, 29.370209, 23.983477);
((GeneralPath)shape).quadTo(28.534271, 24.28556, 27.581146, 24.87931);
((GeneralPath)shape).lineTo(27.581146, 22.31681);
((GeneralPath)shape).quadTo(28.596771, 21.978268, 29.588959, 21.80379);
((GeneralPath)shape).quadTo(30.581146, 21.62931, 31.534271, 21.62931);
((GeneralPath)shape).quadTo(33.62802, 21.62931, 34.78948, 22.551186);
((GeneralPath)shape).quadTo(35.95094, 23.47306, 35.95094, 25.118895);
((GeneralPath)shape).quadTo(35.95094, 26.07202, 35.45875, 26.89754);
((GeneralPath)shape).quadTo(34.966564, 27.72306, 33.38844, 29.10327);
((GeneralPath)shape).lineTo(30.893646, 31.29077);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(-0.9494454860687256, 20.189971923828125), new Point2D.Double(18.015398025512695, 20.189971923828125), new float[] {0.0f,1.0f}, new Color[] {new Color(71, 126, 197, 255),new Color(45, 88, 144, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 28.405590057373047f, -1.0606601238250732f));
g.setPaint(paint);
g.fill(shape);
origAlpha = alpha__0_2_2;
g.setTransform(defaultTransform__0_2_2);
g.setClip(clip__0_2_2);
origAlpha = alpha__0_2;
g.setTransform(defaultTransform__0_2);
g.setClip(clip__0_2);
origAlpha = alpha__0;
g.setTransform(defaultTransform__0);
g.setClip(clip__0);
g.setTransform(defaultTransform_);
g.setClip(clip_);

	}
	
	public Image getImage() {
		BufferedImage image =
            new BufferedImage(getIconWidth(), getIconHeight(),
                    BufferedImage.TYPE_INT_ARGB);
    	Graphics2D g = image.createGraphics();
    	paintIcon(null, g, 0, 0);
    	g.dispose();
    	return image;
	}

    /**
     * Returns the X of the bounding box of the original SVG image.
     * 
     * @return The X of the bounding box of the original SVG image.
     */
    public static int getOrigX() {
        return 7;
    }

    /**
     * Returns the Y of the bounding box of the original SVG image.
     * 
     * @return The Y of the bounding box of the original SVG image.
     */
    public static int getOrigY() {
        return 4;
    }

	/**
	 * Returns the width of the bounding box of the original SVG image.
	 * 
	 * @return The width of the bounding box of the original SVG image.
	 */
	public static int getOrigWidth() {
		return 48;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static int getOrigHeight() {
		return 48;
	}

	/**
	 * The current width of this resizable icon.
	 */
	int width;

	/**
	 * The current height of this resizable icon.
	 */
	int height;

	/**
	 * Creates a new transcoded SVG image.
	 */
	public NumbersIcon() {
        this.width = getOrigWidth();
        this.height = getOrigHeight();
	}
	
	/**
	 * Creates a new transcoded SVG image with the given dimensions.
	 *
	 * @param size the dimensions of the icon
	 */
	public NumbersIcon(Dimension size) {
	this.width = size.width;
	this.height = size.width;
	}

	public NumbersIcon(int width, int height) {
	this.width = width;
	this.height = height;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.swing.Icon#getIconHeight()
	 */
    @Override
	public int getIconHeight() {
		return height;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.swing.Icon#getIconWidth()
	 */
    @Override
	public int getIconWidth() {
		return width;
	}

	public void setDimension(Dimension newDimension) {
		this.width = newDimension.width;
		this.height = newDimension.height;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.swing.Icon#paintIcon(java.awt.Component, java.awt.Graphics,
	 * int, int)
	 */
    @Override
	public void paintIcon(Component c, Graphics g, int x, int y) {
		Graphics2D g2d = (Graphics2D) g.create();
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
		g2d.translate(x, y);
						
		Area clip = new Area(new Rectangle(0, 0, this.width, this.height));		
		if (g2d.getClip() != null) clip.intersect(new Area(g2d.getClip()));		
		g2d.setClip(clip);

		double coef1 = (double) this.width / (double) getOrigWidth();
		double coef2 = (double) this.height / (double) getOrigHeight();
		double coef = Math.min(coef1, coef2);
		g2d.scale(coef, coef);
		paint(g2d);
		g2d.dispose();
	}
}

