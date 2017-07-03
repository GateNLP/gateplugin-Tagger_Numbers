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
public class RomanIcon implements
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
// _0_0 is ShapeNode
paint = new Color(178, 135, 0, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(14.004353, 40.490517);
((GeneralPath)shape).lineTo(20.974451, 41.514263);
((GeneralPath)shape).lineTo(21.03836, 37.573387);
((GeneralPath)shape).curveTo(14.8716345, 31.214085, 23.309717, 28.373636, 24.55459, 33.647713);
((GeneralPath)shape).lineTo(26.542292, 36.80629);
((GeneralPath)shape).curveTo(27.680893, 47.279434, 35.021175, 44.442543, 39.622112, 47.484848);
((GeneralPath)shape).curveTo(34.053043, 40.82673, 34.13345, 37.5243, 34.667545, 34.49135);
((GeneralPath)shape).lineTo(33.07099, 32.35857);
((GeneralPath)shape).curveTo(29.253565, 30.88158, 30.689198, 29.92823, 30.464357, 28.809366);
((GeneralPath)shape).lineTo(40.739655, 28.02449);
((GeneralPath)shape).curveTo(39.27391, 12.492345, 12.695622, 14.150248, 16.379602, 33.161736);
((GeneralPath)shape).curveTo(17.123877, 35.75778, 15.846005, 38.152252, 14.004354, 40.490517);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
paint = new Color(81, 58, 0, 255);
stroke = new BasicStroke(1.030301f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(14.004353, 40.490517);
((GeneralPath)shape).lineTo(20.974451, 41.514263);
((GeneralPath)shape).lineTo(21.03836, 37.573387);
((GeneralPath)shape).curveTo(14.8716345, 31.214085, 23.309717, 28.373636, 24.55459, 33.647713);
((GeneralPath)shape).lineTo(26.542292, 36.80629);
((GeneralPath)shape).curveTo(27.680893, 47.279434, 35.021175, 44.442543, 39.622112, 47.484848);
((GeneralPath)shape).curveTo(34.053043, 40.82673, 34.13345, 37.5243, 34.667545, 34.49135);
((GeneralPath)shape).lineTo(33.07099, 32.35857);
((GeneralPath)shape).curveTo(29.253565, 30.88158, 30.689198, 29.92823, 30.464357, 28.809366);
((GeneralPath)shape).lineTo(40.739655, 28.02449);
((GeneralPath)shape).curveTo(39.27391, 12.492345, 12.695622, 14.150248, 16.379602, 33.161736);
((GeneralPath)shape).curveTo(17.123877, 35.75778, 15.846005, 38.152252, 14.004354, 40.490517);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
origAlpha = alpha__0_0;
g.setTransform(defaultTransform__0_0);
g.setClip(clip__0_0);
float alpha__0_1 = origAlpha;
origAlpha = origAlpha * 1.0f;
g.setComposite(AlphaComposite.getInstance(3, origAlpha));
Shape clip__0_1 = g.getClip();
AffineTransform defaultTransform__0_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1 is ShapeNode
paint = new Color(178, 135, 0, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(32.778057, 15.519646);
((GeneralPath)shape).lineTo(34.407413, 12.847151);
((GeneralPath)shape).curveTo(25.544098, 9.836824, 12.681151, 13.728216, 11.774175, 26.390196);
((GeneralPath)shape).lineTo(14.248438, 26.27365);
((GeneralPath)shape).curveTo(15.293767, 20.294903, 20.374352, 12.555631, 32.77806, 15.519648);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
paint = new Color(81, 58, 0, 255);
stroke = new BasicStroke(1.030301f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(32.778057, 15.519646);
((GeneralPath)shape).lineTo(34.407413, 12.847151);
((GeneralPath)shape).curveTo(25.544098, 9.836824, 12.681151, 13.728216, 11.774175, 26.390196);
((GeneralPath)shape).lineTo(14.248438, 26.27365);
((GeneralPath)shape).curveTo(15.293767, 20.294903, 20.374352, 12.555631, 32.77806, 15.519648);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
origAlpha = alpha__0_1;
g.setTransform(defaultTransform__0_1);
g.setClip(clip__0_1);
float alpha__0_2 = origAlpha;
origAlpha = origAlpha * 1.0f;
g.setComposite(AlphaComposite.getInstance(3, origAlpha));
Shape clip__0_2 = g.getClip();
AffineTransform defaultTransform__0_2 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2 is ShapeNode
paint = new Color(178, 24, 0, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(36.053356, 10.903268);
((GeneralPath)shape).curveTo(39.58971, 5.678307, 38.169193, 6.4846077, 42.492775, 2.2583294);
((GeneralPath)shape).curveTo(40.010357, 1.0065198, 36.321552, 0.7940946, 33.9834, 0.6613869);
((GeneralPath)shape).curveTo(33.41656, 0.6292144, 32.526115, 4.9149365, 32.302677, 4.9517226);
((GeneralPath)shape).curveTo(32.02937, 4.9967194, 32.436653, 0.6363834, 32.036533, 0.6012757);
((GeneralPath)shape).curveTo(29.623491, 0.38954845, 26.338045, 0.57699037, 24.888653, 1.0668958);
((GeneralPath)shape).curveTo(24.61441, 2.2305372, 24.24864, 2.7274086, 24.141516, 3.459223);
((GeneralPath)shape).curveTo(24.06976, 3.9494174, 23.792658, 1.7290595, 23.372667, 1.475752);
((GeneralPath)shape).curveTo(11.616171, 5.048451, 4.772659, 12.445828, 4.5151505, 26.28418);
((GeneralPath)shape).curveTo(5.9985943, 25.769045, 8.007143, 26.861628, 9.659617, 26.1352);
((GeneralPath)shape).curveTo(10.047806, 20.531033, 15.121656, 5.972747, 36.053356, 10.903268);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
paint = new Color(125, 0, 0, 255);
stroke = new BasicStroke(1.030301f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(36.053356, 10.903268);
((GeneralPath)shape).curveTo(39.58971, 5.678307, 38.169193, 6.4846077, 42.492775, 2.2583294);
((GeneralPath)shape).curveTo(40.010357, 1.0065198, 36.321552, 0.7940946, 33.9834, 0.6613869);
((GeneralPath)shape).curveTo(33.41656, 0.6292144, 32.526115, 4.9149365, 32.302677, 4.9517226);
((GeneralPath)shape).curveTo(32.02937, 4.9967194, 32.436653, 0.6363834, 32.036533, 0.6012757);
((GeneralPath)shape).curveTo(29.623491, 0.38954845, 26.338045, 0.57699037, 24.888653, 1.0668958);
((GeneralPath)shape).curveTo(24.61441, 2.2305372, 24.24864, 2.7274086, 24.141516, 3.459223);
((GeneralPath)shape).curveTo(24.06976, 3.9494174, 23.792658, 1.7290595, 23.372667, 1.475752);
((GeneralPath)shape).curveTo(11.616171, 5.048451, 4.772659, 12.445828, 4.5151505, 26.28418);
((GeneralPath)shape).curveTo(5.9985943, 25.769045, 8.007143, 26.861628, 9.659617, 26.1352);
((GeneralPath)shape).curveTo(10.047806, 20.531033, 15.121656, 5.972747, 36.053356, 10.903268);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
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
        return 4;
    }

    /**
     * Returns the Y of the bounding box of the original SVG image.
     * 
     * @return The Y of the bounding box of the original SVG image.
     */
    public static int getOrigY() {
        return 0;
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
	public RomanIcon() {
        this.width = getOrigWidth();
        this.height = getOrigHeight();
	}
	
	/**
	 * Creates a new transcoded SVG image with the given dimensions.
	 *
	 * @param size the dimensions of the icon
	 */
	public RomanIcon(Dimension size) {
	this.width = size.width;
	this.height = size.width;
	}

	public RomanIcon(int width, int height) {
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

