package com.sdrttnclskn.sha;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Formatter;

public class SHA1Algorithm {

	public static String sha1(File file) throws NoSuchAlgorithmException, IOException {

		final MessageDigest messageDigest = MessageDigest.getInstance("SHA1");

		try {

			InputStream is = new BufferedInputStream(new FileInputStream(file));

			final byte[] buffer = new byte[1024];

			for (int read = 0; (read = is.read(buffer)) != -1;) {

				messageDigest.update(buffer, 0, read);

			}

		} catch (Exception e) {

			e.printStackTrace();

		}

		String x = "";

		// Convert the byte to hex format

		try {

			Formatter formatter = new Formatter();

			for (final byte b : messageDigest.digest()) {

				formatter.format("%02x", b);

			}

			x = formatter.toString();

		} catch (Exception e) {

			e.printStackTrace();

		}

		FileWriter fwSha1 = new FileWriter("hash.sha1");
		fwSha1.write(x);
		fwSha1.close();
		return x;

	}

}
