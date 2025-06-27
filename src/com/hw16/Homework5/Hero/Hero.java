package com.hw16.Homework5.Hero;

import com.hw16.Homework5.Hero.bhv.IAttackBehavior;
import com.hw16.Homework5.Hero.bhv.IDefendBehavior;
import com.hw16.Homework5.Hero.bhv.IMoveBehavior;

public abstract class Hero {
	private IAttackBehavior attackBehavior;
	private IDefendBehavior defendBehavior;
	private IMoveBehavior moveBehavior;

	private String name;
	private int level;
	private double exp;

	public void setAttackBehavior(IAttackBehavior attackBehavior) {
		this.attackBehavior = attackBehavior;
	}

	public void setDefendBehavior(IDefendBehavior defendBehavior) {
		this.defendBehavior = defendBehavior;
	}

	public void setMoveBehavior(IMoveBehavior moveBehavior) {
		this.moveBehavior = moveBehavior;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public double getExp() {
		return exp;
	}

	public void setExp(double exp) {
		this.exp = exp;
	}

	public Hero() {
		this("David", 1, 0);
	}

	public Hero(String name, int level, double exp) {
		this.name = name;
		this.level = level;
		this.exp = exp;
	}

	public void attack() {
		attackBehavior.attack();
	}

	public void defend() {
		defendBehavior.defend();
	}
	
	public void move() {
		moveBehavior.move();
	}

}
