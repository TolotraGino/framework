public class AnnotatedClass {
    
    @MyMethodAnnotation(description = "Ceci est une méthode testée")
    public void myAnnotatedMethod() {
        System.out.println("Méthode exécutée !");
    }
    
    public void nonAnnotatedMethod() {
        System.out.println("Méthode non annotée.");
    }
}