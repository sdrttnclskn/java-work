package com.sdrttnclskn.sha1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;

public class HashMain {

	public static void main(String[] args) throws IOException, NoSuchAlgorithmException {

		String txt = "hash fonksiyon için test metini";

		File file = new File("hash.txt");

		if (!file.exists()) {
			file.createNewFile();
		}

		FileWriter fWriter = new FileWriter(file, false);
		BufferedWriter bWriter = new BufferedWriter(fWriter);
		bWriter.write(txt);
		bWriter.close();

		Sha1Algorithm.sha1(file);

	}

}
