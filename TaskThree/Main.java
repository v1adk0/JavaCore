package TaskThree;

public class Main {

    public static void main(String[] args) {

        fuzzySearch("car", "ca6$$#_rtwheel");
        fuzzySearch("cwhl", "cartwheel");
        fuzzySearch("cwhee", "cartwheel");
        fuzzySearch("cartwheel", "cartwheel");
        fuzzySearch("cwheeel", "cartwheel");
        fuzzySearch("lw","cartwheel");
    }

    static boolean fuzzySearch(String part, String whole) {

        if ((part != null) & (whole != null)) {

            char[] partArr = part.toCharArray();
            int partArrCount = 0;

            for (char wholeChar : whole.toCharArray()) {
                if (wholeChar == partArr[partArrCount]) {
                    partArrCount++;
                }
                if (partArrCount == partArr.length) {
                    return true;
                }
            }
        }
            return false;
        }
    }

