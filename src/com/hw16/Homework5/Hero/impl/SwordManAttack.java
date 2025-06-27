package com.hw16.Homework5.Hero.impl;

import com.hw16.Homework5.Hero.bhv.IAttackBehavior;

public class SwordManAttack implements IAttackBehavior {

	@Override
	public void attack() {
		System.out.println("揮劍");
	}
}
