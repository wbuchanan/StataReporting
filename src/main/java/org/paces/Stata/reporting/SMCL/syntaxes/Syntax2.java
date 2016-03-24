package org.paces.Stata.reporting.SMCL.syntaxes;

import java.util.regex.Pattern;

/**
 * Interface used to define the behavior of Syntax 2
 * @author Billy Buchanan
 * @version 0.0.0
 */
public interface Syntax2 {


	public final String intent = "do whatever it is that {xyz} does, do it on the text text, and then stop doing it";

	public final Boolean sameLineMatching = false;

	// Need to set multiline flag for this pattern
	default Pattern syntaxPattern(String name) {

		return Pattern.compile("\\{" + name + ":.*\\}");

	}


}
