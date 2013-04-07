import java.util.ArrayList;

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
	 * @param characters 変換元のArrayList
	 * @return 変換後の文字列
	 */
	public static String charArrayListToString(ArrayList<Character> characters) {
		Character[] array = characters.toArray(new Character[0]);
		char[] chars = new char[array.length];
		for (int i = 0; i < array.length; i++) {
			chars[i] = array[i];
		}
		return new String(chars);
	}

	/**
	 * インスタンス化させないため
	 */
	private UtilityForTC() {

	}
}
