public class Codec {

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        String en = "";
        for(int i=0;i<longUrl.length();i++){
            int a = longUrl.charAt(i);
            en+=((char)(a+1));
        }
        return en;
    }
    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        String de = "";
        for(int i=0;i<shortUrl.length();i++){
            int a = shortUrl.charAt(i);
            de+=((char)(a-1));
        }
        return de;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));