package com.cheap.locatorexe;

import com.cheap.baseClass.BaseClass;
import com.cheap.locators.purchaseLocate;

public class purchaseLocateEx extends SelectLocExe{

	public static void cont() {
	BaseClass.clk(new purchaseLocate().getCont());
	}

	public static void first() {
	BaseClass.sendKeys(new purchaseLocate().getFirst(),readValueForExcel(2, 2, "CheapAir"));
	}
	public static void middle() {
		BaseClass.sendKeys(new purchaseLocate().getMiddleName(),readValueForExcel(2, 3, "CheapAir"));
	}
	public static void last() {
		BaseClass.sendKeys(new purchaseLocate().getLastName(),readValueForExcel(2, 4, "CheapAir"));
		}
	public static void suffix() {
		BaseClass.selectindex(new purchaseLocate().getSuffix(),1);
		}
	public static void gender() {
		BaseClass.selectindex(new purchaseLocate().getGender(),1);
		}
	public static void dob() {
		BaseClass.selectindex(new purchaseLocate().getDob(),1);
		}
	public static void dobday() {
		BaseClass.sendKeys(new purchaseLocate().getDobDay(),readValueForExcel(2, 5, "CheapAir"));
		}
	public static void dobyear() {
		BaseClass.sendKeys(new purchaseLocate().getDobYear(),readValueForExcel(2, 6, "CheapAir"));
		}
	public static void first2() {
		BaseClass.sendKeys(new purchaseLocate().getFirstName2(),readValueForExcel(3, 2, "CheapAir"));
		}
		public static void middle2() {
			BaseClass.sendKeys(new purchaseLocate().getMiddleName2(),readValueForExcel(3, 3, "CheapAir"));
		}
		public static void last2() {
			BaseClass.sendKeys(new purchaseLocate().getLastName2(),readValueForExcel(3, 4, "CheapAir"));
			}
		public static void suffix2() {
			BaseClass.selectindex(new purchaseLocate().getSuffix2(),1);
			}
		public static void gender2() {
			BaseClass.selectindex(new purchaseLocate().getGender2(),1);
			}
		public static void dob2() {
			BaseClass.selectindex(new purchaseLocate().getDob2(),1);
			}
		public static void dobday2() {
			BaseClass.sendKeys(new purchaseLocate().getDobDay2(),readValueForExcel(3, 5, "CheapAir"));
			}
		public static void dobyear2() {
			BaseClass.sendKeys(new purchaseLocate().getDobYear2(),readValueForExcel(3, 6, "CheapAir"));
			}
		public static void first3() {
			BaseClass.sendKeys(new purchaseLocate().getFirstName3(),readValueForExcel(4, 2, "CheapAir"));
			}
			public static void middle3() {
				BaseClass.sendKeys(new purchaseLocate().getMiddleName3(),readValueForExcel(4, 3, "CheapAir"));
			}
			public static void last3() {
				BaseClass.sendKeys(new purchaseLocate().getLastName3(),readValueForExcel(4, 4, "CheapAir"));
				}
			public static void suffix3() {
				BaseClass.selectindex(new purchaseLocate().getSuffix3(),1);
				}
			public static void gender3() {
				BaseClass.selectindex(new purchaseLocate().getGender3(),1);
				}
			public static void dob3() {
				BaseClass.selectindex(new purchaseLocate().getDob3(),1);
				}
			public static void dobday3() {
				BaseClass.sendKeys(new purchaseLocate().getDobDay3(),readValueForExcel(4, 5, "CheapAir"));
				}
			public static void dobyear3() {
				BaseClass.sendKeys(new purchaseLocate().getDobYear3(),readValueForExcel(4, 6, "CheapAir"));
				}
			public static void first4() {
				BaseClass.sendKeys(new purchaseLocate().getFirstName4(),readValueForExcel(5, 2, "CheapAir"));
				}
				public static void middle4() {
					BaseClass.sendKeys(new purchaseLocate().getMiddleName4(),readValueForExcel(5, 3, "CheapAir"));
				}
				public static void last4() {
					BaseClass.sendKeys(new purchaseLocate().getLastName4(),readValueForExcel(5, 4, "CheapAir"));
					}
				public static void suffix4() {
					BaseClass.selectindex(new purchaseLocate().getSuffix4(),1);
					}
				public static void gender4() {
					BaseClass.selectindex(new purchaseLocate().getGender4(),1);
					}
				public static void dob4() {
					BaseClass.selectindex(new purchaseLocate().getDob4(),1);
					}
				public static void dobday4() {
					BaseClass.sendKeys(new purchaseLocate().getDobDay4(),readValueForExcel(5, 5, "CheapAir"));
					}
				public static void dobyear4() {
					BaseClass.sendKeys(new purchaseLocate().getDobYear4(),readValueForExcel(5, 6, "CheapAir"));
					}
				public static void first5() {
					BaseClass.sendKeys(new purchaseLocate().getFirstName5(),readValueForExcel(6, 2, "CheapAir"));
					}
					public static void middle5() {
						BaseClass.sendKeys(new purchaseLocate().getMiddleName5(),readValueForExcel(6, 3, "CheapAir"));
					}
					public static void last5() {
						BaseClass.sendKeys(new purchaseLocate().getLastName5(),readValueForExcel(6, 4, "CheapAir"));
						}
					public static void suffix5() {
						BaseClass.selectindex(new purchaseLocate().getSuffix5(),1);
						}
					public static void gender5() {
						BaseClass.selectindex(new purchaseLocate().getGender5(),1);
						}
					public static void dob5() {
						BaseClass.selectindex(new purchaseLocate().getDob5(),1);
						}
					public static void dobday5() {
						BaseClass.sendKeys(new purchaseLocate().getDobDay5(),readValueForExcel(6, 5, "CheapAir"));
						}
					public static void dobyear5() {
						BaseClass.sendKeys(new purchaseLocate().getDobYear5(),readValueForExcel(6, 6, "CheapAir"));
						}
					public static void cardno() {
						BaseClass.sendKeys(new purchaseLocate().getCardNumb(),readValueForExcel(7, 2, "CheapAir"));
						}
					public static void month() {
						BaseClass.selectindex(new purchaseLocate().getExpMonth(),5);
						}
					public static void year() {
						BaseClass.selectindex(new purchaseLocate().getExpYear(),2);
						}
					public static void ccvno() {
						BaseClass.sendKeys(new purchaseLocate().getCvvNumb(),readValueForExcel(7, 3, "CheapAir"));
						}
					public static void cardHolder() {
						BaseClass.sendKeys(new purchaseLocate().getCardHolder(),readValueForExcel(7, 4, "CheapAir"));
						}
					public static void county() {
						BaseClass.selectText(new purchaseLocate().getPayCountry(),"India");
						}
					public static void address1() {
						BaseClass.sendKeys(new purchaseLocate().getAddress1(),readValueForExcel(7, 5, "CheapAir"));
						}
					public static void address2() {
						BaseClass.sendKeys(new purchaseLocate().getAddress2(),readValueForExcel(7, 6, "CheapAir"));
						}
					public static void city() {
						BaseClass.sendKeys(new purchaseLocate().getPayCity(),readValueForExcel(7, 7, "CheapAir"));
						}
					public static void payment() {
						BaseClass.sendKeys(new purchaseLocate().getPhone(),readValueForExcel(7, 9, "CheapAir"));
						}
					public static void email() {
						BaseClass.sendKeys(new purchaseLocate().getEmail(),readValueForExcel(7, 10, "CheapAir"));
						}
					public static void password() {
						BaseClass.sendKeys(new purchaseLocate().getPassword(),readValueForExcel(7, 11, "CheapAir"));
						}
					public static void confirmpassword() {
						BaseClass.sendKeys(new purchaseLocate().getConfPassword(),readValueForExcel(7, 12, "CheapAir"));
						}
}
