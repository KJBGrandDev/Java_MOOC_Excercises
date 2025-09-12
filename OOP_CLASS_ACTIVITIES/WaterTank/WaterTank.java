package OOP_CLASS_ACTIVITIES.WaterTank;

import java.util.Arrays;

public class WaterTank {
    //Required variables
    private double capacity;
    private double currentLevel;

    //Variables needed by my Watertank visualization.
    private String block; //Stores the ANSI code for the water block
    private Integer rowColorCounter; //Represents how many rows of blocks will be printed vertically
    private Integer[] waterColor; //Stores how many rows per color is printed
    private String[] waterBlockColor; //Stores all the colors for visualization
    private String colorReset; //Resets the color back to white
    private String containerSideStructure;
    private String containerBottomStructure;
    private String containerColor;
    private int containerWidth; //Represents how many blocks will be printed horizontally

    private double blankSpaceContainerCounter; //Represents the blank row space
    private double filledSpaceContainerCounter; //Represents the filled row space

    //Text colors
    private String text_nG; //NeonGreen - For Highlighting
    private String text_nO; //NeonOrange - For standard UI elements
    private String text_nC; //NeonCyan - For normal text
    private String text_nR; //NeonRed - For Errors or Warning
    private String text_g;
    private String text_cR;

    public WaterTank(double capacity){
        this.capacity = capacity;
        this.currentLevel = 0;

        //Initialization for my  Watertank visualization
        this.block = "\u2588";
        this.rowColorCounter = 0;
        this.waterColor = new Integer[]{0, 0, 0, 0, 0};
        this.waterBlockColor = new String[]
                {
                        "\u001B[38;5;87m",
                        "\u001B[38;5;45m",
                        "\u001B[38;5;38m",
                        "\u001B[38;5;32m",
                        "\u001B[38;5;24m"
                };
        this.colorReset = "\u001B[0m";
        this.containerSideStructure = "|";
        this.containerBottomStructure = "-";
        this.containerColor = "\u001B[38;5;214m";
        this.containerWidth = 15;

        this.blankSpaceContainerCounter = capacity;

        //For text colors
        this.text_nG = "\u001B[38;5;46m"; //NeonGreen - For Highlighting
        this.text_nO = "\u001B[38;5;214m"; //NeonOrange - For standard UI elements
        this.text_nC = "\u001B[38;5;87m"; //NeonCyan - For normal text
        this.text_nR =  "\u001B[38;5;197m"; //NeonRed - For Errors or Warning
        this.text_g = "\033[38;5;245m"; //Gray - faded text
        this.text_cR = "\u001B[0m";
    }

    public void fill(double liters){
        if(liters <= 0){
            System.out.println(text_nR + "\nError!"+ text_nO + " Please give a "+ text_nG +"positive value!");
            return;
        }
        if (currentLevel == capacity){
            System.out.println(text_nR + "\nAlready " + text_nG + "Full!");
            System.out.println(text_nO + "Cannot add water anymore!");
        } else if(this.currentLevel + liters > capacity){
            double overflow = (currentLevel + liters) - capacity;
            System.out.println(text_nR+"\nOverflow!" + text_nG + " " + overflow + text_nO +" Ltr. wasted.");

            currentLevel = capacity;
            System.out.println("Tank is now full! ("+ text_nG + currentLevel + text_nO +" Ltr.)");

        } else if(currentLevel + liters <= capacity){
            System.out.println("\nWater added "+ text_nG + "successfully" + text_nO + " to the Watertank!");
            currentLevel += liters;
        }
    }

    public void drain(double liters){
        if(liters <= 0){
            System.out.println(text_nR + "\nError!"+ text_nO + " Please give a "+ text_nG +"positive value!");
            return;
        }

        if (currentLevel <= 0){
            System.out.println(text_nR + "\nAlready " + text_nG + "Empty!");
            System.out.println(text_nO + "There's no water left to drain!");
        } else if (currentLevel - liters < 0){
            System.out.println(text_nR + "\nUnderflow!" + text_nO + " Cannot drain the exact " + text_nG +liters + text_nO +" Ltr.");
            System.out.println("Draining the current water level: " + text_nG + currentLevel + text_nO +" Ltr. \nTank is now" + text_nG + " Empty!");
            currentLevel = 0;
        } else if (currentLevel - liters >= 0){
            System.out.println("\nWater drained "+ text_nG + "successfully!");
            currentLevel -= liters;
        }
    }

    public double getCurrentLevel(){
        return currentLevel;
    }

    public boolean isFull(){
        return currentLevel == capacity;
    }

    public boolean isEmpty(){
        return currentLevel == 0;
    }


    public void prepareWaterLevel(){
        int pureRowColorCounter = 0;

        //Resets initial Value
        Arrays.fill(waterColor,0);

        rowColorCounter = (int) currentLevel / 5;
        if(rowColorCounter > 1){
            pureRowColorCounter = rowColorCounter / 5;
        }

        if(currentLevel > 0 && currentLevel < 5){
            if(currentLevel % 5 != 0){
                rowColorCounter += 1;
            }
        }

        for(int i = 0; i < pureRowColorCounter; i++){
            for(int j = 0; j < waterColor.length; j++){
                waterColor[j] += 1;
            }
        }

        int remainingBits = 0;
        if(rowColorCounter % 5 != 0){
            remainingBits = rowColorCounter % 5;
            int counter = 0;
            while(remainingBits > 0){
                waterColor[counter] += 1;
                counter++;
                remainingBits--;
            }
            counter = 0;
        }
        //My test to check if the method works as intended
//        System.out.println("Array Empty Test");
//        for(Integer i: waterColor){
//            System.out.print(i + "\t");
//        }
//        System.out.println();
    }

    public void printContainerAndWaterBlocks(){
        int blankSpace = (int) (capacity - currentLevel);
        int rowOfBlankSpace = blankSpace / 5;

        System.out.println();
        while(true){
            if(rowOfBlankSpace > 0){
                String blankBlock = " ";

                System.out.print(containerColor + containerSideStructure + colorReset);
                for(int i = 0; i < containerWidth;i++){
                    System.out.print(blankBlock);
                }
                System.out.print(containerColor + containerSideStructure + colorReset);
                System.out.print("   " + text_g + blankSpaceContainerCounter);
                System.out.println();

                double decrement = 5.0;

                blankSpaceContainerCounter -= decrement;
                rowOfBlankSpace--;

            } else if(rowOfBlankSpace == 0){
                this.printWaterBlocks();
                break;
            }
        }
        //Resets back the initial value of this variables
        blankSpaceContainerCounter = capacity;
    }

    public void printWaterBlocks(){
        int firstDecrementCounter = 1;
        filledSpaceContainerCounter = currentLevel;

        for(int i = 0; i < waterColor.length;i++){
            String blockColor = waterBlockColor[i];
            for(int j = 0; j < waterColor[i];j++){
                System.out.print(containerColor + containerSideStructure + colorReset);
                for(int k = 0; k < containerWidth; k++){
                    System.out.print(blockColor + block + colorReset);
                }
                System.out.print(containerColor + containerSideStructure + colorReset);
                System.out.print("   " + text_nG + filledSpaceContainerCounter + colorReset);
                System.out.println();

                double decrement = 5.0;

                if(firstDecrementCounter == 1){
                    double firstDecrement = decrement + (currentLevel % 5.0);
                    filledSpaceContainerCounter -= firstDecrement;
                    firstDecrementCounter--;
                } else {
                    filledSpaceContainerCounter -= decrement;
                }
            }
        }
        System.out.print(" ");
        for(int l = 0; l < containerWidth; l++){
            System.out.print(containerColor + containerBottomStructure + colorReset);
        }
    }
}
