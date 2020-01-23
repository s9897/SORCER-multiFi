public class MaintainOrder implements SorcerConstants {


public static Model getOrderCoffeeMorphers() throws Exception {

	Morpher ingridientsMorpher =  (mgr, mFi, value) -> {
		Fidelity fi =  mFi.getFidelity();
		name = fi.getSelectName()
			switch (name){
				case "showIngridients":
					mgr.morph("ingr1");
					break;
				case "showCaloricValue":
					mgr.morhp("ingr2");
					break;
				case "showNutritionalValue":
					mgr.morhp("ingr3");
					break;
				}
	};

	Morpher paymentMorpher =  (mgr, mFi, value) -> {
		Fidelity fi =  mFi.getFidelity();
		name = fi.getSelectName()
			switch (name){
				case "pay":
					mgr.morph("pay1");
					break;
				case "paymentWithCard":
					mgr.morhp("pay2");
					break;
				case "paymentWithCash":
					mgr.morhp("pay3");
					break;
				case "paymentWithPhone":
					mgr.morhp("pay4");
					break;
				}
	};

	Morpher modifyOrderMorpher =  (mgr, mFi, value) -> {
		Fidelity fi =  mFi.getFidelity();
		name = fi.getSelectName()
			switch (name){
				case "addBrownSugar":
					mgr.morph("mod1");
					break;
				case "addWhiteSugar":
					mgr.morhp("mod2");
					break;
				case "addMilk":
					mgr.morhp("mod3");
					break;
				case "addMilkCoconut":
					mgr.morph("mod4");
					break;
				case "addMilkRice":
					mgr.morhp("mod5");
					break;
				case "addExtraIngridient":
					mgr.morhp("mod6");
					break;
				}
	};

        Signature showIngridients = sig("showIngridients", Coffee.class,
                result("ingridientList", inPaths("orderedCoffee")));

        Signature showCaloricValue = sig("showCaloricValue", Coffee.class, 
		result("showCaloricValue", inPaths("orderedCoffee")));

        Signature showNutritionalValue = sig("showNutritionalValue", Coffee.class,
                result("showNutritionalValue", inPaths("orderedCoffee")));
        
        Signature paymentWithCard = sig("paymentWithCard", Coffee.class,
                result("paymentWithCard", inPaths("orderedCoffee")));

        Signature paymentWithCash = sig("paymentWithCash", Coffee.class,
                result("paymentWithCash", inPaths("orderedCoffee")));

        Signature paymentWithPhone = sig("paymentWithPhone", Coffee.class,
                result("paymentWithPhone", inPaths("orderedCoffee")));

        Signature addBrownSugar = sig("addBrownSugar", Coffee.class,
                result("addBrownSugar", inPaths("orderedCoffee")));

        Signature addWhiteSugar = sig("addWhiteSugar", Coffee.class,
                result("addWhiteSugar", inPaths("orderedCoffee")));

        Signature addMilk = sig("addMilk", Coffee.class,
                result("addMilk", inPaths("orderedCoffee")));

        Signature addMilkCoconut = sig("addMilkCoconut", Coffee.class,
                result("addMilkCoconut", inPaths("orderedCoffee")));

        Signature addMilkRice = sig("addMilkRice", Coffee.class,
                result("addMilkRice", inPaths("orderedCoffee")));

        Signature addExtraIngridient = sig("addExtraIngridient", Coffee.class,
                result("addExtraIngridient", inPaths("orderedCoffee")));


	Model mod = model(inVal("orderedCoffee"),
		ent("mFi1", mphFi(ingridientsMorpher, showIngridients, showCaloricValue, showNutritionalValue)),
		ent("mFi2", mphFi(paymentMorpher, pay, paymentWithCard, paymentWithCash, paymentWithPhone)),
		ent("mFi3", mphFimodifyOrderMorpher, addBrownSugar, addWhiteSugar, addMilk, addMilkCoconut, addMilkRice, addExtraIngridient)),
		response("mFi1", "mFi2", "mFi3", "orderedCoffee"));

	return mod;

    }
}