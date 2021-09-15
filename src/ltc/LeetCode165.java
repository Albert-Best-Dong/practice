package ltc;

public class LeetCode165 {
    public int compareVersion(String version1, String version2) {
        String[] v1 = null;
        String[] v2 = null;
        if(!version2.contains(".")&&!version1.contains(".")){
            if(Integer.valueOf(version1)>Integer.valueOf(version2)) return 1;
            if(Integer.valueOf(version1)<Integer.valueOf(version2)) return -1;
            return 0;

        }
        if (version2.contains(".")&&!version1.contains(".")) {
            v2 = version2.split("\\.");
            if (Integer.valueOf(v2[0]) < Integer.valueOf(version1)) {
                return 1;
            } else if (Integer.valueOf(v2[0]) > Integer.valueOf(version1)) {
                return -1;
            }else{
                int i = 1;
                while (i < v2.length) {
                    if (Integer.valueOf(v2[i++]) != 0) {
                        return -1;
                    }
                }
            }

            return 0;
        }
        if (version1.contains(".")&&!version2.contains(".")) {
            v1 = version1.split("\\.");
            if (Integer.valueOf(v1[0]) < Integer.valueOf(version2)) {
                return -1;
            } else if (Integer.valueOf(v1[0]) > Integer.valueOf(version2)) {
                return 1;
            }else{
                int i = 1;
                while (i < v1.length) {
                    if (Integer.valueOf(v1[i++]) != 0) {
                        return 1;
                    }
                }
            }
            return 0;
        }
        if (version1.contains(".")&&version2.contains(".")) {
            v1 = version1.split("\\.");
            v2 = version2.split("\\.");

        }



        if (v1.length == v2.length) {
            for (int i = 0; i < v1.length; i++) {
                if (Integer.valueOf(v1[i]) > Integer.valueOf(v2[i])) {
                    return 1;
                } else if (Integer.valueOf(v1[i]) < Integer.valueOf(v2[i])) {
                    return -1;
                }
            }
            return 0;
        } else {
            int idx = 0;

            if (v1.length < v2.length) {
                idx = v1.length;
            } else {
                idx = v2.length;
            }

            for (int i = 0; i < idx; i++) {
                if (Integer.valueOf(v1[i]) > Integer.valueOf(v2[i])) {
                    return 1;
                } else if (Integer.valueOf(v1[i]) < Integer.valueOf(v2[i])) {
                    return -1;
                }
            }

            if (idx == v1.length) {
                while (idx < v2.length) {
                    if (Integer.valueOf(v2[idx++]) != 0) {
                        return -1;
                    }
                }
            } else {
                while (idx < v1.length) {
                    if (Integer.valueOf(v1[idx++]) != 0) {
                        return 1;
                    }
                }
            }

            return 0;

        }
    }

    public static void main(String[] args) {
        System.out.println(new LeetCode165().compareVersion("1", "1.0.1"));
    }
}
