package org.example.java12a15;

public class TextBlocks {
    public static void main(String[] args) {
        // Exemplo básico de um Text Block
        String json = """
                      {
                          "name": "Nataniel",
                          "age": 33,
                          "city": "São Paulo"
                      }
                      """;

        System.out.println("JSON:\n" + json);

        // Text Block com HTML
        String html = """
                      <html>
                          <body>
                              <h1>Bem-vindo ao Java</h1>
                              <p>Java é incrível!</p>
                          </body>
                      </html>
                      """;

        System.out.println("HTML:\n" + html);

        // Text Block com SQL
        String sql = """
                     SELECT * FROM users
                     WHERE age > 25
                     ORDER BY name;
                     """;

        System.out.println("SQL:\n" + sql);
    }
}

