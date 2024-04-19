package md.tekwillacademy.classesandobjects.autoservicetask;

public class Tool {
    String nameOfTheTool;
    String material;

    public Tool(String enteredNameOfTheTool){
        nameOfTheTool = enteredNameOfTheTool;
        System.out.println("The constructor with param was used and the material is still null");

    }


//    public Tool(String name){
//        this.nameOfTheTool = name;
//        System.out.println("A tool object has been created, its name is" + this.nameOfTheTool);
//    }
//
//    public Tool(){
//        System.out.println("A new tool object has been create in our project. We do not have its details"
//        + "for details the Name is" + this.nameOfTheTool + "the weight is" + this.weight);
//    }

}
