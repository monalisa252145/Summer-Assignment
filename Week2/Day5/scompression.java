class scompression {
    public int compress(char[] chars) {
        int n = chars.length;
        int write = 0;
        int i = 0;

        while (i < n) {
            char current = chars[i];
            int count = 0;

            while (i < n && chars[i] == current) {
                count++;
                i++;
            }

            chars[write++] = current;

            if (count > 1) {
                String strCount = String.valueOf(count);

                for (char c : strCount.toCharArray()) {
                    chars[write++] = c;
                }
            }
        }

        return write;
    }
}
