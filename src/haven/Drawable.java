package haven;

import java.awt.Graphics;

public abstract class Drawable extends GAttrib {
	public Drawable(Gob gob) {
		super(gob);
	}
	
	public abstract Coord getsize();
	public abstract Coord getoffset();
	public abstract boolean checkhit(Coord c);
	public abstract void draw(Graphics g, Coord sc);
}
