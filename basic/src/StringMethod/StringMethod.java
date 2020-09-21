package StringMethod;

import java.io.UnsupportedEncodingException;

public class StringMethod {
	public static void main(String[] args) {
		String str = "Hello";
		int i =2;
		char[] c = new char[10];
		
		System.out.println("¹®ÀÚ¿­ ±æÀÌ length(): "+ str.length());
		System.out.println("¹®ÀÚ¿­ Áß i¹øÂ° ¹®ÀÚ¸¦ ¹İÈ¯: "+str.charAt(i));
		System.out.println("¹®ÀÚ¿­ÀÇ ÀÏºÎ¸¦ char[]·Î Á¦°ø: "+c);
		str.getChars(0, str.length(), c, 1);
		
		System.out.println("¹®ÀÚ¿­ ºñ±³, ´ë¼Ò¹®ÀÚ ¹«½Ã: "+str.equalsIgnoreCase("hello"));
		
		System.out.println("¹®ÀÚ¿­ÀÌ 'h'·Î ½ÃÀÛÇÏ¶ó¸é ture·Î ¹İÈ¯: "+str.startsWith("h"));
		
		System.out.println("ÇöÀçÀÇ ¹®ÀÚ¿­ÀÌ \"lo\"·Î ³¡³ª¸é ture·Î ¹İÈ¯ÇÏ´Â ¸Ş¼Òµå:"+str.endsWith("lo"));
		
		System.out.println("ÇöÀçÀÇ ¹®ÀÚ¿­°ú ÁöÁ¤µÈ ¹®ÀÚ¿­À» ºñ±³ÇÏ¿© ÇöÀçÀÇ ¹®ÀÚ¿­ÀÌ \n" 
		+ "ºñ±³µÈ ¹®ÀÚ¿­º¸´Ù Å©¸é ¾ç¼ö,°°À¸¸é0, ÀÛÀ¸¸é À½¼ö°ªÀ» ¹İÈ¯: "+str.compareTo("A"));
		
		System.out.println("ºñ±³ÇÒ ¹®ÀÚ¹®ÀÌ strÀÇ ¸î¹øÂ°¿¡ À§Ä¡ÇÏ´ÂÁö ¹İÈ¯ÇÏ´Â ¸Ş¼Òµå: "+str.indexOf("l"));
		
		System.out.println("ºñ±³ÇÒ ¹®ÀÚ¹®ÀÌ strÀÇ startIndex(3)ºÎÅÍ"+ "¸î¹øÂ°¿¡ À§Ä¡ÇÏ´Â ¸Ş¼Òµå: "+str.indexOf("1",3));
		
		System.out.println("ºñ±³ÇÒ ¹®ÀÚ°¡ ÀÎµ¦½º¸¦ ¸¶Áö¸·ºÎÅÍ ºñ±³ÇÏ¿©" +"¸î¹øÂ°¿¡ À§Ä¡ÇÏ´ÂÁö ¹İÈ¯ÇÏ´Â °ª: "+str.lastIndexOf("1"));
		
		System.out.println("ÁöÁ¤ ÀÎµ¦½ººÎÅÍ ÁöÁ¤ ÀÎµ¦½º(-1)±îÁö ¹İÈ¯ÇÏ´Â ÇÔ¼ö: "+str.substring(1,3));//1ºÎÅÍ2±îÁöÀÇ ¹®ÀÚ¿­ ¹İÈ¯
		
		System.out.println("°áÇÕµÈ ¹®ÀÚ¿­À» ¹İÈ¯ÇÏ´Â ¸Ş¼Òµå: "+str.concat("world"));
		
		System.out.println("¸Å°³º¯¼ö¿¡ ¾²¿©Áø ¹®ÀÚ¸¦ µÎ¹øÂ° ¸Å°³º¯¼ö¿¡ ¾²¿©Áø ¹®ÀÚ·Î ±³Ã¼: "+str.replace("o", "ow"));
		
		System.out.println("¹®ÀÚ¿­ÀÇ ½ÃÀÛ°ú ³¡¿¡ ÀÖ´Â °ø¹éÀ» Á¦°ÅÇÏ´Â ¸Ş¼Òµå: "+str.trim());
		
		System.out.println("¾²¿©Áø ¹®ÀÚ¸¦ ¼Ò¹®ÀÚ·Î ¹İÈ¯ÇÏ´Â ¸Ş¼Òµå: "+str.toLowerCase());
		
		System.out.println("¾²¿©Áø ¹®ÀÚ¸¦ ´ë¹®ÀÚ·Î ¹İÈ¯ÇÏ´Â ¸Ş¼Òµå: "+str.toUpperCase());
		
		System.out.println("¸Å°³º¯¼ö¸¦ ±âÁØÀ¸·Î ¹®ÀÚ¸¦ ¹è¿­·Î ³ª´©´Â ¸Ş¼Òµå: "+str.split(" "));
		
		System.out.println("¹®Àå³»¿¡ ¸Å°³º¯¼ö·Î ÁÖ¾îÁø ¹®ÀÚ°¡ ÀÖ´ÂÁö true¿Í false·Î ¹İÈ¯ÇÏ´Â ¸Ş¼Òµå: "+str.contains("s"));
		
		System.out.println("ÁÖ¾îÁø ¹®ÀÚ¿­À» ¾Æ½ºÅ° ÄÚµå·Î ¹İÈ¯ÇÏ´Â ¸Ş¼Òµå: "+str.getBytes());
		
		try {
			System.out.println("ÁÖ¾îÁø ¹®ÀÚ¿­À» ÇØ´ç ¹®ÀÚ¼ÂÀ¸·Î ¹İÈ¯ÇÏ´Â ¸Ş¼Òµå: "+str.getBytes("UTF-8"));
		} catch (UnsupportedEncodingException e) {
			
			e.printStackTrace();
		}
		
		System.out.println("ÇØ´ç ¹®ÀÚ¿­ÀÌ ºñ¾ú´ÂÁö ¾Ë·ÁÁÖ´Â ¸Ş¼Òµå: "+str.isEmpty());
		
		System.out.println("¹®ÀÚ¿­¿¡ ÁöÁ¤ÇÑ ¹®ÀÚ°¡ ÀÖÀ¸¸é Ã¹¹øÂ°¸¸ »õ·Î ÁöÁ¤ÇÑ ¹®ÀÚ·Î ¹Ù²ãÁÖ´Â"+"¸Ş¼Òµå: "+str.replaceFirst("l", "llo hel"));
		
		System.out.println("Á¤±ÔÇ¥Çö½ÄÀ» »ç¿ëÇÏ¿© Ã¹¹øÂ° ¸Å°³º¯¼ö¿¡ ÇØ´çÇÏ´Â ¹®ÀÚ¸¦ "+"µÎ¹ø¤Š ¸Å°³º¯¼ö¿¡ ÇØ´çÇÏ´Â ¹®ÀÚ·Î Ä¡È¯:"
		+str.replaceAll("[0-9]", " ")+ //0ºÎÅÍ9±îÁö °ø¹éÀ¸·Î ¹Ù²Ù°Ú´Ù.
		str.replaceAll("[^8-9]", " ")	//0-9¸¦ Á¦¿ÜÇÑ ³ª¸ÓÁö¸¦ ±³Ã¼
		+str.replaceAll("[a-z", " ")
		+str.replaceAll("[a-z|A-Z]", " ")
		+str.replaceAll("[¤¡-¤¾|¤¿-¤Ó|°¡-ÆR]", " ")	//ÇÑ±ÛÀ» ÇØ´ç ¹®ÀÚ¿­·Î ±³Ã¼
		+str.replaceAll("[^¤¡-¤¾|^¤¿-¤Ó|^°¡-ÆR]", " "));	//ÇÑ±ÛÀÌ ¾Æ´Ñ ¸ğµç ¹®ÀÚ¸¦ ÇØ´ç ¹®ÀÚ¿­·Î ±³Ã¼
		
		
		
				
	}
}
