public class NameOps {
    public static String printMethodCall(String method, String name) {
        return method + "(\"" + name + "\"): ";
    }

    public static String whoIsAwesome(String name) {
        return name + " is awesome!";
    }

    public static int indexOfFirstSpace(String name) {
        if (name.indexOf(" ") > 0) {
            return name.indexOf(" ");
        } else {
            return -1;
        }
    }

    public static int indexOfSecondSpace(String name) {
        if (indexOfFirstSpace(name) == -1) {
            return -1;
        } else {
            int firstSpace = name.indexOf(" ");
            String afterSpace = name.substring(firstSpace + 1);
            if (indexOfFirstSpace(afterSpace) > 0) {
                return indexOfFirstSpace(afterSpace) + indexOfFirstSpace(name) + 1;
            } else {
                return -1;
            }
        }
    }

    public static String findFirstName(String name) {
        if (indexOfFirstSpace(name) == -1) {
            return name;
        } else {
            return name.substring(0, indexOfFirstSpace(name));
        }
    }

    public static String findLastName(String name) {
        if (indexOfFirstSpace(name) == -1) {
            return "";
        } else if (indexOfSecondSpace(name) == -1) {
            return name.substring(indexOfFirstSpace(name) + 1);
        } else {
            return name.substring(indexOfSecondSpace(name) + 1);
        }
    }

    public static String findMiddleName(String name) {
        if (indexOfFirstSpace(name) == -1 || indexOfSecondSpace(name) == -1) {
            return "";
        } else {
            return name.substring(indexOfFirstSpace(name) + 1, indexOfSecondSpace(name));
        }
    }

    public static String generateLastFirstMidInitial(String name) {
        if (indexOfFirstSpace(name) == -1) {
            return name;
        } else if (indexOfSecondSpace(name) == -1) {
            return findLastName(name) + ", " + findFirstName(name);
        } else {
            String part1 = findLastName(name) + ", " + findFirstName(name) + " ";
            String part2 =
                    name.substring(indexOfFirstSpace(name) + 1, indexOfFirstSpace(name) + 2) + ".";
            return part1 + part2;
        }
    }
}
