package clienta;

import modulea.A;
import nesteda.NestedA;

public class ClientA {
	public void moduleA() {
		A a = new A();
		a.a();
	}

	public void nestedA() {
		NestedA nestedA = new NestedA();
		nestedA.nestedA();
	}
}
