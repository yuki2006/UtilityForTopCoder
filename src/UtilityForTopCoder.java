import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 主にTopCoder用の便利な処理をまとめたUtilityクラスです。 このコードを丸々コピーしてもいいですし、必要な処理だけコピペしてもいいです。
 * メソッド内のコードをコピペする場合は　メソッドパラメータ・リターンは適宜自分のコードに合うようにしてください。
 *
 * @author yuki2006
 *
 */
class UtilityForTopCoder {
	/**
	 * 引数として渡した値の各ビットで１の値の総数を返します。 ただし、正の数を対象とします。
	 *
	 * @param num
	 *            ビットを数える値
	 * @return ビットの数を返します。
	 */
	public static int bitcount(int num) {
		int count = 0;
		while (num > 0) {
			count += num % 2;
			num /= 2;
		}
		return count;
	}

	/**
	 * HashMapからすべて要素を取り出す処理を行います。
	 *
	 * @param map
	 *            対象のHashMapです。String,Integerの組としてますが基本的には何の組み合わせでもいいです。
	 */
	public static void getHashMapElement(HashMap<String, Integer> map) {
		// map.keySet()ですべてのkeyのSet (重複しないリスト)を取得できる
		for (String key : map.keySet()) {
			int value = map.get(key);
			System.out.println(value);
		}
	}

	/**
	 * HashMapからすべての値(value)だけを取り出す処理を行います。
	 *
	 * @param map
	 *            対象のHashMapです。String,Integerの組としてますが基本的には何の組み合わせでもいいです。
	 */
	public static void getHashMapValue(HashMap<String, Integer> map) {
		// map.values()ですべての値のCollection(リストのようなもの）を取得できる。
		for (int value : map.values()) {
			System.out.println(value);
		}
	}

	/**
	 * int 配列に対して indexOfの処理を行います。
	 *
	 * @author yuki2006
	 * @param values
	 *            対象の配列
	 * @param target
	 *            探す値
	 * @return
	 */
	public static int indexOf(int[] values, int target) {
		for (int i = 0; i < values.length; i++) {
			if (values[i] == target) {
				return i;
			}
		}
		return -1;
	}

	/**
	 * 文字列（String）配列に対して indexOfの処理を行います。
	 *
	 * @author yuki2006
	 * @param values
	 *            対象の配列
	 * @param target
	 *            探す文字列
	 * @return
	 */
	public static int indexOf(String[] values, String target) {
		for (int i = 0; i < values.length; i++) {
			if (values[i].equals(target)) {
				return i;
			}
		}
		return -1;
	}

	/**
	 * 配列から最大値を探す処理です。 空の配列は渡さないでください。 intではない場合は適宜、型を書き換えてください。
	 * Math.maxと拡張for文を使って短く記述。
	 *
	 * @author yuki2006
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
	 * 配列の最大値の添字を探す処理です。
	 * よく習う最大値を求める処理になってます。
	 *
	 * @author yuki2006
	 * @param values
	 * @return
	 */
	public static int maxIndex(int[] values) {
		int max = Integer.MIN_VALUE;
		int maxIndex = -1;
		for (int i = 0; i < values.length; i++) {
			if (max < values[i]) {
				max = values[i];
				maxIndex = i;
			}
		}
		return maxIndex;
	}

	/**
	 * 配列から最小値を探す処理です。 空の配列は渡さないでください。 intではない場合は適宜、型を書き換えてください。
	 *
	 * @author yuki2006
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
	 * 変数出力の処理例
	 *
	 * @author yuki2006
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

	/**
	 * int 配列の反転をします。 Arraysクラスに習ってパラメータの配列を書き換えます。 (int 以外の場合は適宜書き換えてください）
	 *
	 * @author yuki2006
	 * @param values
	 *            反転させる配列
	 */
	public static void reverse(int[] values) {
		for (int i = 0; i < values.length / 2; i++) {
			int tmp = values[values.length - i - 1];
			values[values.length - i - 1] = values[i];
			values[i] = tmp;
		}
	}

	/**
	 * 文字列を反転させる処理 charに変換した基本的な実装
	 *
	 * @author yuki2006
	 */
	public static String reverse(String str) {
		char[] charArray = str.toCharArray();
		char[] resultChar = new char[charArray.length];
		for (int i = 0; i < charArray.length; i++) {
			resultChar[i] = charArray[charArray.length - i - 1];
		}
		String result = new String(resultChar);
		return result;
	}

	/**
	 * int 配列の反転をします。 Collections.reverse を使うために List
	 * に変換して反転　これをするくらいなら普通に反転したほうが良さそう？ プリミティブとクラス型の変換部分が面倒。。 (int
	 * 以外の場合は適宜書き換えてください）
	 *
	 * @author yuki2006
	 * @param values
	 *            反転させる配列
	 * @return 反転後の配列
	 */
	public static void reverseUseList(int[] values) {
		List<Integer> list = new ArrayList<Integer>();
		for (int object : values) {
			list.add(object);
		}

		Collections.reverse(list);

		Integer[] integers = list.toArray(new Integer[0]);
		for (int i = 0; i < values.length; i++) {
			values[i] = integers[i];
		}
	}

	/**
	 * 文字列を反転させる処理 StringBuilderを経由した実装 実装としては短い
	 *
	 * @author yuki2006
	 * @see UtilityForTopCoder (stringReverse)
	 */
	public static String reverseUseSB(String str) {
		String result = new StringBuffer(str).reverse().toString();
		return result;
	}

	/**
	 * intの値を2進数表現の文字列に変換します。
	 *
	 * @param num
	 * @return
	 */
	public static String toBinaryString(int num) {
		return Integer.toBinaryString(num);
	}

	/**
	 * String を 配列 (char 配列）に変換する処理です。
	 *
	 * @author yuki2006
	 * @param str
	 *            元の文字列
	 * @return 変換後のchar配列
	 */
	public static char[] toCharArray(String str) {
		char[] result = str.toCharArray();
		return result;
	}

	/**
	 * intの値を16進数表現の文字列に変換します。
	 *
	 * @param num
	 * @return
	 */
	public static String toHexString(int num) {
		return Integer.toHexString(num);
	}

	/**
	 * ArrayList<Character> から Stringに変換するための処理
	 *
	 * @author yuki2006
	 * @param characters
	 *            変換元のArrayList
	 * @return 変換後の文字列
	 */
	public static String toString(ArrayList<Character> characters) {
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
	 * @author yuki2006
	 * @param c
	 * @return
	 */
	public static String toString(char c) {
		return new String(new char[] { c });
	}

	/**
	 * int から Stringに変換させる処理です。
	 *
	 * @param value
	 *            元のintの値です。
	 * @return 変換後のStringです。
	 */
	public static String toString(int value) {
		return value + "";

		// return String.valueOf(value);
	}

	/**
	 * 与えられたintの配列で一意なものにする処理です。 int だけでなく必要なら適宜,型を書き換えてください。
	 *
	 * @author yuki2006
	 * @param values
	 *            元のintの配列です
	 * @return 一意なもの数
	 */
	public static int[] unique(int[] values) {
		Set<Integer> set = new HashSet<Integer>();
		for (int string : values) {
			set.add(string);
		}
		Integer[] tmp = set.toArray(new Integer[0]);
		int[] result = new int[tmp.length];
		for (int i = 0; i < result.length; i++) {
			result[i] = tmp[i];
		}
		return result;
	}

	/**
	 * 与えられた文字列で一意なもののみの配列を返します。 String だけでなく必要なら適宜,型を書き換えてください。
	 *
	 * @author yuki2006
	 * @param strings
	 *            元のstringの配列です
	 * @return 一意な配列
	 */
	public static String[] unique(String[] strings) {
		Set<String> set = new HashSet<String>();
		for (String string : strings) {
			set.add(string);
		}
		String[] result = set.toArray(new String[0]);
		return result;
	}

	// //////////////////////////////////////////////これ以下は実際には不必要
	/**
	 * インスタンス化させないため
	 */
	private UtilityForTopCoder() {

	}

}
