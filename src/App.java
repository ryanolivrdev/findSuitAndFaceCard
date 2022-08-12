public class App {
    public static void main(String[] args) throws Exception {
        String[] suit = {"ouro", "espada", "copas", "paus"};
        int[] faceCard = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};

        String userChoiceSuit = System.console().readLine("Qual nipes você quer: ");
        String userChoiceFaceCard = System.console().readLine("Faces você quer: ");

        for (int i = 0; i < suit.length; i++) {
            if (suit[i].equalsIgnoreCase(userChoiceSuit)) {
                String resultNipes = suit[i] + ", no index: " + i;

                for (int j = 0; j < faceCard.length; j++) {
                    if (faceCard[j] == Integer.parseInt(userChoiceFaceCard)) {
                        String resultFaces = faceCard[j] + ", no index: " + j;

                        System.out.println("O nipe escolhido foi: " + resultNipes);
                        System.out.println("O faces escolhido foi: " + resultFaces);
                    }
                }
            }
        }
    }
}
