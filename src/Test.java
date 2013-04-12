import java.util.Arrays;

/**
 * UtilityForTopCoderをテストするためのMainです。
 *
 * @author yuki
 *
 */
public class Test {

	/**
	 * テスト用メイン。
	 * 起動時には VMのパラメータ -ea を追加して実行すること
	 * Eclipse使用時は「実行の構成」→「引数」→「VMパラメータ」
	 */
	public static void main(String[] args) {
		int[] array = { 3, 5, 7, 9, 5 };
		assert 3 == UtilityForTopCoder.min(array);
		assert 9 == UtilityForTopCoder.max(array);
		assert 1 == UtilityForTopCoder.indexOf(array, 5);

		char c = 'a';
		assert "a".equals(UtilityForTopCoder.toString(c));

		int[] tmp = UtilityForTopCoder.unique(array);
		assert Arrays.equals(tmp, new int[] { 3, 5, 7, 9 });

		int[] clone = array.clone();
		UtilityForTopCoder.reverseUseList(clone);

		assert Arrays.equals(clone, new int[] { 5, 9, 7, 5, 3 });
		assert UtilityForTopCoder.reverse("abc").equals("cba");

		assert UtilityForTopCoder.bitcount(8) == 1;
		assert UtilityForTopCoder.bitcount(127) == 7;

		tmp = UtilityForTopCoder.insertForArray(array, 1, 10);
		assert Arrays.equals(tmp, new int[] { 3, 10, 5, 7, 9, 5 });
		tmp = UtilityForTopCoder.insertForArrayH(array, 1, 10);
		assert Arrays.equals(tmp, new int[] { 3, 10, 5, 7, 9, 5 });
	}
}
