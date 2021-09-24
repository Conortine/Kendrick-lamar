package Practice;

public class exam5 {
    public static void main(String[] args) {
        var line = "";
        for (var j = 0; j < 10; j++) {
            for (var i = 0; i < 10; i++) {
                line += (j + i + 1) % 10 + ' ';
            }
            System.out.println();

        }
    }
}
