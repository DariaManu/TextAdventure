import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game {

    ChoiceHandler choiceHandler = new ChoiceHandler();
    UI ui = new UI();
    VisibilityManager visibilityManager = new VisibilityManager(ui);
    Story story = new Story(this, ui, visibilityManager);
    String nextPosition1, nextPosition2, nextPosition3, nextPosition4;

    public static void main(String[] args) {
	    new Game();
    }

    public Game() {
        ui.createUI(choiceHandler);
        story.defaultSetup();
        visibilityManager.showTitleScreen();
    }

    public class ChoiceHandler implements  ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String yourChoice = e.getActionCommand();
            switch (yourChoice) {
                case "start":
                    visibilityManager.titleToTown();
                    story.townGate();
                    break;
                case "c1":
                    story.selectPosition(nextPosition1);
                    break;
                case "c2":
                    story.selectPosition(nextPosition2);
                    break;
                case "c3":
                    story.selectPosition(nextPosition3);
                    break;
                case "c4":
                    story.selectPosition(nextPosition4);
                    break;
            }
        }
    }
}
