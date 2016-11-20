casadocodigo
=========================
projeto do livro java-ee-aproveite-toda-a-plataforma-para-construir-aplicacoes


* Wildfly 10
* JAVAEE7
* JSF

Configuração datasource wildfly
------------------------------

### standalone.xml
* Para configurar Mysql utilizar o trecho:
```xml
<xa-datasource-class>com.mysql.jdbc.jdbc2.optional.MysqlXADataSource</xa-datasource-class>
```




