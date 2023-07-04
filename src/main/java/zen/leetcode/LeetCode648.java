package zen.leetcode;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 题目：单词替换（字节跳动十日计划）
 * 链接：https://leetcode.cn/problems/replace-words/
 * 状态：AC
 */
public class LeetCode648 {

    public String replaceWords(List<String> dictionary, String sentence) {
        // 按照词根的首字母来重新组织词根
        final Map<Character, List<String>> firstCharMap = new HashMap<>();
        for (String root : dictionary) {
            final List<String> collection = firstCharMap.getOrDefault(root.charAt(0), new ArrayList<>());
            if (collection.isEmpty()) {
                collection.add(root);
                firstCharMap.put(root.charAt(0), collection);
            } else {
                collection.add(root);
            }
        }
        firstCharMap.values().forEach(it -> Collections.sort(it, (a, b) -> a.length() - b.length()));
        final String[] words = sentence.split(" ");

        for (int i = 0; i < words.length; i++) {
            final String word = words[i];
            final char firstChar = word.charAt(0);
            final List<String> candidateRoots = firstCharMap.get(firstChar);
            if (candidateRoots == null || candidateRoots.isEmpty()) continue;
            for (String root : candidateRoots) {
                if (word.startsWith(root)) {
                    words[i] = root;
                    break;
                }
            }
        }
        return String.join(" ", words);
    }
}
