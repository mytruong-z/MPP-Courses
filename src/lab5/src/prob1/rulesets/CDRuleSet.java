package lab5.src.prob1.rulesets;

import lab5.src.prob1.gui.CDWindow;

import java.awt.Component;


/**
 * Rules:
 * 1. All fields must be nonempty
 * 2. Price must be a floating point number with two decimal places
 * 3. Price must be a number greater than 0.49.
 */

public class CDRuleSet implements RuleSet {

    @Override
    public void applyRules(Component ob) throws RuleException {
        CDWindow cdWindow = (CDWindow) ob;
        nonemptyRule(cdWindow);
        priceRule(cdWindow);
    }

    private void nonemptyRule(CDWindow cdWindow) throws RuleException {
        if (
                cdWindow.getTitleValue().trim().equals("") ||
                        cdWindow.getPriceValue().trim().equals("") ||
                        cdWindow.getArtistValue().trim().equals("")) {
            throw new RuleException("All fields must be non-empty!");
        }
    }

    private void priceRule(CDWindow cdWindow) throws RuleException {
        String price = cdWindow.getPriceValue();
        try {
            double priceVal = Double.parseDouble(price);
            if (priceVal <= 0.49) {
                throw new RuleException("Price must be a number greater than 0.49");
            }
        } catch (NumberFormatException e) {
            throw new RuleException("Price must be a floating point number");
        }
    }


}
