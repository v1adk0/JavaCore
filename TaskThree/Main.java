package TaskThree;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

//        fuzzySearch("car", "ca6$$#_rtwheel");
//        fuzzySearch("cwhl", "cartwheel");
//        fuzzySearch("cwhee", "cartwheel");
//        fuzzySearch("cartwheel", "cartwheel");
//        fuzzySearch("cwheeel", "cartwheel");
//        fuzzySearch("lw","cartwheel");
    }

    static boolean fuzzySearch(String part, String whole) {
        String similar = "";
        if ((part != null) & (whole != null)) {
            similar = Arrays.stream(whole.split(""))
                    .filter(part::contains)
                    .collect(Collectors.joining());
        }
        return similar.equals(part);
        }
    }

