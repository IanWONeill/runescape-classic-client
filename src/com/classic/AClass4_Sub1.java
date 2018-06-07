package com.classic;

final class AClass4_Sub1 extends AClass4 {
	private int anInt648;
	private int anInt649;
	private int anInt650;
	private int anInt651;
	private final int anInt652;
	private final int anInt653;
	private int anInt654;
	private final int anInt655;
	private int anInt656;
	private int anInt657;
	private int anInt658;
	private int anInt659;
	private int anInt660;
	private int anInt661;
	private final boolean aBool36;

	@Override
	int method411() {
		if ((anInt654 == 0) && (anInt651 == 0)) {
			return 0;
		}
		return 1;
	}

	private int method423(final int[] is, int i, final int i_0_, final int i_1_, final int i_2_) {
		while (anInt651 > 0) {
			int i_3_ = i + anInt651;
			if (i_3_ > i_1_) {
				i_3_ = i_1_;
			}
			anInt651 += i;
			if ((anInt649 == 256) && ((anInt650 & 0xff) == 0)) {
				if (Class37.aBool21) {
					i = method426(0, (((AClass3_Sub1) this.anAClass3_1).aByteArray26), is, anInt650, i, anInt661,
							anInt648, anInt657, anInt659, 0, i_3_, i_0_, this);
				} else {
					i = method443((((AClass3_Sub1) this.anAClass3_1).aByteArray26), is, anInt650, i, anInt656, anInt658,
							0, i_3_, i_0_, this);
				}
			} else if (Class37.aBool21) {
				i = method433(0, 0, ((AClass3_Sub1) this.anAClass3_1).aByteArray26, is, anInt650, i, anInt661, anInt648,
						anInt657, anInt659, 0, i_3_, i_0_, this, anInt649, i_2_);
			} else {
				i = method424(0, 0, ((AClass3_Sub1) this.anAClass3_1).aByteArray26, is, anInt650, i, anInt656, anInt658,
						0, i_3_, i_0_, this, anInt649, i_2_);
			}
			anInt651 -= i;
			if (anInt651 != 0) {
				return i;
			}
			if (method430()) {
				return i_1_;
			}
		}
		if ((anInt649 == 256) && ((anInt650 & 0xff) == 0)) {
			if (Class37.aBool21) {
				return method441(0, (((AClass3_Sub1) this.anAClass3_1).aByteArray26), is, anInt650, i, anInt661,
						anInt648, 0, i_1_, i_0_, this);
			}
			return method434(((AClass3_Sub1) this.anAClass3_1).aByteArray26, is, anInt650, i, anInt656, 0, i_1_, i_0_,
					this);
		}
		if (Class37.aBool21) {
			return method442(0, 0, ((AClass3_Sub1) this.anAClass3_1).aByteArray26, is, anInt650, i, anInt661, anInt648,
					0, i_1_, i_0_, this, anInt649, i_2_);
		}
		return method425(0, 0, ((AClass3_Sub1) this.anAClass3_1).aByteArray26, is, anInt650, i, anInt656, 0, i_1_, i_0_,
				this, anInt649, i_2_);
	}

	private static int method424(int i, int i_4_, final byte[] is, final int[] is_5_, int i_6_, int i_7_, int i_8_,
			final int i_9_, int i_10_, final int i_11_, final int i_12_, final AClass4_Sub1 aclass4_sub1,
			final int i_13_, final int i_14_) {
		aclass4_sub1.anInt661 -= aclass4_sub1.anInt657 * i_7_;
		aclass4_sub1.anInt648 -= aclass4_sub1.anInt659 * i_7_;
		if ((i_13_ == 0) || ((i_10_ = i_7_ + ((((i_12_ - i_6_) + i_13_) - 257) / i_13_)) > i_11_)) {
			i_10_ = i_11_;
		}
		while (i_7_ < i_10_) {
			i_4_ = i_6_ >> 8;
			i = is[i_4_];
			is_5_[i_7_++] += (((i << 8) + ((is[i_4_ + 1] - i) * (i_6_ & 0xff))) * i_8_) >> 6;
			i_8_ = i_9_ + i_8_;
			i_6_ += i_13_;
		}
		if ((i_13_ == 0) || ((i_10_ = i_7_ + ((((i_12_ - i_6_) + i_13_) - 1) / i_13_)) > i_11_)) {
			i_10_ = i_11_;
		}
		i_4_ = i_14_;
		while (i_7_ < i_10_) {
			i = is[i_6_ >> 8];
			is_5_[i_7_++] += (((i << 8) + ((i_4_ - i) * (i_6_ & 0xff))) * i_8_) >> 6;
			i_8_ = i_9_ + i_8_;
			i_6_ += i_13_;
		}
		aclass4_sub1.anInt661 += aclass4_sub1.anInt657 * i_7_;
		aclass4_sub1.anInt648 += aclass4_sub1.anInt659 * i_7_;
		aclass4_sub1.anInt656 = i_8_;
		aclass4_sub1.anInt650 = i_6_;
		return i_7_;
	}

	private static int method425(int i, int i_15_, final byte[] is, final int[] is_16_, int i_17_, int i_18_,
			final int i_19_, int i_20_, final int i_21_, final int i_22_, final AClass4_Sub1 aclass4_sub1,
			final int i_23_, final int i_24_) {
		if ((i_23_ == 0) || ((i_20_ = i_18_ + (((i_23_ + (i_22_ - i_17_)) - 257) / i_23_)) > i_21_)) {
			i_20_ = i_21_;
		}
		while (i_18_ < i_20_) {
			i_15_ = i_17_ >> 8;
			i = is[i_15_];
			is_16_[i_18_++] += ((((i << 8) + ((is[i_15_ + 1] - i) * (i_17_ & 0xff))) * i_19_) >> 6);
			i_17_ = i_23_ + i_17_;
		}
		if ((i_23_ == 0) || ((i_20_ = i_18_ + (((i_23_ + (i_22_ - i_17_)) - 1) / i_23_)) > i_21_)) {
			i_20_ = i_21_;
		}
		i_15_ = i_24_;
		while (i_18_ < i_20_) {
			i = is[i_17_ >> 8];
			is_16_[i_18_++] += (((i << 8) + ((i_15_ - i) * (i_17_ & 0xff))) * i_19_) >> 6;
			i_17_ = i_23_ + i_17_;
		}
		aclass4_sub1.anInt650 = i_17_;
		return i_18_;
	}

	private static int method426(int i, final byte[] is, final int[] is_25_, int i_26_, int i_27_, int i_28_, int i_29_,
			int i_30_, int i_31_, int i_32_, final int i_33_, int i_34_, final AClass4_Sub1 aclass4_sub1) {
		i_26_ >>= 8;
		i_34_ >>= 8;
		i_28_ <<= 2;
		i_29_ <<= 2;
		i_30_ <<= 2;
		i_31_ <<= 2;
		if ((i_32_ = (i_34_ + i_27_) - i_26_) > i_33_) {
			i_32_ = i_33_;
		}
		aclass4_sub1.anInt656 += aclass4_sub1.anInt658 * (i_32_ - i_27_);
		i_27_ <<= 1;
		i_32_ <<= 1;
		i_32_ -= 6;
		while (i_27_ < i_32_) {
			i = is[i_26_++];
			is_25_[i_27_++] += i * i_28_;
			i_28_ += i_30_;
			is_25_[i_27_++] += i * i_29_;
			i_29_ = i_31_ + i_29_;
			i = is[i_26_++];
			is_25_[i_27_++] += i * i_28_;
			i_28_ += i_30_;
			is_25_[i_27_++] += i * i_29_;
			i_29_ = i_31_ + i_29_;
			i = is[i_26_++];
			is_25_[i_27_++] += i * i_28_;
			i_28_ += i_30_;
			is_25_[i_27_++] += i * i_29_;
			i_29_ = i_31_ + i_29_;
			i = is[i_26_++];
			is_25_[i_27_++] += i * i_28_;
			i_28_ += i_30_;
			is_25_[i_27_++] += i * i_29_;
			i_29_ = i_31_ + i_29_;
		}
		i_32_ += 6;
		while (i_27_ < i_32_) {
			i = is[i_26_++];
			is_25_[i_27_++] += i * i_28_;
			i_28_ += i_30_;
			is_25_[i_27_++] += i * i_29_;
			i_29_ = i_31_ + i_29_;
		}
		aclass4_sub1.anInt661 = i_28_ >> 2;
		aclass4_sub1.anInt648 = i_29_ >> 2;
		aclass4_sub1.anInt650 = i_26_ << 8;
		return i_27_ >> 1;
	}

	private static int method427(int i, int i_35_, final byte[] is, final int[] is_36_, int i_37_, int i_38_,
			final int i_39_, final int i_40_, int i_41_, final int i_42_, final int i_43_,
			final AClass4_Sub1 aclass4_sub1, final int i_44_, final int i_45_) {
		if ((i_44_ == 0) || ((i_41_ = i_38_ + ((((i_43_ + 256) - i_37_) + i_44_) / i_44_)) > i_42_)) {
			i_41_ = i_42_;
		}
		i_38_ <<= 1;
		i_41_ <<= 1;
		while (i_38_ < i_41_) {
			i_35_ = i_37_ >> 8;
			i = is[i_35_ - 1];
			i = ((is[i_35_] - i) * (i_37_ & 0xff)) + (i << 8);
			is_36_[i_38_++] += (i * i_39_) >> 6;
			is_36_[i_38_++] += (i * i_40_) >> 6;
			i_37_ += i_44_;
		}
		if ((i_44_ == 0) || ((i_41_ = (i_38_ >> 1) + (((i_43_ - i_37_) + i_44_) / i_44_)) > i_42_)) {
			i_41_ = i_42_;
		}
		i_41_ <<= 1;
		i_35_ = i_45_;
		while (i_38_ < i_41_) {
			i = (i_35_ << 8) + ((i_37_ & 0xff) * (is[i_37_ >> 8] - i_35_));
			is_36_[i_38_++] += (i * i_39_) >> 6;
			is_36_[i_38_++] += (i * i_40_) >> 6;
			i_37_ += i_44_;
		}
		aclass4_sub1.anInt650 = i_37_;
		return i_38_ >> 1;
	}

	@Override
	AClass4 method417() {
		return null;
	}

	private static int method428(int i, int i_46_, final byte[] is, final int[] is_47_, int i_48_, int i_49_,
			final int i_50_, int i_51_, final int i_52_, final int i_53_, final AClass4_Sub1 aclass4_sub1,
			final int i_54_, final int i_55_) {
		if ((i_54_ == 0) || ((i_51_ = i_49_ + ((i_54_ + ((i_53_ + 256) - i_48_)) / i_54_)) > i_52_)) {
			i_51_ = i_52_;
		}
		while (i_49_ < i_51_) {
			i_46_ = i_48_ >> 8;
			i = is[i_46_ - 1];
			is_47_[i_49_++] += (((i << 8) + ((is[i_46_] - i) * (i_48_ & 0xff))) * i_50_) >> 6;
			i_48_ = i_54_ + i_48_;
		}
		if ((i_54_ == 0) || ((i_51_ = i_49_ + ((i_54_ + (i_53_ - i_48_)) / i_54_)) > i_52_)) {
			i_51_ = i_52_;
		}
		i = i_55_;
		i_46_ = i_54_;
		while (i_49_ < i_51_) {
			is_47_[i_49_++] += ((((i << 8) + ((is[i_48_ >> 8] - i) * (i_48_ & 0xff))) * i_50_) >> 6);
			i_48_ += i_46_;
		}
		aclass4_sub1.anInt650 = i_48_;
		return i_49_;
	}

	@Override
	synchronized void method413(final int[] is, final int i, int i_56_) {
		if ((anInt654 == 0) && (anInt651 == 0)) {
			method416(i_56_);
		} else {
			final AClass3_Sub1 aclass3_sub1 = (AClass3_Sub1) this.anAClass3_1;
			final int i_57_ = anInt655 << 8;
			final int i_58_ = anInt653 << 8;
			final int i_59_ = aclass3_sub1.aByteArray26.length << 8;
			final int i_60_ = i_58_ - i_57_;
			if (i_60_ <= 0) {
				anInt660 = 0;
			}
			int i_61_ = i;
			i_56_ += i;
			if (anInt650 < 0) {
				if (anInt649 > 0) {
					anInt650 = 0;
				} else {
					method431();
					method178(22);
					return;
				}
			}
			if (anInt650 >= i_59_) {
				if (anInt649 < 0) {
					anInt650 = i_59_ - 1;
				} else {
					method431();
					method178(3);
					return;
				}
			}
			if (anInt660 < 0) {
				if (aBool36) {
					if (anInt649 < 0) {
						i_61_ = method429(is, i_61_, i_57_, i_56_, (aclass3_sub1.aByteArray26[anInt655]));
						if (anInt650 >= i_57_) {
							return;
						}
						anInt650 = (i_57_ + i_57_) - 1 - anInt650;
						anInt649 = -anInt649;
					}
					for (;;) {
						i_61_ = method423(is, i_61_, i_58_, i_56_, (aclass3_sub1.aByteArray26[anInt653 - 1]));
						if (anInt650 < i_58_) {
							break;
						}
						anInt650 = (i_58_ + i_58_) - 1 - anInt650;
						anInt649 = -anInt649;
						i_61_ = method429(is, i_61_, i_57_, i_56_, (aclass3_sub1.aByteArray26[anInt655]));
						if (anInt650 >= i_57_) {
							break;
						}
						anInt650 = (i_57_ + i_57_) - 1 - anInt650;
						anInt649 = -anInt649;
					}
				} else if (anInt649 < 0) {
					for (;;) {
						i_61_ = method429(is, i_61_, i_57_, i_56_, (aclass3_sub1.aByteArray26[anInt653 - 1]));
						if (anInt650 >= i_57_) {
							break;
						}
						anInt650 = i_58_ - 1 - ((i_58_ - 1 - anInt650) % i_60_);
					}
				} else {
					for (;;) {
						i_61_ = method423(is, i_61_, i_58_, i_56_, (aclass3_sub1.aByteArray26[anInt655]));
						if (anInt650 < i_58_) {
							break;
						}
						anInt650 = i_57_ + ((anInt650 - i_57_) % i_60_);
					}
				}
			} else {
				do {
					if (anInt660 > 0) {
						if (aBool36) {
							if (anInt649 < 0) {
								i_61_ = method429(is, i_61_, i_57_, i_56_, (aclass3_sub1.aByteArray26[anInt655]));
								if (anInt650 >= i_57_) {
									return;
								}
								anInt650 = (i_57_ + i_57_) - 1 - anInt650;
								anInt649 = -anInt649;
								if (--anInt660 == 0) {
									break;
								}
							}
							do {
								i_61_ = method423(is, i_61_, i_58_, i_56_, (aclass3_sub1.aByteArray26[anInt653 - 1]));
								if (anInt650 < i_58_) {
									return;
								}
								anInt650 = (i_58_ + i_58_) - 1 - anInt650;
								anInt649 = -anInt649;
								if (--anInt660 == 0) {
									break;
								}
								i_61_ = method429(is, i_61_, i_57_, i_56_, (aclass3_sub1.aByteArray26[anInt655]));
								if (anInt650 >= i_57_) {
									return;
								}
								anInt650 = (i_57_ + i_57_) - 1 - anInt650;
								anInt649 = -anInt649;
							} while (--anInt660 != 0);
						} else if (anInt649 < 0) {
							for (;;) {
								i_61_ = method429(is, i_61_, i_57_, i_56_, (aclass3_sub1.aByteArray26[anInt653 - 1]));
								if (anInt650 >= i_57_) {
									return;
								}
								final int i_62_ = (i_58_ - 1 - anInt650) / i_60_;
								if (i_62_ >= anInt660) {
									anInt650 += i_60_ * anInt660;
									anInt660 = 0;
									break;
								}
								anInt650 += i_60_ * i_62_;
								anInt660 -= i_62_;
							}
						} else {
							for (;;) {
								i_61_ = method423(is, i_61_, i_58_, i_56_, (aclass3_sub1.aByteArray26[anInt655]));
								if (anInt650 < i_58_) {
									return;
								}
								final int i_63_ = (anInt650 - i_57_) / i_60_;
								if (i_63_ >= anInt660) {
									anInt650 -= i_60_ * anInt660;
									anInt660 = 0;
									break;
								}
								anInt650 -= i_60_ * i_63_;
								anInt660 -= i_63_;
							}
						}
					}
				} while (false);
				if (anInt649 < 0) {
					method429(is, i_61_, 0, i_56_, 0);
					if (anInt650 < 0) {
						anInt650 = -1;
						method431();
						method178(-25);
					}
				} else {
					method423(is, i_61_, i_59_, i_56_, 0);
					if (anInt650 >= i_59_) {
						anInt650 = i_59_;
						method431();
						method178(-11);
					}
				}
			}
		}
	}

	private int method429(final int[] is, int i, final int i_64_, final int i_65_, final int i_66_) {
		while (anInt651 > 0) {
			int i_67_ = i + anInt651;
			if (i_67_ > i_65_) {
				i_67_ = i_65_;
			}
			anInt651 += i;
			if ((anInt649 == -256) && ((anInt650 & 0xff) == 0)) {
				if (Class37.aBool21) {
					i = method446(0, (((AClass3_Sub1) this.anAClass3_1).aByteArray26), is, anInt650, i, anInt661,
							anInt648, anInt657, anInt659, 0, i_67_, i_64_, this);
				} else {
					i = method445((((AClass3_Sub1) this.anAClass3_1).aByteArray26), is, anInt650, i, anInt656, anInt658,
							0, i_67_, i_64_, this);
				}
			} else if (Class37.aBool21) {
				i = method439(0, 0, ((AClass3_Sub1) this.anAClass3_1).aByteArray26, is, anInt650, i, anInt661, anInt648,
						anInt657, anInt659, 0, i_67_, i_64_, this, anInt649, i_66_);
			} else {
				i = method440(0, 0, ((AClass3_Sub1) this.anAClass3_1).aByteArray26, is, anInt650, i, anInt656, anInt658,
						0, i_67_, i_64_, this, anInt649, i_66_);
			}
			anInt651 -= i;
			if (anInt651 != 0) {
				return i;
			}
			if (method430()) {
				return i_65_;
			}
		}
		if ((anInt649 == -256) && ((anInt650 & 0xff) == 0)) {
			if (Class37.aBool21) {
				return method444(0, (((AClass3_Sub1) this.anAClass3_1).aByteArray26), is, anInt650, i, anInt661,
						anInt648, 0, i_65_, i_64_, this);
			}
			return method438(((AClass3_Sub1) this.anAClass3_1).aByteArray26, is, anInt650, i, anInt656, 0, i_65_, i_64_,
					this);
		}
		if (Class37.aBool21) {
			return method427(0, 0, ((AClass3_Sub1) this.anAClass3_1).aByteArray26, is, anInt650, i, anInt661, anInt648,
					0, i_65_, i_64_, this, anInt649, i_66_);
		}
		return method428(0, 0, ((AClass3_Sub1) this.anAClass3_1).aByteArray26, is, anInt650, i, anInt656, 0, i_65_,
				i_64_, this, anInt649, i_66_);
	}

	private boolean method430() {
		int i = anInt654;
		int i_68_;
		int i_69_;
		if (i == -2147483648) {
			i_69_ = 0;
			i_68_ = 0;
			i = 0;
		} else {
			i_68_ = method437(i, anInt652);
			i_69_ = method436(i, anInt652);
		}
		if ((i != anInt656) || (i_68_ != anInt661) || (i_69_ != anInt648)) {
			if (anInt656 < i) {
				anInt658 = 1;
				anInt651 = i - anInt656;
			} else if (anInt656 > i) {
				anInt658 = -1;
				anInt651 = anInt656 - i;
			} else {
				anInt658 = 0;
			}
			if (anInt661 < i_68_) {
				anInt657 = 1;
				if ((anInt651 == 0) || (anInt651 > (i_68_ - anInt661))) {
					anInt651 = i_68_ - anInt661;
				}
			} else if (anInt661 > i_68_) {
				anInt657 = -1;
				if ((anInt651 == 0) || (anInt651 > (anInt661 - i_68_))) {
					anInt651 = anInt661 - i_68_;
				}
			} else {
				anInt657 = 0;
			}
			if (anInt648 < i_69_) {
				anInt659 = 1;
				if ((anInt651 == 0) || (anInt651 > (i_69_ - anInt648))) {
					anInt651 = i_69_ - anInt648;
				}
			} else if (anInt648 > i_69_) {
				anInt659 = -1;
				if ((anInt651 == 0) || (anInt651 > (anInt648 - i_69_))) {
					anInt651 = anInt648 - i_69_;
				}
			} else {
				anInt659 = 0;
			}
			return false;
		}
		if (anInt654 == -2147483648) {
			anInt654 = 0;
			anInt648 = 0;
			anInt661 = 0;
			anInt656 = 0;
			method178(-114);
			return true;
		}
		method432();
		return false;
	}

	private void method431() {
		if (anInt651 != 0) {
			if (anInt654 == -2147483648) {
				anInt654 = 0;
			}
			anInt651 = 0;
			method432();
		}
	}

	private void method432() {
		anInt656 = anInt654;
		anInt661 = method437(anInt654, anInt652);
		anInt648 = method436(anInt654, anInt652);
	}

	@Override
	int method412() {
		int i = (anInt656 * 3) >> 6;
		i = (i ^ (i >> 31)) + (i >>> 31);
		if (anInt660 == 0) {
			i -= (i * anInt650) / ((((AClass3_Sub1) this.anAClass3_1).aByteArray26).length << 8);
		} else if (anInt660 >= 0) {
			i -= (i * anInt655) / (((AClass3_Sub1) this.anAClass3_1).aByteArray26).length;
		}
		return i > 255 ? 255 : i;
	}

	private static int method433(int i, int i_70_, final byte[] is, final int[] is_71_, int i_72_, int i_73_, int i_74_,
			int i_75_, final int i_76_, final int i_77_, int i_78_, final int i_79_, final int i_80_,
			final AClass4_Sub1 aclass4_sub1, final int i_81_, final int i_82_) {
		aclass4_sub1.anInt656 -= i_73_ * aclass4_sub1.anInt658;
		if ((i_81_ == 0) || ((i_78_ = i_73_ + ((((i_80_ - i_72_) + i_81_) - 257) / i_81_)) > i_79_)) {
			i_78_ = i_79_;
		}
		i_73_ <<= 1;
		i_78_ <<= 1;
		while (i_73_ < i_78_) {
			i_70_ = i_72_ >> 8;
			i = is[i_70_];
			i = (i << 8) + ((i_72_ & 0xff) * (is[i_70_ + 1] - i));
			is_71_[i_73_++] += (i * i_74_) >> 6;
			i_74_ = i_76_ + i_74_;
			is_71_[i_73_++] += (i * i_75_) >> 6;
			i_75_ += i_77_;
			i_72_ += i_81_;
		}
		if ((i_81_ == 0) || ((i_78_ = (i_73_ >> 1) + ((((i_80_ - i_72_) + i_81_) - 1) / i_81_)) > i_79_)) {
			i_78_ = i_79_;
		}
		i_78_ <<= 1;
		i_70_ = i_82_;
		while (i_73_ < i_78_) {
			i = is[i_72_ >> 8];
			i = (i << 8) + ((i_70_ - i) * (i_72_ & 0xff));
			is_71_[i_73_++] += (i * i_74_) >> 6;
			i_74_ = i_76_ + i_74_;
			is_71_[i_73_++] += (i * i_75_) >> 6;
			i_75_ += i_77_;
			i_72_ += i_81_;
		}
		i_73_ >>= 1;
		aclass4_sub1.anInt656 += aclass4_sub1.anInt658 * i_73_;
		aclass4_sub1.anInt661 = i_74_;
		aclass4_sub1.anInt648 = i_75_;
		aclass4_sub1.anInt650 = i_72_;
		return i_73_;
	}

	private static int method434(final byte[] is, final int[] is_83_, int i, int i_84_, int i_85_, int i_86_,
			final int i_87_, int i_88_, final AClass4_Sub1 aclass4_sub1) {
		i >>= 8;
		i_88_ >>= 8;
		i_85_ <<= 2;
		if ((i_86_ = (i_84_ + i_88_) - i) > i_87_) {
			i_86_ = i_87_;
		}
		i_86_ -= 3;
		while (i_84_ < i_86_) {
			is_83_[i_84_++] += is[i++] * i_85_;
			is_83_[i_84_++] += is[i++] * i_85_;
			is_83_[i_84_++] += is[i++] * i_85_;
			is_83_[i_84_++] += is[i++] * i_85_;
		}
		i_86_ += 3;
		while (i_84_ < i_86_) {
			is_83_[i_84_++] += is[i++] * i_85_;
		}
		aclass4_sub1.anInt650 = i << 8;
		return i_84_;
	}

	static AClass4_Sub1 method435(final AClass3_Sub1 aclass3_sub1, final int i, final int i_89_) {
		if ((aclass3_sub1.aByteArray26 == null) || (aclass3_sub1.aByteArray26.length == 0)) {
			return null;
		}
		return new AClass4_Sub1(aclass3_sub1, (int) (((aclass3_sub1.anInt647) * 256L * i) / (Class37.anInt386 * 100)),
				i_89_ << 6);
	}

	private static int method436(final int i, final int i_90_) {
		return i_90_ < 0 ? -i : (int) ((i * Math.sqrt(i_90_ * 1.220703125E-4)) + 0.5);
	}

	private static int method437(final int i, final int i_91_) {
		return (i_91_ < 0 ? i : (int) ((i * Math.sqrt((16384 - i_91_) * 1.220703125E-4)) + 0.5));
	}

	private static int method438(final byte[] is, final int[] is_92_, int i, int i_93_, int i_94_, int i_95_,
			final int i_96_, int i_97_, final AClass4_Sub1 aclass4_sub1) {
		i >>= 8;
		i_97_ >>= 8;
		i_94_ <<= 2;
		if ((i_95_ = (i_93_ + i) - (i_97_ - 1)) > i_96_) {
			i_95_ = i_96_;
		}
		i_95_ -= 3;
		while (i_93_ < i_95_) {
			is_92_[i_93_++] += is[i--] * i_94_;
			is_92_[i_93_++] += is[i--] * i_94_;
			is_92_[i_93_++] += is[i--] * i_94_;
			is_92_[i_93_++] += is[i--] * i_94_;
		}
		i_95_ += 3;
		while (i_93_ < i_95_) {
			is_92_[i_93_++] += is[i--] * i_94_;
		}
		aclass4_sub1.anInt650 = i << 8;
		return i_93_;
	}

	@Override
	synchronized void method416(int i) {
		if (anInt651 > 0) {
			if (i >= anInt651) {
				if (anInt654 == -2147483648) {
					anInt654 = 0;
					anInt648 = 0;
					anInt661 = 0;
					anInt656 = 0;
					method178(123);
					i = anInt651;
				}
				anInt651 = 0;
				method432();
			} else {
				anInt656 += anInt658 * i;
				anInt661 += anInt657 * i;
				anInt648 += anInt659 * i;
				anInt651 -= i;
			}
		}
		final AClass3_Sub1 aclass3_sub1 = (AClass3_Sub1) this.anAClass3_1;
		final int i_98_ = anInt655 << 8;
		final int i_99_ = anInt653 << 8;
		final int i_100_ = aclass3_sub1.aByteArray26.length << 8;
		final int i_101_ = i_99_ - i_98_;
		if (i_101_ <= 0) {
			anInt660 = 0;
		}
		if (anInt650 < 0) {
			if (anInt649 > 0) {
				anInt650 = 0;
			} else {
				method431();
				method178(-121);
				return;
			}
		}
		if (anInt650 >= i_100_) {
			if (anInt649 < 0) {
				anInt650 = i_100_ - 1;
			} else {
				method431();
				method178(121);
				return;
			}
		}
		anInt650 += anInt649 * i;
		if (anInt660 < 0) {
			if (aBool36) {
				if (anInt649 < 0) {
					if (anInt650 >= i_98_) {
						return;
					}
					anInt650 = (i_98_ + i_98_) - 1 - anInt650;
					anInt649 = -anInt649;
				}
				while (anInt650 >= i_99_) {
					anInt650 = (i_99_ + i_99_) - 1 - anInt650;
					anInt649 = -anInt649;
					if (anInt650 >= i_98_) {
						break;
					}
					anInt650 = (i_98_ + i_98_) - 1 - anInt650;
					anInt649 = -anInt649;
				}
			} else if (anInt649 < 0) {
				if (anInt650 < i_98_) {
					anInt650 = i_99_ - 1 - ((i_99_ - 1 - anInt650) % i_101_);
				}
			} else if (anInt650 >= i_99_) {
				anInt650 = i_98_ + ((anInt650 - i_98_) % i_101_);
			}
		} else {
			do {
				if (anInt660 > 0) {
					if (aBool36) {
						if (anInt649 < 0) {
							if (anInt650 >= i_98_) {
								return;
							}
							anInt650 = (i_98_ + i_98_) - 1 - anInt650;
							anInt649 = -anInt649;
							if (--anInt660 == 0) {
								break;
							}
						}
						do {
							if (anInt650 < i_99_) {
								return;
							}
							anInt650 = (i_99_ + i_99_) - 1 - anInt650;
							anInt649 = -anInt649;
							if (--anInt660 == 0) {
								break;
							}
							if (anInt650 >= i_98_) {
								return;
							}
							anInt650 = (i_98_ + i_98_) - 1 - anInt650;
							anInt649 = -anInt649;
						} while (--anInt660 != 0);
					} else {
						if (anInt649 < 0) {
							if (anInt650 < i_98_) {
								final int i_102_ = (i_99_ - 1 - anInt650) / i_101_;
								if (i_102_ >= anInt660) {
									anInt650 += i_101_ * anInt660;
									anInt660 = 0;
									break;
								}
								anInt650 += i_101_ * i_102_;
								anInt660 -= i_102_;
							}
						} else if (anInt650 >= i_99_) {
							final int i_103_ = (anInt650 - i_98_) / i_101_;
							if (i_103_ >= anInt660) {
								anInt650 -= i_101_ * anInt660;
								anInt660 = 0;
								break;
							}
							anInt650 -= i_101_ * i_103_;
							anInt660 -= i_103_;
						}
						return;
					}
				}
			} while (false);
			if (anInt649 < 0) {
				if (anInt650 < 0) {
					anInt650 = -1;
					method431();
					method178(123);
				}
			} else if (anInt650 >= i_100_) {
				anInt650 = i_100_;
				method431();
				method178(-70);
			}
		}
	}

	private static int method439(int i, int i_104_, final byte[] is, final int[] is_105_, int i_106_, int i_107_,
			int i_108_, int i_109_, final int i_110_, final int i_111_, int i_112_, final int i_113_, final int i_114_,
			final AClass4_Sub1 aclass4_sub1, final int i_115_, final int i_116_) {
		aclass4_sub1.anInt656 -= i_107_ * aclass4_sub1.anInt658;
		if ((i_115_ == 0) || ((i_112_ = i_107_ + ((((i_114_ + 256) - i_106_) + i_115_) / i_115_)) > i_113_)) {
			i_112_ = i_113_;
		}
		i_107_ <<= 1;
		i_112_ <<= 1;
		while (i_107_ < i_112_) {
			i_104_ = i_106_ >> 8;
			i = is[i_104_ - 1];
			i = ((is[i_104_] - i) * (i_106_ & 0xff)) + (i << 8);
			is_105_[i_107_++] += (i * i_108_) >> 6;
			i_108_ = i_110_ + i_108_;
			is_105_[i_107_++] += (i * i_109_) >> 6;
			i_109_ += i_111_;
			i_106_ += i_115_;
		}
		if ((i_115_ == 0) || ((i_112_ = (i_107_ >> 1) + (((i_114_ - i_106_) + i_115_) / i_115_)) > i_113_)) {
			i_112_ = i_113_;
		}
		i_112_ <<= 1;
		i_104_ = i_116_;
		while (i_107_ < i_112_) {
			i = (i_104_ << 8) + ((i_106_ & 0xff) * (is[i_106_ >> 8] - i_104_));
			is_105_[i_107_++] += (i * i_108_) >> 6;
			i_108_ = i_110_ + i_108_;
			is_105_[i_107_++] += (i * i_109_) >> 6;
			i_109_ += i_111_;
			i_106_ += i_115_;
		}
		i_107_ >>= 1;
		aclass4_sub1.anInt656 += aclass4_sub1.anInt658 * i_107_;
		aclass4_sub1.anInt661 = i_108_;
		aclass4_sub1.anInt648 = i_109_;
		aclass4_sub1.anInt650 = i_106_;
		return i_107_;
	}

	private static int method440(int i, int i_117_, final byte[] is, final int[] is_118_, int i_119_, int i_120_,
			int i_121_, final int i_122_, int i_123_, final int i_124_, final int i_125_,
			final AClass4_Sub1 aclass4_sub1, final int i_126_, final int i_127_) {
		aclass4_sub1.anInt661 -= aclass4_sub1.anInt657 * i_120_;
		aclass4_sub1.anInt648 -= aclass4_sub1.anInt659 * i_120_;
		if ((i_126_ == 0) || ((i_123_ = i_120_ + ((((i_125_ + 256) - i_119_) + i_126_) / i_126_)) > i_124_)) {
			i_123_ = i_124_;
		}
		while (i_120_ < i_123_) {
			i_117_ = i_119_ >> 8;
			i = is[i_117_ - 1];
			is_118_[i_120_++] += ((((i << 8) + ((is[i_117_] - i) * (i_119_ & 0xff))) * i_121_) >> 6);
			i_121_ = i_122_ + i_121_;
			i_119_ += i_126_;
		}
		if ((i_126_ == 0) || ((i_123_ = i_120_ + (((i_125_ - i_119_) + i_126_) / i_126_)) > i_124_)) {
			i_123_ = i_124_;
		}
		i = i_127_;
		i_117_ = i_126_;
		while (i_120_ < i_123_) {
			is_118_[i_120_++] += (((i << 8) + ((is[i_119_ >> 8] - i) * (i_119_ & 0xff))) * i_121_) >> 6;
			i_121_ = i_122_ + i_121_;
			i_119_ += i_117_;
		}
		aclass4_sub1.anInt661 += aclass4_sub1.anInt657 * i_120_;
		aclass4_sub1.anInt648 += aclass4_sub1.anInt659 * i_120_;
		aclass4_sub1.anInt656 = i_121_;
		aclass4_sub1.anInt650 = i_119_;
		return i_120_;
	}

	private static int method441(int i, final byte[] is, final int[] is_128_, int i_129_, int i_130_, int i_131_,
			int i_132_, int i_133_, final int i_134_, int i_135_, final AClass4_Sub1 aclass4_sub1) {
		i_129_ >>= 8;
		i_135_ >>= 8;
		i_131_ <<= 2;
		i_132_ <<= 2;
		if ((i_133_ = (i_130_ + i_135_) - i_129_) > i_134_) {
			i_133_ = i_134_;
		}
		i_130_ <<= 1;
		i_133_ <<= 1;
		i_133_ -= 6;
		while (i_130_ < i_133_) {
			i = is[i_129_++];
			is_128_[i_130_++] += i * i_131_;
			is_128_[i_130_++] += i * i_132_;
			i = is[i_129_++];
			is_128_[i_130_++] += i * i_131_;
			is_128_[i_130_++] += i * i_132_;
			i = is[i_129_++];
			is_128_[i_130_++] += i * i_131_;
			is_128_[i_130_++] += i * i_132_;
			i = is[i_129_++];
			is_128_[i_130_++] += i * i_131_;
			is_128_[i_130_++] += i * i_132_;
		}
		i_133_ += 6;
		while (i_130_ < i_133_) {
			i = is[i_129_++];
			is_128_[i_130_++] += i * i_131_;
			is_128_[i_130_++] += i * i_132_;
		}
		aclass4_sub1.anInt650 = i_129_ << 8;
		return i_130_ >> 1;
	}

	private static int method442(int i, int i_136_, final byte[] is, final int[] is_137_, int i_138_, int i_139_,
			final int i_140_, final int i_141_, int i_142_, final int i_143_, final int i_144_,
			final AClass4_Sub1 aclass4_sub1, final int i_145_, final int i_146_) {
		if ((i_145_ == 0) || ((i_142_ = i_139_ + ((((i_144_ - i_138_) + i_145_) - 257) / i_145_)) > i_143_)) {
			i_142_ = i_143_;
		}
		i_139_ <<= 1;
		i_142_ <<= 1;
		while (i_139_ < i_142_) {
			i_136_ = i_138_ >> 8;
			i = is[i_136_];
			i = (i << 8) + ((i_138_ & 0xff) * (is[i_136_ + 1] - i));
			is_137_[i_139_++] += (i * i_140_) >> 6;
			is_137_[i_139_++] += (i * i_141_) >> 6;
			i_138_ += i_145_;
		}
		if ((i_145_ == 0) || ((i_142_ = (i_139_ >> 1) + ((((i_144_ - i_138_) + i_145_) - 1) / i_145_)) > i_143_)) {
			i_142_ = i_143_;
		}
		i_142_ <<= 1;
		i_136_ = i_146_;
		while (i_139_ < i_142_) {
			i = is[i_138_ >> 8];
			i = (i << 8) + ((i_136_ - i) * (i_138_ & 0xff));
			is_137_[i_139_++] += (i * i_140_) >> 6;
			is_137_[i_139_++] += (i * i_141_) >> 6;
			i_138_ += i_145_;
		}
		aclass4_sub1.anInt650 = i_138_;
		return i_139_ >> 1;
	}

	private static int method443(final byte[] is, final int[] is_147_, int i, int i_148_, int i_149_, int i_150_,
			int i_151_, final int i_152_, int i_153_, final AClass4_Sub1 aclass4_sub1) {
		i >>= 8;
		i_153_ >>= 8;
		i_149_ <<= 2;
		i_150_ <<= 2;
		if ((i_151_ = (i_148_ + i_153_) - i) > i_152_) {
			i_151_ = i_152_;
		}
		aclass4_sub1.anInt661 += aclass4_sub1.anInt657 * (i_151_ - i_148_);
		aclass4_sub1.anInt648 += aclass4_sub1.anInt659 * (i_151_ - i_148_);
		i_151_ -= 3;
		while (i_148_ < i_151_) {
			is_147_[i_148_++] += is[i++] * i_149_;
			i_149_ = i_150_ + i_149_;
			is_147_[i_148_++] += is[i++] * i_149_;
			i_149_ = i_150_ + i_149_;
			is_147_[i_148_++] += is[i++] * i_149_;
			i_149_ = i_150_ + i_149_;
			is_147_[i_148_++] += is[i++] * i_149_;
			i_149_ = i_150_ + i_149_;
		}
		i_151_ += 3;
		while (i_148_ < i_151_) {
			is_147_[i_148_++] += is[i++] * i_149_;
			i_149_ = i_150_ + i_149_;
		}
		aclass4_sub1.anInt656 = i_149_ >> 2;
		aclass4_sub1.anInt650 = i << 8;
		return i_148_;
	}

	private static int method444(int i, final byte[] is, final int[] is_154_, int i_155_, int i_156_, int i_157_,
			int i_158_, int i_159_, final int i_160_, int i_161_, final AClass4_Sub1 aclass4_sub1) {
		i_155_ >>= 8;
		i_161_ >>= 8;
		i_157_ <<= 2;
		i_158_ <<= 2;
		if ((i_159_ = (i_155_ + i_156_) - (i_161_ - 1)) > i_160_) {
			i_159_ = i_160_;
		}
		i_156_ <<= 1;
		i_159_ <<= 1;
		i_159_ -= 6;
		while (i_156_ < i_159_) {
			i = is[i_155_--];
			is_154_[i_156_++] += i * i_157_;
			is_154_[i_156_++] += i * i_158_;
			i = is[i_155_--];
			is_154_[i_156_++] += i * i_157_;
			is_154_[i_156_++] += i * i_158_;
			i = is[i_155_--];
			is_154_[i_156_++] += i * i_157_;
			is_154_[i_156_++] += i * i_158_;
			i = is[i_155_--];
			is_154_[i_156_++] += i * i_157_;
			is_154_[i_156_++] += i * i_158_;
		}
		i_159_ += 6;
		while (i_156_ < i_159_) {
			i = is[i_155_--];
			is_154_[i_156_++] += i * i_157_;
			is_154_[i_156_++] += i * i_158_;
		}
		aclass4_sub1.anInt650 = i_155_ << 8;
		return i_156_ >> 1;
	}

	@Override
	AClass4 method414() {
		return null;
	}

	private static int method445(final byte[] is, final int[] is_162_, int i, int i_163_, int i_164_, int i_165_,
			int i_166_, final int i_167_, int i_168_, final AClass4_Sub1 aclass4_sub1) {
		i >>= 8;
		i_168_ >>= 8;
		i_164_ <<= 2;
		i_165_ <<= 2;
		if ((i_166_ = (i_163_ + i) - (i_168_ - 1)) > i_167_) {
			i_166_ = i_167_;
		}
		aclass4_sub1.anInt661 += aclass4_sub1.anInt657 * (i_166_ - i_163_);
		aclass4_sub1.anInt648 += aclass4_sub1.anInt659 * (i_166_ - i_163_);
		i_166_ -= 3;
		while (i_163_ < i_166_) {
			is_162_[i_163_++] += is[i--] * i_164_;
			i_164_ = i_165_ + i_164_;
			is_162_[i_163_++] += is[i--] * i_164_;
			i_164_ = i_165_ + i_164_;
			is_162_[i_163_++] += is[i--] * i_164_;
			i_164_ = i_165_ + i_164_;
			is_162_[i_163_++] += is[i--] * i_164_;
			i_164_ = i_165_ + i_164_;
		}
		i_166_ += 3;
		while (i_163_ < i_166_) {
			is_162_[i_163_++] += is[i--] * i_164_;
			i_164_ = i_165_ + i_164_;
		}
		aclass4_sub1.anInt656 = i_164_ >> 2;
		aclass4_sub1.anInt650 = i << 8;
		return i_163_;
	}

	private static int method446(int i, final byte[] is, final int[] is_169_, int i_170_, int i_171_, int i_172_,
			int i_173_, int i_174_, int i_175_, int i_176_, final int i_177_, int i_178_,
			final AClass4_Sub1 aclass4_sub1) {
		i_170_ >>= 8;
		i_178_ >>= 8;
		i_172_ <<= 2;
		i_173_ <<= 2;
		i_174_ <<= 2;
		i_175_ <<= 2;
		if ((i_176_ = (i_170_ + i_171_) - (i_178_ - 1)) > i_177_) {
			i_176_ = i_177_;
		}
		aclass4_sub1.anInt656 += aclass4_sub1.anInt658 * (i_176_ - i_171_);
		i_171_ <<= 1;
		i_176_ <<= 1;
		i_176_ -= 6;
		while (i_171_ < i_176_) {
			i = is[i_170_--];
			is_169_[i_171_++] += i * i_172_;
			i_172_ += i_174_;
			is_169_[i_171_++] += i * i_173_;
			i_173_ = i_175_ + i_173_;
			i = is[i_170_--];
			is_169_[i_171_++] += i * i_172_;
			i_172_ += i_174_;
			is_169_[i_171_++] += i * i_173_;
			i_173_ = i_175_ + i_173_;
			i = is[i_170_--];
			is_169_[i_171_++] += i * i_172_;
			i_172_ += i_174_;
			is_169_[i_171_++] += i * i_173_;
			i_173_ = i_175_ + i_173_;
			i = is[i_170_--];
			is_169_[i_171_++] += i * i_172_;
			i_172_ += i_174_;
			is_169_[i_171_++] += i * i_173_;
			i_173_ = i_175_ + i_173_;
		}
		i_176_ += 6;
		while (i_171_ < i_176_) {
			i = is[i_170_--];
			is_169_[i_171_++] += i * i_172_;
			i_172_ += i_174_;
			is_169_[i_171_++] += i * i_173_;
			i_173_ = i_175_ + i_173_;
		}
		aclass4_sub1.anInt661 = i_172_ >> 2;
		aclass4_sub1.anInt648 = i_173_ >> 2;
		aclass4_sub1.anInt650 = i_170_ << 8;
		return i_171_ >> 1;
	}

	private AClass4_Sub1(final AClass3_Sub1 aclass3_sub1, final int i, final int i_179_) {
		this.anAClass3_1 = aclass3_sub1;
		anInt655 = aclass3_sub1.anInt645;
		anInt653 = aclass3_sub1.anInt646;
		aBool36 = aclass3_sub1.aBool35;
		anInt649 = i;
		anInt654 = i_179_;
		anInt652 = 8192;
		anInt650 = 0;
		method432();
	}
}
