UtilityForTopCoder
==================

主に [TopCoder][1] SRMに特化した便利な処理をまとめたUtilityクラスです。

「Javaの標準ライブラリのArrayクラスに配列を反転させる処理はないの？」

「配列に対するindexOfがないの！？」

のようにTopCoder SRM をする上で標準ライブラリの処理が足りないと不満をもったので、
比較的簡単な処理だけどよく使うような処理をまとめたものを作っています。

TopCoder SRMだけでなく、通常の開発でも「この処理どうやるんだっけ？」みたいな備忘録を目指してます。

将来、このコードを使って更に便利なサービスを目指しております。


使い方
=======
こちらから、自分のしたい処理を探してください（ブラウザの検索機能を使うと良い）
https://github.com/yuki2006/UtilityForTopCoder/blob/master/src/UtilityForTopCoder.java

（将来探しやすいように工夫するつもりです。）

このソースから以下の事ができます。
* 必要なメソッドだけコピーして自分のクラス内にコピーする。（推奨）
* クラスを丸々自分のソースコード内にコピーする
* メソッド内のコードを自分の処理コード内にコピーする。

* 自分のしたい処理がなかったから文句をいう。
    (その場合はこちらから　https://github.com/yuki2006/UtilityForTopCoder/issues)

    メソッド内のコードをコピペする場合はメソッドパラメータ・リターンは適宜自分のコードに合うように調整してください。
    (一旦スタティックメソッドで呼び出して、Eclipseの機能でインライン展開すると楽かも)

UtilityForTopCoder.javaのファイルをそのまま作業フォルダにコピーしてもTopCoder SRMでは使えませんのでご注意ください。

コードをコピーしてもらうのが目標ではなく、それぞれの処理に書かれてるコードを理解してもらって、
*新しい発見をしたり、自分で書けるようになってもらうのが目標*です。



対象
=======
* 少し言語をかじって多少は書けるんだけど、ちょっとした処理の書き方がわからない。
* わざわざ書くのが面倒といった時
* 自分でも実装できるけど、自分の知らなかった方法を再発見したい。

方針
=======
*  思いつけば「初心者にやさしい比較的簡単な記述」と「テクニックを使って難しいけど短いor 処理が早い」記述をする予定です。

    簡単や難しいは、独断と偏見で選んでます。

    あったほうがいいと思いついたら、どんどん実装してます。

* メソッドはすべてスタティックメソッドで作成する予定です。

* 命名規則としては、処理名だけ書くようにして、利用できる型は引数（パラメータ）の型で判断してください。

* 一つのメソッドで完結したいので、（例え同様の処理が他に書かれていても）標準ライブラリのメソッド以外は呼び出しません。

* 本来、仕様の範囲外の値を与えたら例外などを投げるべきですが、あえて例外処理をしていません。
競技プログラミングに特化しているためですので、使うときには注意してください。

* 以下のようにインスタンス化したらインターフェイスで受け取るような記述を実際の開発でしたりしますが、
    オブジェクト指向に精通してないと解読が難しいということでこういった表現はしない方針です。

    List<String> list=new ArrayList<String>()

もし、ここに載っているものより短い or 処理が早い or スマートな記述を知ってる方は是非 Pull Request をお願いします。


ゆるぼ
=======
プリミティブ型の配列とそのクラス型の配列を一行でに変換できるようなものないでしょうか？
（自分でループを回すしかない？）


License
=======
この説明だけでわかる方は誰でも自由に使っていただければOKです。
一応 Creative Commons 3.0の CC BY でお願いします。

（プロジェクトの性質上、メソッド単位で見るとどこかのコードと同じになってしまってたということもあると思いますので、

このプロジェクトのコードを使われたという場合、ご自身の良心で宣伝していただくというくらいで結構です。）


注意
=======
一応テストはしておりますが、コードの正確性は保証しておりませんので、
参考程度にご使用してください。

競技プログラミングに特化したコードになっておりますので、
実際のプログラム開発にとっては品質が低い可能性があります。

[1]: http://www.topcoder.com/
