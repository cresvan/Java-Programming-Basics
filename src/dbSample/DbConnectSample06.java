
/* 前のサンプルの二つの問題点「同じ処理を何度も記述することになる」と「取得したデータが扱いにくい」を解決するため、オブジェクト指向らしい構造 にする。
 * クラスの責務とは、クラスが果たすべき役割のことです。オブジェクト指向には「単一責任の原則」という原則があります。
 * これは、「1つのクラスに1つの役割をもたせる（＝複数の役割を持たせてはいけない）」というものです。
 */

package dbSample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import dbSample.dao.CountryDAO;
import dbSample.entity.Country;

public class DbConnectSample06 {

	public static void main(String[] args) {

		CountryDAO dao = new CountryDAO();

		System.out.print("検索キーワードを入力してください > ");
		String name = keyIn();

		List<Country> list = dao.getCountryFromName(name);


		for(Country item : list) {
			System.out.println(item.getName());
			System.out.println(item.getPopulation());
		}
	}

	private static String keyIn() {
		String line = null;
		try {
			BufferedReader key = new BufferedReader(new InputStreamReader(System.in));
			line = key.readLine();
		} catch (IOException e) {

		}
		return line;
	}
}