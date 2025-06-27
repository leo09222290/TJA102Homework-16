package com.hw16.Homework5.Hero;

import com.hw16.Homework5.Hero.impl.ArrowManAttack;
import com.hw16.Homework5.Hero.impl.Defend;
import com.hw16.Homework5.Hero.impl.Move;
import com.hw16.Homework5.Hero.impl.SwordManAttack;

public class RoleGameTest {

	public static void main(String[] args) {
		Hero saber = new SwordMan("亞拉岡", 1, 0);
		Hero archer = new ArrowMan("勒苟拉斯", 1, 0);
		saber.setAttackBehavior(new SwordManAttack());
		saber.setDefendBehavior(new Defend());
		saber.setMoveBehavior(new Move());
		saber.attack();
		saber.defend();
		saber.move();
		archer.setAttackBehavior(new ArrowManAttack());
		archer.setDefendBehavior(new Defend());
		archer.setMoveBehavior(new Move());
		archer.attack();
		archer.defend();
		archer.move();

	}

}
