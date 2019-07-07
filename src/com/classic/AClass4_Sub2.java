package com.classic;

final class AClass4_Sub2 extends AClass4 {
	private final Class43 aClass43_1 = new Class43();
	private final Class43 aClass43_2 = new Class43();
	private int anInt662 = 0;
	private int anInt663 = -1;

	private void method447(final int[] is, final int i, final int i_0_) {
		for (AClass4 aclass4 = (AClass4) aClass43_1.method299(false); aclass4 != null; aclass4 = (AClass4) aClass43_1
				.method297(0)) {
			aclass4.method415(is, i, i_0_);
		}
	}

	private void method448() {
		if (anInt662 > 0) {
			for (AClass2 aclass2 = (AClass2) aClass43_2
					.method299(false); aclass2 != null; aclass2 = (AClass2) aClass43_2.method297(0)) {
				aclass2.anInt604 -= anInt662;
			}
			anInt663 -= anInt662;
			anInt662 = 0;
		}
	}

	@Override
	synchronized void method413(final int[] is, int i, int i_1_) {
		do {
			if (anInt663 < 0) {
				method447(is, i, i_1_);
				break;
			}
			if ((i_1_ + anInt662) < anInt663) {
				anInt662 += i_1_;
				method447(is, i, i_1_);
				break;
			}
			final int i_2_ = anInt663 - anInt662;
			method447(is, i, i_2_);
			i = i_2_ + i;
			i_1_ -= i_2_;
			anInt662 += i_2_;
			method448();
			final AClass2 aclass2 = (AClass2) aClass43_2.method299(false);
			synchronized (aclass2) {
				final int i_3_ = aclass2.method383(this);
				if (i_3_ < 0) {
					aclass2.anInt604 = 0;
					method449(aclass2);
				} else {
					aclass2.anInt604 = i_3_;
					method451(aclass2.aClass27_2, aclass2);
				}
			}
		} while (i_1_ != 0);
	}

	private void method449(final AClass2 aclass2) {
		aclass2.method178();
		aclass2.method384();
		final Class27 class27 = aClass43_2.aClass27_3.aClass27_2;
		if (class27 == aClass43_2.aClass27_3) {
			anInt663 = -1;
		} else {
			anInt663 = ((AClass2) class27).anInt604;
		}
	}

	void method450(final AClass3_Sub1 aclass3_sub1, final int i, final int i_4_) {
		method452(AClass4_Sub1.method435(aclass3_sub1, i, i_4_));
	}

	private void method451(Class27 class27, final AClass2 aclass2) {
		for (/**/; ((aClass43_2.aClass27_3 != class27)
				&& (((AClass2) class27).anInt604 <= aclass2.anInt604)); class27 = class27.aClass27_2) {
			/* empty */
		}
		Class1.method2(125, aclass2, class27);
		anInt663 = (((AClass2) aClass43_2.aClass27_3.aClass27_2).anInt604);
	}

	@Override
	AClass4 method417() {
		return (AClass4) aClass43_1.method299(false);
	}

	private synchronized void method452(final AClass4 aclass4) {
		aClass43_1.method300(aclass4);
	}

	@Override
	synchronized void method416(int i) {
		do {
			if (anInt663 < 0) {
				method453(i);
				break;
			}
			if ((anInt662 + i) < anInt663) {
				anInt662 += i;
				method453(i);
				break;
			}
			final int i_5_ = anInt663 - anInt662;
			method453(i_5_);
			i -= i_5_;
			anInt662 += i_5_;
			method448();
			final AClass2 aclass2 = (AClass2) aClass43_2.method299(false);
			synchronized (aclass2) {
				final int i_6_ = aclass2.method383(this);
				if (i_6_ < 0) {
					aclass2.anInt604 = 0;
					method449(aclass2);
				} else {
					aclass2.anInt604 = i_6_;
					method451(aclass2.aClass27_2, aclass2);
				}
			}
		} while (i != 0);
	}

	@Override
	AClass4 method414() {
		return (AClass4) aClass43_1.method297(0);
	}

	@Override
	int method411() {
		return 0;
	}

	private void method453(final int i) {
		for (AClass4 aclass4 = (AClass4) aClass43_1.method299(false); aclass4 != null; aclass4 = (AClass4) aClass43_1
				.method297(0)) {
			aclass4.method416(i);
		}
	}

	public AClass4_Sub2() {
		/* empty */
	}
}
