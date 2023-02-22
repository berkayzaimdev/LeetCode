class Solution {
    public int romanToInt(String s) 
    {
        Map<Character,Integer> romantoint = Map.of
        (
            'I',1,
            'V',5,
            'X',10,
            'L',50,
            'C',100,
            'D',500,
            'M',1000
        );

        int sum=0;
        s = s.replace("IV", "IIII").replace("IX", "VIIII").replace("XL", "XXXX").replace("XC", "LXXXX").replace("CD", "CCCC").replace("CM", "DCCCC");
        for(Character c : s.toCharArray()) sum+=romantoint.get(c);
        return sum;
    }
}
