package com.model;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class BombTank {
	private int x, y;
	private boolean live = true; 
	private TankClient tc;
	private static Toolkit tk = Toolkit.getDefaultToolkit();

	private static Image[] imgs = {
			tk.getImage(BombTank.class.getClassLoader().getResource(
					"Images/1.gif")),
			tk.getImage(BombTank.class.getClassLoader().getResource(
					"Images/2.gif")),
			tk.getImage(BombTank.class.getClassLoader().getResource(
					"Images/3.gif")),
			tk.getImage(BombTank.class.getClassLoader().getResource(
					"Images/4.gif")),
			tk.getImage(BombTank.class.getClassLoader().getResource(
					"Images/5.gif")),
			tk.getImage(BombTank.class.getClassLoader().getResource(
					"Images/6.gif")),
			tk.getImage(BombTank.class.getClassLoader().getResource(
					"Images/7.gif")),
			tk.getImage(BombTank.class.getClassLoader().getResource(
					"Images/8.gif")),
			tk.getImage(BombTank.class.getClassLoader().getResource(
					"Images/9.gif")),
			tk.getImage(BombTank.class.getClassLoader().getResource(
					"Images/10.gif")), };
	int step = 0;

	public BombTank(int x, int y, TankClient tc) {
		this.x = x;
		this.y = y;
		this.tc = tc;
	}

	public void draw(Graphics g) { 

		if (!live) { 
			tc.bombTanks.remove(this);
			return;
		}
		if (step == imgs.length) {
			live = false;
			step = 0;
			return;
		}

		g.drawImage(imgs[step], x, y, null);
		step++;
	}
}
