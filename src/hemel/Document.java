package hemel;

class Document implements searchable {
    private String content;

    public Document(String content) {
        this.content = content;
    }

    @Override
    public boolean search(String keyword) {
        return content != null && content.contains(keyword);
    }
}