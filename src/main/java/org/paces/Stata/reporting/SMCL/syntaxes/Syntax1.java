package org.paces.Stata.reporting.SMCL.syntaxes;

import java.util.regex.Pattern;

/**
 * Interface used to define the behavior of Syntax 1
 * @author Billy Buchanan
 * @version 0.0.0
 */
public interface Syntax1 {


	public final String intent = "do whatever it is that {xyz} does";

	public final Boolean sameLineMatching = false;


	// Need to set multiline flag for this pattern
	default Pattern syntaxPattern(String name) {

		return Pattern.compile("\\{" + name + "\\}.*");

	}

}
