package com.siddharth;

import java.math.BigInteger;
import java.util.Scanner;

public class Ks {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		int tc = 1;
		while (t-- > 0) {
			BigInteger ans = BigInteger.ZERO;
			long x = 1;
			long r = s.nextLong() - 1;
			long c = s.nextLong() - 1;
			while (r != 0 && c != 0) {
				// ans += (r * c) + ((r * c) * (x - 1));
				BigInteger r1 = new BigInteger(Long.toString(r));
				BigInteger c1 = new BigInteger(Long.toString(c));
				BigInteger x1 = new BigInteger(Long.toString(x - 1));
				BigInteger temp = r1.multiply(c1);
				ans = ans.add(temp);
				temp = temp.multiply(x1);
				ans = ans.add(temp);

				x++;
				r--;
				c--;
			}
			BigInteger mod1 = new BigInteger("1000000007");
			System.out.println("Case #" + (tc++) + ": " + (ans.mod(mod1)));

		}
	}

}
/*
 * 624937395 Case #1: 841413529 Case #2: 182508426 Case #3: 16425570 Case #4:
 * 274701435 Case #5: 22809704 Case #6: 939872353 Case #7: 693190009 Case #8:
 * 668647502 Case #9: 208727915 Case #10: 154265461 Case #11: 331176384 Case
 * #12: 582219580 Case #13: 432186742 Case #14: 347358539 Case #15: 27145050
 * Case #16: 395521329 Case #17: 3132624 Case #18: 7478130 Case #19: 225537868
 * Case #20: 861931590 Case #21: 667695530 Case #22: 139625166 Case #23:
 * 165169811 Case #24: 158628426 Case #25: 88172280 Case #26: 13342560 Case #27:
 * 281928224 Case #28: 819958891 Case #29: 624293028 Case #30: 8432634 Case #31:
 * 20797920 Case #32: 659247092 Case #33: 187542936 Case #34: 917920835 Case
 * #35: 69469823 Case #36: 812430734 Case #37: 355445436 Case #38: 691092316
 * Case #39: 376390506 Case #40: 285919095 Case #41: 432545498 Case #42:
 * 744049248 Case #43: 924279649 Case #44: 2472250 Case #45: 48888360 Case #46:
 * 678667500 Case #47: 121915603 Case #48: 205968806 Case #49: 947077033 Case
 * #50: 66303047 Case #51: 52588720 Case #52: 477299457 Case #53: 528102626 Case
 * #54: 12242670 Case #55: 9576440 Case #56: 675996053 Case #57: 802776264 Case
 * #58: 539933006 Case #59: 502803730 Case #60: 349368533 Case #61: 741582643
 * Case #62: 92155250 Case #63: 933598939 Case #64: 924397440 Case #65:
 * 691895598 Case #66: 53416534 Case #67: 83049000 Case #68: 92599635 Case #69:
 * 87699737 Case #70: 919171863 Case #71: 696940869 Case #72: 502017600 Case
 * #73: 212215835 Case #74: 87616925 Case #75: 514931174 Case #76: 601370329
 * Case #77: 253368007 Case #78: 602664312 Case #79: 2436390 Case #80: 940985308
 * Case #81: 984632817 Case #82: 367538276 Case #83: 443234610 Case #84:
 * 409199370 Case #85: 599665960 Case #86: 777191308 Case #87: 309657270 Case
 * #88: 160758180 Case #89: 168368200 Case #90: 853255118 Case #91: 37492412
 * Case #92: 232212205 Case #93: 446698616 Case #94: 280296516 Case #95:
 * 62585056 Case #96: 498352850 Case #97: 216006052 Case #98: 992339104 Case
 * #99: 206030 Case #100: 15399945
 * 
 */
