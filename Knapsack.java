
/*
class Item {
    int value, weight;
    Item(int x, int y){
        this.value = x;
        this.weight = y;
    }
}
*/

class Solution
{
    //Function to get the maximum total value in the knapsack.
    double fractionalKnapsack(int W, Item arr[], int n) 
    {
        Arrays.sort(arr, Comparator.comparing((Item a) -> (double)a.value / a.weight).reversed());
    
        double result = 0;
        for(Item item : arr){
            if(item.weight <= W){
                result += item.value;
                W-=item.weight;
            }else{
                result += (double)(W * item.value) / item.weight;
                break;
            }
        }
        return result;
    }
}
