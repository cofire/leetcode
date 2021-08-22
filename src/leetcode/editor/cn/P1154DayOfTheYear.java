//给你一个按 YYYY-MM-DD 格式表示日期的字符串 date，请你计算并返回该日期是当年的第几天。 
//
// 通常情况下，我们认为 1 月 1 日是每年的第 1 天，1 月 2 日是每年的第 2 天，依此类推。每个月的天数与现行公元纪年法（格里高利历）一致。 
//
// 
//
// 示例 1： 
//
// 输入：date = "2019-01-09"
//输出：9
// 
//
// 示例 2： 
//
// 输入：date = "2019-02-10"
//输出：41
// 
//
// 示例 3： 
//
// 输入：date = "2003-03-01"
//输出：60
// 
//
// 示例 4： 
//
// 输入：date = "2004-03-01"
//输出：61 
//
// 
//
// 提示： 
//
// 
// date.length == 10 
// date[4] == date[7] == '-'，其他的 date[i] 都是数字。 
// date 表示的范围从 1900 年 1 月 1 日至 2019 年 12 月 31 日。 
// 
// Related Topics 数学


package leetcode.editor.cn;

//Java：一年中的第几天
public class P1154DayOfTheYear {
    public static void main(String[] args) {
        Solution solution = new P1154DayOfTheYear().new Solution();
        // TO TEST
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int dayOfYear(String date) {
            String[] strs = date.split("-");
            int[] months = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            int countDay = 0;
            int year = Integer.valueOf(strs[0]).intValue();
            int month = Integer.valueOf(strs[1]).intValue();
            ;
            int day = Integer.valueOf(strs[2]).intValue();
            ;
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                months[2] = 29;
            }
            for (int i = 0; i < month; i++) {
                countDay += months[i];
            }
            return countDay + day;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
