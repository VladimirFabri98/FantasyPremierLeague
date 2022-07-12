package fpl;

public class Fixtures {

	private String[] MCI, LIV, CHE, TOT, ARS, MUN, WHU, LEI, BHA, WOL, NEW, CRY, BRE, AVL, SOU, EVE, LEE, FUL, BOU, NFO;
	private static String[] teams = { "MCI", "LIV", "CHE", "TOT", "ARS", "MUN", "WHU", "LEI", "WOL", "BHA", "NEW",
			"CRY", "BRE", "AVL", "SOU", "EVE", "LEE", "FUL", "BOU", "NFO" };

	public Fixtures() {
		this.MCI = new String[] { "WHU", "BOU", "NEW", "CRY", "NFO", "AVL", "TOT", "WOL", "MUN", "SOU" };
		this.LIV = new String[] { "FUL", "CRY", "MUN", "BOU", "NEW", "EVE", "WOL", "CHE", "BHA", "ARS" };
		this.CHE = new String[] { "EVE", "TOT", "LEE", "LEI", "SOU", "WHU", "FUL", "LIV", "CRY", "WOL" };
		this.TOT = new String[] { "SOU", "CHE", "WOL", "NFO", "WHU", "FUL", "MCI", "LEI", "ARS", "BHA" };
		this.ARS = new String[] { "CRY", "LEI", "BOU", "FUL", "AVL", "MUN", "EVE", "BRE", "TOT", "LIV" };
		this.MUN = new String[] { "BHA", "BRE", "LIV", "SOU", "LEI", "ARS", "CRY", "LEE", "MCI", "EVE" };
		this.WHU = new String[] { "MCI", "NFO", "BHA", "AVL", "TOT", "CHE", "NEW", "EVE", "WOL", "FUL" };
		this.LEI = new String[] { "BRE", "ARS", "SOU", "CHE", "MUN", "BHA", "AVL", "TOT", "NFO", "BOU" };
		this.BHA = new String[] { "MUN", "NEW", "WHU", "LEE", "FUL", "LEI", "BOU", "CRY", "LIV", "TOT" };
		this.WOL = new String[] { "LEE", "FUL", "TOT", "NEW", "BOU", "SOU", "LIV", "MCI", "WHU", "CHE" };
		this.NEW = new String[] { "NFO", "BHA", "MCI", "WOL", "LIV", "CRY", "WHU", "BOU", "FUL", "BRE" };
		this.CRY = new String[] { "ARS", "LIV", "AVL", "MCI", "BRE", "NEW", "MUN", "BHA", "CHE", "LEE" };
		this.BRE = new String[] { "LEI", "MUN", "FUL", "EVE", "CRY", "LEE", "SOU", "ARS", "BOU", "NEW" };
		this.AVL = new String[] { "BOU", "EVE", "CRY", "WHU", "ARS", "MCI", "LEI", "SOU", "LEE", "NFO" };
		this.SOU = new String[] { "TOT", "LEE", "LEI", "MUN", "CHE", "WOL", "BRE", "AVL", "EVE", "MCI" };
		this.EVE = new String[] { "CHE", "AVL", "NFO", "BRE", "LEE", "LIV", "ARS", "WHU", "SOU", "MUN" };
		this.LEE = new String[] { "WOL", "SOU", "CHE", "BHA", "EVE", "BRE", "NFO", "MUN", "AVL", "CRY" };
		this.FUL = new String[] { "LIV", "WOL", "BRE", "ARS", "BHA", "TOT", "CHE", "NFO", "NEW", "WHU" };
		this.BOU = new String[] { "AVL", "MCI", "ARS", "LIV", "WOL", "NFO", "BHA", "NEW", "BRE", "LEI" };
		this.NFO = new String[] { "NEW", "WHU", "EVE", "TOT", "MCI", "BOU", "LEE", "FUL", "LEI", "AVL" };
	}

	public String[] selectTeamFixtures(String name) {
		String[] temp = new String[10];
		for (String s : teams) {
			if (s.equals(name)) {
				switch (s) {
				case "MCI":
					temp =  this.getMCI();
					break;
				case "LIV":
					temp = this.getLIV();
					break;
				case "ARS":
					temp = this.getARS();
					break;
				case "CHE":
					temp = this.getCHE();
					break;
				case "TOT":
					temp = this.getTOT();
					break;
				case "MUN":
					temp = this.getMUN();
					break;
				case "WHU":
					temp = this.getWHU();
					break;
				case "LEI":
					temp = this.getLEI();
					break;
				case "WOL":
					temp = this.getWOL();
					break;
				case "BHA":
					temp = this.getBHA();
					break;
				case "NEW":
					temp = this.getNEW();
					break;
				case "CRY":
					temp = this.getCRY();
					break;
				case "BRE":
					temp = this.getBRE();
					break;
				case "AVL":
					temp = this.getAVL();
					break;
				case "SOU":
					temp = this.getSOU();
					break;
				case "EVE":
					temp = this.getEVE();
					break;
				case "LEE":
					temp = this.getLEE();
					break;
				case "FUL":
					temp = this.getFUL();
					break;
				case "BOU":
					temp = this.getBOU();
					break;
				case "NFO":
					temp = this.getBOU();
					break;
				}
				break;
			}
		}
		return temp;
	}

	public String[] getMCI() {
		return MCI;
	}

	public void setMCI(String[] mCI) {
		MCI = mCI;
	}

	public String[] getLIV() {
		return LIV;
	}

	public void setLIV(String[] lIV) {
		LIV = lIV;
	}

	public String[] getCHE() {
		return CHE;
	}

	public void setCHE(String[] cHE) {
		CHE = cHE;
	}

	public String[] getTOT() {
		return TOT;
	}

	public void setTOT(String[] tOT) {
		TOT = tOT;
	}

	public String[] getARS() {
		return ARS;
	}

	public void setARS(String[] aRS) {
		ARS = aRS;
	}

	public String[] getMUN() {
		return MUN;
	}

	public void setMUN(String[] mUN) {
		MUN = mUN;
	}

	public String[] getWHU() {
		return WHU;
	}

	public void setWHU(String[] wHU) {
		WHU = wHU;
	}

	public String[] getLEI() {
		return LEI;
	}

	public void setLEI(String[] lEI) {
		LEI = lEI;
	}

	public String[] getBHA() {
		return BHA;
	}

	public void setBHA(String[] bHA) {
		BHA = bHA;
	}

	public String[] getWOL() {
		return WOL;
	}

	public void setWOL(String[] wOL) {
		WOL = wOL;
	}

	public String[] getNEW() {
		return NEW;
	}

	public void setNEW(String[] nEW) {
		NEW = nEW;
	}

	public String[] getCRY() {
		return CRY;
	}

	public void setCRY(String[] cRY) {
		CRY = cRY;
	}

	public String[] getBRE() {
		return BRE;
	}

	public void setBRE(String[] bRE) {
		BRE = bRE;
	}

	public String[] getAVL() {
		return AVL;
	}

	public void setAVL(String[] aVL) {
		AVL = aVL;
	}

	public String[] getSOU() {
		return SOU;
	}

	public void setSOU(String[] sOU) {
		SOU = sOU;
	}

	public String[] getEVE() {
		return EVE;
	}

	public void setEVE(String[] eVE) {
		EVE = eVE;
	}

	public String[] getLEE() {
		return LEE;
	}

	public void setLEE(String[] lEE) {
		LEE = lEE;
	}

	public String[] getFUL() {
		return FUL;
	}

	public void setFUL(String[] fUL) {
		FUL = fUL;
	}

	public String[] getBOU() {
		return BOU;
	}

	public void setBOU(String[] bOU) {
		BOU = bOU;
	}

	public String[] getNFO() {
		return NFO;
	}

	public void setNFO(String[] nFO) {
		NFO = nFO;
	}

}
