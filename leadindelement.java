
class leadindelement {
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 6, 2, 7, 4};
        int lead = arr[0]; 
        boolean isLead; 
        for (int i = 1; i < arr.length; i++) {
            isLead = true; 
            for (int j = 0; j < i; j++) {
                if (arr[j] >= arr[i]) {
                    isLead = false; 
                    break;
                }
            }
            if (isLead) {
                lead = arr[i]; 
            }
        }
        System.out.println("Lead in element: " + lead); 
    }
}

