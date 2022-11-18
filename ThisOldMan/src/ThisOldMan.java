public class ThisOldMan {
    public static void main(String[] args) {
        String[] nums = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};
        String[] playedon = {"thumb", "shoe", "knee", "door", "hive", "sticks", "heaven", "gate", "spine", "hen"};
        for (int x = 0; x < 10; x++) {
            System.out.print("\n\nThis old man, he played " + nums[x] + ",\n" +
                    "He played knick-knack " + ((x != 6) ? "on my " : "up in ") + playedon[x] + ";\n" +
                    "With a knick-knack paddywhack,\n" +
                    "Give a dog a bone,\n" +
                    "This old man came rolling home.");
        }
    }
}