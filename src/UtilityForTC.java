import java.util.ArrayList;
import java.util.Arrays;

/**
 * 主にTopCoder用の便利な処理をまとめたUtilityクラスです。
 * このコードを丸々コピーしてもいいですし、必要な処理だけコピペしてもいいです。
 * メソッド内のコードをコピペする場合は　メソッドパラメータ・リターンは適宜自分のコードに合うようにしてください。
 *
 * @author yuki
 *
 */
class UtilityForTC {
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
	 * @see UtilityForTC (stringReverse)
	 */
	public static String stringReverseSB(String str) {
		String result = new StringBuffer(str).reverse().toString();
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

	// //////////////////////////////////////////////これは以下は実際には不必要
	/**
	 * インスタンス化させないため
	 */
	private UtilityForTC() {

	}

	/**
	 * テスト用メイン
	 */
	public static void main(String[] args) {
		UtilityForTC.print();
	}
}
