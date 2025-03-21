class Solution {
    public List<String> findAllRecipes(String[] recipes, List<List<String>> ingredients, String[] supplies) {
        List<String> successfullRecipesList = new ArrayList<>();
        List<String> remainingIngredientsList;
        HashMap<String, Boolean> supplyMap = new HashMap<>();
        HashMap<List<String>, String> remainingRecipesMap = new HashMap<>();

        List<List<String>> unsuccessfullRecipes = new ArrayList<>();

        for(int supplyIndex = 0; supplyIndex < supplies.length; supplyIndex++){
            supplyMap.put(supplies[supplyIndex], true);
        }

        for(int recipeIndex = 0; recipeIndex < recipes.length; recipeIndex++){
            int ingredientsCheckCount = 0;
            remainingIngredientsList = new ArrayList<>();
            for(int ingredientIndex = 0; ingredientIndex < ingredients.get(recipeIndex).size(); ingredientIndex++){
                if(supplyMap.containsKey(ingredients.get(recipeIndex).get(ingredientIndex))){
                    ingredientsCheckCount++;
                }
                else{
                    remainingIngredientsList.add(ingredients.get(recipeIndex).get(ingredientIndex));
                }
            }
            if(ingredientsCheckCount == ingredients.get(recipeIndex).size()){
                supplyMap.put(recipes[recipeIndex],true);
                successfullRecipesList.add(recipes[recipeIndex]);
            }
            else{
                remainingRecipesMap.put(remainingIngredientsList, recipes[recipeIndex]);
                unsuccessfullRecipes.add(remainingIngredientsList);
            }
        }
        boolean newRecipeAdded = true;
        while (newRecipeAdded) {
            newRecipeAdded = false;
            for (int unsuccessfullRecipesIndex = 0; unsuccessfullRecipesIndex < unsuccessfullRecipes.size(); unsuccessfullRecipesIndex++) {
                int ingredientsCheckCount = 0;

                for (int remainingIngredientIndex = 0; remainingIngredientIndex < unsuccessfullRecipes.get(unsuccessfullRecipesIndex).size(); remainingIngredientIndex++) {
                    if (supplyMap.containsKey(unsuccessfullRecipes.get(unsuccessfullRecipesIndex).get(remainingIngredientIndex))) {
                        ingredientsCheckCount++;
                    }
                }

                if (ingredientsCheckCount == unsuccessfullRecipes.get(unsuccessfullRecipesIndex).size()) {
                    String recipe = remainingRecipesMap.get(unsuccessfullRecipes.get(unsuccessfullRecipesIndex));
                    supplyMap.put(recipe, true);
                    successfullRecipesList.add(recipe);
                    unsuccessfullRecipes.remove(unsuccessfullRecipesIndex);
                    unsuccessfullRecipesIndex--;
                    newRecipeAdded = true;
                }
            }
        }
        return successfullRecipesList;
    }
}