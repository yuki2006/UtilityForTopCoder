import java.util.Arrays;

/**
 * UtilityForTppCoderをテストするためのMainです。
 *
 * @author yuki
 *
 */
public class Test {

	/**
	 * テスト用メイン
	 * 起動時には VMのパラメータ -ea を追加して実行すること
	 */
	public static void main(String[] args) {
		int[] array = { 3, 5, 7, 9, 5 };
		assert 3 == UtilityForTopCoder.min(array);
		assert 9 == UtilityForTopCoder.max(array);
		assert 1 == UtilityForTopCoder.indexOf(array, 5);
		int[] tmp = UtilityForTopCoder.uniqueIntsArray(array);
		assert Arrays.equals(tmp, new int[] { 3, 5, 7, 9 });

		UtilityForTopCoder.arrayReverseUseList(array);
		assert Arrays.equals(array, new int[] { 5, 9, 7, 5, 3 });
		assert UtilityForTopCoder.stringReverse("abc").equals("cba");

	}
}
