package lab5.src.prob1.rulesets;

import lab5.src.prob1.gui.BookWindow;

import java.awt.Component;



/**
 * Rules:
 * 1. All fields must be nonempty
 * 2. Isbn must be numeric and consist of either 10 or 13 characters
 * 3. If Isbn has length 10, the first digit must be 0 or 1
 * 4. If Isbn has length 13, the first 3 digits must be either 978 or 979
 * 5. Price must be a floating point number with two decimal places 
 * 6. Price must be a number greater than 0.49.
 *
 */
public class BookRuleSet implements RuleSet {

	@Override
	public void applyRules(Component ob) throws RuleException {
		BookWindow bookWindow = (BookWindow) ob;
		nonemptyRule(bookWindow);
		isbnRule(bookWindow);
		priceRule(bookWindow);
	}

	private void nonemptyRule(BookWindow bookWindow) throws RuleException {
		if(bookWindow.getIsbnValue().trim().equals("") ||
				bookWindow.getTitleValue().trim().equals("") ||
				bookWindow.getPriceValue().trim().equals("") ||
				bookWindow.getIsbnValue().trim().equals("")) {
			throw new RuleException("All fields must be non-empty!");
		}
	}

	private void isbnRule(BookWindow bookWindow) throws RuleException {
		String isbn = bookWindow.getIsbnValue();
		if(isbn.length() != 10 && isbn.length() != 13) {
			throw new RuleException("Isbn must be numeric and consist of either 10 or 13 characters");
		}
		if(isbn.length() == 10) {
			if(isbn.charAt(0) != '0' && isbn.charAt(0) != '1') {
				throw new RuleException("If Isbn has length 10, the first digit must be 0 or 1");
			}
		}
		if(isbn.length() == 13) {
			if(!isbn.substring(0, 3).equals("978") && !isbn.substring(0, 3).equals("979")) {
				throw new RuleException("If Isbn has length 13, the first 3 digits must be either 978 or 979");
			}
		}
	}

	private void priceRule(BookWindow bookWindow) throws RuleException {
		String price = bookWindow.getPriceValue();
		try {
			double priceVal = Double.parseDouble(price);
			if(priceVal <= 0.49) {
				throw new RuleException("Price must be a number greater than 0.49");
			}
		} catch(NumberFormatException e) {
			throw new RuleException("Price must be a floating point number");
		}
	}
}
