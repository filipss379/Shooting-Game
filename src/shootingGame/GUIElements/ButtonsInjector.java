package shootingGame.GUIElements;

public class ButtonsInjector {

    private static CloseButton closeButton;

    {
        closeButton = new CloseButton(
                100, 500, 200, 100);
    }

    public static CloseButton getCloseButton() {
        return closeButton;
    }
}
