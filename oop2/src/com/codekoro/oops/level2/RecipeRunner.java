package com.codekoro.oops.level2;

public class RecipeRunner {

	public static void main(String[] args) {
		Recipe1 recipe = new Recipe1();
		recipe.execute();
		RecipeWithMicrowave recipeWM = new RecipeWithMicrowave();
		recipeWM.execute();
	}

}
