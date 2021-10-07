package data_types;

public class NonPrimitiveDataTypes_2 {

    /**
     * The main purpose of using variables is to keep the code maintainable, reusable.
     * Basically it becomes easier to update if needed at one place and it gets applied
     * on every usage of that variable.
     */

    public static void main(String[] args) {

        String ceoOfApple = "Serhii Psarov";

        String aboutAppleCEO = "The current CEO of Apple co. is "+ceoOfApple+". He joined Apple co.\n in 1990. He " +
                "is the best CEO of Apple co. in the history. "+ceoOfApple+" has a great personality and \nhe is best fit for this role. " +
                "The current CEO of Apple co. is "+ceoOfApple+". He joined Apple co. in 1990. He \n" +
                "is the best CEO of Apple co. in the history. "+ceoOfApple+" has a great personality " +
                "and he is best fit for this role. \nThe current CEO of Apple co. is "+ceoOfApple+". He joined Apple co. in 1990. He \n" +
                "is the best CEO of Apple co. in the history. "+ceoOfApple+" has a great personality and he " +
                "is best fit for this role.";

        System.out.println(aboutAppleCEO);

        System.out.println("****************************************");

        int tallestBuildingHeightInM = 1425;
        String tallestBuildingName = "Chicago Super Sky Tower";

        String tallestBuildingInfo = "The tallest building is " + tallestBuildingName + ". The height of it in meters is: " + tallestBuildingHeightInM;
        System.out.println(tallestBuildingInfo);
    }
}
