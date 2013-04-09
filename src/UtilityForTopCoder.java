import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 主にTopCoder用の便利な処理をまとめたUtilityクラスです。
 * このコードを丸々コピーしてもいいですし、必要な処理だけコピペしてもいいです。
 * メソッド内のコードをコピペする場合は　メソッドパラメータ・リターンは適宜自分のコードに合うようにしてください。
 *
 * @author yuki
 *
 */
class UtilityForTopCoder {
	/**
	 * int 配列の反転をします。
	 * (int 以外の場合は適宜書き換えてください）
	 *
	 * @param ints
	 *            反転させる配列
	 * @return 反転後の配列
	 */
	public static int[] arrayReverse(int[] ints) {
		int[] result = new int[ints.length];
		for (int i = 0; i < ints.length; i++) {
			result[i] = ints[ints.length - i - 1];
		}
		return result;
	}

	/**
	 * int 配列の反転をします。
	 * Collections.reverse を使うために
	 * List に変換して反転　これをするくらいなら普通に反転したほうが良さそう？
	 * プリミティブとクラス型の変換部分が面倒。。
	 * (int 以外の場合は適宜書き換えてください）
	 *
	 * @param obj
	 *            反転させる配列
	 * @return 反転後の配列
	 */
	public static int[] arrayReverseUseList(int[] obj) {
		List<Integer> list = new ArrayList<Integer>();
		for (int object : obj) {
			list.add(object);
		}

		Collections.reverse(list);

		Integer[] integers = list.toArray(new Integer[0]);
		int[] result = new int[list.size()];
		for (int i = 0; i < result.length; i++) {
			result[i] = integers[i];
		}
		return result;
	}

	/**
	 * ArrayList<Character> から Stringに変換するための処理
	 *
	 * @param characters
	 *            変換元のArrayList
	 * @return 変換後の文字列
	 */
	public static String charArrayListToString(ArrayList<Character> characters) {
		Character[] array = characters.toArray(new Character[0]);
		char[] chars = new char[array.length];
		for (int i = 0; i < array.length; i++) {
			chars[i] = array[i];
		}
		String result = new String(chars);
		return result;
	}

	/**
	 * char をStringに変換する処理です。
	 *
	 * @param c
	 * @return
	 */
	public static String charToString(char c) {
		return new String(new char[] { c });
	}

	/**
	 * 配列から最小値を探す処理です。
	 * 空の配列は渡さないでください。
	 * intではない場合は適宜、型を書き換えてください。
	 *
	 * @param values
	 * @return
	 */
	public static int min(int[] values) {
		int min = Integer.MAX_VALUE;
		for (int i : values) {
			min = Math.min(min, i);
		}
		return min;
	}

	/**
	 * 配列から最大値を探す処理です。
	 * 空の配列は渡さないでください。
	 * intではない場合は適宜、型を書き換えてください。
	 *
	 * @param values
	 * @return
	 */
	public static int max(int[] values) {
		int max = Integer.MIN_VALUE;
		for (int i : values) {
			max = Math.max(max, i);
		}
		return max;
	}

	/**
	 * 文字列を反転させる処理
	 * charに変換した基本的な実装
	 */
	public static String stringReverse(String str) {
		char[] charArray = str.toCharArray();
		char[] resultChar = new char[charArray.length];
		for (int i = 0; i < charArray.length; i++) {
			resultChar[i] = charArray[charArray.length - i - 1];
		}
		String result = new String(resultChar);
		return result;
	}

	/**
	 * 文字列を反転させる処理
	 * StringBuilderを経由した実装 実装としては短い
	 *
	 * @see UtilityForTopCoder (stringReverse)
	 */
	public static String stringReverseUseSB(String str) {
		String result = new StringBuffer(str).reverse().toString();
		return result;
	}

	/**
	 * String を 配列 (char 配列）に変換する処理です。
	 *
	 * @param str
	 *            元の文字列
	 * @return 変換後のchar配列
	 */
	public static char[] stringToCharArray(String str) {
		char[] result = str.toCharArray();
		return result;
	}

	/**
	 * 与えられたintの配列で一意なもののみ数える処理です。
	 * int だけでなく必要なら適宜,型を書き換えてください。
	 *
	 * @param ints
	 *            元のintの配列です
	 * @return 一意なもの数
	 */
	public static int uniqueIntsSize(int[] ints) {
		Set<Integer> set = new HashSet<Integer>();
		for (int string : ints) {
			set.add(string);
		}
		int result = set.size();
		return result;
	}

	/**
	 * 与えられた文字列で一意なもののみの配列を返します。
	 * String だけでなく必要なら適宜,型を書き換えてください。
	 *
	 * @param strings
	 *            元のstringの配列です
	 * @return 一意な配列
	 */
	public static String[] uniqueStringsArray(String[] strings) {
		Set<String> set = new HashSet<String>();
		for (String string : strings) {
			set.add(string);
		}
		String[] result = set.toArray(new String[0]);
		return result;
	}

	/**
	 * 変数出力の処理例
	 */
	public static void print() {
		// /////////////////変数例
		int x = 30;
		double y = 10.5;
		int[] z = { 10, 20, 30 };

		// /////////////////出力部分
		System.out.println(x);
		System.out.println(y);

		// 配列を見やすいように出力する場合は Arrays.toStringを使う
		System.out.println(Arrays.toString(z));

	}

	// //////////////////////////////////////////////これ以下は実際には不必要
	/**
	 * インスタンス化させないため
	 */
	private UtilityForTopCoder() {

	}

}
