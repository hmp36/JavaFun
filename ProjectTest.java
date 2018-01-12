import javax.print.event.PrintJobListener;

class ProjectTest {
    public static void main(String[] args) {
        Project project1 = new Project("Hagan", "I am a web developer", 13.50);
        System.out.println(project1.elevatorPitch());
        Project project2 = new Project("John", "I am a king", 130.50);
        System.out.println(project2.elevatorPitch());
        Project project3 = new Project("Jeff", "I am a dude", 7.50);
        System.out.println(project3.elevatorPitch());
        }
    }