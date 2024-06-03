package abstractfactory;


interface Sofa {

    void sitOn();
}

interface Table {

    void place();
}

interface Chair {

    void sitOn();
}

class ModernSofa implements Sofa {

    @Override
    public void sitOn() {
        System.out.println("sitting on Modern sofa");
    }
    
}

class TraditionalSofa implements Sofa {

    @Override
    public void sitOn() {
        System.out.println("sitting on Traditional sofa");    
    }
    
}

class ModernChair implements Chair {

    @Override
    public void sitOn() {
        System.out.println("sitting on Modern chair");    
    }

}

class TraditionalChair implements Chair {

    @Override
    public void sitOn() {
        System.out.println("sitting on traditional chair");    
    }
    
}

class ModernTable implements Table {

    @Override
    public void place() {
        System.out.println("placing on modern table");    
    }
    
}

class TraditionalTable implements Table {

    @Override
    public void place() {
        System.out.println("placing on modern sofa");    
    }
    
}

interface FurnitureItem {

    public Sofa createSofa();

    public Chair createChair();

    public Table createTable();
}

class ModernFurniture implements FurnitureItem {

    @Override
    public Sofa createSofa() {
        return new ModernSofa();   
    }

    @Override
    public Chair createChair() {
        return new ModernChair();    
    }

    @Override
    public Table createTable() {
        return new ModernTable();    
    }
    
}

class TraditionalFurniture  implements FurnitureItem {

    @Override
    public Sofa createSofa() {
        return new TraditionalSofa();
    }

    @Override
    public Chair createChair() {
        return new TraditionalChair();    
    }

    @Override
    public Table createTable() {
        return new TraditionalTable();    
    }
    
}

class Factory {

    FurnitureItem createFurniture(String type) {
        if(type.equals("MODERN"))
            return new ModernFurniture();
        return new TraditionalFurniture();
    }

}


public class Furniture {

    public static void main(String[] args) {
        FurnitureItem modernFurniture = new Factory().createFurniture("MODERN");
        Chair chair = modernFurniture.createChair();
        chair.sitOn();

        Sofa sofa = modernFurniture.createSofa();
        sofa.sitOn();
    }
    
}
