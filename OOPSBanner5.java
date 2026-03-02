public class OOPSBanner5 {
    static class CharacterPatternMap {
        char character;
        String[] pattern;

        CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }
    }
	public static CharacterPatternMap[] createCharacterPatternMaps() {
        return new CharacterPatternMap[]{
            new CharacterPatternMap('O', new String[]{
             "   ***   ",
			 " **   ** ",
			 "**     **",
			 "**     **",
			 "**     **",
			 " **   ** ",
			 "   ***   ",
            }),
			  new CharacterPatternMap('O', new String[]{
             "   ***   ",
			 " **   ** ",
			 "**     **",
			 "**     **",
			 "**     **",
			 " **   ** ",
			 "   ***   ",
            }),
			
            new CharacterPatternMap('P', new String[]{
                "*******  ",
				"**   *** ",
				"**    ***",
                "**   *** ",
                "*******  ",
				"**       ",
				"**       "
            }),
            new CharacterPatternMap('S', new String[]{
                "  ******* "
				" ***   ***"
				" ***      "
				"   ****** "
				"      *** "
				" ***   ***"
				"  ******* "
            })
        };
    }
	public static String[] getCharacterPattern(char ch, CharacterPatternMap[] charMaps) {
        for (CharacterPatternMap map : charMaps) {
            if (map.character == ch) {
                return map.pattern;
            }
        }
        return new String[]{"     ", "     ", "     ", "     ", "     "}; // fallback blank
    }
    public static void printMessage(String message, CharacterPatternMap[] charMaps) {
        for (int row = 0; row < 5; row++) {
            StringBuilder line = new StringBuilder();
            for (char ch : message.toCharArray()) {
                String[] pattern = getCharacterPattern(ch, charMaps);
                line.append(pattern[row]).append("  ");
            }
            System.out.println(line.toString());
        }
    }
	public static void main(String[] args) {
        CharacterPatternMap[] charMaps = createCharacterPatternMaps();
        String message = "OOPS";
        printMessage(message, charMaps);
    }
}