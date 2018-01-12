class Project {
    private String name;
    private String description;
    private Double initialCost;

    public Project() {
    }

    public Project(String name) {
        this.name = name;

    }
    
    public Project(String name, String description, double initialCost) {
        this.name = name;
        this.description = description;
        this.initialCost = initialCost;
    }


    
    //Getter and Setters
    //name Getter
    public String getName(){
        return this.name;
    }

    //name setter
    public void setName(String name){
        this.name=name;
    }

    //description Getter
    public String getDescription(){
        return this.description;
    }

    //description setter
    public void setDescription(String description){
        this.description=description;
    }
    //initialCost Getter
    public Double getInitialCost(){
        return this.initialCost;
    }

    //initialCost setter
    public void setInitialCost(Double initialCost){
        this.initialCost=initialCost;
    }

    //instance methods
    public String elevatorPitch(){
        return this.name + "($" + this.initialCost + "): " + this.description; 
    }


}


