package lab5.src.prob1.rulesets;

import java.awt.Component;
import java.util.HashMap;


final public class RuleSetFactory {
	private RuleSetFactory(){}
	static HashMap<Class<? extends Component>, RuleSet> map = new HashMap<>();

	static {
		map.put(lab5.src.prob1.gui.BookWindow.class, new BookRuleSet());
		map.put(lab5.src.prob1.gui.CDWindow.class, new CDRuleSet());
	}

	public static RuleSet getRuleSet(Component c) {
		Class<? extends Component> cl = c.getClass();
		if(!map.containsKey(cl)) {
			throw new IllegalArgumentException("RuleSet not found");
		}
		return map.get(cl);
	}


	
}
