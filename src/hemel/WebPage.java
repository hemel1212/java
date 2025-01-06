package hemel;
class WebPage implements searchable {
    private String url;
    private String content;

    public WebPage(String url) {

        this.content = content;
    }

    @Override
    public boolean search(String keyword) {
        return content != null && content.contains(keyword);
    }

}