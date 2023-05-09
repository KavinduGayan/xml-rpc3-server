##Introduction

Sample source code for XML-RPC web server

##prerequisite

- Java 17
- maven 3+

## Sample request

```
curl --location --request POST 'http://localhost:8088' \
--header 'Content-Type: application/xml' \
--data-raw '<?xml version="1.0" encoding="ISO-8859-1"?>
<methodCall>
<methodName>sample.sum</methodName>
<params>
<param>
<value><int>17</int></value>
</param>
<param>
<value><int>13</int></value>
</param>
</params>
</methodCall>'
```

##Sample response

```
<?xml version="1.0" encoding="UTF-8"?>
<methodResponse>
    <params>
        <param>
            <value>
                <i4>221</i4>
            </value>
        </param>
    </params>
</methodResponse>
```